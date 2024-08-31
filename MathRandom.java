
public class MathRandom {
  public static void main(String[] args) {
    //basic usage , round off double to int
    int x = (int) Math.round(9.5);
    //print out random number that is integer from 0 to any number
    System.out.print(Math.round(Math.random()*20) + "\n");
    int g;
    g = (int) Math.round(Math.random()*20);
    System.out.print(g+ "\n"); 
    //print out random integer numbers within a range.
    int min= -3; 
    int max= 6;
  for (int j=0; j<10; j++){
    int i = (int) (Math.random() * (max - min + 1) + min);
    System.out.print(i);
    System.out.print("\n");
  }
  }
}