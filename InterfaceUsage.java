public class InterfaceUsage {
  public static void main(String[] args) {
    Chicken ck = new Chicken();
    ck.Kao();
    ck.Moo();
  }

}

interface Farm{
  void Kao();
  void Moo();
}

class Chicken implements Farm{
  public void Kao(){
    System.out.println("Chicken Kao");
  }
  public void Moo(){
    System.out.println("Chicken Moo");
  }
}