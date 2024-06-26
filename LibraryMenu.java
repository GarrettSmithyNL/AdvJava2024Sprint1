import java.util.Scanner;
import java.util.List;

import Authors.Author;
import Patrons.*;
import LibraryItems.*;

public class LibraryMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        
        Library library = new Library();
        Author author1 = new Author(Library.generateAuthorId(), "J.K. Rowling", "July 31, 1965");
        Author author2 = new Author(Library.generateAuthorId(), "Stephen King", "September 21, 1947");
        library.addAuthor(author1);
        library.addAuthor(author2);
        library.addPublication(new BookPrinted("Harry Potter and the Sorcerer's Stone", author1, "Scholastic", Library.generatePublicationId(), "978-0439708180", 320));
        library.addPublication(new BookPrinted("Harry Potter and the Chamber of Secrets", author1, "Scholastic", Library.generatePublicationId(), "978-0439064873", 341));
        library.addPublication(new BookAudio("Harry Potter and the Prisoner of Azkaban", author1, "Scholastic", Library.generatePublicationId(), "978-0807281918", 480, "Jim Dale"));
        library.addPublication(new BookElectronic("Harry Potter and the Goblet of Fire", author1, "Scholastic", Library.generatePublicationId(), "978-0439139601", 752));
        library.addPublication(new BookPrinted("Harry Potter and the Order of the Phoenix", author1, "Scholastic", Library.generatePublicationId(), "978-0439358071", 870));
        library.addPublication(new BookPrinted("Harry Potter and the Half-Blood Prince", author1, "Scholastic", Library.generatePublicationId(), "978-0439785969", 652));
        library.addPublication(new BookPrinted("Harry Potter and the Deathly Hallows", author1, "Scholastic", Library.generatePublicationId(), "978-0545139700", 784));
        library.addPublication(new BookPrinted("The Shining", author2, "Anchor", Library.generatePublicationId(), "978-0307743657", 688));  
        library.addPublication(new BookPrinted("Carrie", author2, "Anchor", Library.generatePublicationId(), "978-0307743664", 304));
        library.addPublication(new BookPrinted("It", author2, "Anchor", Library.generatePublicationId(), "978-0451169518", 1138));
        library.addPublication(new BookPrinted("Misery", author2, "Anchor", Library.generatePublicationId(), "978-0451169525", 320));
        library.addPatron(new Student(Library.generatePatronId(), "John Doe", "123 Main St", "555-555-5555", "123456", "University of Washington"));
        library.addPatron(new Employee(Library.generatePatronId(), "Jane Doe", "456 Elm St", "555-555-5556", "654321", "Librarian"));
        library.addPatron(new Patron(Library.generatePatronId(), "Alice Smith", "789 Oak St", "555-555-5557"));

        
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
                                Publication publication;
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
                                String newTitle, newAuthorName, newPublisher, newISBN, nwevoicedBy;
                                int newNumOfPages, newDuration, newIssueNum;
                                Author newAuthor;
                                System.out.println("What is the title of the item you would like to edit?");
                                publication = library.getPublication(scanner.nextLine());
                                if (publication == null) {
                                    System.out.println("Publication not found. Please try again.");
                                    break;
                                } else {
                                    switch (publication.getClass().getName()) {
                                        case "BookPrinted":
                                            System.out.println("What is the new title of the book?");
                                            newTitle = scanner.nextLine();
                                            System.out.println("Who is the new author of the book?");
                                            newAuthorName = scanner.nextLine();
                                            if (library.getAuthor(newAuthorName) == null) {
                                                System.out.println("Author not found. Please add the author first.");
                                                break;
                                            } else {
                                                newAuthor = library.getAuthor(newAuthorName);
                                            }
                                            System.out.println("Who is the new publisher of the book?");
                                            newPublisher = scanner.nextLine();
                                            System.out.println("What is the new ISBN of the book?");
                                            newISBN = scanner.nextLine();
                                            System.out.println("How many pages does the book have?");
                                            newNumOfPages = scanner.nextInt();
                                            BookPrinted.editPublication((BookPrinted) publication, newTitle, newAuthor, newPublisher, newISBN, newNumOfPages);
                                            System.out.println("Book edited successfully!");
                                            break;
                                        case "BookElectronic":
                                            System.out.println("What is the new title of the book?");
                                            newTitle = scanner.nextLine();
                                            System.out.println("Who is the new author of the book?");
                                            newAuthorName = scanner.nextLine();
                                            if (library.getAuthor(newAuthorName) == null) {
                                                System.out.println("Author not found. Please add the author first.");
                                                break;
                                            } else {
                                                newAuthor = library.getAuthor(newAuthorName);
                                            }
                                            System.out.println("Who is the new publisher of the book?");
                                            newPublisher = scanner.nextLine();
                                            System.out.println("What is the new ISBN of the book?");
                                            newISBN = scanner.nextLine();
                                            System.out.println("How many pages does the book have?");
                                            newNumOfPages = scanner.nextInt();
                                            BookElectronic.editPublication((BookElectronic) publication, newTitle, newAuthor, newPublisher, newISBN, newNumOfPages);
                                            System.out.println("Book edited successfully!");
                                            break;
                                        case "BookAudio":
                                            System.out.println("What is the new title of the book?");
                                            newTitle = scanner.nextLine();
                                            System.out.println("Who is the new author of the book?");
                                            newAuthorName = scanner.nextLine();
                                            if (library.getAuthor(newAuthorName) == null) {
                                                System.out.println("Author not found. Please add the author first.");
                                                break;
                                            } else {
                                                newAuthor = library.getAuthor(newAuthorName);
                                            }
                                            System.out.println("Who is the new publisher of the book?");
                                            newPublisher = scanner.nextLine();
                                            System.out.println("What is the new ISBN of the book?");
                                            newISBN = scanner.nextLine();
                                            System.out.println("What is the new duration of the book in seconds?");
                                            newDuration = scanner.nextInt();
                                            System.out.println("Who is the new narrator of the book?");
                                            nwevoicedBy = scanner.nextLine();
                                            BookAudio.editPublication((BookAudio) publication, newTitle, newAuthor, newPublisher, newISBN, newDuration, nwevoicedBy);
                                            System.out.println("Book edited successfully!");
                                            break;
                                        case "PeriodicalPrinted":
                                            System.out.println("What is the new title of the periodcial?");
                                            newTitle = scanner.nextLine();
                                            System.out.println("Who is the new author of the periodical?");
                                            newAuthorName = scanner.nextLine();
                                            if (library.getAuthor(newAuthorName) == null) {
                                                System.out.println("Author not found. Please add the author first.");
                                                break;
                                            } else {
                                                newAuthor = library.getAuthor(newAuthorName);
                                            }
                                            System.out.println("Who is the new publisher of the periodical?");
                                            newPublisher = scanner.nextLine();
                                            System.out.println("What is the new issue number of the periodical?");
                                            newIssueNum = scanner.nextInt();
                                            System.out.println("How many pages does the periodical have?");
                                            newNumOfPages = scanner.nextInt();
                                            PeriodicalPrinted.editPublication((PeriodicalPrinted) publication, newTitle, newAuthor, newPublisher, newIssueNum, newNumOfPages);
                                            System.out.println("Periodical edited successfully!");
                                            break;
                                        case "PeriodicalElectronic":
                                            System.out.println("What is the new title of the periodcial?");
                                            newTitle = scanner.nextLine();
                                            System.out.println("Who is the new author of the periodical?");
                                            newAuthorName = scanner.nextLine();
                                            if (library.getAuthor(newAuthorName) == null) {
                                                System.out.println("Author not found. Please add the author first.");
                                                break;
                                            } else {
                                                newAuthor = library.getAuthor(newAuthorName);
                                            }
                                            System.out.println("Who is the new publisher of the periodical?");
                                            newPublisher = scanner.nextLine();
                                            System.out.println("What is the new issue number of the periodical?");
                                            newIssueNum = scanner.nextInt();
                                            System.out.println("How many pages does the periodical have?");
                                            newNumOfPages = scanner.nextInt();
                                            PeriodicalElectronic.editPublication((PeriodicalElectronic) publication, newTitle, newAuthor, newPublisher, newIssueNum, newNumOfPages);
                                            System.out.println("Periodical edited successfully!");
                                            break; 
                                    }
                                }
                                break;
                            case 3:
                                System.out.println("What is the title of the item you would like to edit?");
                                publication = library.getPublication(scanner.nextLine());
                                if (publication == null) {
                                    System.out.println("Publication not found. Please try again.");
                                    break;
                                } else {
                                    library.removePublication(publication);
                                    System.out.println("Publication deleted successfully!");
                                }
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
                                System.out.println("What is the name of the author you would like to edit?");
                                Author author = library.getAuthor(scanner.nextLine());
                                if (author == null) {
                                    System.out.println("Author not found. Please try again.");
                                    break;
                                } else {
                                    System.out.println("What is the new name of the author?");
                                    name = scanner.nextLine();
                                    System.out.println("What is the new date of birth of the author?");
                                    dateOfBirth = scanner.nextLine();
                                    author.setName(name);
                                    author.setDateOfBirth(dateOfBirth);
                                    System.out.println("Author edited successfully!");
                                }
                                break;
                            case 3:
                                System.out.println("What is the name of the author you would like to delete?");
                                Author authorToDelete = library.getAuthor(scanner.nextLine());
                                if (authorToDelete == null) {
                                    System.out.println("Author not found. Please try again.");
                                    break;
                                } else {
                                    library.removeAuthor(authorToDelete);
                                    System.out.println("Author deleted successfully!");
                                }

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
                                System.out.println("What is the name of the patron you would like to edit?");
                                Patron patron = library.getPatron(scanner.nextLine());
                                if (patron == null) {
                                    System.out.println("Patron not found. Please try again.");
                                    break;
                                } else {
                                    switch (patron.getClass().getName()) {
                                        case "Student":
                                            System.out.println("What is the new name of the student?");
                                            name = scanner.nextLine();
                                            System.out.println("What is the new address of the student?");
                                            address = scanner.nextLine();
                                            System.out.println("What is the new phone number of the student?");
                                            phone = scanner.nextLine();
                                            System.out.println("What is the new student ID of the student?");
                                            studentId = scanner.nextLine();
                                            System.out.println("What is the new school of the student?");
                                            school = scanner.nextLine();
                                            Student.editPatron((Student) patron, name, address, phone, studentId, school);
                                            break;
                                        case "Employee":
                                            System.out.println("What is the new name of the employee?");
                                            name = scanner.nextLine();
                                            System.out.println("What is the new address of the employee?");
                                            address = scanner.nextLine();
                                            System.out.println("What is the new phone number of the employee?");
                                            phone = scanner.nextLine();
                                            System.out.println("What is the new employee ID of the employee?");
                                            employeeId = scanner.nextLine();
                                            System.out.println("What is the new job title of the employee?");
                                            jobTitle = scanner.nextLine();
                                            Employee.editPatron((Employee) patron, name, address, phone, employeeId, jobTitle);
                                            break;
                                        case "Patron":
                                            System.out.println("What is the new name of the patron?");
                                            name = scanner.nextLine();
                                            System.out.println("What is the new address of the patron?");
                                            address = scanner.nextLine();
                                            System.out.println("What is the new phone number of the patron?");
                                            phone = scanner.nextLine();
                                            Patron.editPatron(patron, name, address, phone);
                                            break;                    
                                    }
                                }
                                break;
                            case 3:
                                System.out.println("What is the name of the patron you would like to delete?");
                                Patron patronToDelete = library.getPatron(scanner.nextLine());
                                if (patronToDelete == null) {
                                    System.out.println("Patron not found. Please try again.");
                                    break;
                                } else {
                                    library.removePatron(patronToDelete);
                                    System.out.println("Patron deleted successfully!");
                                }
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
                        Patron patron;
                        Publication publication;

                        switch (borrowOption) {
                            case 1:
                                System.out.println("Who is the patron borrowing the item?");
                                patron = library.getPatron(scanner.nextLine());
                                if (patron == null) {
                                    System.out.println("Patron not found. Please try again.");
                                    break;
                                }
                                System.out.println("What is the title of the item the patron is borrowing?");
                                publication = library.getPublication(scanner.nextLine());
                                if (publication == null) {
                                    System.out.println("Publication not found. Please try again.");
                                    break;
                                }
                                library.takeOutPublication(publication, patron);
                                System.out.println("Publication borrowed successfully!");
                                break;
                            case 2:
                                // Go back to the main menu
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
                                System.out.println("What is the title of the item the patron is returning?");
                                Publication publication = library.getPublication(scanner.nextLine());
                                if (publication == null) {
                                    System.out.println("Publication not found. Please try again.");
                                    break;
                                }
                                library.returnPublication(publication);
                                System.out.println("Publication returned successfully!");
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
                                System.out.println("What is the name of the author you would like to search for?");
                                Author author = library.getAuthor(scanner.nextLine());
                                if (author == null) {
                                    System.out.println("Author not found. Please try again.");
                                    break;
                                }
                                List<Publication> publicationsByAuthor = library.getPublicationByAuthors(author.getName());
                                for (Publication publication : publicationsByAuthor) {
                                    System.out.println(publication.getTitle());
                                }
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
