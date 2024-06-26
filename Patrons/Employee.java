package Patrons;

/**
 * Represents an employee who is also a patron.
 * Inherits from the Patron class.
 */
public class Employee extends Patron {
    private String employeeID;
    private String jobTitle;

    /**
     * Constructs an Employee object with the specified attributes.
     *
     * @param patronID     the ID of the employee patron
     * @param name         the name of the employee patron
     * @param address      the address of the employee patron
     * @param phone        the phone number of the employee patron
     * @param employeeID   the ID of the employee
     * @param jobTitle     the job title of the employee
     */
    public Employee(int patronID, String name, String address, String phone, String employeeID, String jobTitle) {
        super(patronID, name, address, phone);
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
    }

    // Getters and setters

    /**
     * Returns the ID of the employee.
     *
     * @return the employee ID
     */
    public String getEmployeeID() {
        return employeeID;
    }

    /**
     * Sets the ID of the employee.
     *
     * @param employeeID the employee ID to set
     */
    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    /**
     * Returns the job title of the employee.
     *
     * @return the job title
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Sets the job title of the employee.
     *
     * @param jobTitle the job title to set
     */
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    /**
     * Edits the attributes of an Employee object.
     *
     * @param employee       the Employee object to edit
     * @param newName        the new name of the employee
     * @param newAddress     the new address of the employee
     * @param newPhone       the new phone number of the employee
     * @param newEmployeeID  the new ID of the employee
     * @param newJobTitle    the new job title of the employee
     */
    public static void editPatron(Employee employee, String newName, String newAddress, String newPhone, String newEmployeeID, String newJobTitle) {
        employee.setName(newName);
        employee.setAddress(newAddress);
        employee.setPhone(newPhone);
        employee.setEmployeeID(newEmployeeID);
        employee.setJobTitle(newJobTitle);
    }
}
