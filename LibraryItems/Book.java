package LibraryItems;

public abstract class Book extends Publication {
  private int bookId = 0;
  private String ISBN;

  public Book (String title, Author author, String publisher, String ISBN) {
    super(title, author, publisher);
    this.ISBN = ISBN;
    bookId++;
  }

  public int getBookId() {
    return bookId;
  }

  public String getISBN() {
    return ISBN;
  }

  public void setISBN(String ISBN) {
    this.ISBN = ISBN;
  }
}