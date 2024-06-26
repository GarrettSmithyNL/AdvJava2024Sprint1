package LibraryItems;
import Authors.Author;

/**
 * The abstract class representing a periodical publication.
 * It extends the Publication class and provides additional functionality for managing issue numbers.
 */
public abstract class Periodical extends Publication {
  private int issueNum;

  /**
   * Constructs a Periodical object with the specified title, author, publisher, periodical ID, and issue number.
   *
   * @param title        the title of the periodical
   * @param author       the author of the periodical
   * @param publisher    the publisher of the periodical
   * @param periodicalId the ID of the periodical
   * @param issueNum     the issue number of the periodical
   */
  public Periodical(String title, Author author, String publisher, int periodicalId, int issueNum) {
    super(title, author, publisher, periodicalId);
    this.issueNum = issueNum;
  }

  /**
   * Returns the issue number of the periodical.
   *
   * @return the issue number of the periodical
   */
  public int getIssueNum() {
    return issueNum;
  }

  /**
   * Sets the issue number of the periodical.
   *
   * @param issueNum the issue number to set
   */
  public void setIssueNum(int issueNum) {
    this.issueNum = issueNum;
  }
}