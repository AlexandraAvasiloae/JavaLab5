package optional;

import freemarker.template.TemplateException;
import optional.catalog.Catalog;
import optional.exceptions.InvalidCatalogException;
import optional.exceptions.InvalidCommandException;
import optional.exceptions.InvalidItemSpecificationsException;
import optional.items.Book;
import optional.items.Item;
import optional.items.Movie;
import optional.shell.Shell;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<Catalog> catalogList = new ArrayList<>();
    public static List<Item> itemList = new ArrayList<>();

    public static void main(String[] args) throws IOException, SQLException, InvalidItemSpecificationsException, InvalidCatalogException, InvalidCommandException, TemplateException {

        Catalog catalog = new Catalog("My Catalog", "D:\\java5\\catalog.ser");
        catalogList.add(catalog);

        Movie movie = new Movie("Titanic", "D:\\FILME\\movie\\movie.mkv");
        movie.setYear(1997);
        movie.setDirector("James Cameron");
        itemList.add(movie);

        Book book = new Book("Harry Potter", "D:\\java5\\book1.pdf");
        book.setYear(2000);
        book.setAuthor("J. K. Rowling");
        itemList.add(book);
        boolean ok=true;
        while(ok) {
            Shell shell = new Shell();
            shell.readCommand();
        }
    }
}

