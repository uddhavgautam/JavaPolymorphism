/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author uddhav
 */
public class MyFileReader {

    public static void main(String[] args) {

//        try{
//    PrintWriter writer = new PrintWriter("input.txt", "UTF-8");
//    writer.println("The first line");
//    writer.println("The second line");
//    writer.close();
//} catch (IOException e) {
//   // do something
//}
//        
//        File f = new File("input.txt");
//        FileInputStream fileInputStream = null;
//        BufferedReader bufferedReader = null;
//        try {
//            fileInputStream = new FileInputStream(f);
//            bufferedReader = new BufferedReader(new FileReader(f));
//            try {
//                while(bufferedReader.readLine() != null) {
//                    System.out.println(bufferedReader.readLine());
//                }
//            } catch (IOException ex) {
//                Logger.getLogger(MyFileReader.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(MyFileReader.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        finally {
//            try {
//                fileInputStream.close();
//            } catch (IOException ex) {
//                Logger.getLogger(MyFileReader.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            try {
//                bufferedReader.close();
//            } catch (IOException ex) {
//                Logger.getLogger(MyFileReader.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        try {
//            Scanner scan = new Scanner(new File("input.txt"));
//            while(scan.hasNextLine()) {
//                arrayList.add(Integer.parseInt(scan.nextLine()));
//            }
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(MyFileReader.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//        for (Integer integer1 : arrayList) {
//            System.out.println(integer1);
//        }
    }
}
