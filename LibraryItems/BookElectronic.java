package LibraryItems;
import Authors.Author;

public class BookElectronic extends Book {
  private int numOfPages;

  public BookElectronic(String title, Author author, String publisher, int publicationId, String ISBN, int numOfPages) {
    super(title, author, publisher, publicationId, ISBN);
    this.numOfPages = numOfPages;
  }

  public int getNumOfPages() {
    return numOfPages;
  }

  public void setNumOfPages(int numOfPages) {
    this.numOfPages = numOfPages;
  }

  public static void editPublication(BookElectronic book, String newTitle, Author newAuthor, String newPublisher, String newISBN, int newNumOfPages) {
    book.setTitle(newTitle);
    book.setAuthor(newAuthor);
    book.setPublisher(newPublisher);
    book.setISBN(newISBN);
    book.setNumOfPages(newNumOfPages);
  }
}