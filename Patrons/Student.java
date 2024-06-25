package Patrons;

public class Student extends Patron {
    private String studentID;
    private String school;

    public Student(int patronID, String name, String address, String phone, String studentID, String school) {
        super(patronID, name, address, phone);
        this.studentID = studentID;
        this.school = school;
    }

    // Getters and setters
    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
