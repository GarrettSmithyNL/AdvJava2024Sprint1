package LibraryItems;
import Authors.Author;

/**
 * The abstract class representing a book publication.
 * It extends the Publication class.
 */
public abstract class Book extends Publication {
  private String ISBN;

  /**
   * Constructs a Book object with the specified title, author, publisher, publication ID, and ISBN.
   *
   * @param title         the title of the book
   * @param author        the author of the book
   * @param publisher     the publisher of the book
   * @param publicationId the ID of the publication
   * @param ISBN          the ISBN (International Standard Book Number) of the book
   */
  public Book(String title, Author author, String publisher, int publicationId, String ISBN) {
    super(title, author, publisher, publicationId);
    this.ISBN = ISBN;
  }

  /**
   * Returns the ISBN (International Standard Book Number) of the book.
   *
   * @return the ISBN of the book
   */
  public String getISBN() {
    return ISBN;
  }

  /**
   * Sets the ISBN (International Standard Book Number) of the book.
   *
   * @param ISBN the ISBN to set
   */
  public void setISBN(String ISBN) {
    this.ISBN = ISBN;
  }
}