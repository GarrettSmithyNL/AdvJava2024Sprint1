package LibraryItems;
import Authors.Author;

/**
 * The Publication class represents a publication in a library.
 * It is an abstract class that implements the Borrowable interface.
 */
public abstract class Publication implements Borrowable {
  private String title;
  private Author author;
  private String publisher;
  private Status status;
  private int publicationId;

  /**
   * Constructs a Publication object with the specified title, author, publisher, and publication ID.
   *
   * @param title         the title of the publication
   * @param author        the author of the publication
   * @param publisher     the publisher of the publication
   * @param publicationId the ID of the publication
   */
  public Publication(String title, Author author, String publisher, int publicationId) {
    this.title = title;
    this.author = author;
    this.publisher = publisher;
    this.status = Status.AVAILABLE;
    this.publicationId = publicationId;
  }

  /**
   * Returns the title of the publication.
   *
   * @return the title of the publication
   */
  public String getTitle() {
    return title;
  }

  /**
   * Sets the title of the publication.
   *
   * @param title the title of the publication
   */
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Returns the author of the publication.
   *
   * @return the author of the publication
   */
  public Author getAuthor() {
    return author;
  }

  /**
   * Sets the author of the publication.
   *
   * @param author the author of the publication
   */
  public void setAuthor(Author author) {
    this.author = author;
  }

  /**
   * Returns the publisher of the publication.
   *
   * @return the publisher of the publication
   */
  public String getPublisher() {
    return publisher;
  }

  /**
   * Sets the publisher of the publication.
   *
   * @param publisher the publisher of the publication
   */
  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  /**
   * Returns the status of the publication.
   *
   * @return the status of the publication
   */
  public Status getStatus() {
    return status;
  }

  /**
   * Sets the status of the publication.
   *
   * @param status the status of the publication
   */
  public void setStatus(Status status) {
    this.status = status;
  }

  /**
   * Checks out the publication.
   */
  public void checkoutPublication() {
    // Implementation goes here
  }

  /**
   * Returns the ID of the publication.
   *
   * @return the ID of the publication
   */
  public int getPublicationId() {
    return publicationId;
  }

  /**
   * Borrows the publication by setting its status to CHECKED_OUT.
   */
  public void borrowItem() {
    this.setStatus(Status.CHECKED_OUT);
  }

  /**
   * Returns the publication by setting its status to AVAILABLE.
   */
  public void returnItem() {
    this.setStatus(Status.AVAILABLE);
  }
}