package LibraryItems;

public abstract class Book extends Publication {
  private static int nextBookId = 0;
  private int bookId;
  private String ISBN;

  public Book (String title, Author author, String publisher, String ISBN) {
    super(title, author, publisher);
    this.ISBN = ISBN;
    nextBookId++;
    this.bookId = nextBookId;
    
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