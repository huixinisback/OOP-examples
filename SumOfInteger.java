//find the sum of all the digits for a given positive integer using recurrsive method
import java.util.*;

public class SumOfInteger {
    public static void main(String[] args) {
        int x = 123456;
        System.out.println(sumOfInteger(x));
        System.out.println(1+2+3+4+5+6);
    }

    static public int sumOfInteger(int sum){
        if (sum>0){
            int nextSum = sum/10;
            int remainder = sum%10;
            if (nextSum>9){
                return (remainder+sumOfInteger(nextSum));
            }else{
                return (nextSum+remainder);
            }

        }

        return 0;
    }

}