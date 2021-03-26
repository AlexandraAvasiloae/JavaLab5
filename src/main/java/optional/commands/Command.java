package optional.commands;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
abstract public class Command {

    protected String name;
    public Command(String name){
        this.name=name;
    }

}
