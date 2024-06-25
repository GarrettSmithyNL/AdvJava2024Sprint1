package LibraryItems;
import Authors.Author;

public class PeriodicalElectronic extends Periodical {
  private int numOfPages;

  public PeriodicalElectronic (String title, Author author, String publisher, int publicationId, int issueNum, int numOfPages) {
    super(title, author, publisher, publicationId, issueNum);
    this.numOfPages = numOfPages;
  }

  public int getNumOfPages() {
    return numOfPages;
  }

  public void setNumOfPages(int numOfPages) {
    this.numOfPages = numOfPages;
  }

  public static void editPublication(PeriodicalElectronic periodical, String newTitle, Author newAuthor, String newPublisher, int newIssueNum, int newNumOfPages) {
    periodical.setTitle(newTitle);
    periodical.setAuthor(newAuthor);
    periodical.setPublisher(newPublisher);
    periodical.setIssueNum(newIssueNum);
    periodical.setNumOfPages(newNumOfPages);   
  }
}