package dark;

public class GroupOverflowException extends Exception {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public GroupOverflowException() {
     super("Group is full. Cannot add more students.");
 }
 
 public GroupOverflowException(String message) {
     super(message);
 }
}


