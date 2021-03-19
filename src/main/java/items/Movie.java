package items;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode

public class Movie extends Item {

    private int year;
    private String director;

    /**
     * Constructor
     *
     * @param name
     * @param path
     * @throws InvalidItemSpecificationsException
     */
    public Movie(String name, String path) throws InvalidItemSpecificationsException {
        super(name, path);
    }

    /**
     * this method set the year the film was released and throw a exception if the year could not be good
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
