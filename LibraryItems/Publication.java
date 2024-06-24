package LibraryItems;

public abstract class Publication implements Borrowable {
  private String title;
  private Author author;
  private String publisher;
  private Status status;

  public Publication(String title, Author author, String publisher) {
    this.title = title;
    this.author = author;
    this.publisher = publisher;
    this.status = Status.AVAILABLE;
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


}