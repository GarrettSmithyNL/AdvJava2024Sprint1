package LibraryItems;
import Authors.Author;

public abstract class Book extends Publication {
  private String ISBN;

  public Book (String title, Author author, String publisher, int publicationId, String ISBN) {
    super(title, author, publisher, publicationId);
    this.ISBN = ISBN;
  }

  public String getISBN() {
    return ISBN;
  }

  public void setISBN(String ISBN) {
    this.ISBN = ISBN;
  }
}