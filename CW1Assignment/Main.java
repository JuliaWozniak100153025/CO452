package CW1Assignment;

class Main 
{
    
  public static void main(String[] args) 
  {
    SongCollection mySongCollection = new SongCollection();
    mySongCollection = buildSongCollection(mySongCollection);
    menu(mySongCollection);
  }

  /**
    Method to build sample songs and test they are stored
    @return - playlist arraylist of songs.
  */
  public static SongCollection buildSongCollection(SongCollection mySongCollection)
  {   
    Song[] songs = new Song[10];
    
    // Create 10 songs for playlist
    songs[0] = new Song("Rum Rage","Sticky Fingers",12);
    songs[1] = new Song("Ghosts","Bakar",23);
    songs[2] = new Song("The Neighbourhood","The Beach",15);
    songs[3] = new Song("Ocean Valley","Yellow Mellow",19);
    songs[4] = new Song("Lime Cordiale","Robbery",34);
    songs[5] = new Song("Enter Sandman","Metallica",9);
    songs[6] = new Song("Bohemian Rhapsody","Queen",7);
    songs[7] = new Song("Fools Garden","Lemon Tree",18);  
    songs[8] = new Song("Arabella","Arctic Monkeys",33);
    songs[9] = new Song("Wonderwall","Oasis",18);

    // Create playlist with the sample songs
    
    for (int loop=0;loop<=9;loop++)
      {
        mySongCollection.addSong(songs[loop]);
      }
    
    return mySongCollection;
  }     

  /**
    Method: to provide user with a pause between menu option execution
    @return void no return required.
  */
  public static void pressKey()
  {
    System.out.println("------------------------------------------------------");
    System.out.println("<<< Press a key to continue >>>>");
    System.out.println("------------------------------------------------------");
    try{System.in.read();}
        catch(Exception e){}
  }



  /**
    Method: to display the latest playlist
    @return void so no return value required
  */
  public static void latestSongCollection(SongCollection mySongCollection)
  {
    System.out.println("---------------");
    System.out.println("Latest Playlist");
    System.out.println("---------------");
    System.out.println("");
    mySongCollection.printHeader();
    mySongCollection.printSongs();
    System.out.println("");
  }
  
  public static void menu(SongCollection mySongCollection)
  {
    int track; //Used to store selection of track
    String[] options = {"[1] Add a new song to the list of songs",
                            "[2] Remove a song from list of songs",
                            "[3] Print a list of all the songs stored",
                            "[4] Print a list of songs over a given number of plays",
                            "[0] Exit",
                       };
    //initialise option
    int choice = 1;
    while (choice !=0)
    {
      //Display basic menu header
      System.out.println("");
      System.out.println("Playlist Menu");
      System.out.println("=============");
      
      //Display options
      for (String option : options)
      {
        System.out.println(option);
      }
      choice = InputReader.getInt("Please make your choice: ");
       
    //Execute decisions from menu for the range of menu options        
      switch(choice)
      {
        case 1:
          String nameOfSong = InputReader.getString("Please enter Song Title: ");
          String theArtist = InputReader.getString("Please enter Artist: ");
          int plyCount = InputReader.getInt("Please enter Playcount: ");
          Song song = new Song(nameOfSong,theArtist,plyCount);
          mySongCollection.addSong(song);
          break;
          
        case 2:
          latestSongCollection(mySongCollection);
          track = InputReader.getInt("Select id of track to delete: ");
          mySongCollection.deleteSong(track-1);
          System.out.println("xxxxxx Track Deleted xxxxxx");
          break;
          
        case 3:
          latestSongCollection(mySongCollection);
          pressKey();
          break;
          
        case 4:
          track = InputReader.getInt("Enter number of plays: ");
          mySongCollection.printHeader();
          mySongCollection.printSelectSongs(track);
          pressKey();
          break;
          
        case 0:
          System.out.println("Bye....");
          break;
          
        default:
          System.out.println("Not a valid options, try again...");
          break;
      }
    }
  }
}

