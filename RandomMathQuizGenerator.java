import java.util.Scanner;
import java.util.ArrayList;
public class RandomMathQuizGenerator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Double> answers = new ArrayList<Double>();
    
    double answer;
    for(int i =1; i<=10; i++){
      int num1 =(int) Math.round(Math.random() * 50);
      int num2 = (int)Math.round(Math.random() * 50);
      int operator = (int)Math.round(Math.random() * 3);
      
    switch(operator){
        
      case 0: 
        System.out.println("What is " + num1 + " + " + num2 + "?");
        answer = num1 + num2;
        answers.add(answer);
        break;
      case 1:
        System.out.println("What is " + num1 + " - " + num2 + "?");
        answer = num1 - num2;
        answers.add(answer);
        break;
      case 2:
        System.out.println("What is " + num1 + " * " + num2 + "?");
        answer = num1 * num2;
        answers.add(answer);
        break;
      case 3:
        System.out.println("What is " + num1 + " / " + num2 + "?");
        answer = num1 / num2;
        answers.add(answer);
        break;
    }
    

    }
    int correct = 0;
    for (int x =0; x<10; x++){
    System.out.println("Which question are you solving?");
      System.out.println("Question Number:");
    int qn = sc.nextInt();
    int input = sc.nextInt();
    
    System.out.println("Your answer is: ");
    int userAnswer = sc.nextInt();
    if(userAnswer == answers.get(qn-1)){
      System.out.println("Correct!");
      correct = correct + 1;
      
    }else{
      System.out.println("The correct answer is: " + answers.get(qn-1));
    }
    }
    System.out.print("You got " + correct + " out of 10 correct!");
    
  }
}