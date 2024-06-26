package Authors;

import java.util.ArrayList;
import java.util.List;

/**
 * The Author class represents an author in a publication system.
 * It contains information about the author, such as their ID, name, date of birth,
 * and a list of publications written by the author.
 */
public class Author {
    private int authorID;
    private String name;
    private String dateOfBirth;
    private List<String> publicationsWritten;

    /**
     * Constructs an Author object with the specified author ID, name, and date of birth.
     * The list of publications written by the author is initialized as an empty list.
     *
     * @param authorID     the ID of the author
     * @param name         the name of the author
     * @param dateOfBirth  the date of birth of the author
     */
    public Author(int authorID, String name, String dateOfBirth) {
        this.authorID = authorID;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.publicationsWritten = new ArrayList<>();
    }

    // Getters and setters

    /**
     * Returns the ID of the author.
     *
     * @return the ID of the author
     */
    public int getAuthorID() {
        return authorID;
    }

    /**
     * Sets the ID of the author.
     *
     * @param authorID the ID of the author
     */
    public void setAuthorID(int authorID) {
        this.authorID = authorID;
    }

    /**
     * Returns the name of the author.
     *
     * @return the name of the author
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the author.
     *
     * @param name the name of the author
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the date of birth of the author.
     *
     * @return the date of birth of the author
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the date of birth of the author.
     *
     * @param dateOfBirth the date of birth of the author
     */
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Returns the list of publications written by the author.
     *
     * @return the list of publications written by the author
     */
    public List<String> getPublicationsWritten() {
        return publicationsWritten;
    }

    /**
     * Adds a publication to the list of publications written by the author.
     *
     * @param publicationID the ID of the publication to be added
     */
    public void addPublication(String publicationID) {
        this.publicationsWritten.add(publicationID);
    }

    /**
     * Removes a publication from the list of publications written by the author.
     *
     * @param publicationID the ID of the publication to be removed
     */
    public void removePublication(String publicationID) {
        this.publicationsWritten.remove(publicationID);
    }
}
