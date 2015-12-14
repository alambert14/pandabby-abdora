import java.io.*;
/**
 * This thread runs through a shuffled list of songs.
 * 
 * @author Abby Lambert 
 * @version 1.0.0
 */
public class Shuffle extends SongChooser implements Runnable
{
    private MiddleMan middle;
    //     private SongMap map;
    //     private Song[] list;
    private Song nowPlaying;
    private Song[] list;
    private int index;
    private Player p;
    private Thread t;
    private AppFrame frame;
    //     public Song[] oneGenre;
    //     public Song[] temp;
    /**
     * Constructor for the Shuffle class
     * @param ListMaker class which makes the shuffled and normal lists
     * @param MiddleMan the class which allows threads to interact
     * @param AppFrame the frame the app runs in
     */
    public Shuffle(ListMaker lm, MiddleMan m, AppFrame a)
    {
        middle = m;
        list = lm.getShuffled();
        index = 0;
        frame = a;
        new Thread(this, "Shuffle").start();
    }

    /**
     * Method run when the thread it started, plays through a list of songs.
     */
    public void run()
    {
        while(index < list.length)
        {
            nowPlaying = list[index];
            frame.setText("Now Playing: " + nowPlaying.getSongName() + " by " + nowPlaying.getArtist());
            frame.setFile(nowPlaying.getCover());
            frame.repaint();
            //frame.update(frame.getGraphics());
            frame.pack();
            p = new Player(nowPlaying, middle, this);
            t = new Thread(p);
            t.start(); //creates a new player and plays a song
            middle.Waiting();//waits for either a skip or for a song to end
            if(middle.getSkipped() == true)
            {
                //System.out.println("Shuffler says: song successfuly skipped");
                
                middle.setSkipped(false);
                //System.out.println("skipped set to false");
            }
            index++;
                //waiting for a button command
            //shuffle class is being notified twice and therefore continues to run through the loop.  Must make it wait again
            t = null;
        }
        middle.AllDone();
        //System.out.println("All Done");
    }
    
}
