package LibraryItems;

public class BookPrinted extends Book {
  private int numOfCopies;
  private int numOfPages;

  public BookPrinted(String title, Author author, String publisher, String ISBN, int numOfCopies, int numOfPages) {
    super(title, author, publisher, ISBN);
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
}