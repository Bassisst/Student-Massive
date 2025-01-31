package dark;

public class StudentNotFoundException extends Exception {
    private static final long serialVersionUID = 1L;

    public StudentNotFoundException() {
        super("Student not found.");
    }
    
    public StudentNotFoundException(String message) {
        super(message);
    }
}

