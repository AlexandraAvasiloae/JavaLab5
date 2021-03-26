package compulsory.items;

/**
 * a custom exception
 */
public class InvalidItemSpecificationsException extends Exception {
    public InvalidItemSpecificationsException(String errorMessage) {
        super(errorMessage);
    }
}
