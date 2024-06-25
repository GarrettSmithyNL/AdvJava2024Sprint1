package Patrons;

public class Employee extends Patron {
    private String employeeID;
    private String jobTitle;

    public Employee(String patronID, String name, String address, String phone, String employeeID, String jobTitle) {
        super(patronID, name, address, phone);
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
    }

    // Getters and setters
    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
}
