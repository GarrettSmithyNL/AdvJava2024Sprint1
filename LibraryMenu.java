import java.util.Scanner;

import Authors.Author;
import LibraryItems.Publication;
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
            System.out.println("4. Borrow A Library Item");
            System.out.println("5. Return of A Library Item");
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
                        scanner.nextLine();
                        
                        int publicationID, newIssueNum, newNumOfCopies, newNumOfPages, newDurationSeconds;
                        String  newTitle, newPublisher, newISBN, newVoicedBy;
                        Author newAuthor;
                        Publication Publication;
                        
                        switch (itemOption) {
                            case 1:
                                System.out.println("Which type item would you like to add?");
                                break;

                            case 2:
                                System.out.println("Which item would you like to edit?");
                                System.out.println("Please enter the publication ID of the publication you would like to edit.");
                                publicationID = scanner.nextInt();

                                System.out.println("Please enter the new information for the publication.");
                                System.out.print("Enter New Title: ");
                                newTitle = scanner.nextLine(); 
                                
                                System.out.print("Enter New Author: ");
                                newAuthor = scanner.nextLine();

                                System.out.print("Enter New Publisher: ");
                                newPublisher = scanner.nextLine();

                                System.out.print("Enter New ISBN: ");
                                newISBN = scanner.nextLine();

                                System.out.print("Enter New Issue Number: ");
                                newIssueNum = scanner.nextInt();

                                System.out.print("Enter New Number of Copies: ");
                                newNumOfCopies = scanner.nextInt();

                                System.out.print("Enter New Number of Pages: ");
                                newNumOfPages = scanner.nextInt();

                                System.out.print("Enter New Duration in Seconds: ");
                                newDurationSeconds = scanner.nextInt();

                                System.out.print("Enter New Voiced By: ");
                                newVoicedBy = scanner.nextLine();
                                
                                library.editPublication(publicationID, newTitle, newAuthor, newPublisher, newISBN, newIssueNum, newNumOfCopies, newNumOfPages, newDurationSeconds, newVoicedBy);

                                break;

                            case 3:

                                System.out.println("Which item would you like to delete?");
                                System.out.println("Please enter the publication ID of the publication you would like to delete.");
                                Publication = scanner.nextLine();

                                library.removePublication(Publication);
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

                        int authorID;
                        String newName, newDateOfBirth;
                       
                        switch (authorOption) {
                            case 1:
                                System.out.println("Add a new author");      
                                break;

                            case 2:
                                System.out.println("Edit an existing author");
                                System.out.println("Please enter the author ID of the author you would like to edit.");
                                authorID = scanner.nextInt();

                                System.out.println("Please enter the new information for the author.");
                                System.out.print("Enter New Name: ");
                                newName = scanner.nextLine();

                                System.out.print("Enter A New Date of Birth: ");
                                newDateOfBirth = scanner.nextLine();

                                library.editAuthor(authorID, newName,newDateOfBirth);
                                break;

                            case 3:
                                System.out.println("Delete an existing author");
                                System.out.println("Please enter the author ID of the author you would like to delete.");
                                
                                authorID = scanner.nextInt();
                                library.removeAuthor(authorID);

                                System.out.println("Author with ID " + authorID +" has been deleted.");
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

                        int patronID;
                        String name, address, phone;
                        switch (patronOption) {
                            case 1:
                                System.out.println("Add a new patron");                     
                                break;

                            case 2:
                                System.out.println("Edit an existing patron");
                                System.out.println("Please enter the patron ID of the patron you would like to edit.");
                                patronID = scanner.nextInt();

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
                                patronID = scanner.nextInt();

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
                        System.out.println("2. Go Back");

                        int borrowOption = scanner.nextInt();

                            
                        
                        switch (borrowOption) {
                            case 1:
                                System.out.println("Borrowing a library item...");
                               
                                

                                break;
                          
                            case 2:
                                System.out.println("Press 2 to go back to the main menu.");
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
