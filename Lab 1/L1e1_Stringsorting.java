public class L1e1_Stringsorting {
  public static void main(String[] args) {
    String x = "I Love SG";
    String y = "I Love SP";
    String z = "Go Love SP";
    //if the result of x.compareTo(y) is smaller, x comes first in alphabetical order
    String result[] = new String[3];
    if (x.compareTo(y)<=0) {
    if (x.compareTo(z)<=0) {
    result[0] = x;
    if (y.compareTo(z) <=0){
    result[1]=y;
    result[2]=z;
    }
    else {
    result[1]=z;
    result[2]=y;
    }
    }
    else {
    result[0]=z;
    result[1]=x;
    result[2]=y;
    }
    }
    else {
    if (x.compareTo(z)<=0) {
    result[0] = y;
    result[1] = x;
    result[2] = z;
    }
    else {
    result[0] = y;
    result[1] = z;
    result[2] = x;
    }
    }
    for (String i : result){
    System.out.println (i);
    }
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}