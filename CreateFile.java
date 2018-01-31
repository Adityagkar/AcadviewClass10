
package Files;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CreateFile {
    
    public static void main(String args[]) throws IOException{
        
        File fobject=new File("C:\\Users\\Aditya\\Desktop\\path.txt");
        
        try {
            FileReader in_stream=new FileReader(fobject);
            int c;

            while((c=in_stream.read())!=-1){
               System.out.print(""+((char)c));  
            }
           
            
        } catch (FileNotFoundException ex) {
          System.out.print("File not Found!!");  
        }
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
