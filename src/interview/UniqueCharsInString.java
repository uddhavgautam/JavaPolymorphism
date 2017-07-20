package interview;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.stream.IntStream;

/**
 *
 * @author uddhav
 */
public class UniqueCharsInString {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        int noOfLetters = 0;
        //assert noOfLetters is between 1 to 100
        assert noOfLetters > 1 && noOfLetters <= 100;

        String word;
        word = chooseRandomlyAnyWordFrom1To100LettersInIt(noOfLetters);

        ThreadFactory threadFactory = Executors.defaultThreadFactory(); //creates threads on demand
        ExecutorService threadPoolExecutor = Executors.newFixedThreadPool(10); //Creates a thread pool that creates new threads as needed, but will reuse previously constructed threads when they are available. 

//        Runnable runnable = () -> { //lambda expression guarantees there is no need to create new Runnable anonymous object each time
//            //This is so performance effecient
//            if (isUniqueCharInStr(word)) { //I am testing one input "uddhav"
//                //I would like to test millions of inputs in an automated way
//                System.out.println("unique char");
//                return;
//            }
//            System.out.println("not unique char");
//        };
//        for (int i = 0; i < 100000000; i++) { //1 billions of tasks distributed among 10 threads
//            threadPoolExecutor.execute(runnable);
//        }
//        threadPoolExecutor.shutdown();
//        
        IntStream.range(0, 99999999).forEach((value) -> execute(threadPoolExecutor, word));
        threadPoolExecutor.shutdown();

    }

    public static boolean isUniqueCharInStr(String str) {
        if ((str.length() < 1) || (str.length() > 128)) {
            return false;
        }
        boolean[] charSet = new boolean[128]; //charSet all 128 slots are filled with False.
//there can'be be more than 128 sysmbols in computer world

        for (int i = 0; i < str.length(); i++) { //I can't distribute this loop here. Because it is one complete task
            int val = str.charAt(i); //returns ASCII value, which we use as index for charSet
            if (charSet[val] == true) { //if this is true, it means charSet is already filed with true.
                return false; //returns output. Function stops here
            }
            charSet[val] = true; //we filled charSet boolean array
        }
        return true; //must check all elements of String to reach here

    }

    private static String chooseRandomlyAnyWordFrom1To100LettersInIt(int noOfLetters) {
        return "abcdefghijklmnopqrstwxyz";
    }

    private static void execute(ExecutorService threadPoolExecutor, String word) {
        threadPoolExecutor.execute(() -> {
            if (isUniqueCharInStr(word)) {
                System.out.println("unique char");
                return;
            }
            System.out.println("not unique char");
        });
    }
}
