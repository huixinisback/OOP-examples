

public class L2E1_MathClasses {
  public static void main(String[] args) {
    System.out.println("Degree\tsin\tcos");
    for (int degree = 0; degree <= 360; degree += 10) {
        double radian = Math.toRadians(degree);
        double sinValue = Math.sin(radian);
        double cosValue = Math.cos(radian);

        sinValue = Math.round(sinValue * 10000.0) / 10000.0; // rounding to four digits after decimal point
        cosValue = Math.round(cosValue * 10000.0) / 10000.0; // rounding to four digits after decimal point

        System.out.printf("%d \t\t %.4f \t %.4f \n", degree, sinValue, cosValue);
  }
  }
 }