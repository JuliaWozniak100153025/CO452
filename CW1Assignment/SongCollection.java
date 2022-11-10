package CW1Assignment;

import java.util.ArrayList;
/**
 Class which manages a playlist of songs.
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
  Method to get size of playlist
  @return void
  */
  public int songCollectionSize()
  {
    return mySongCollection .size();
  }


 /* The 'add' method to add the song to the array of songs */
 
 public void addSong(Song song)
    {
      mySongCollection.add(song);
    }

    /* The 'remove' method to delete the song from the array of songs */

public void deleteSong(int id)
    {
      mySongCollection.remove(id);
    }


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
Method: Prints a header for table of songs - needs attention! 
@return void
*/

public void printHeader()
{
  System.out.printf("--------------------------------%n");
  System.out.printf("| %-10s | %-8s | %4s |%n", "Song Name","Artist Name","Play Count");
  System.out.printf("--------------------------------%n");
}

/**
Method: Prints selected songs over a specified playcount
@return void
*/
public void printSelectSongs(int playCount)
{
  for (int index = 0; index < mySongCollection.size(); index++)
    {        
      Song s = mySongCollection .get(index);
      if (s.getPlayCount() > playCount)
      {
          System.out.print("["+(index+1)+"]");
          s.printSong();
      } 
    }

  }
}
