public class L1e_CastInttoByte {
  public static void main(String[] args) {
    byte m;
    int i =9999;
    // i = 00100111 00001111 in binary
    m = (byte)i;
    //hence the lower byte (00001111) will be put into m.
    System.out.println(m);
  }

}