package optional.catalog;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import optional.items.Item;
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
    public Catalog(){

    }

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
    public void addItem(Item item) {
        items.add(item);
    }




}
