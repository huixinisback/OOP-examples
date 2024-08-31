
public class L3E3_ResusingOOP{
  public static void main(String[] args) {
   PrintMachine Canon = new PrintMachine();
   PrintMachine Fujitsu = new PrintMachine();
    //referece array like a temp storage of what you want to print
    String c[];

    c = Canon.copy("Flying!", 6);
    for(String i : c){
      System.out.println("\n" + i);
    }

    // the array c can be reused
    c = Fujitsu.copy("High!", 4);

    System.out.print(PrintMachine.TotalNoOfCopy);

    for(String i : c){
      System.out.println("\n" + i);
    }
    /*inheritance, both will be printed as the string both is converted*/
    System.out.print(Canon);
    System.out.print(Canon.toString());

  }
}

class PrintMachine{

  static int TotalNoOfCopy = 0;

  String[] copy(String strText, int intNos){
    String[] a = new String[intNos];
    for(int i = 0; i < intNos; i++){
      a[i] = strText;
    }


    TotalNoOfCopy += intNos;
    return(a);
  }

   public String toString(){
    String s = "this string is nice";
    return(s);
  }
}