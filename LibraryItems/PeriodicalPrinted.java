package LibraryItems;

public class PeriodicalPrinted extends Periodical implements Borrowable{
  private static Publication[] periodicalsTaken = new Publication[100];
  private int numOfCopies;
  private int numOfPages;

  public PeriodicalPrinted(String title, Author author, String publisher, int issueNum, int numOfCopies, int numOfPages) {
    super(title, author, publisher, issueNum);
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
    for (int i = 0; i < periodicalsTaken.length; i++) {
      if (periodicalsTaken[i] == null) {
        periodicalsTaken[i] = this;
        break;
      }
    }
  }

  public void returnPublication() {
    this.setStatus(Status.AVAILABLE);
    // remove the book from the booksTaken array
    for (int i = 0; i < periodicalsTaken.length; i++) {
      if (periodicalsTaken[i] == this) {
        periodicalsTaken[i] = null;
        break;
      }
    }
  }
}