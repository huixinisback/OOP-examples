import java.util.Scanner;
public class SubjectGPACalculator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int subjects;
    int totalcredit=0;
    double totalgrade=0;
    double gpa;
    System.out.println("How many subjects: ");
    subjects=sc.nextInt();
    for(int i=0; i<subjects; i++){
    System.out.println("Credit unit: ");
    int credit = sc.nextInt();
    System.out.println("Grade: ");
    double grade = sc.nextDouble();
    totalgrade = totalgrade + grade*credit;
    totalcredit = totalcredit + credit; 
    }
    gpa = totalgrade/totalcredit;
    System.out.print("Your total gpa is "+ gpa);
  }
}
