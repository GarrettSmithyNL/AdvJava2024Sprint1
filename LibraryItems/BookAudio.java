package LibraryItems;
import Authors.Author;

public class BookAudio extends Book{
  private int durationSeconds;
  private String voicedBy;

  public BookAudio(String title, Author author, String publisher, String ISBN, int durationSeconds, String voicedBy) {
    super(title, author, publisher, ISBN);
    this.durationSeconds = durationSeconds;
    this.voicedBy = voicedBy;
  }

  public int getDurationSeconds() {
    return durationSeconds;
  }

  public void setDurationSeconds(int durationSeconds) {
    this.durationSeconds = durationSeconds;
  }

  public String getVoicedBy() {
    return voicedBy;
  }

  public void setVoicedBy(String voicedBy) {
    this.voicedBy = voicedBy;
  }
}