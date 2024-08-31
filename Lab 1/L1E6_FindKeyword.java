// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class L1E6_FindKeyword{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");


        System.out.println("\nKey in a text to search:");
        String text = sc.nextLine();

        System.out.println("\nKey in a phrase to find:");
        String phrase = sc.nextLine();

        System.out.println("\n1 - Find the first phrase that appears\n2 - find all the phrases that appears");
        int option = sc.nextInt();
        if (option == 1) {
            findWord(text, phrase);
        }
        if (option == 2) {
            findWords(text, phrase);
        }


    }

    public static void findWord(String text, String phrase) {
        System.out.println("\nFound the keyword at position: " + text.indexOf(phrase));
    }

    public static void findWords(String text, String keyword) {
        System.out.println("This is your text: " + text);
        System.out.println("\nThis is your keyword: " + keyword);
        int position = text.indexOf(keyword);

        if (position >= 0) {
            System.out.println("\nFound the keyword at position: " + position);
        } else {
            System.out.println("\nKeyword is not found");
        }

        while (position >= 0) {
            position = text.indexOf(keyword, position + 1);

            if (position >= 0) {
                System.out.println("\nFound the keyword at position: " + position);
            } else {


                System.out.println("\nThat is the end");
            }
        }
    }
}