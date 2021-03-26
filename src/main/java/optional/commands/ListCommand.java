package optional.commands;

import optional.shell.Shell;
import optional.catalog.Catalog;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class ListCommand extends Command {

    static final Logger log = Logger.getLogger(Command.class);
    /**
     * constructor + execute the command
     */
    public ListCommand(String name, Catalog catalog){
        super(name);
        BasicConfigurator.configure();
        Shell shell = new Shell();
        log.info(catalog);
    }
}
