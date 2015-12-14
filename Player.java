import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

/**
 * This class plays audio files and interacts with the threads to either start or stop a song.
 * Most of this code does not belong to me, I only edited it to fit the needs of the project.
 * 
 * @author Abby Lambert
 * @version 1.0.0
 */
public class Player implements Runnable {

    private final int BUFFER_SIZE = 128000;
    private File soundFile;
    private AudioInputStream audioStream;
    private AudioFormat audioFormat;
    private SourceDataLine sourceLine;
    private Song nowPlaying;
    private MiddleMan middle;
    private SongChooser songChooser;

    /**
     * Constructor for the Player class
     * @param Song to be played by the player
     * @param MiddleMan class that allows the threads to interact
     * @param SongChooser either a Shuffle or Normal class
     */
    public Player(Song s, MiddleMan m, SongChooser sc)
    {
        nowPlaying = s;
        middle = m;
        songChooser = sc;
    }

    /**
     * Method executed when the thread is run, plays a song from a WAV file.
     */
    public void run() {
        String strFilename = nowPlaying.getFilename();

        try {
            soundFile = new File(strFilename);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }

        try {
            audioStream = AudioSystem.getAudioInputStream(soundFile);
        } catch (Exception e){
            e.printStackTrace();
            System.exit(1);
        }

        audioFormat = audioStream.getFormat();

        DataLine.Info info = new DataLine.Info(SourceDataLine.class, audioFormat);
        try {
            sourceLine = (SourceDataLine) AudioSystem.getLine(info);
            sourceLine.open(audioFormat);
        } catch (LineUnavailableException e) {
            e.printStackTrace();
            System.exit(1);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }

        sourceLine.start();
        //System.out.println("Player says: Song started");

        int nBytesRead = 0;
        byte[] abData = new byte[BUFFER_SIZE];
        while (nBytesRead != -1 && middle.getSkipped() == false) {
            try {
                nBytesRead = audioStream.read(abData, 0, abData.length);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (nBytesRead >= 0) {
                @SuppressWarnings("unused")
                int nBytesWritten = sourceLine.write(abData, 0, nBytesRead);
            }
        }

        sourceLine.drain();
        sourceLine.close();
        middle.NoWorries();
        //System.out.println("Player says: song is finished");
    }

}