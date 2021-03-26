package optional.commands;

import optional.items.Item;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class PlayCommand extends Command {
    /**
     * contructor + play the item
     * @param name
     * @param arg
     * @throws IOException
     */
    public PlayCommand(String name, Item arg) throws IOException {
        super(name);
        Desktop desktop = Desktop.getDesktop();
        File catalogFile = new File(arg.getPath());
        desktop.open(catalogFile);
    }
}
