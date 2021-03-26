package optional.commands;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import optional.catalog.Catalog;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class SaveCommand extends Command {

    private Catalog catalog;

    /**
     * constructor + save the catalog
     * @param name
     * @param catalog
     * @throws IOException
     */
    public SaveCommand(String name, Catalog catalog) throws IOException{
        super(name);
        this.catalog=catalog;
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(catalog.getPath()))) {
            oos.writeObject(catalog);
        }
    }
}
