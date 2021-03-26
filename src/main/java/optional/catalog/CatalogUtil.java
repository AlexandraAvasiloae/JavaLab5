package optional.catalog;

import optional.exceptions.InvalidCatalogException;
import optional.items.Item;

import java.awt.*;
import java.io.*;

/**
 * a class which implements some util method: save, load and play
 */
public class CatalogUtil {


    /**
     * this method load the catalog from file where it was saved
     * if the file path does not exist in the local system, a custom exception will pe thrown
     *
     * @param path
     * @return
     * @throws InvalidCatalogException
     */
    public static Catalog load(String path) throws InvalidCatalogException {
        try {
            FileInputStream fi = new FileInputStream(new File(path));
            ObjectInputStream oi = new ObjectInputStream(fi);
            Catalog catalog = (Catalog) oi.readObject();
            oi.close();
            fi.close();
            return catalog;
        } catch (FileNotFoundException e) {
            throw new InvalidCatalogException(e);
        } catch (IOException e) {
            throw new InvalidCatalogException(e);
        } catch (ClassNotFoundException e) {
            throw new InvalidCatalogException(e);
        }

    }

    /**
     * this method open the item from the catalog, using Desktop class
     *
     * @param item
     * @throws IOException
     */
    public static void play(Item item) throws IOException {
        Desktop desktop = Desktop.getDesktop();
        File catalogFile = new File(item.getPath());
        desktop.open(catalogFile);
    }

}
