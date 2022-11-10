package CW1Assignment;

/**
 * Main program should be run in testing.
 *
 * 
 * @author     Julia Wozniak
 * @version    0.1 (10.11.2022)
 */

class Main 
{
    
  public static void main(String[] args) 
  {
    SongCollection mySongCollection = new SongCollection();
    mySongCollection = buildSongCollection(mySongCollection);
    menu(mySongCollection);
  }

  /**
    Method used to build sample songs and test they are stored.
    @return - An array list of songs called SongCollction.
  */
  public static SongCollection buildSongCollection(SongCollection mySongCollection)
  {   
    Song[] songs = new Song[10];
    
   /* Creating 10 songs for playlist in a [0] to [9] array. */ 

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

   /* Builidng a song collection with the songs created in the array list above.
    * Using a for loop to print the array list objects from 0 to 9.
    */
    
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
    Method: to display the latest song collection.
    @return No return is needed, void.
  */
  public static void latestSongCollection(SongCollection mySongCollection)
  {
    System.out.println("---------------");
    System.out.println("Updated Song Collection");
    System.out.println("======================");
    System.out.println("");
    mySongCollection.printHeader();
    mySongCollection.printSongs();
    System.out.println("");
  }

  /* Main method menu created within the application- displaying a menu with 5 options to user. */
  
  public static void menu(SongCollection mySongCollection)
  {
     /* Used to store selection of track. */

    int track,plays;
    String[] options = {"[1] Add a new song to the list of songs",
                            "[2] Remove a song from list of songs",
                            "[3] Print a list of all the songs stored",
                            "[4] Print a list of songs over a given number of plays",
                            "[0] Exit",
                       };
    /* Initialise option. */
    int choice = 1;
    while (choice !=0)
    {
      /* Display basic menu header. */

      System.out.println("");
      System.out.println("Song Collection Menu");
      System.out.println("====================");
      
      /* Display options to user. */

      for (String option : options)
      {
        System.out.println(option);
      }
      choice = InputReader.getInt("Please make your choice: ");
       
    /* Execute decisions from menu for the range of menu options. */

      switch(choice)
      {
        /* Adding a song into the Song Collection array. Input Reader used for user input. */
        case 1:
          String nameOfSong = InputReader.getString("Please enter Song Title: ");
          String theArtist = InputReader.getString("Please enter Artist: ");
          int plyCount = InputReader.getInt("Please enter Playcount: ");
          Song song = new Song(nameOfSong,theArtist,plyCount);
          mySongCollection.addSong(song);
          break; 

          /* Deleting a song from the Song Collection.  */
          
        case 2:
          latestSongCollection(mySongCollection);
          track = InputReader.getInt("Select ID of the track to delete: ");
          mySongCollection.deleteSong(track-1);
          System.out.println("xxxxxx Track Deleted xxxxxx");
          break;

          /* Prints the latest Song Collection. Press key allows to run menu again.*/  
        
        case 3:
          latestSongCollection(mySongCollection);
          pressKey();
          break;
          
          /* Print the songs over the inputted number of plays. Press key allows to run menu again. */

        case 4:
          plays = InputReader.getInt("Enter the number of plays: ");
          mySongCollection.printHeader();
          mySongCollection.printSelectSongs(plays);
          pressKey();
          break;

          /* Exit the menu. Menu will run again. */
          
        case 0:
          System.out.println("Bye....");
          break;
          
        /* Any other value input will be dismissed and line below will print. Menu will not run again. */

        default:
          System.out.println("Not a valid option, try again please.");
          break;
      }
    }
  }
}

