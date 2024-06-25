package LibraryItems;
import Authors.Author;

public abstract class Publication implements Borrowable{
  private String title;
  private Author author;
  private String publisher;
  private Status status;
  private int publicationId;

  public Publication(String title, Author author, String publisher, int publicationId) {
    this.title = title;
    this.author = author;
    this.publisher = publisher;
    this.status = Status.AVAILABLE;
    this.publicationId = publicationId;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Author getAuthor() {
    return author;
  }

  public void setAuthor(Author author) {
    this.author = author;
  }

  public String getPublisher() {
    return publisher;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public void checkoutPublication() {

  }

  public int getPublicationId() {
    return publicationId;
  }

  public void borrowItem() {
    this.setStatus(Status.CHECKED_OUT);
  }

  public void returnItem() {
    this.setStatus(Status.AVAILABLE);
  }
}