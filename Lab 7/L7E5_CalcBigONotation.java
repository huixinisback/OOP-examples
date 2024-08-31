public class L7E5_CalcBigONotation {
  public static void main(String[] args) {
    int x = 64;
    int n = x;
    int total=0;
    // no of loops = 6*64
    while (n>1){ // <- this is O(n)=log(n)
        n = (int)Math.floor(n/2); // O(n)=log2(64)
        for (int j=1; j<=x; j++) { //O(n) = 64
            System.out.println (j);
            total++;
        }
    }
    //64*log2(64), nlog(n)

    System.out.print(total);
  }
}