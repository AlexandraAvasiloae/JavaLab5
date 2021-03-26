package optional.shell;

import freemarker.template.TemplateException;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import optional.Main;
import optional.catalog.Catalog;
import optional.commands.*;
import optional.exceptions.InvalidCatalogException;
import optional.exceptions.InvalidCommandException;
import optional.items.Item;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
@Getter
@Setter
@EqualsAndHashCode
@ToString

public class Shell {
    /**
     * the method get the catalog with the name from param
     * @param name
     * @return
     */
    public Catalog getCatalogFromCatalogList(String name) {
        for (int i = 0; i < Main.catalogList.size(); i++) {
            if (name.equals(Main.catalogList.get(i).getName())) {
                return Main.catalogList.get(i);
            }
        }
        return null;
    }

    /**
     * the method get item with the name
     * @param name
     * @return
     */
    public Item getItemFromItemList(String name) {
        for (int i = 0; i < Main.itemList.size(); i++) {
            if (name.equals(Main.itemList.get(i).getName())) {
                return Main.itemList.get(i);
            }
        }
        return null;
    }

    /**
     * with this method we can read the commands from shell
     * every command has a name and an argument which is given separably
     * in add command case it is necessary to specificate the second argument which is the name of catalog in which we save the item
     * @throws IOException
     * @throws InvalidCommandException
     * @throws InvalidCatalogException
     * @throws TemplateException
     */
    public void readCommand() throws IOException, InvalidCommandException, InvalidCatalogException, TemplateException {

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.println("Command name: ");
        String commandName = reader.readLine();
        validateCommandName(commandName);
        System.out.println("Command argument: ");
        String commandArgument = reader.readLine();
        validateCommandArgument(commandArgument, commandName);
        if (commandName.equals("add")) {
            System.out.println("The catalog in which you add the item: ");
            String commandArgument2 = reader.readLine();
            validateCommandAddArgument(commandArgument2);
            AddComand addComand = new AddComand(commandName, getItemFromItemList(commandArgument), getCatalogFromCatalogList(commandArgument2));
        }
        executeCommand(commandName, commandArgument);
    }

    /**
     * this method verify if the catalog in which we want to add a item exist, otherwise a custom exception is thrown
     * @param commandArgument2
     * @throws InvalidCommandException
     */
    public void validateCommandAddArgument(String commandArgument2) throws InvalidCommandException {
        if (getCatalogFromCatalogList(commandArgument2).equals(null)) {
            throw new InvalidCommandException("This catalog does not exist!");
        }
    }

    /**
     * this method verify if the name of command is one of commands specificated
     * @param commandName
     * @throws InvalidCommandException
     */
    public void validateCommandName(String commandName) throws InvalidCommandException {
        if (!(commandName.equals("add") || commandName.equals("list") || commandName.equals("save") || commandName.equals("play") || commandName.equals("load")  || commandName.equals("report"))) {
            throw new InvalidCommandException("The command name is incorrect");
        }
        if(commandName.equals("exit")){
            System.exit(0);
        }
    }

    /**
     * this method verify:
     *  if the item exist, in add command and play command case
     *  if the catalog exist, in save, load and list case
     * @param argument
     * @param name
     * @throws InvalidCommandException
     */
    public void validateCommandArgument(String argument, String name) throws InvalidCommandException {

        if (name.equals("save") || name.equals("load") || name.equals("list")) {
            if (getCatalogFromCatalogList(argument).equals(null)) {
                throw new InvalidCommandException("This catalog does not exist!");
            }
        }
        if (name.equals("add") || name.equals("play")) {
            if (getItemFromItemList(argument).equals(null)) {
                throw new InvalidCommandException("This item does not exist!");
            }
        }
    }

    /**
     * this method execute the command depends on case
     * @param name
     * @param argument
     * @throws IOException
     * @throws InvalidCommandException
     * @throws InvalidCatalogException
     * @throws TemplateException
     */
    public void executeCommand(String name, String argument) throws IOException, InvalidCommandException, InvalidCatalogException, TemplateException {
        if (name.equals("save")) {
            SaveCommand saveCommand = new SaveCommand(name, getCatalogFromCatalogList(argument));
            System.out.println(getCatalogFromCatalogList(argument));
        }
        if (name.equals("list")) {
            ListCommand listCommand = new ListCommand(name, getCatalogFromCatalogList(argument));
        }
        if (name.equals("play")) {
            PlayCommand playCommand = new PlayCommand(name, getItemFromItemList(argument));
        }
        if(name.equals("load")){
            LoadCommand loadCommand = new LoadCommand(name, getCatalogFromCatalogList(argument));
        }
        if(name.equals("report")){
            ReportCommand reportCommand= new ReportCommand(name, getCatalogFromCatalogList(argument));
        }

    }
}

