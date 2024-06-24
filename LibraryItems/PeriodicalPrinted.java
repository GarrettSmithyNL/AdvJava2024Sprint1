public class PeriodicalPrinted extends Periodical {
  private int numOfCopies;
  private int numOfPages;

  public PeriodicalPrinted(String title, Author author, String publisher, int issueNum, int numOfCopies, int numOfPages) {
    super(title, author, publisher, issueNum)
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