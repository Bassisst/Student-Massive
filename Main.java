package dark;

public class Main {
    public static void main(String[] args) {
        try {
            Group group = new Group("Java Developers");

            // Adding 10 students
            Student student1 = new Student("John", "Doe", Human.Gender.MALE, 101, "Java Developers");
            Student student2 = new Student("Jane", "Smith", Human.Gender.FEMALE, 102, "Java Developers");
            Student student3 = new Student("Alice", "Johnson", Human.Gender.FEMALE, 103, "Java Developers");
            Student student4 = new Student("Bob", "Williams", Human.Gender.MALE, 104, "Java Developers");
            Student student5 = new Student("Charlie", "Brown", Human.Gender.MALE, 105, "Java Developers");
            Student student6 = new Student("Diana", "Evans", Human.Gender.FEMALE, 106, "Java Developers");
            Student student7 = new Student("Evan", "Garcia", Human.Gender.MALE, 107, "Java Developers");
            Student student8 = new Student("Fiona", "Martinez", Human.Gender.FEMALE, 108, "Java Developers");
            Student student9 = new Student("George", "Lee", Human.Gender.MALE, 109, "Java Developers");
            Student student10 = new Student("Hannah", "Clark", Human.Gender.FEMALE, 110, "Java Developers");

            // Adding students to the group
            group.addStudent(student1);
            group.addStudent(student2);
            group.addStudent(student3);
            group.addStudent(student4);
            group.addStudent(student5);
            group.addStudent(student6);
            group.addStudent(student7);
            group.addStudent(student8);
            group.addStudent(student9);
            group.addStudent(student10);
            
            // Print the group with all students
            System.out.println(group);

            // Search for a student by last name
            Student foundStudent = group.searchStudentByLastName("Doe");
            System.out.println("Found student: " + foundStudent);

            // Remove a student by ID
            boolean removed = group.removeStudentByID(101);
            System.out.println("Student removed: " + removed);

            // Print the group after removal
            System.out.println(group);

        } catch (GroupOverflowException | StudentNotFoundException e) {
            e.printStackTrace();
        }
    }
}


