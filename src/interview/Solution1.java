package interview;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution1 {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            int res;
            String _word1;
            try {
                _word1 = in.nextLine();

            } catch (Exception e) {
                _word1 = null;
            }
            String _word2;
            try {
                _word2 = in.nextLine();

            } catch (Exception e) {
                _word2 = null;
            }
            res = numberOfIntersections(_word1, _word2);
            bw.write(String.valueOf(res));
            bw.newLine();

        }

    }

    private static int numberOfIntersections(String word1, String word2) {
        int noOfIntersections = 0;

        //check the word length
        boolean checkWord1 = checkWord(word1);
        //System.out.println(checkWord1);

        boolean checkWord2 = checkWord(word2);
        //System.out.println(checkWord2);

        if (checkWord1 && checkWord2) { //both should be true
            //do your work here
            for (int i = 0; i < word1.length(); i++) {
                for (int j = 0; j < word2.length(); j++) {

                    if (word1.charAt(i) == word2.charAt(j)) {
                        noOfIntersections++;
                    } else {
                        //do nothing
                    }

                }
            }

        } else { //do nothing
            //System.out.println("Check the length on your input words!");

        }

        return noOfIntersections; //Actually, it should be 2 * noOfIntersections because of below reasons:
        //each word can be vertical and horizontal
        //when word1 becomes vertical, second word horizontal and vice-versa. 
        //It's like handshaking. So, two times would be there
    }

    private static boolean checkWord(String word) {
        boolean status = false;
        //check word length
        if ((word.length() <= 120000) && (word.length() >= 1)) {
            //System.out.println("Length:" + word.length());
            //check word uppercase
            status = !word.equals(word.toLowerCase());
        } else {
            status = false;
        }
        //System.out.println(status);

        return status;
    }
}
