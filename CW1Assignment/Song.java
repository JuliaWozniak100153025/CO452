package CW1Assignment;

public class Song 
{
 String songName;
 String artistName;
int playCount;
 
 /** Constructor method to create a song object.
  * @return constructor method has no value.
  */
 public Song(String sName, String artName, int playyCount) 
{
    this.songName = sName;
    this.artistName = artName;
    this.playCount = playyCount;
 }
 /**
 Method which gets the name of the song.
 @return - A String representing the song name.
  */
public String getSongName()
{
    return songName;
}
 /**
 Method which gets the name of the artist.
 @return - A String representing the artist name.
  */
public String getArtistName()
{
    return artistName;
 /**
 Method which gets the play count.
 @return - A String representing the play count.
  */
}
public int getPlayCount()
{
    return playCount;
}
 /**
 Set method which updates the song name for a song.
 @return - void, no return value.
  */

public void setsongName(String sName)
{
    this.songName = sName;
}
 /**
 Set method which updates the artist name for a song.
 @return - void, no return value.
  */

  public void setartistName(String artName)
  {
      this.artistName = artName;
  }
   /**
 Set method which updates the play count for a song.
 @return - void, no return value.
  */

  public void setplayCount(int playyCount)
  {
      this.playCount = playyCount;
  }
  public void printSong()
  {
  System.out.println(songName+"  |  "+artistName+"  |  "+playCount);
  }
}


