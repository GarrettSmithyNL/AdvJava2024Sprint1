import java.util.Scanner;

import Authors.Author;
import Patrons.Patron;
public class LibraryMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        
        Library library = new Library();
        
        while (running) {
            System.out.println("Welcome to the Library Management System");
            System.out.println("1. Manage Library Items");
            System.out.println("2. Manage Authors");
            System.out.println("3. Manage Patrons");
            System.out.println("4. Handle Borrowing of A Library Item");
            System.out.println("5. Handle Returning of A Library Item");
            System.out.println("6. Search for a Library Item by Title, Author, or ISBN");
            System.out.println("7. Exit");
            System.out.print("Enter your choice (1-7): ");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    while (true) {
                        System.out.println("Please Select which Method you would like to use");
                        System.out.println("1. Add Item");
                        System.out.println("2. Edit An Existing Item");
                        System.out.println("3. Delete An Item");
                        System.out.println("4. Go Back");

                        int itemOption = scanner.nextInt();
                        
                        switch (itemOption) {
                            case 1:
                                System.out.println("Which type oitem would you like to add?");
                                break;
                            case 2:
                                System.out.println("Which item would you like to edit?");
                                // Insert logic to edit an existing item
                                break;
                            case 3:
                                System.out.println("Which item would you like to delete?");
                                // Insert logic to delete an existing item
                                break;
                            case 4:
                                System.out.println("Press 4 to go back to the main menu.");
                                break;
                            default:
                                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                                continue;
                            }
                            break;
                        }
                    break;
                case 2:
                    while (true) {
                        System.out.println("Please Select which Method you would like to use");
                        System.out.println("1. Add Author");
                        System.out.println("2. Edit An Existing Author");
                        System.out.println("3. Delete An Author");
                        System.out.println("4. Go Back");

                        int authorOption = scanner.nextInt();
                        scanner.nextLine();
                        String authorID, name, dateOfBirth;
                        switch (authorOption) {
                            case 1:
                                System.out.println("Add a new author");
                                System.out.println("Please enter author information.");
                                System.out.print("Enter Author ID: ");
                                authorID = scanner.nextLine();

                                System.out.print("Enter Name: ");
                                name = scanner.nextLine();

                                System.out.print("Enter Date of Birth: ");
                                dateOfBirth = scanner.nextLine();

                                library.addAuthor(new Author(authorID, name, dateOfBirth));
                                
                                break;
                            case 2:
                                System.out.println("Edit an existing author");
                                System.out.println("Please enter the author ID of the author you would like to edit.");
                                authorID = scanner.nextLine();

                                System.out.println("Please enter the new information for the author.");
                                System.out.print("Enter Name: ");
                                name = scanner.nextLine();

                                System.out.print("Enter Date of Birth: ");
                                dateOfBirth = scanner.nextLine();

                                library.editAuthor(authorID, name, dateOfBirth);
                                break;
                            case 3:
                                System.out.println("Delete an existing author");
                                // Add logic to delete an existing author
                                break;
                            case 4:
                                System.out.println("Press 4 to go back to the main menu.");
                                break;
                            default:
                                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                                continue;
                            }
                        break;
                    }
                    break;
                case 3:
                    while (true) {
                        System.out.println("Please Select which Method you would like to use");
                        System.out.println("1. Add Patron");
                        System.out.println("2. Edit An Existing Patron");
                        System.out.println("3. Delete An Patron");
                        System.out.println("4. Go Back");

                        int patronOption = scanner.nextInt();
                        scanner.nextLine();
                        String patronID, name, address, phone;
                        switch (patronOption) {
                            case 1:
                                System.out.println("Add a new patron");
                                System.out.println("Please enter patron information.");

                                System.out.print("Enter Patron ID: ");
                                patronID = scanner.nextLine();
                        
                                System.out.print("Enter Name: ");
                                name = scanner.nextLine();
                        
                                System.out.print("Enter Address: ");
                                address = scanner.nextLine();
                        
                                System.out.print("Enter Phone: ");
                                phone = scanner.nextLine();
                    
                                library.addPatron(new Patron(patronID, name, address, phone));
                                System.out.println("Patron added successfully!");
                        
                                break;
                            case 2:
                                System.out.println("Edit an existing patron");
                                System.out.println("Please enter the patron ID of the patron you would like to edit.");
                                patronID = scanner.nextLine();

                                System.out.println("Please enter the new information for the patron.");
                                System.out.print("Enter Name: ");
                                name = scanner.nextLine();

                                System.out.print("Enter Address: ");
                                address = scanner.nextLine();
                                
                                System.out.print("Enter Phone: ");
                                phone = scanner.nextLine();

                                library.editPatron(patronID, name, address, phone);
                                break;
                            case 3:
                                System.out.println("Delete an existing patron");
                                System.out.println("Please enter the patron ID of the patron you would like to delete.");
                                patronID = scanner.nextLine();
                                library.removePatron(patronID);
                                System.out.println("Patron with ID " + patronID +" has been deleted.");
                                break;
                            case 4:
                                System.out.println("Press 4 to go back to the main menu.");
                                break;
                            default:
                                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                                continue;
                            }
                        break;
                    }
                    break;
                case 4:
                    while (true) {
                        System.out.println("Please Select which Method you would like to use");
                        System.out.println("1. Borrow a Library Item");
                        System.out.println("2. Renew a Library Item");
                        System.out.println("3. Go Back");

                        int borrowOption = scanner.nextInt();

                        switch (borrowOption) {
                            case 1:
                                System.out.println("Borrowing a library item...");
                                // Add logic to borrow a library item
                                break;
                            case 2:
                                System.out.println("Renewing a library item...");
                                // Add logic to renew a library item
                                break;
                            case 3:
                                System.out.println("Press 3 to go back to the main menu.");
                                break;
                            default:
                                System.out.println("Invalid choice. Please enter a number between 1 and 3.");
                                continue;
                            }
                        break;
                    }
                    break;
                case 5:
                    while (true) {
                        System.out.println("Please Select which Method you would like to use");
                        System.out.println("1. Return a Library Item");
                        System.out.println("2. Go Back");

                        int returnOption = scanner.nextInt();

                        switch (returnOption) {
                            case 1:
                                System.out.println("Returning a library item...");
                                // Add logic to return a library item
                                break;
                            case 2:
                                System.out.println("Press 2 to go back to the main menu.");
                                break;
                            default:
                                System.out.println("Invalid choice. Please enter a number between 1 and 2.");
                                continue;
                            }
                        break;
                    }
                    break;
                case 6:
                    while (true) {
                        System.out.println("Please Select which Method you would like to use");
                        System.out.println("1. Search for a Library Item by Title");
                        System.out.println("2. Search for a Library Item by Author");
                        System.out.println("3. Search for a Library Item by ISBN");
                        System.out.println("4. Go Back");

                        int searchOption = scanner.nextInt();

                        switch (searchOption) {
                            case 1:
                                System.out.println("Searching for a library item by title...");
                                // Add logic to search for a library item by title
                                break;
                            case 2:
                                System.out.println("Searching for a library item by author...");
                                // Add logic to search for a library item by author
                                break;
                            case 3:
                                System.out.println("Searching for a library item by ISBN...");
                                // Add logic to search for a library item by ISBN
                                break;
                            case 4:
                                System.out.println("Press 4 to go back to the main menu.");
                                break;
                            default:
                                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                                continue;
                            }
                        break;
                    }
                    break;
                case 7:
                    System.out.println("Exiting the system. Goodbye!");
                    scanner.close();
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        }
    }
}
