public class CompareStrings {
  public static void main(String[] args) {
    String s1 = new String("I love Java");  // 1st encounter “I love Java”
    String s2 = new String("I love Java");  
    String s3 = "I love Java";
    String s4 = "I love Java";
    String s5 = new String (s4);

    System.out.println("Comparing source");
    System.out.println(s1==s2); // false
    System.out.println(s1==s3); // false
    System.out.println(s1==s4); // false
    System.out.println(s2==s3); // false
    System.out.println(s3==s4); // true
    System.out.println(s4==s5); // false
 

    System.out.println("comparing contents");
    System.out.println(s1.equals(s2)); // false
    System.out.println(s3.equals(s1)); // true
    System.out.println(s1.equals(s4)); // true
    System.out.println(s2.equals(s3)); // true
    System.out.println(s3.equals(s4)); // true
    System.out.println(s5.equals(s4)); // true

    String b1 ="ABCD";
    String b2 ="AFCD";
    System.out.print(b1.compareTo(b2)+"\n");
    System.out.print(b2.compareTo(b1));
  }


}