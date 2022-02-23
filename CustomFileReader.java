
package reader;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class CustomFileReader {
    final String SOURCEFILE = "C:\\Java\\EduProjects\\Epam\\Task1\\Src\\datasource.txt";
    
    public List<String> getFileContents(){
        try{
            lines =  Files.readAllLines(Paths.get(SOURCEFILE));
        }catch(Exception e){
            
        }
        return lines;
    }
    private List<String> lines;
}
