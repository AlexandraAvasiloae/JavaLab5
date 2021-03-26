package compulsory.catalog;

import compulsory.items.Item;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode

public class Catalog implements Serializable {

    static final Logger log = Logger.getLogger(Catalog.class);

    private String name;
    private String path;
    private List<Item> items = new ArrayList<>();

    /**
     * Constructor
     *
     * @param name
     * @param path
     */
    public Catalog(String name, String path) {
        this.name = name;
        this.path = path;
    }

    /**
     * This method add compulsory.catalog.items to the compulsory.catalog
     *
     * @param item
     */
    public void addItem(Item item) {
        items.add(item);
    }

    /**
     * This method display the compulsory.catalog content
     */
    public void list() {
        BasicConfigurator.configure();
        log.info(this.name + this.items);
    }

}
