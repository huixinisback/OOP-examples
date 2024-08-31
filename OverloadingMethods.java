public class OverloadingMethods {
public static void main(String[] args) {
System.out.println("The minimum between 8,9 is " + min(8, 9));
System.out.println("The minimum between 7.7 , 3.3 is " + min(7.7, 3.3));
System.out.println("The minimum between 3.0, 5.4,10.14 is " + min(3.0, 5.4, 10.14));
System.out.println("The minimum between 4 , 4.1 is " + min(4, 4.1));
}
public static int min(int n1, int n2) { //method 1
if (n1 < n2) return n1;
else return n2;
}
public static double min(double num1, double num2) { //method 2
if (num1 < num2) return num1;
else return num2;
}
public static double min(int num1, double num2) { //method 3
if (num1 < num2) return num1;
else return num2;
} 
public static double min(double num1, double num2, double num3) { //method 4
return min(min(num1, num2), num3);
}
}

