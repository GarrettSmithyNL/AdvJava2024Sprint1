package library.authors;

import java.util.ArrayList;
import java.util.List;

public class Author {
    private String authorID;
    private String name;
    private String dateOfBirth;
    private List<String> publicationsWritten;

    public Author(String authorID, String name, String dateOfBirth) {
        this.authorID = authorID;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.publicationsWritten = new ArrayList<>();
    }

    // Getters and setters
    public String getAuthorID() {
        return authorID;
    }

    public void setAuthorID(String authorID) {
        this.authorID = authorID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public List<String> getPublicationsWritten() {
        return publicationsWritten;
    }

    public void addPublication(String publicationID) {
        this.publicationsWritten.add(publicationID);
    }

    public void removePublication(String publicationID) {
        this.publicationsWritten.remove(publicationID);
    }
}
