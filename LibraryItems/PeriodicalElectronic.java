package LibraryItems;
import Authors.Author;

public class PeriodicalElectronic extends Periodical {
  private int numOfPages;

  public PeriodicalElectronic (String title, Author author, String publisher, int issueNum, int numOfPages) {
    super(title, author, publisher, issueNum);
    this.numOfPages = numOfPages;
  }

  public int getNumOfPages() {
    return numOfPages;
  }

  public void setNumOfPages(int numOfPages) {
    this.numOfPages = numOfPages;
  }
}