// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class L1E1_SwapVariables {
  public static void main(String[] args) {
    int x =2;
    int y=10;
    System.out.println("Before swap \nx:"+ x +"\ny:"+y);
    int placeholder =x;
    x=y;
    y=placeholder;
    System.out.println("After swap \nx:"+ x +"\ny:"+y);
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}
