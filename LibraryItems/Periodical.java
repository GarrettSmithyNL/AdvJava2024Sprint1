package LibraryItems;
import Authors.Author;

public abstract class Periodical extends  Publication {
  private int issueNum;

  public Periodical(String title, Author author, String publisher, int periodicalId, int issueNum) {
    super(title, author, publisher, periodicalId);
    this.issueNum = issueNum;
  }

  public int getIssueNum() {
    return issueNum;
  }

  public void setIssueNum(int issueNum) {
    this.issueNum = issueNum;
  }
}