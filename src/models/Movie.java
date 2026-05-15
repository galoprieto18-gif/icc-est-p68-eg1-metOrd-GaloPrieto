package models;

public class Movie {

  private String title;
  private String releaseYear;
  
  
  public Movie() {
  }


  public Movie(String title, String releaseYear) {
    this.title = title;
    this.releaseYear = releaseYear;
  }


  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public String getReleaseYear() {
    return releaseYear;
  }


  public void setReleaseYear(String releaseYear) {
    this.releaseYear = releaseYear;
  }


  @Override
  public String toString() {
    return "Movie [title=" + title + ", releaseYear=" + releaseYear + "]";
  }

}
