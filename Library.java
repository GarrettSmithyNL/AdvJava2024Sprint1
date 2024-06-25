

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
}

