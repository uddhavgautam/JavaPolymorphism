package interview;

import java.util.ArrayList;
import java.util.Scanner;

public class Prime {

    private static ArrayList<Integer> initialNumbers;
    private static int lower;
    private static int higher;
    private static ArrayList<Integer> primeArrayList;
    private static ArrayList<Integer> compositeArrayList;
    private static boolean isPrimeInt = true;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the range (each number input in different line) to find the prime");
        lower = scan.nextInt();
        higher = scan.nextInt();

        //initialize primeArrayList
        primeArrayList = new ArrayList<>(); //generic
        compositeArrayList = new ArrayList<>(); //generic

        int length = higher - lower + 1;
        initialNumbers = new ArrayList<>(); //generic

        for (int i = 0; i < length; i++) {
            initialNumbers.add(lower + i);
        }
        //print Initial 
        System.out.println("*** Initial ***");
        for (Integer ii : initialNumbers) {
            System.out.print("\t" + ii);
        }

        for (int i = 0; i < length; i++) {
            isPrimeInt = true;
            int cc = initialNumbers.get(i);
            if (cc > 1) {
                if (checkPrime(cc)) { //it forms PrimeArrayList and compositeArrayList
                    primeArrayList.add(cc);
                }
            }
        }

        System.out.println("");
        //print composites
        System.out.println("*** Composite ***");
        compositeArrayList.forEach((ii) -> {
            System.out.print("\t" + ii);
        });

        System.out.println("");

        //print primes
        System.out.println("*** Primes ***");
        primeArrayList.forEach((iii) -> {
            System.out.print("\t" + iii);
        });
        System.out.println("");

    }

    private static boolean checkPrime(int initialNumber) {
        int count = 0;
        if (initialNumber >= 2) {
            switch (initialNumber) {
                case 2:
                    //first prime number is 2
                    primeArrayList.add(initialNumber);
                    isPrimeInt = false;
                    break;
                case 3:
                    primeArrayList.add(initialNumber);
                    isPrimeInt = false;
                    break;
                default:
                    //first composite number is 4

                    for (int i = 2; i <= initialNumber / 2; i++) { //the same number always divides the same number
                        if (initialNumber % i == 0) {
                            count++;
                            if (count == 1) {
                                compositeArrayList.add(initialNumber);
                                isPrimeInt = false;
                                count = 0;
                                break;
                            }

                        }
                    }
                    break;
            }
        }
        return isPrimeInt;
    }
}
