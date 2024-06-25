package LibraryItems;
import Authors.Author;

public class PeriodicalPrinted extends Periodical {
  private int numOfPages;

  public PeriodicalPrinted(String title, Author author, String publisher, int publicationID, int issueNum, int numOfPages) {
    super(title, author, publisher, publicationID, issueNum);

    this.numOfPages = numOfPages;
  }

  public int getNumOfPages() {
    return numOfPages;
  }

  public void setNumOfPages(int numOfPages) {
    this.numOfPages = numOfPages;
  }

  public static void editPublication(PeriodicalPrinted periodical, String newTitle, Author newAuthor, String newPublisher, int newIssueNum, int newNumOfPages) {
    periodical.setTitle(newTitle);
    periodical.setAuthor(newAuthor);
    periodical.setPublisher(newPublisher);
    periodical.setIssueNum(newIssueNum);
    periodical.setNumOfPages(newNumOfPages);
  }
}