// import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Random;
import java.util.Scanner;
class LuckyDraw {
  public static void main(String[] args) {
    Random rand = new Random();
    Scanner sc = new Scanner(System.in);
    int input =1;
  while(input != 0){
    // Generate random integers in range 0 to 999
    int rand_int1 = rand.nextInt(10);
    System.out.println(rand_int1);
    switch (rand_int1) {
        case 1:
            System.out.println("You win the big prize");
            break;
        case 2:
            System.out.println("You win a medium prize");
            break;
        case 3:
            System.out.println("Lucky lucky you");
            double rand_dollar = rand.nextDouble();
            System.out.println("You win $" + rand_dollar);
            break;
        default:
            System.out.println("You lose, try again");
            break;
    }
    input =0 ;
    System.out.println("Press 1 to try again \nEnter 0 to quit");
    input = sc.nextInt();

  }
}}
