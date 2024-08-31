import java.util.Scanner;

public class L1E2_GradingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please key in a score:");
        int score = sc.nextInt();
        char grade ='a';
      
        if(score<=100 && score>=80){
            grade='A';
        } else if (score>=70) {
            grade='B';
        } else if (score>=60) {
            grade='C';
        } else if (score>=50) {
            grade='D';
        } else if (score>=0) {
            grade='F';
        }
      
      if (score>=0 && score<=100){
      System.out.println("Your grade is " + grade);
      }else{
      System.out.println("Invalid score");
      }
    }
}
