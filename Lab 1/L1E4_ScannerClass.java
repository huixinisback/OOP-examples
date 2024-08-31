import java.util.Scanner;

public class L1E4_ScannerClass {
  
  
  public static void main(String[] args) {
    String name[] = new String[3];
    int age[] = new int[3];
    String school[] = new String[3];
    
    Scanner sc = new Scanner(System.in);
    
    for(int i = 1; i < 4; i++){
    System.out.println("Enter name "+ i +": ");
    name[i-1] = sc.nextLine();
    System.out.println("Enter age "+ i +": ");
    age[i-1] = sc.nextInt();
    System.out.println("Enter school "+ i +": ");
    sc.nextLine();
    school[i-1] = sc.nextLine();
    }

    for(int i = 1; i < 4; i++){
      System.out.println("Student "+ i +": "+ name[i-1] +", " + age[i-1]+", " + school[i-1] +"  ");
      }
  }


}