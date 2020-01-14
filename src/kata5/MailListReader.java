
package kata5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class MailListReader {

    public static List<Mail> read(String fileName) {
        List<Mail> list = new ArrayList<>();
        
        try{
            BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));
            String line = "";
            while(((line = reader.readLine()))!= null){
                if(Mail.isMail(line))
                    list.add(new Mail(line));
            }
            
        } catch(FileNotFoundException exception){
            System.out.println("ERROR MailListREader::read (File not Found) " +exception.getMessage());
        } catch(IOException exception){
            System.out.println("ERROR");
        }
        return list;
    }
    
}
