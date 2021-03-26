package optional.items;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import optional.exceptions.InvalidItemSpecificationsException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;

@Getter
@Setter
@ToString
@EqualsAndHashCode
abstract public class Item implements Serializable {

    protected String path;
    protected String name;

    /**
     * Constructor
     * if the path does not exist, a custom exception will be thrown
     *
     * @param name
     * @param path
     * @throws InvalidItemSpecificationsException
     */
    public Item(String name, String path) throws InvalidItemSpecificationsException {
        try {
            FileInputStream fi = new FileInputStream(path);
            this.name = name;
            this.path = path;
        } catch (FileNotFoundException e) {
            throw new InvalidItemSpecificationsException("The path does not exist!");
        }
    }
}
