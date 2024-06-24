public abstract class Periodical extends  Publication {
  private int periodicalId = 0;
  private int issueNum;

  public Periodical(String title, Author author, String publisher, int issueNum) {
    super(title, author, publisher);
    this.issueNum = issueNum;
    periodicalId++;
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