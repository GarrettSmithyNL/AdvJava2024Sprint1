package LibraryItems;
import Authors.Author;

/**
 * Represents an audio book, which is a type of book that has an additional duration in seconds and is voiced by a specific person.
 * Inherits properties and methods from the Book class.
 */
public class BookAudio extends Book {
  private int durationSeconds;
  private String voicedBy;

  /**
   * Constructs a new BookAudio object with the specified title, author, publisher, publication ID, ISBN, duration in seconds, and voice actor.
   *
   * @param title           the title of the book
   * @param author          the author of the book
   * @param publisher       the publisher of the book
   * @param publicationID   the publication ID of the book
   * @param ISBN            the ISBN of the book
   * @param durationSeconds the duration of the audio book in seconds
   * @param voicedBy        the person who voiced the audio book
   */
  public BookAudio(String title, Author author, String publisher, int publicationID, String ISBN, int durationSeconds, String voicedBy) {
    super(title, author, publisher, publicationID, ISBN);
    this.durationSeconds = durationSeconds;
    this.voicedBy = voicedBy;
  }

  /**
   * Gets the duration of the audio book in seconds.
   *
   * @return the duration of the audio book in seconds
   */
  public int getDurationSeconds() {
    return durationSeconds;
  }

  /**
   * Sets the duration of the audio book in seconds.
   *
   * @param durationSeconds the duration of the audio book in seconds
   */
  public void setDurationSeconds(int durationSeconds) {
    this.durationSeconds = durationSeconds;
  }

  /**
   * Gets the person who voiced the audio book.
   *
   * @return the person who voiced the audio book
   */
  public String getVoicedBy() {
    return voicedBy;
  }

  /**
   * Sets the person who voiced the audio book.
   *
   * @param voicedBy the person who voiced the audio book
   */
  public void setVoicedBy(String voicedBy) {
    this.voicedBy = voicedBy;
  }

  /**
   * Edits the publication details of a BookAudio object.
   *
   * @param book             the BookAudio object to be edited
   * @param newTitle         the new title of the book
   * @param newAuthor        the new author of the book
   * @param newPublisher     the new publisher of the book
   * @param newISBN          the new ISBN of the book
   * @param newDurationSeconds the new duration of the audio book in seconds
   * @param newVoicedBy      the new person who voiced the audio book
   */
  public static void editPublication(BookAudio book, String newTitle, Author newAuthor, String newPublisher, String newISBN, int newDurationSeconds, String newVoicedBy) {
    book.setTitle(newTitle);
    book.setAuthor(newAuthor);
    book.setPublisher(newPublisher);
    book.setISBN(newISBN);
    book.setDurationSeconds(newDurationSeconds);
    book.setVoicedBy(newVoicedBy);
  }
}