import catalog.Catalog;
import catalog.CatalogUtil;
import catalog.InvalidCatalogException;
import items.Book;
import items.InvalidItemSpecificationsException;
import items.Movie;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.sql.SQLException;

public class Main {
    static final Logger log = Logger.getLogger(Main.class);

    /**
     * this method:
     * create a new catalog, a movie and a book
     * add the book and the movie to the catalog
     * save the catalog
     * display the catalog content
     *
     * @throws InvalidItemSpecificationsException
     * @throws IOException
     */
    private void testCreateSaveAndList() throws InvalidItemSpecificationsException, IOException {
        Catalog catalog = new Catalog("My catalog.Catalog", "D:\\java5\\catalog.ser");

        Movie movie = new Movie("Titanic", "D:\\FILME\\movie\\movie.mkv" );
        movie.setYear(1997);
        movie.setDirector("James Cameron");

        Book book = new Book("Harry Potter", "D:\\java5\\book1.pdf" );
        book.setYear(2000);
        book.setAuthor("J. K. Rowling");

        catalog.addItem(movie);
        catalog.addItem(book);
        CatalogUtil.save(catalog);
        catalog.list();
    }

    /**
     * this method call the load method from catalog.CatalogUtil and play the second element from the catalog, in this case, open the book from a pdf file
     * @throws InvalidCatalogException
     * @throws IOException
     */
    private void testLoadAndPlay() throws InvalidCatalogException, IOException {
        Catalog catalog = CatalogUtil.load("D:\\java5\\catalog.txt");
        CatalogUtil.play(catalog.getItems().get(1));
    }

    public static void main(String[] args) throws IOException, SQLException, InvalidItemSpecificationsException, InvalidCatalogException {
        BasicConfigurator.configure();
        Main app = new Main();
        app.testCreateSaveAndList();
        app.testLoadAndPlay();
    }
}
