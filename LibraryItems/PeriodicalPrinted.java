package LibraryItems;
import Authors.Author;

/**
 * Represents a printed periodical item in a library.
 * Extends the Periodical class.
 */
public class PeriodicalPrinted extends Periodical {
  private int numOfPages;

  /**
   * Constructs a PeriodicalPrinted object with the specified title, author, publisher, publication ID, issue number, and number of pages.
   *
   * @param title          the title of the periodical
   * @param author         the author of the periodical
   * @param publisher      the publisher of the periodical
   * @param publicationID  the ID of the periodical publication
   * @param issueNum       the issue number of the periodical
   * @param numOfPages     the number of pages in the periodical
   */
  public PeriodicalPrinted(String title, Author author, String publisher, int publicationID, int issueNum, int numOfPages) {
    super(title, author, publisher, publicationID, issueNum);

    this.numOfPages = numOfPages;
  }

  /**
   * Returns the number of pages in the periodical.
   *
   * @return the number of pages
   */
  public int getNumOfPages() {
    return numOfPages;
  }

  /**
   * Sets the number of pages in the periodical.
   *
   * @param numOfPages the number of pages to set
   */
  public void setNumOfPages(int numOfPages) {
    this.numOfPages = numOfPages;
  }

  /**
   * Edits the publication details of the given PeriodicalPrinted object.
   *
   * @param periodical    the PeriodicalPrinted object to edit
   * @param newTitle      the new title of the periodical
   * @param newAuthor     the new author of the periodical
   * @param newPublisher  the new publisher of the periodical
   * @param newIssueNum   the new issue number of the periodical
   * @param newNumOfPages the new number of pages in the periodical
   */
  public static void editPublication(PeriodicalPrinted periodical, String newTitle, Author newAuthor, String newPublisher, int newIssueNum, int newNumOfPages) {
    periodical.setTitle(newTitle);
    periodical.setAuthor(newAuthor);
    periodical.setPublisher(newPublisher);
    periodical.setIssueNum(newIssueNum);
    periodical.setNumOfPages(newNumOfPages);
  }
}