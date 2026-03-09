import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    public boolean addStudent(Student student) {
        if (searchById(student.getStudentId()) != null) {
            return false;
        }
        students.add(student);
        return true;
    }

    public void listAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        System.out.println("\n=== All Students ===");
        for (int i = 0; i < students.size(); i++) {
            System.out.println((i + 1) + ". " + students.get(i));
        }
    }

    public Student searchById(String studentId) {
        for (Student student : students) {
            if (student.getStudentId().equals(studentId)) {
                return student;
            }
        }
        return null;
    }

    public ArrayList<Student> searchByLastName(String lastName) {
        ArrayList<Student> results = new ArrayList<>();
        for (Student student : students) {
            if (student.getLastName().equalsIgnoreCase(lastName)) {
                results.add(student);
            }
        }
        return results;
    }

    public boolean updateStudent(String studentId, String firstName, String lastName, double gpa) {
        Student student = searchById(studentId);
        if (student != null) {
            student.setFirstName(firstName);
            student.setLastName(lastName);
            student.setGpa(gpa);
            return true;
        }
        return false;
    }

    public boolean removeStudent(String studentId) {
        Student student = searchById(studentId);
        if (student != null) {
            students.remove(student);
            return true;
        }
        return false;
    }

    public void sortById() {
        if (students.isEmpty()) {
            System.out.println("No students to sort.");
            return;
        }
        recursiveSortById(0);
        System.out.println("Students sorted by ID.");
    }

    private void recursiveSortById(int index) {
        if (index >= students.size() - 1) {
            return;
        }
        int minIndex = index;
        for (int i = index + 1; i < students.size(); i++) {
            if (students.get(i).getStudentId().compareTo(students.get(minIndex).getStudentId()) < 0) {
                minIndex = i;
            }
        }
        if (minIndex != index) {
            Student temp = students.get(index);
            students.set(index, students.get(minIndex));
            students.set(minIndex, temp);
        }
        recursiveSortById(index + 1);
    }

    public void sortByLastName() {
        if (students.isEmpty()) {
            System.out.println("No students to sort.");
            return;
        }
        recursiveSortByLastName(0);
        System.out.println("Students sorted by Last Name.");
    }

    private void recursiveSortByLastName(int index) {
        if (index >= students.size() - 1) {
            return;
        }
        int minIndex = index;
        for (int i = index + 1; i < students.size(); i++) {
            if (students.get(i).getLastName().compareTo(students.get(minIndex).getLastName()) < 0) {
                minIndex = i;
            }
        }
        if (minIndex != index) {
            Student temp = students.get(index);
            students.set(index, students.get(minIndex));
            students.set(minIndex, temp);
        }
        recursiveSortByLastName(index + 1);
    }

    public double getAverageGpa() {
        if (students.isEmpty()) {
            return 0;
        }
        return recursiveAverageGpa(0, 0) / students.size();
    }

    private double recursiveAverageGpa(int index, double sum) {
        if (index >= students.size()) {
            return sum;
        }
        return recursiveAverageGpa(index + 1, sum + students.get(index).getGpa());
    }

    public double getHighestGpa() {
        if (students.isEmpty()) {
            return 0;
        }
        return recursiveHighestGpa(0, students.get(0).getGpa());
    }

    private double recursiveHighestGpa(int index, double max) {
        if (index >= students.size()) {
            return max;
        }
        double current = students.get(index).getGpa();
        double newMax = (current > max) ? current : max;
        return recursiveHighestGpa(index + 1, newMax);
    }

    public int countAboveGpaThreshold(double threshold) {
        if (students.isEmpty()) {
            return 0;
        }
        return recursiveCountAboveGpa(0, threshold);
    }

    private int recursiveCountAboveGpa(int index, double threshold) {
        if (index >= students.size()) {
            return 0;
        }
        int count = (students.get(index).getGpa() >= threshold) ? 1 : 0;
        return count + recursiveCountAboveGpa(index + 1, threshold);
    }

    public int getTotalStudents() {
        return students.size();
    }
}