package LibraryItems;
import Authors.Author;

public class BookAudio extends Book{
  private int durationSeconds;
  private String voicedBy;

  public BookAudio(String title, Author author, String publisher, int publicationID, String ISBN, int durationSeconds, String voicedBy) {
    super(title, author, publisher, publicationID, ISBN);
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

  public static void editPublication(BookAudio book, String newTitle, Author newAuthor, String newPublisher, String newISBN, int newDurationSeconds, String newVoicedBy) {
    book.setTitle(newTitle);
    book.setAuthor(newAuthor);
    book.setPublisher(newPublisher);
    book.setISBN(newISBN);
    book.setDurationSeconds(newDurationSeconds);
    book.setVoicedBy(newVoicedBy);   
  }
}