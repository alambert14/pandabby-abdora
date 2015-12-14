/**
 * This class interracts with all of the threads and contains synchronized methods so they can work
 * together.
 * 
 * @author Abby Lambert 
 * @version 1.0.0
 */
public class MiddleMan
{
    private boolean skipped;
    private boolean done;
    /**
     * Constructor for the MiddleMan class
     */
    public MiddleMan()
    {
        skipped = false;
        done = false;
    }
    /**
     * @return boolean whether or not a song has been skipped
     */
    public boolean getSkipped()
    {
        return skipped;
    }
    /**
     * @param boolean whether or not a song has been skipped
     */
    public void setSkipped(boolean s)
    {
        skipped = s;
    }
    /**
     * @return boolean whether or not the list has run out of songs
     */
    public boolean getDone()
    {
        return done;
    }
    /**
     * @param boolean whether or not the list has run out of songs
     */
    public void setDone(boolean d)
    {
        done = d;
    }
    
    /**
     * Is called if everything is a-okay
     */
    public synchronized void NoWorries()
    {
        notify();
    }
    
    /**
     * Is called if the list of songs has run out of songs to notify the runner class
     */
    public synchronized void AllDone()
    {
        notify();
        done = true;
    }

    /**
     * Is called if a song has been finished to notify the Player class
     */
    public synchronized void SongDone()
    {
        notify();
    }

    /**
     * Is called in order to pause a thread to wait for a another to notify.
     */
    public synchronized void Waiting()
    {
        try
        {
            wait();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Your code sucks");
        }
    }

    
}
