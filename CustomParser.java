
package parser;


import com.epam.task1.entity.EntityArray;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import reader.CustomFileReader;
import separator.CustomSeparator;


public class CustomParser {
    public List<Integer> parse(List<Integer> result){
        CustomSeparator cs = new CustomSeparator();
        String separators = cs.getSeparator();
        CustomFileReader cfr = new CustomFileReader();
        
        List<String> lines = cfr.getFileContents();
        
        for (int i = 0; i < lines.size(); i++) {
            String line = lines.get(i);
            try{
                result.addAll(parseLine(line, separators));
                System.out.println("Line[" + i + "] accepted: " + line);
            }catch(NumberFormatException e){
                System.out.println("Line[" + i + "] discarded: " + line);
            }
        }
        return result;
    }
    
     private  List<Integer> parseLine(String line, String separators) {
        StringTokenizer tokenizer = new StringTokenizer(line, separators);
        List<Integer> intermediateResult = new EntityArray();
        while (tokenizer.hasMoreElements()) {
            String token = tokenizer.nextToken().trim();
            if(token.isEmpty())
                continue;
            
            Integer number = Integer.parseInt(token);
            intermediateResult.add(number);
        }
        return intermediateResult;
    }
    
    
    
}
