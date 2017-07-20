package ObserverPackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author uddhav
 */
class S1 implements Subject {

    private List<Observer> listObservers;
    private Observer ob1;
    private PrintWriter p1;
    private File file1;
    private Object object;
    private Thread thread;

    public S1() {
        
        listObservers = new ArrayList<>();
        
        ob1 = new ConcreteObserver1();

        file1 = new File("file.txt");

        try {
            //create a File
            p1 = new PrintWriter(file1, "utf-8");
        } catch (FileNotFoundException | UnsupportedEncodingException ex) {
            Logger.getLogger(S1.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Observer initialized!");
    }

    @Override
    public void registerObservers() {
        listObservers.add(ob1);
        System.out.println("Observer registered!");
    }

    public void updateFile() {
        while (true) {
            try {
                thread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        p1.write("hello man!");
                        p1.close();
                    }
                });

                thread.start();
                ob1.onUpdate(file1);
                thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(S1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
