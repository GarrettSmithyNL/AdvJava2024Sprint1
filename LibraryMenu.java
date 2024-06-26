import java.util.Scanner;

import Authors.Author;
import Patrons.*;
import LibraryItems.*;

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
                                System.out.println("Which type item would you like to add?");
                                System.out.println("1. BookPrinted");
                                System.out.println("2. BookElectronic");
                                System.out.println("3. BookAudio");
                                System.out.println("4. PeriodicalPrinted");
                                System.out.println("5. PeriodicalElectronic");
                                int typeOption = scanner.nextInt();
                                String title, authorName, publisher, ISBN, voicedBy;
                                int numOfPages, duration, issueNum;
                                Author author;
                                switch (typeOption) {
                                    case 1:  //BookPrinted
                                        System.out.println("What is the title of the book?");
                                        title = scanner.nextLine();
                                        System.out.println("Who is the author of the book?");
                                        authorName = scanner.nextLine();
                                        if (library.getAuthor(authorName) == null) {
                                            System.out.println("Author not found. Please add the author first.");
                                            break;
                                        } else {
                                            author = library.getAuthor(authorName);
                                        }
                                        System.out.println("Who is the publisher of the book?");
                                        publisher = scanner.nextLine();
                                        System.out.println("What is the ISBN of the book?");
                                        ISBN = scanner.nextLine();
                                        System.out.println("How many pages does the book have?");
                                        numOfPages = scanner.nextInt();
                                        library.addPublication(new BookPrinted(title, author, publisher, Library.generatePublicationId(), ISBN, numOfPages));
                                        System.out.println("Book added successfully!");
                                        break;
                                    case 2:  //BookElectronic
                                        System.out.println("What is the title of the book?");
                                        title = scanner.nextLine();
                                        System.out.println("Who is the author of the book?");
                                        authorName = scanner.nextLine();
                                        // Check if author exists in the library
                                        if (library.getAuthor(authorName) == null) {
                                            System.out.println("Author not found. Please add the author first.");
                                            break;
                                        } else {
                                            author = library.getAuthor(authorName);
                                        }
                                        System.out.println("Who is the publisher of the book?");
                                        publisher = scanner.nextLine();
                                        System.out.println("What is the ISBN of the book?");
                                        ISBN = scanner.nextLine();
                                        System.out.println("How many pages does the book have?");
                                        numOfPages = scanner.nextInt();
                                        library.addPublication(new BookElectronic(title, author, publisher, Library.generatePublicationId(), ISBN, numOfPages));
                                        System.out.println("Book added successfully!");
                                        break;
                                    case 3:  //BookAudio
                                        System.out.println("What is the title of the book?");
                                        title = scanner.nextLine();
                                        System.out.println("Who is the author of the book?");
                                        authorName = scanner.nextLine();
                                        if (library.getAuthor(authorName) == null) {
                                            System.out.println("Author not found. Please add the author first.");
                                            break;
                                        } else {
                                            author = library.getAuthor(authorName);
                                        }
                                        System.out.println("Who is the publisher of the book?");
                                        publisher = scanner.nextLine();
                                        System.out.println("What is the ISBN of the book?");
                                        ISBN = scanner.nextLine();
                                        System.out.println("What is the duration of the book in seconds?");
                                        duration = scanner.nextInt();
                                        System.out.println("Who is the narrator of the book?");
                                        voicedBy = scanner.nextLine();
                                        library.addPublication(new BookAudio(title, author, publisher, Library.generatePublicationId(), ISBN, duration, voicedBy));
                                        System.out.println("Book added successfully!");
                                        break;
                                    case 4:  //PeriodicalPrinted
                                        System.out.println("What is the title of the book?");
                                        title = scanner.nextLine();
                                        System.out.println("Who is the author of the book?");
                                        authorName = scanner.nextLine();
                                        if (library.getAuthor(authorName) == null) {
                                            System.out.println("Author not found. Please add the author first.");
                                            break;
                                        } else {
                                            author = library.getAuthor(authorName);
                                        }
                                        System.out.println("Who is the publisher of the book?");
                                        publisher = scanner.nextLine();
                                        System.out.println("What is the issue number of the book?");
                                        issueNum = scanner.nextInt();
                                        System.out.println("How many pages does the book have?");
                                        numOfPages = scanner.nextInt();
                                        library.addPublication(new PeriodicalPrinted(title, author, publisher, Library.generatePublicationId(), issueNum, numOfPages));
                                        System.out.println("Periodical added successfully!");
                                        break;
                                    case 5:  //PeriodicalElectronic
                                        System.out.println("What is the title of the book?");
                                        title = scanner.nextLine();
                                        System.out.println("Who is the author of the book?");
                                        authorName = scanner.nextLine();
                                        // Check if author exists in the library
                                        if (library.getAuthor(authorName) == null) {
                                            System.out.println("Author not found. Please add the author first.");
                                            break;
                                        } else {
                                            author = library.getAuthor(authorName);
                                        }
                                        System.out.println("Who is the publisher of the book?");
                                        publisher = scanner.nextLine();
                                        System.out.println("What is the issue number of the book?");
                                        issueNum = scanner.nextInt();
                                        System.out.println("How many pages does the book have?");
                                        numOfPages = scanner.nextInt();
                                        library.addPublication(new PeriodicalElectronic(title, author, publisher, Library.generatePublicationId(), issueNum, numOfPages));
                                        System.out.println("Book added successfully!");
                                        break;
                                }
                                break;
                            case 2:
                                System.out.println("Which item would you like to edit?");
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
                        String name, dateOfBirth;
                        switch (authorOption) {
                            case 1:
                                System.out.println("What is the name of the author?");
                                name = scanner.nextLine();
                                System.out.println("What is the date of birth of the author?");
                                dateOfBirth = scanner.nextLine();
                                library.addAuthor(new Author(Library.generateAuthorId(), name, dateOfBirth));
                                System.out.println("Author added successfully!");                                
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            default:
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
                        String name, address, phone, employeeId, jobTitle, studentId, school;
                        switch (patronOption) {
                            case 1:
                                System.out.println("What type of patron would you like to add?");
                                System.out.println("1. Student");
                                System.out.println("2. Employee");
                                System.out.println("3. Regular");
                                int typeOption = scanner.nextInt();
                                switch (typeOption) {
                                    case 1:
                                        System.out.println("What is the name of the student?");
                                        name = scanner.nextLine();
                                        System.out.println("What is the address of the student?");
                                        address = scanner.nextLine();
                                        System.out.println("What is the phone number of the student?");
                                        phone = scanner.nextLine();
                                        System.out.println("What is the student ID of the student?");
                                        studentId = scanner.nextLine();
                                        System.out.println("What is the school of the student?");
                                        school = scanner.nextLine();
                                        library.addPatron(new Student(Library.generatePatronId(), name, address, phone, studentId, school));
                                        System.out.println("Student added successfully!");
                                        break;
                                    case 2:
                                        System.out.println("What is the name of the employee?");
                                        name = scanner.nextLine();
                                        System.out.println("What is the address of the employee?");
                                        address = scanner.nextLine();
                                        System.out.println("What is the phone number of the employee?");
                                        phone = scanner.nextLine();
                                        System.out.println("What is the employee ID of the employee?");
                                        employeeId = scanner.nextLine();
                                        System.out.println("What is the job title of the employee?");
                                        jobTitle = scanner.nextLine();
                                        library.addPatron(new Employee(Library.generatePatronId(), name, address, phone, employeeId, jobTitle));
                                        System.out.println("Employee added successfully!");
                                        break;
                                    case 3:
                                        System.out.println("What is the name of the patron?");
                                        name = scanner.nextLine();
                                        System.out.println("What is the address of the patron?");
                                        address = scanner.nextLine();
                                        System.out.println("What is the phone number of the patron?");
                                        phone = scanner.nextLine();
                                        library.addPatron(new Patron(Library.generatePatronId(), name, address, phone));
                                        System.out.println("Patron added successfully!");
                                        break;
                                }
                                break;
                            case 2:
                                System.out.println("Edit an existing patron");
                                break;
                            case 3:
                                System.out.println("Delete an existing patron");
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
