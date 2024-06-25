package LibraryItems;
import Authors.Author;

public class BookPrinted extends Book{
  private int numOfCopies;
  private int numOfPages;

  public BookPrinted(String title, Author author, String publisher, int publicationId, String ISBN, int numOfCopies, int numOfPages) {
    super(title, author, publisher, publicationId, ISBN);
    this.numOfCopies = numOfCopies;
    this.numOfPages = numOfPages;
  }

  public int getNumOfCopies() {
    return numOfCopies;
  }

  public void setNumOfCopies(int numOfCopies) {
    this.numOfCopies = numOfCopies;
  }

  public int getNumOfPages() {
    return numOfPages;
  }

  public void setNumOfPages(int numOfPages) {
    this.numOfPages = numOfPages;
  }

  public static void editPublication(BookPrinted book, String newTitle, Author newAuthor, String newPublisher, String newISBN, int newNumOfCopies, int newNumOfPages) {
    book.setTitle(newTitle);
    book.setAuthor(newAuthor);
    book.setPublisher(newPublisher);
    book.setISBN(newISBN);
    book.setNumOfCopies(newNumOfCopies);
    book.setNumOfPages(newNumOfPages);
  }
}