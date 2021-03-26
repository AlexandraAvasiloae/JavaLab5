package optional.commands;

import optional.catalog.Catalog;
import optional.exceptions.InvalidCatalogException;

import java.io.*;

public class LoadCommand extends Command {
    /**
     * constructor + load the catalog
     * @param name
     * @param catalog
     * @throws InvalidCatalogException
     */
    public LoadCommand(String name, Catalog catalog) throws InvalidCatalogException {
        super(name);
        try {
            FileInputStream fi = new FileInputStream(new File(catalog.getPath()));
            ObjectInputStream oi = new ObjectInputStream(fi);
            catalog = (Catalog) oi.readObject();
            oi.close();
            fi.close();
        } catch (FileNotFoundException e) {
            throw new InvalidCatalogException(e);
        } catch (IOException e) {
            throw new InvalidCatalogException(e);
        } catch (ClassNotFoundException e) {
            throw new InvalidCatalogException(e);
        }
    }
}
