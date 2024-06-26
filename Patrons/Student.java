package Patrons;

/**
 * Represents a student patron in a library system.
 * Inherits from the Patron class.
 */
public class Student extends Patron {
    private String studentID;
    private String school;

    /**
     * Constructs a new Student object with the specified patron ID, name, address, phone, student ID, and school.
     * @param patronID the ID of the student patron
     * @param name the name of the student patron
     * @param address the address of the student patron
     * @param phone the phone number of the student patron
     * @param studentID the student ID of the student patron
     * @param school the school of the student patron
     */
    public Student(int patronID, String name, String address, String phone, String studentID, String school) {
        super(patronID, name, address, phone);
        this.studentID = studentID;
        this.school = school;
    }

    // Getters and setters

    /**
     * Returns the student ID of the student patron.
     * @return the student ID
     */
    public String getStudentID() {
        return studentID;
    }

    /**
     * Sets the student ID of the student patron.
     * @param studentID the student ID to set
     */
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    /**
     * Returns the school of the student patron.
     * @return the school
     */
    public String getSchool() {
        return school;
    }

    /**
     * Sets the school of the student patron.
     * @param school the school to set
     */
    public void setSchool(String school) {
        this.school = school;
    }

    /**
     * Edits the details of a student patron.
     * @param student the student patron to edit
     * @param newName the new name of the student patron
     * @param newAddress the new address of the student patron
     * @param newPhone the new phone number of the student patron
     * @param newStudentID the new student ID of the student patron
     * @param newSchool the new school of the student patron
     */
    public static void editPatron(Student student, String newName, String newAddress, String newPhone, String newStudentID, String newSchool) {
        student.setName(newName);
        student.setAddress(newAddress);
        student.setPhone(newPhone);
        student.setStudentID(newStudentID);
        student.setSchool(newSchool);
    }
}
