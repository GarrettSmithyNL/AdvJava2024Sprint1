import java.util.ArrayList;
import java.util.List;

import Authors.Author;
import LibraryItems.*;
import Patrons.Patron;

public class Library {
    // Static variables to keep track of the next ID to assign to a new Author, Patron, or Publication
    private static int publicationID = 1;
    private static int authorID = 1;
    private static int patronID = 1;
    // Lists to store the Authors, Patrons, Publications, and checked out Publications
    private final List<Author> authors;
    private final List<Patron> patrons;
    private final List<Publication> publications;
    private final List<int[]> checkedOutPublications;

    // Constructor to initialize the lists
    public Library() {
        this.authors = new ArrayList<>();
        this.patrons = new ArrayList<>();
        this.publications = new ArrayList<>();
        this.checkedOutPublications = new ArrayList<>();
    }

    // add, edit, and remove Author methods
    public void addAuthor(Author author) {
        authors.add(author);
    }

    public void editAuthor(int authorid, String newName, String newDateOfBirth) {
        for (Author author : authors) {
            if (author.getAuthorID() == authorid){
                author.setName(newName);
                author.setDateOfBirth(newDateOfBirth);
                break;
            }
        }
    }

    public void removeAuthor(int authorid) {
        authors.removeIf(author -> author.getAuthorID() == authorid);
    }

    // add, edit, and remove Patron methods
    public void addPatron(Patron patron) {
        patrons.add(patron);
    }

    public void editPatron(int patronid, String newName, String newAddress, String newPhone) {
        for (Patron patron : patrons) {
            if (patron.getPatronID() == patronid) {
                patron.setName(newName);
                patron.setAddress(newAddress);
                patron.setPhone(newPhone);
                break;
            }
        }
    }

    public void removePatron(int patronid) {
        patrons.removeIf(patron -> patron.getPatronID() == patronid);
    }


    // add, edit, and remove Publication methods
    public void addPublication(Publication publication) {
        publications.add(publication);
    }

    public void removePublication(Publication publication) {
        publications.remove(publication);
    }

    // Methods to take out and return Publications
    public void takeOutPublication(Publication publication, Patron patron) {
        publication.borrowItem();
        int[] checkedOutPublication = {publication.getPublicationId(), patron.getPatronID()};
        checkedOutPublications.add(checkedOutPublication);
    }

    public void returnPublication(Publication publication) {
        publication.returnItem();
        checkedOutPublications.removeIf(checkedOutPublication -> checkedOutPublication[0] == publication.getPublicationId());
    }

    // Generate unique IDs for Authors, Patrons, and Publications
    public static int generatePublicationId()  {
        int temp = publicationID;
        publicationID++;
        return temp;
    }

    public static int generateAuthorId()  {
        int temp = authorID;
        authorID++;
        return temp;
    }

    public static int generatePatronId()  {
        int temp = patronID;
        patronID++;
        return temp;
    }
        
    // Method to search publications
    public List<Publication> searchPublications(String query) {
        List<Publication> results = new ArrayList<>();
        for (Author author : authors) {
            for (String publicationID : author.getPublicationsWritten()) {
                Publication publication = findPublicationByID(publicationID);
                if (publication != null) {
                    if (publication.getTitle().equalsIgnoreCase(query) ||
                            publication.getAuthor().getName().equalsIgnoreCase(query) ||
                            (publication instanceof Book && ((Book) publication).getISBN().equalsIgnoreCase(query))) {
                        results.add(publication);
                    }
                }
            }
        }
        return results;
    }

    // Helper method to find publication by ID
    private Publication findPublicationByID(String publicationID) {
        // This method should find and return a Publication object by its ID.
        // Implementation depends on how publications are stored in the library.
        // Assuming a list or map of publications exists.
        return null; // Replace with actual implementation.
    }

    // Getters for the lists
    public Author getAuthor(String authorName) {
        for (Author author : authors) {
            if (author.getName().equalsIgnoreCase(authorName)) {
                return author;
            }
        }
        return null;
    }
}


