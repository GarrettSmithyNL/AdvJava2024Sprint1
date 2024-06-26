package Patrons;

import java.util.ArrayList;
import java.util.List;

public class Patron {
    private int patronID;
    private String name;
    private String address;
    private String phone;
    private List<String> borrowedItems;

    public Patron(int patronID, String name, String address, String phone) {
        this.patronID = patronID;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.borrowedItems = new ArrayList<>();
    }

    // Getters and setters
    public int getPatronID() {
        return patronID;
    }

    public void setPatronID(int patronID) {
        this.patronID = patronID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<String> getBorrowedItems() {
        return borrowedItems;
    }

    public void borrowItem(String itemID) {
        this.borrowedItems.add(itemID);
    }

    public void returnItem(String itemID) {
        this.borrowedItems.remove(itemID);
    }

    public static void editPatron(Patron patron, String newName, String newAddress, String newPhone) {
        patron.setName(newName);
        patron.setAddress(newAddress);
        patron.setPhone(newPhone);
    }
}

