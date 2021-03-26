package optional.items;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import optional.exceptions.InvalidItemSpecificationsException;

@Getter
@Setter
@EqualsAndHashCode
@ToString

public class Book extends Item {
    private String author;
    private int year;

    /**
     * Constructor
     *
     * @param name
     * @param path
     * @throws InvalidItemSpecificationsException
     */
    public Book(String name, String path) throws InvalidItemSpecificationsException {
        super(name, path);
    }

    /**
     * this method set the year the book was published and throw a exception if the year could not be good
     *
     * @param year
     * @throws InvalidItemSpecificationsException
     */
    public void setYear(int year) throws InvalidItemSpecificationsException {
        if (year > 2021) {
            throw new InvalidItemSpecificationsException("Anul nu este valid!");
        } else {
            this.year = year;
        }
    }
}
