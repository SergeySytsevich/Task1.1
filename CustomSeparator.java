
package separator;

import java.io.FileReader;
import java.util.Properties;


public class CustomSeparator {
    public CustomSeparator(){
        separator = ";";
        setSeparator();
    }
    public String getSeparator(){
        return separator;
    }
    private String separator;
    private void setSeparator(){
        
        Properties p = new Properties();
        try{
            p.load(new FileReader("separator.properties"));
            separator = p.getProperty("validSeparators", ";");
        }
        catch(Exception e){
        }
        
    }
}
