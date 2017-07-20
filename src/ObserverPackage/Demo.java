
package ObserverPackage;

/**
 *
 * @author uddhav
 */
public class Demo {
    public static void main(String[] args) {
        S1 s1 = new S1(); // instantiate Concrete Observers
        s1.registerObservers();
        s1.updateFile();        
    }
}
