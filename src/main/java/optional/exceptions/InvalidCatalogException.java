package optional.exceptions;

/**
 * a custom exception
 */
public class InvalidCatalogException extends Exception {
    public InvalidCatalogException(Exception ex) {
        super("Invalid catalog file.", ex);
    }

}
