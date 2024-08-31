
public class L3E3_DiceOOP {
  public static void main(String[] args) {
    Die die = new Die(6);
    System.out.print(die.roll());
  }
}

class Die {
  private int maxFace;
  public Die(int maxFace) {
    this.maxFace = maxFace;
  }
  public int roll() {
    int random = (int) (Math.random() * maxFace + 1);
    return random;
  }
}
  