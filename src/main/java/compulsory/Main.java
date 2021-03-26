package compulsory;

import compulsory.catalog.Catalog;
import compulsory.catalog.CatalogUtil;
import compulsory.catalog.InvalidCatalogException;
import compulsory.items.Book;
import compulsory.items.InvalidItemSpecificationsException;
import compulsory.items.Movie;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.sql.SQLException;

public class Main {

    static final Logger log = Logger.getLogger(Main.class);
    /**
     * this method:
     * create a new compulsory.catalog, a movie and a book
     * add the book and the movie to the compulsory.catalog
     * save the compulsory.catalog
     * display the compulsory.catalog content
     *
     * @throws InvalidItemSpecificationsException
     * @throws IOException
     */
    private void testCreateSaveAndList() throws InvalidItemSpecificationsException, IOException {
        Catalog catalog = new Catalog("My Catalog", "D:\\java5\\compulsory.catalog.ser");

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
     * this method call the load method from CatalogUtil and play the second element from the compulsory.catalog, in this case, open the book from a pdf file
     * @throws InvalidCatalogException
     * @throws IOException
     */
    private void testLoadAndPlay() throws InvalidCatalogException, IOException {
        Catalog catalog = CatalogUtil.load("D:\\java5\\compulsory.catalog.txt");
        CatalogUtil.play(catalog.getItems().get(1));
    }

    public static void main(String[] args) throws IOException, SQLException, InvalidItemSpecificationsException, InvalidCatalogException {
        BasicConfigurator.configure();
        Main app = new Main();
        app.testCreateSaveAndList();
        app.testLoadAndPlay();
    }
}
