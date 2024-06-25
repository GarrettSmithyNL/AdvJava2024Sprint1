package LibraryItems;
import Authors.Author;

public abstract class Periodical extends  Publication {
  private static int nextPeriodicalId = 0;
  private int periodicalId;
  private int issueNum;

  public Periodical(String title, Author author, String publisher, int issueNum) {
    super(title, author, publisher);
    this.issueNum = issueNum;
    nextPeriodicalId++;
    this.periodicalId = nextPeriodicalId;
  }

  public int getPeriodicalId() {
    return periodicalId;
  }

  public int getIssueNum() {
    return issueNum;
  }

  public void setIssueNum(int issueNum) {
    this.issueNum = issueNum;
  }
}