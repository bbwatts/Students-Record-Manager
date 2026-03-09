public class Student {
    private String studentId;
    private String firstName;
    private String lastName;
    private double gpa;

    // Constructor
    public Student(String studentId, String firstName, String lastName, double gpa) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    // Getters
    public String getStudentId() {
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getGpa() {
        return gpa;
    }

    // Setters
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student ID: " + studentId + '\n' + 
               "First Name: " + firstName + '\n' + 
               "Last Name: " + lastName + '\n' + 
               "GPA: " + gpa + '\n';
    }
}