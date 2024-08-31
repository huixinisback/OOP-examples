import java.util.Random;
import java.util.Scanner;

public class RandomLetterGenerator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int choice = 1;
    int number;
    
      System.out.println("Key in how many letters u want: ");
      number=sc.nextInt();
      while(choice==1){
        System.out.println(thisone(number));
        System.out.println("Press 1 to continue " + number +" letters \nPress 0 to choose new number of letters");
        choice=sc.nextInt();
        if (choice!=1){
          choice = 1;
          System.out.println("Key in how many letters u want: ");
          number=sc.nextInt();
        }
   }
    
    
    
  }
  public static String thisone(int x){
      StringBuilder randomletters= new StringBuilder("The Letters are: ");
      char[] letters = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
      int randomIndex;
      for(int i = 0; i<x; i++){
          randomIndex=(int)Math.floor(Math.random()*26);
          randomletters.append(letters[randomIndex]);
      }
      return randomletters.toString();
  }
 
}