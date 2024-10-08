package dark;

public class Group {
    private String groupName;
    private Student[] students = new Student[10];
    private int studentCount = 0;

    public Group(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Student[] getStudents() {
        return students;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Group: " + groupName + "\n");
        for (Student student : students) {
            if (student != null) {
                sb.append(student).append("\n");
            }
        }
        return sb.toString();
    }

    public void addStudent(Student student) throws GroupOverflowException {
        if (studentCount >= students.length) {
            throw new GroupOverflowException("Cannot add student. Group is full.");
        }
        students[studentCount++] = student;
    }

    public Student searchStudentByLastName(String lastName) throws StudentNotFoundException {
        for (Student student : students) {
            if (student != null && student.getLastName().equals(lastName)) {
                return student;
            }
        }
        throw new StudentNotFoundException("Student with last name " + lastName + " not found.");
    }

    public boolean removeStudentByID(int id) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getId() == id) {
                students[i] = null;
                studentCount--;
                return true;
            }
        }
        return false;
    }
}
