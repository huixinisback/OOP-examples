
// Importing StringBuilder class
import java.lang.StringBuilder;
public class StringBuilderClass {
  public static void main(String[] args) {
   
    // Creating a StringBuilder object
    StringBuilder sb = new StringBuilder();
    // Appending some strings to the object
    sb.append("Hello");
    sb.append(" ");
    sb.append("World");
    // Converting the object to a string
    String str = sb.toString();
    // Printing the string
    System.out.println(str);
    // Output: Hello World

    //Alternatively
    StringBuilder s = new StringBuilder ("I like orange" );
    ABC(s);
    System.out.println ("After ABC() called, s = " +s);

  }
  
  public static void ABC(StringBuilder a) {
  a.append(" and apple"); // new string object is created as old literal is immutable
  System.out.println ("Inside ABC() , s = " +a);
  }
  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}