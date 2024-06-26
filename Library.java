import java.util.ArrayList;
import java.util.List;

import Authors.Author;
import LibraryItems.Book;
import LibraryItems.Publication;
import Patrons.Patron;

/**
 * The `Library` class represents a library that manages authors, patrons, and publications.
 * It provides methods to add, edit, and remove authors, patrons, and publications.
 * It also allows patrons to borrow and return publications.
 * The class keeps track of unique IDs for authors, patrons, and publications.
 * Additionally, it provides methods to retrieve authors, patrons, and publications based on various criteria.
 */
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

    /**
     * Represents a library.
     */
    public Library() {
        this.authors = new ArrayList<>();
        this.patrons = new ArrayList<>();
        this.publications = new ArrayList<>();
        this.checkedOutPublications = new ArrayList<>();
    }

    /**
     * Adds an author to the library.
     * 
     * @param author the author to be added
     */
    public void addAuthor(Author author) {
        authors.add(author);
    }

    /**
     * Edits the author's name and date of birth based on the given author ID.
     * 
     * @param authorid the ID of the author to be edited
     * @param newName the new name of the author
     * @param newDateOfBirth the new date of birth of the author
     */
    public void editAuthor(int authorid, String newName, String newDateOfBirth) {
        for (Author author : authors) {
            if (author.getAuthorID() == authorid){
                author.setName(newName);
                author.setDateOfBirth(newDateOfBirth);
                break;
            }
        }
    }

    /**
     * Removes the specified author from the library.
     *
     * @param author the author to be removed
     */
    public void removeAuthor(Author author) {
        authors.remove(author);
    }

    /**
     * Adds a patron to the library.
     * 
     * @param patron the patron to be added
     */
    public void addPatron(Patron patron) {
        patrons.add(patron);
    }

    /**
     * Edits the details of a patron with the specified patron ID.
     * 
     * @param patronid the ID of the patron to be edited
     * @param newName the new name of the patron
     * @param newAddress the new address of the patron
     * @param newPhone the new phone number of the patron
     */
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

    /**
     * Removes the specified patron from the library.
     *
     * @param patron the patron to be removed
     */
    public void removePatron(Patron patron) {
        patrons.remove(patron);
    }

    /**
     * Adds a publication to the library.
     *
     * @param publication the publication to be added
     */
    public void addPublication(Publication publication) {
        publications.add(publication);
    }

    /**
     * Removes the specified publication from the library.
     *
     * @param publication the publication to be removed
     */
    public void removePublication(Publication publication) {
        publications.remove(publication);
    }

    /**
     * Takes out a publication from the library for a patron.
     * This method borrows the specified publication and adds it to the list of checked out publications.
     *
     * @param publication the publication to be taken out
     * @param patron the patron who is taking out the publication
     */
    public void takeOutPublication(Publication publication, Patron patron) {
        publication.borrowItem();
        int[] checkedOutPublication = {publication.getPublicationId(), patron.getPatronID()};
        checkedOutPublications.add(checkedOutPublication);
    }

    /**
     * Returns a publication to the library.
     * This method marks the publication as returned and removes it from the list of checked out publications.
     *
     * @param publication the publication to be returned
     */
    public void returnPublication(Publication publication) {
        publication.returnItem();
        checkedOutPublications.removeIf(checkedOutPublication -> checkedOutPublication[0] == publication.getPublicationId());
    }

    /**
     * Generates a unique publication ID and increments the counter.
     *
     * @return The generated publication ID.
     */
    public static int generatePublicationId()  {
        int temp = publicationID;
        publicationID++;
        return temp;
    }

    /**
     * Generates a new author ID.
     * 
     * @return The generated author ID.
     */
    public static int generateAuthorId()  {
        int temp = authorID;
        authorID++;
        return temp;
    }

    /**
     * Generates a unique patron ID.
     *
     * @return The generated patron ID.
     */
    public static int generatePatronId()  {
        int temp = patronID;
        patronID++;
        return temp;
    }

    // Getters for the lists
    /**
     * Retrieves the Author object with the specified author name.
     * 
     * @param authorName the name of the author to retrieve
     * @return the Author object with the specified author name, or null if not found
     */
    public Author getAuthor(String authorName) {
        for (Author author : authors) {
            if (author.getName().equalsIgnoreCase(authorName)) {
                return author;
            }
        }
        return null;
    }

    /**
     * Retrieves a patron with the specified name from the library.
     *
     * @param patronName the name of the patron to retrieve
     * @return the patron with the specified name, or null if not found
     */
    public Patron getPatron(String patronName) {
        for (Patron patron : patrons) {
            if (patron.getName().equalsIgnoreCase(patronName)) {
                return patron;
            }
        }
        return null;
    }

    /**
     * Retrieves a publication from the library based on its title.
     * 
     * @param publicationTitle the title of the publication to retrieve
     * @return the Publication object with the specified title, or null if not found
     */
    public Publication getPublication(String publicationTitle) {
        for (Publication publication : publications) {
            if (publication.getTitle().equalsIgnoreCase(publicationTitle)) {
                return publication;
            }
        }
        return null;
    }

    /**
     * Retrieves a list of publications written by a specific author.
     *
     * @param authorName the name of the author
     * @return a list of publications written by the specified author
     */
    public List<Publication> getPublicationByAuthors(String authorName) {
        List<Publication> publicationsByAuthor = new ArrayList<>();
        for (Publication publication : publications) {
            if (publication.getAuthor().getName().equalsIgnoreCase(authorName)) {
                publicationsByAuthor.add(publication);
            }
        }
        return publicationsByAuthor;    
    }

    /**
     * Retrieves a publication from the library by its ISBN.
     * 
     * @param isbn the ISBN of the publication to retrieve
     * @return the publication with the specified ISBN, or null if not found
     */
    public Publication getPublicationByISBN(String isbn) {
        for (Publication publication : publications) {
            if (((Book)publication).getISBN().equalsIgnoreCase(isbn)) {
                return publication;
            }
        }
        return null;
    }
}


 
