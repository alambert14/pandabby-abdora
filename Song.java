/**
 * Stores data for a perticular Song object.
 * 
 * @author Abby Lambert 
 * @version 1.0.0
 */
public class Song
{
    private String filename;
    private String genre;
    private int seconds;
    private boolean isLiked;
    private String songName;
    private String artist;
    private String cover;
    
    /**
     * Constructor for the Song class
     */
    public Song(String file, String name, String art, String gen, int sec, boolean like, String c) 
    {
        filename = file;
        songName = name;
        artist = art;
        genre = gen;
        seconds = sec;
        isLiked = like;
        cover = c;
    }
    
    /**
     * @return The filename of the song
     */
    public String getFilename()
    {
        return filename;
    }
    /**
     * @return The name of the song
     */
    public String getSongName()
    {
        return songName;
    }
    /**
     * @return The artist name of the song
     */
    public String getArtist()
    {
        return artist;
    }
    /**
     * @return The genre of the song
     */
    public String getGenre()
    {
        return genre;
    }
    /**
     * @return The length of the song in minutes
     */
    public int getSeconds()
    {
        return seconds;
    }
    /**
     * @return Whether or not the song is "liked"
     */
    public boolean getIsLiked()
    {
        return isLiked;
    }
    /**
     * @return Filename of the album cover
     */
    public String getCover()
    {
        return cover;
    }
    
    /**
     * @param String
     */
    public void setFilename(String file)
    {
        filename = file;
    }
    /**
     * @param String
     */
    public void setSongName(String name)
    {
        songName = name;
    }
    /**
     * @param String
     */
    public void setArtist(String art)
    {
        artist = art;
    }
    /**
     * @param String
     */
    public void setGenre(String gen)
    {
        genre = gen;
    }
    /**
     * @param int
     */
    public void setSeconds(int sec)
    {
        seconds = sec;
    }
    /**
     * @param boolean
     */
    public void setIsLiked(boolean like)
    {
        isLiked = like;
    }
    /**
     * @param string
     */
    public void setCover(String c)
    {
        cover = c;
    }
    
}
