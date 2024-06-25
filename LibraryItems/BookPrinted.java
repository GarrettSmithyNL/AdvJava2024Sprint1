package LibraryItems;

public class BookPrinted extends Book implements Borrowable{
  private static Publication[] booksTaken = new Publication[100];
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

  public void checkoutPublication() {
    this.setStatus(Status.CHECKED_OUT);
    // push the book to the booksTaken array
    for (int i = 0; i < booksTaken.length; i++) {
      if (booksTaken[i] == null) {
        booksTaken[i] = this;
        break;
      }
    }
  }

  public void returnPublication() {
    this.setStatus(Status.AVAILABLE);
    // remove the book from the booksTaken array
    for (int i = 0; i < booksTaken.length; i++) {
      if (booksTaken[i] == this) {
        booksTaken[i] = null;
        break;
      }
    }
  }
}