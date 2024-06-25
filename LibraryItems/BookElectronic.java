package LibraryItems;

public class BookElectronic extends Book {
  private int numOfPages;

  public BookElectronic(String title, Author author, String publisher, String ISBN, int numOfPages) {
    super(title, author, publisher, ISBN);
    this.numOfPages = numOfPages;
  }

  public int getNumOfPages() {
    return numOfPages;
  }

  public void setNumOfPages(int numOfPages) {
    this.numOfPages = numOfPages;
  }
}