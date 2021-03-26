package optional.commands;

import optional.catalog.Catalog;
import optional.items.Item;

public class AddComand extends Command {
    /**
     * Constructor
     * @param name
     * @param item
     * @param catalog
     */
    public AddComand(String name, Item item, Catalog catalog){
        super(name);
        catalog.addItem(item);
    }

}
