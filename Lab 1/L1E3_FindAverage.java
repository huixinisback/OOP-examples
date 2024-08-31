// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;

public class L1E3_FindAverage {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int looped =0;
    int total = 0;
    int input = 0;
    do{
       System.out.println("Please key in an Integer: ");
       input = sc.nextInt();
       if(input!=0){
         total +=input;
         looped++;
       }
    }while(input!=0);

    double average = ((double)total)/looped;
    System.out.println("The average is: "+average);
    
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}