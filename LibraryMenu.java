import library.Library;
import library.authors.Author;
import library.patrons.Employee;
import library.patrons.Patron;
import library.patrons.Student;

import java.util.Scanner;

public class LibraryMenu {
    private final Library library;  // Marking 'library' as final

    public LibraryMenu(Library library) {
        this.library = library;
    }

    public static void main(String[] args) {
        Library library = new Library();
        LibraryMenu menu = new LibraryMenu(library);
        menu.displayMenu();
    }

    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
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
            scanner.nextLine();  // Consume newline

            switch (option) {
                case 1:
                    manageItems();
                    break;
                case 2:
                    manageAuthors(scanner);
                    break;
                case 3:
                    managePatrons(scanner);
                    break;
                case 4:
                    handleBorrowing();
                    break;
                case 5:
                    handleReturning();
                    break;
                case 6:
                    searchItems();
                    break;
                case 7:
                    System.out.println("Exiting the system. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 7.");
            }
        }
    }

    private void manageItems() {
        // Implement item management logic here
    }

    private void manageAuthors(Scanner scanner) {
        while (true) {
            System.out.println("Please Select which Method you would like to use");
            System.out.println("1. Add Author");
            System.out.println("2. Edit An Existing Author");
            System.out.println("3. Delete An Author");
            System.out.println("4. Go Back");

            int authorOption = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (authorOption) {
                case 1:
                    addAuthor(scanner);
                    break;
                case 2:
                    editAuthor(scanner);
                    break;
                case 3:
                    removeAuthor(scanner);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }

    private void addAuthor(Scanner scanner) {
        System.out.print("Enter author ID: ");
        String authorID = scanner.nextLine();
        System.out.print("Enter author name: ");
        String name = scanner.nextLine();
        System.out.print("Enter author date of birth: ");
        String dateOfBirth = scanner.nextLine();
        Author author = new Author(authorID, name, dateOfBirth);
        library.addAuthor(author);
        System.out.println("Author added successfully.");
    }

    private void editAuthor(Scanner scanner) {
        System.out.print("Enter author ID to edit: ");
        String authorID = scanner.nextLine();
        System.out.print("Enter new name: ");
        String newName = scanner.nextLine();
        System.out.print("Enter new date of birth: ");
        String newDateOfBirth = scanner.nextLine();
        library.editAuthor(authorID, newName, newDateOfBirth);
        System.out.println("Author edited successfully.");
    }

    private void removeAuthor(Scanner scanner) {
        System.out.print("Enter author ID to remove: ");
        String authorID = scanner.nextLine();
        library.removeAuthor(authorID);
        System.out.println("Author removed successfully.");
    }

    private void managePatrons(Scanner scanner) {
        while (true) {
            System.out.println("Please Select which Method you would like to use");
            System.out.println("1. Add Patron");
            System.out.println("2. Edit An Existing Patron");
            System.out.println("3. Delete A Patron");
            System.out.println("4. Go Back");

            int patronOption = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (patronOption) {
                case 1:
                    addPatron(scanner);
                    break;
                case 2:
                    editPatron(scanner);
                    break;
                case 3:
                    removePatron(scanner);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }

    private void addPatron(Scanner scanner) {
        System.out.print("Enter patron ID: ");
        String patronID = scanner.nextLine();
        System.out.print("Enter patron name: ");
        String name = scanner.nextLine();
        System.out.print("Enter patron address: ");
        String address = scanner.nextLine();
        System.out.print("Enter patron phone number: ");
        String phoneNumber = scanner.nextLine();

        System.out.println("Is the patron a student or an employee?");
        System.out.println("1. Student");
        System.out.println("2. Employee");
        int type = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        Patron patron;
        if (type == 1) {
            System.out.print("Enter student ID: ");
            String studentID = scanner.nextLine();
            System.out.print("Enter school: ");
            String school = scanner.nextLine();
            patron = new Student(patronID, name, address, phoneNumber, studentID, school);
        } else {
            System.out.print("Enter employee ID: ");
            String employeeID = scanner.nextLine();
            System.out.print("Enter job title: ");
            String jobTitle = scanner.nextLine();
            Employee employee = new Employee(patronID, name, address, phoneNumber, employeeID, jobTitle);
            // Use the getter and setter methods
            System.out.println("Employee ID: " + employee.getEmployeeID());
            employee.setEmployeeID(employeeID);
            System.out.println("Job Title: " + employee.getJobTitle());
            employee.setJobTitle(jobTitle);
            patron = employee;
        }

        library.addPatron(patron);
        System.out.println("Patron added successfully.");
    }

    private void editPatron(Scanner scanner) {
        System.out.print("Enter patron ID to edit: ");
        String patronID = scanner.nextLine();
        System.out.print("Enter new name: ");
        String newName = scanner.nextLine();
        System.out.print("Enter new address: ");
        String newAddress = scanner.nextLine();
        System.out.print("Enter new phone number: ");
        String newPhone = scanner.nextLine();
        library.editPatron(patronID, newName, newAddress, newPhone);
        System.out.println("Patron edited successfully.");
    }

    private void removePatron(Scanner scanner) {
        System.out.print("Enter patron ID to remove: ");
        String patronID = scanner.nextLine();
        library.removePatron(patronID);
        System.out.println("Patron removed successfully.");
    }

    private void handleBorrowing() {
        // Implement borrowing logic here
    }

    private void handleReturning() {
        // Implement returning logic here
    }

    private void searchItems() {
        // Implement search logic here
    }
}


