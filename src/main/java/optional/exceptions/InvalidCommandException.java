package optional.exceptions;

public class InvalidCommandException extends Exception{
    public InvalidCommandException(String errorMessage) {
        super(errorMessage);
    }
}
