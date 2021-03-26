#Lab 5

##Media Catalog

Write an application that can manage a compulsory.catalog of multimedia compulsory.catalog.items.
An entry in this compulsory.catalog might be a song, a movie, a book, an image or any item that has at least a name and a path in the local file system. (We may also consider specifying a release year, a rating and other additional data, for example the author of the book, etc.)

##Compulsory (1p)

```

Compulsory (1p)

(done)Create an object-oriented model of the problem. You should have at least the following classes: Catalog and two item classes at your choice. Consider using an interface or an abstract class in order to describe the compulsory.catalog.items in a compulsory.catalog.
(done)Implement the following methods representing commands that will manage the content of the compulsory.catalog:
    add: adds a new entry into the compulsory.catalog;
    list: prints the content of the compulsory.catalog on the screen;
    play: playback using the native operating system application (see the Desktop class);
    save: saves the compulsory.catalog to an external file (either as a text or binary, using object serialization);
    load: loads the compulsory.catalog from an external file.
(done)The application will signal invalid data (year, path, etc.) using a custom exception.

OUTPUT:

"C:\Program Files\Java\jdk1.8.0_281\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2020.3.2\lib\idea_rt.jar=58638:C:\Program Files\JetBrains\IntelliJ IDEA 2020.3.2\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_281\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\rt.jar;C:\Users\Alexandra\IdeaProjects\lab5\target\classes;C:\Users\Alexandra\.m2\repository\com\github\javafaker\javafaker\1.0.2\javafaker-1.0.2.jar;C:\Users\Alexandra\.m2\repository\org\apache\commons\commons-lang3\3.5\commons-lang3-3.5.jar;C:\Users\Alexandra\.m2\repository\org\yaml\snakeyaml\1.23\snakeyaml-1.23-android.jar;C:\Users\Alexandra\.m2\repository\com\github\mifmif\generex\1.0.2\generex-1.0.2.jar;C:\Users\Alexandra\.m2\repository\dk\brics\automaton\automaton\1.11-8\automaton-1.11-8.jar;C:\Users\Alexandra\.m2\repository\log4j\log4j\1.2.15\log4j-1.2.15.jar;C:\Users\Alexandra\.m2\repository\javax\mail\mail\1.4\mail-1.4.jar;C:\Users\Alexandra\.m2\repository\javax\activation\activation\1.1\activation-1.1.jar" Main
0 [main] INFO Catalog  - My Catalog[Movie(year=1997, director=James Cameron), Book(author=J. K. Rowling, year=2000)]

Process finished with exit code 0

```

##Optional(2p)
```
    
(done)Create a shell that allows reading commands from the keyboard, together with their arguments.
(done)Represent the commands using classes instead of methods. Use an interface or an abstract class in order to desribe a generic command.
(done)Implement the commands add, list, save, load, play (create the classes AddCommand, ListCommand, etc.).
(done)Implement the command report: create (and open) an HTML report representing the content of the catalog.
      Use a template engine such as FreeMarker or Velocity, in order to create the HTML report.
(done)The application will signal the commands that are not valid using a custom exception.
(not done)The final form of the application will be an executable JAR archive. Identify the generated archive and launch the application from the console, using the JAR.
    
    
  output:
  
"C:\Program Files\Java\jdk1.8.0_281\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2020.3.2\lib\idea_rt.jar=55438:C:\Program Files\JetBrains\IntelliJ IDEA 2020.3.2\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_281\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\rt.jar;C:\Users\Alexandra\IdeaProjects\lab5\target\classes;C:\Users\Alexandra\.m2\repository\com\github\javafaker\javafaker\1.0.2\javafaker-1.0.2.jar;C:\Users\Alexandra\.m2\repository\org\apache\commons\commons-lang3\3.5\commons-lang3-3.5.jar;C:\Users\Alexandra\.m2\repository\org\yaml\snakeyaml\1.23\snakeyaml-1.23-android.jar;C:\Users\Alexandra\.m2\repository\com\github\mifmif\generex\1.0.2\generex-1.0.2.jar;C:\Users\Alexandra\.m2\repository\dk\brics\automaton\automaton\1.11-8\automaton-1.11-8.jar;C:\Users\Alexandra\.m2\repository\log4j\log4j\1.2.15\log4j-1.2.15.jar;C:\Users\Alexandra\.m2\repository\javax\mail\mail\1.4\mail-1.4.jar;C:\Users\Alexandra\.m2\repository\javax\activation\activation\1.1\activation-1.1.jar;C:\Users\Alexandra\.m2\repository\org\freemarker\freemarker\2.3.23\freemarker-2.3.23.jar" optional.Main
Command name: 
add
Command argument: 
Harry Potter
The catalog in which you add the item: 
My Catalog
Command name: 
list
Command argument: 
My Catalog
0 [main] INFO optional.commands.Command  - Catalog(name=My Catalog, path=D:\java5\catalog.ser, items=[Book(author=J. K. Rowling, year=2000)])
Command name: 
save
Command argument: 
My Catalog
Catalog(name=My Catalog, path=D:\java5\catalog.ser, items=[Book(author=J. K. Rowling, year=2000)])
Command name: 
load
Command argument: 
My Catalog
Command name: 
report
Command argument: 

```