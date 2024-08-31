
import java.util.Scanner;

public class SearchLetterInString {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
   
    System.out.print("Enter a sentence:\n");
    String sentence = scanner.nextLine();

    System.out.print("Press 1 to find character at index\nPress 2 to find index of Word \n");
    int option=scanner.nextInt();
    switch (option){    
      case 1:
        System.out.print("Enter an index:");
        int index = scanner.nextInt();
        char character = sentence.charAt(index);
        System.out.println("\nYour sentence:\t" + sentence);
        System.out.println("Your index:\t" + character);

        break;

      case 2:
        System.out.print("Enter a word:");
        scanner.nextLine();
        String indexWord = scanner.nextLine();
        int indexOfWord = sentence.indexOf(indexWord);
        System.out.println("\nYour sentence:\t" + sentence);
        System.out.println("Your index:\t" + indexOfWord);
        break;
    }


  } 
}