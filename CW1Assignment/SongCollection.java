package CW1Assignment;
import java.util.ArrayList;

/**
 * Class Song Collection - array list created, all menu option methods created.
 *
 * 
 * @author     Julia Wozniak
 * @version    0.1 (01.11.2022)
 */

public class SongCollection  

/* ArrayList creates a list which will store the songs. */
{
 private ArrayList<Song> mySongCollection;

 public SongCollection ()
  {
    mySongCollection  = new ArrayList<>();
  }

  /**
  Method to get size of the Song Collection.
  @return void - There is no return of any type, as void keyword is used.
  */
  public int songCollectionSize()
  {
    return mySongCollection .size();
  }


 /* The 'add' method to add the song to the array of songs. */
 
 public void addSong(Song song)
    {
      mySongCollection.add(song);
    }

    /* The 'remove' method to delete the song from the array of songs. */

public void deleteSong(int id)
    {
      mySongCollection.remove(id);
    }

/* Method used to print the list of songs in the array. */

public void printSongs()
{
  for (int index = 0; index < mySongCollection.size(); index++)
  {
      Song s = mySongCollection.get(index);
      System.out.print("["+(index+1)+"]");
      s.printSong();
  }
}

/**
Method: Prints a header for the table of songs.
*/

public void printHeader()
{}

/**
Method: Prints selected songs over a specified number of times played.
@return void - - There is no return of any type, as void keyword is used.
*/

public void printSelectSongs(int numOfPlays)
{
  for (int index = 0; index < mySongCollection.size(); index++)
    {        
      Song s = mySongCollection .get(index);
      if (s.getnumberOfPlays() > numOfPlays)
      {
          System.out.print("["+(index+1)+"]");
          s.printSong();
      } 
    }

  }
}
