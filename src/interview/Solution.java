package interview;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        in.useDelimiter("END_OF_FILE");
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        String res;
        String _inputJavaScript;
        try {
            _inputJavaScript = in.next();
        } catch (Exception e) {
            _inputJavaScript = null;
        }

        res = standardizeJavaScript(_inputJavaScript);
        bw.write(res);
        bw.newLine();

        bw.close();
    }

    private static String standardizeJavaScript(String _inputJavaScript) {
        //trim first and last trailing whilte spaces
        String finalStr = _inputJavaScript.trim();

        //check the word length
        boolean checkWord1Length = checkWordLength(_inputJavaScript);
        //System.out.println(checkWord1Length);
        if (checkWord1Length) {
            //do your work here
            //Since string are immutable, each time new string will produce

            //produces array of strings by breaking into newlines
            finalStr = finalStr.replace("\"", "\\\""); //should be above
            finalStr = finalStr.replace("'", "\""); //should be below

        } else {
            //do nothing
        }

        return finalStr;
    }

    private static boolean checkWordLength(String _inputJavaScript) {
        boolean status = false;
        if ((_inputJavaScript.length() <= 600000) && (_inputJavaScript.length() >= 1)) {
            //System.out.println("Length:" + _inputJavaScript.length());
            status = true;
        }
        //System.out.println(status);
        return status;
    }
}
