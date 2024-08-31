// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;

public class FirstUpperCaseOfString {
    public static void main(String[] args) {
        String x = "singApore";
        String y = "singaporE";
        String z = "singapore";
       System.out.println(firstUpperCaseLetter(x,0));
       System.out.println(firstUpperCaseLetter(y,0));
       System.out.println(firstUpperCaseLetter(z,0));
       System.out.println(getFirstUpper(z,0));
    }

    static public char firstUpperCaseLetter(String x, int index){
       if (index<x.length()){
           String newX = x.toUpperCase();
           char newChar = newX.charAt(index);
           char original = x.charAt(index);
           if (newChar==original){
               return original;
           }else{
               return firstUpperCaseLetter(x,index+1);
           }

       }
        return '1';

    }

    public static char getFirstUpper(String x, int i){
        // check 'A' -  'Z'
        char y = x.charAt(i);
        if ((y >='A') && (y <='Z')) {
            return (y);
        }
        else {
            // not last character?
            if (i< x.length()-1){
                return (getFirstUpper(x,i+1));
            }
        }
        return ('1');  // no uppercase, return a character '1'

    }



}