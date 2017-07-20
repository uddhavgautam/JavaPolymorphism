package ObserverPackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author uddhav
 */
public class ConcreteObserver1 implements Observer{

    @Override
    public void onUpdate(File fie) {
        try {
            FileReader fileReader = null;
            try {
                fileReader = new FileReader(fie);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ConcreteObserver1.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader =
                    new BufferedReader(fileReader);
            String line;
            
            try {
                while((line = bufferedReader.readLine()) != null) {
                    System.out.println(line);
                }   
            } catch (IOException ex) {
                Logger.getLogger(ConcreteObserver1.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            // Always close files.
            bufferedReader.close();
            
        } catch (IOException ex) {
            Logger.getLogger(ConcreteObserver1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

}
