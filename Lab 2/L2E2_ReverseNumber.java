
import java.lang.Math;
public class Main {
  public static void main(String[] args) {
    int number = (int) Math.floor(Math.random()*100000);
    System.out.println("This is randomly generated: "+ number);
    System.out.println("This is in reverse: " + reverse(number));
  }

  public static int reverse(int number){
    String numberString = String.valueOf(number); //Change from int to String
    String reversedNumberString = "";
    for(int i = numberString.length() - 1; i >= 0; i--){
      reversedNumberString += numberString.charAt(i);
    }
    int reversedNumber = Integer.parseInt(reversedNumberString); //Change from String to int
    return reversedNumber;
  }

  }