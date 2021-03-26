package optional.commands;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;
import optional.catalog.Catalog;
import org.apache.log4j.BasicConfigurator;

import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class ReportCommand extends Command {

    public static final Configuration cfg = new Configuration(Configuration.VERSION_2_3_23);

    /**
     * contructor + display a html doc with catalog specifications
     * setup for freemarker
     * @param name
     * @param catalog
     * @throws IOException
     * @throws TemplateException
     */
    public ReportCommand(String name, Catalog catalog) throws IOException, TemplateException {

        super(name);
        BasicConfigurator.configure();
        cfg.setDirectoryForTemplateLoading(new File(System.getProperty("user.dir") + "\\templates\\"));
        cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
        cfg.setLogTemplateExceptions(false);
        Template temp = ReportCommand.cfg.getTemplate("template.ftl");
        temp.process(catalog, new OutputStreamWriter(System.out));
    }

}
