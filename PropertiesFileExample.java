import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;
import java.io.IOException;;


public class PropertiesFileExample {
    public static void main(String[] args) throws IOException {
        
        Properties props = new Properties();

        //Set Properties
        props.setProperty("db.user", "Sujal");
        props.setProperty("db.password", "secret");

        //Save to a file
        FileOutputStream fos = new FileOutputStream("config.properties");
        props.store(fos, "Database Configuration");
        System.out.println("Info has been stored in file");
        fos.close();

        //Now Load File
        Properties loadProps = new Properties();
        FileInputStream fis = new FileInputStream("config.properties");
        loadProps.load(fis);
        System.out.println("File has been loaded");
        fis.close();

        //Print loaded values
        System.out.println("User: " + loadProps.getProperty("db.user"));
        System.out.println("Password: " + loadProps.getProperty("db.password"));

        //Printing via output stream
        props.list(System.out);
    }
}
