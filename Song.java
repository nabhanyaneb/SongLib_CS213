//Joshua Gole and Nabhanya Neb

public class Song{
  private String name;
  private String artist;
  private String album;
  private int year;

  public Song(String name, String artist, String album, int year){
    this.name = name;
    this.artist = artist;
    this.album = album;
    this.year = year;
  }

  public Song(String name, String artist, String album){
    this.name = name;
    this.artist = artist;
    this.album = album;
  }

  public Song(String name, String artist, int year){
    this.name = name;
    this.artist = artist;
    this.year = year;
  }

  public Song(String name, String artist){
    this.name = name;
    this.artist = artist;
  }

  public String getName(){
    return name;
  }

  public String getArtist(){
    return artist;
  }

  public String getAlbum(){
    return album;
  }

  public int getYear(){
    return year;
  }

  public void setName(String name){
    this.name = name;
  }

  public void setArtist(String artist){
    this.artist = artist;
  }

  public void setAlbum(String album){
    this.album = album;
  }

  public void setYear(int year){
    this.year = year;
  }

  public void printSong(){
    System.out.println("Name: " + name +" | Artist: " + artist + " | Album: " + album + " | Year: "+year);
  }
}
