package compulsory.catalog;

/**
 * a custom exception
 */
public class InvalidCatalogException extends Exception {
    public InvalidCatalogException(Exception ex) {
        super("Invalid compulsory.catalog file.", ex);
    }

}
