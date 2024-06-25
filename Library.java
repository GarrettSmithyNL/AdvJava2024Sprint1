import java.util.ArrayList;
import java.util.List;

import Authors.Author;
import LibraryItems.*;
import Patrons.Patron;

public class Library {
    private static int publicationID = 1;
    private final List<Author> authors;
    private final List<Patron> patrons;
    private final List<Publication> publications;

    public Library() {
        this.authors = new ArrayList<>();
        this.patrons = new ArrayList<>();
        this.publications = new ArrayList<>();
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


    // Publication management methods

    //create publication
    public void addPublication(Publication publication) {
        publications.add(publication);
    }

    public void editPublicaiton(int publicationID, String newTitle, Author newAuthor, String newPublisher, String newISBN, int newIssueNum, int newNumOfCopies, int newNumOfPages, int newDurationSeconds, String newVoicedBy) {
        for (Publication publication : publications) {
            if (publication.getPublicationId() == publicationID) {
                switch (publication.getClass().getName()) {
                    case "BookPrinted":
                        BookPrinted.editPublication((BookPrinted) publication, newTitle, newAuthor, newPublisher, newISBN, newNumOfCopies, newNumOfPages);
                        break;
                    case "BookAudio":
                        BookAudio.editPublication((BookAudio) publication, newTitle, newAuthor, newPublisher, newISBN, newDurationSeconds, newVoicedBy);
                        break;
                    case "BookElectronic":
                        BookElectronic.editPublication((BookElectronic) publication, newTitle, newAuthor, newPublisher, newISBN, newNumOfPages);
                        break;
                    case "PeriodicalPrinted":
                        PeriodicalPrinted.editPublication((PeriodicalPrinted) publication, newTitle, newAuthor, newPublisher, newIssueNum, newNumOfCopies, newNumOfPages);
                        break;
                    case "PeriodicalElectronic":
                        PeriodicalElectronic.editPublication((PeriodicalElectronic) publication, newTitle, newAuthor, newPublisher, newIssueNum, newNumOfPages);
                        break;
                }  
            }
        }
    }

    public void removePublication(Publication publication) {
        publications.remove(publication);
    }

    public static int generateID()  {
        int temp = publicationID;
        publicationID++;
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
}


