package LibraryItems;
import Authors.Author;

/**
 * Represents a printed book, which is a subclass of the Book class.
 */
public class BookPrinted extends Book {
  private int numOfPages;

  /**
   * Constructs a BookPrinted object with the specified title, author, publisher, publication ID, ISBN, and number of pages.
   *
   * @param title         the title of the book
   * @param author        the author of the book
   * @param publisher     the publisher of the book
   * @param publicationId the publication ID of the book
   * @param ISBN          the ISBN of the book
   * @param numOfPages    the number of pages in the book
   */
  public BookPrinted(String title, Author author, String publisher, int publicationId, String ISBN, int numOfPages) {
    super(title, author, publisher, publicationId, ISBN);
    this.numOfPages = numOfPages;
  }

  /**
   * Returns the number of pages in the book.
   *
   * @return the number of pages
   */
  public int getNumOfPages() {
    return numOfPages;
  }

  /**
   * Sets the number of pages in the book.
   *
   * @param numOfPages the number of pages to set
   */
  public void setNumOfPages(int numOfPages) {
    this.numOfPages = numOfPages;
  }

  /**
   * Edits the publication details of the given BookPrinted object.
   *
   * @param book           the BookPrinted object to edit
   * @param newTitle       the new title of the book
   * @param newAuthor      the new author of the book
   * @param newPublisher   the new publisher of the book
   * @param newISBN        the new ISBN of the book
   * @param newNumOfPages  the new number of pages in the book
   */
  public static void editPublication(BookPrinted book, String newTitle, Author newAuthor, String newPublisher, String newISBN, int newNumOfPages) {
    book.setTitle(newTitle);
    book.setAuthor(newAuthor);
    book.setPublisher(newPublisher);
    book.setISBN(newISBN);
    book.setNumOfPages(newNumOfPages);
  }
}