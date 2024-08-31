// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class L1E5_TypeCasting{
  public static void main(String[] args) {
   float a;
   int b; 
  //because the function they are using is returning a double value.
   byte c,d;
   String e;
   a = (float) getArea(10);
   b = (int) getFullBag(77);
   c= (byte) 7;
   d = (byte) (c + c) ;
   e = a + "" + c;
    
//show  check results
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    System.out.println(e);
  }
  
  public static double getArea(int r){
   return(r*r*22.0/7);
  }
  
  public static double getFullBag(int apples){
   // each bag can take 10 apples
   // return number of full-bag
   return (apples/10.0);
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}