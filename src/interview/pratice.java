package interview;

/**
 *
 * @author uddhav
 */
public class pratice {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
//        String str = "      Uddhav Gautam ** //Uddhav ** \"G\"\n k cha? 'Uddhav \"Gautam\"'\n /* hello \"man\" 'how \"are\" you'\n\n**\n**\napg */ hey man //deshsdfdsfd   \n";
//        String str = "     Uddhav Gautam\n//Udhav \"gautam\"\n";
        String str = " //u g    1 2\n/*a \"b\"*/c d\n";
        //remove starting and trailing white spaces
        str = str.trim();
        String finalStr1 = "";
        String finalStr2 = "";

        for (String s : str.split("[/*].*[*/]")) {
            finalStr1 = finalStr1 + s;
            System.out.println(s);

//            System.out.println(finalStr1);
//            System.out.println(str);
            //update str
//            str = str.replace(finalStr1+".*([/*]).*([*/])", "");
        }
//        System.out.println(finalStr1);

//        String[] strr1 = finalStr1.split(".*[//].*[\n]*");
//        for (String s : strr1) {
//
//            finalStr2 = finalStr2 + s;
//        }
//        System.out.println(finalStr2);
    }
}
