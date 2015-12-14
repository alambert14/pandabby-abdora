
/**
 * This class creates the genre lists.
 * 
 * @author Abby Lambert 
 * @version 1.0.0
 */
public class ListMaker
{
    private SongMap map;
    private Song[] list;
    public Song[] oneGenre;
    public Song[] shuffled;
    
    /**
     * Constructor for the ListMaker class
     * @param String the genre to make the list from.
     */
    public ListMaker(String genre)
    {
        map = new SongMap();
        map.init();
        list = map.getSongList();

        int genreCounter = 0;
        for(int i = 0; i < list.length; i++)
        {
            if(list[i].getGenre().equals(genre))
            {
                genreCounter++;
            }
        }
        oneGenre = new Song[genreCounter];
        for(int a = 0, b = 0; a < list.length; a++)
        {
            if(list[a].getGenre().equals(genre))
            {
                oneGenre[b] = list[a];
                b++;
            }
        }
        shuffled = oneGenre;
        
        boolean fullShuffle = false;
        while(!fullShuffle)
        {
            
            for(int i = oneGenre.length-1; i > 0; i--)
            {
                int randNum = (int)(Math.random()*i);

                Song tempSong = shuffled[i];
                shuffled[i] = shuffled[randNum];
                shuffled[randNum] = tempSong;
            }
            fullShuffle = true;
            for(int i = 0; i < oneGenre.length; i++)
            {
                if (i < oneGenre.length-1) 
                {
                    if(shuffled[i].getArtist().equals(shuffled[i+1].getArtist()))
                    {
                        fullShuffle = false;
                    }
                }
            }
        }
    }

    /**
     * @return Song[] the unshuffled list of one genre
     */
    public Song[] getGenreList()
    {
        return oneGenre;
    }

    /**
     * @return Song[] the shuffled list of one genre
     */
    public Song[] getShuffled()
    {
        return shuffled;
    }
}
