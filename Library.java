import java.util.ArrayList;
import java.util.List;

import Authors.Author;
import Patrons.Patron;

public class Library {
    private final List<Author> authors;
    private final List<Patron> patrons;

    public Library() {
        this.authors = new ArrayList<>();
        this.patrons = new ArrayList<>();
    }

    // Author management methods
    public void addAuthor(Author author) {
        authors.add(author);
    }

    public void editAuthor(String authorID, String newName, String newDateOfBirth) {
        for (Author author : authors) {
            if (author.getAuthorID().equals(authorID)) {
                author.setName(newName);
                author.setDateOfBirth(newDateOfBirth);
                break;
            }
        }
    }

    public void removeAuthor(String authorID) {
        authors.removeIf(author -> author.getAuthorID().equals(authorID));
    }

    // Patron management methods
    public void addPatron(Patron patron) {
        patrons.add(patron);
    }

    public void editPatron(String patronID, String newName, String newAddress, String newPhone) {
        for (Patron patron : patrons) {
            if (patron.getPatronID().equals(patronID)) {
                patron.setName(newName);
                patron.setAddress(newAddress);
                patron.setPhone(newPhone);
                break;
            }
        }
    }

    public void removePatron(String patronID) {
        patrons.removeIf(patron -> patron.getPatronID().equals(patronID));
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
}


