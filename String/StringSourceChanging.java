public class StringSourceChanging {
  public static void main(String[] args) {
    String m1 = new String("Welcome to Java");
    char[] c = new char[] {'c', 'o', 'v', 'i', 'd'};
    String m2 = new String(c);
    String m3 = new String(m2);
    String m4 = "Welcome to JAVA";
    String m5 = "Welcome to JAVA";

    System.out.println(m1);
    System.out.println(m2);
    System.out.println(m3);
    System.out.println(m4);
    System.out.println(m5);
    
    m5 = "just java";
    System.out.println("After changing m5");
    System.out.println(m4);
    System.out.println(m5);
    
    
  }

}