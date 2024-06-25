package LibraryItems;
import Authors.Author;

public class PeriodicalPrinted extends Periodical{
  private int numOfCopies;
  private int numOfPages;

  public PeriodicalPrinted(String title, Author author, String publisher, int publicationID, int issueNum, int numOfCopies, int numOfPages) {
    super(title, author, publisher, publicationID, issueNum);
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

  public static void editPublication(PeriodicalPrinted periodical, String newTitle, Author newAuthor, String newPublisher, int newIssueNum, int newNumOfCopies, int newNumOfPages) {
    periodical.setTitle(newTitle);
    periodical.setAuthor(newAuthor);
    periodical.setPublisher(newPublisher);
    periodical.setIssueNum(newIssueNum);
    periodical.setNumOfCopies(newNumOfCopies);
    periodical.setNumOfPages(newNumOfPages);
  }
}