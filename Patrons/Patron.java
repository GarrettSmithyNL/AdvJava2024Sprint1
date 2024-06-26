package Patrons;

import java.util.ArrayList;
import java.util.List;

/**
 * The Patron class represents a library patron.
 * It stores information about the patron's ID, name, address, phone number, and borrowed items.
 */
public class Patron {
    private int patronID;
    private String name;
    private String address;
    private String phone;
    private List<String> borrowedItems;

    /**
     * Constructs a new Patron object with the specified patron ID, name, address, and phone number.
     * The borrowedItems list is initialized as an empty ArrayList.
     *
     * @param patronID the ID of the patron
     * @param name the name of the patron
     * @param address the address of the patron
     * @param phone the phone number of the patron
     */
    public Patron(int patronID, String name, String address, String phone) {
        this.patronID = patronID;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.borrowedItems = new ArrayList<>();
    }

    // Getters and setters

    /**
     * Returns the ID of the patron.
     *
     * @return the patron ID
     */
    public int getPatronID() {
        return patronID;
    }

    /**
     * Sets the ID of the patron.
     *
     * @param patronID the patron ID to set
     */
    public void setPatronID(int patronID) {
        this.patronID = patronID;
    }

    /**
     * Returns the name of the patron.
     *
     * @return the patron name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the patron.
     *
     * @param name the patron name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the address of the patron.
     *
     * @return the patron address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the address of the patron.
     *
     * @param address the patron address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Returns the phone number of the patron.
     *
     * @return the patron phone number
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the phone number of the patron.
     *
     * @param phone the patron phone number to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Returns the list of borrowed items by the patron.
     *
     * @return the list of borrowed items
     */
    public List<String> getBorrowedItems() {
        return borrowedItems;
    }

    /**
     * Adds an item to the list of borrowed items by the patron.
     *
     * @param itemID the ID of the item to borrow
     */
    public void borrowItem(String itemID) {
        this.borrowedItems.add(itemID);
    }

    /**
     * Removes an item from the list of borrowed items by the patron.
     *
     * @param itemID the ID of the item to return
     */
    public void returnItem(String itemID) {
        this.borrowedItems.remove(itemID);
    }

    /**
     * Edits the details of a patron.
     *
     * @param patron the patron to edit
     * @param newName the new name of the patron
     * @param newAddress the new address of the patron
     * @param newPhone the new phone number of the patron
     */
    public static void editPatron(Patron patron, String newName, String newAddress, String newPhone) {
        patron.setName(newName);
        patron.setAddress(newAddress);
        patron.setPhone(newPhone);
    }
}

