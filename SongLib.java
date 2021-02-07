//Joshua Gole and Nabhanya Neb
//double check public, private, and static stuff
//confirm that global vars are allowed

import java.util.ArrayList;

public class SongLib{

public static ArrayList<Song> library = new ArrayList<Song>();

  public static void main (String[] args){
    addSong("Hold On", "Extreme Music", "Glory Pop 2", 2015);
    addSong("Man of the Year", "Juice WRLD", "Legends are Awesome", 2050);
    addSong("Got it in You", "BANNERS", "Where the Shadow Ends", 2020);

    System.out.println("before edits");
    printLibrary();
    System.out.println();

    editSong(library.get(1),"Man of the Year", "Juice WLRD", "Legends Never Die", 2020);

    System.out.println("after edits");
    printLibrary();
    System.out.println();

  }

  public static void addSong(String name, String artist, String album, int year){
    if (name==null || artist==null){
      failedToAdd();
      return;
    }
    if (checkDuplicates(name, artist)){
      failedToAdd();
      return;
    }
    if (album == null && year == 0)
      library.add(new Song(name, artist));
    else if (album == null)
      library.add(new Song(name, artist, year));
    else if (year == 0)
      library.add(new Song(name, artist, album));
    else
      library.add(new Song(name, artist, album, year));
  }

  public static void editSong (Song song, String name, String artist, String album, int year){
      if (!song.getName().equals(name))
        song.setName(name);
      if (!song.getArtist().equals(artist))
        song.setArtist(artist);
      if (!song.getAlbum().equals(album))
        song.setAlbum(album);
      if (song.getYear()!=year)
        song.setYear(year);
  }

  public void deleteSong (Song song){

  }

  public static boolean checkDuplicates(String name, String artist){
    for (int i = 0;i<library.size();i++){
      if (library.get(i).getName().equals(name) && library.get(i).getArtist().equals(artist))
        return true;
    }
    return false;
  }

  public static void failedToAdd(){
    //something later
  }

  public static void printLibrary(){
    for (Song s : library){
      s.printSong();
    }
  }
}
