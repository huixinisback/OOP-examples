public class 2DArrayUnequalRows {
  public static void main(String[] args) {
    int z[][]=new int[3][]; // three rows
    
    z[0] = new int[2]; // first row - 2 elements
    z[1] = new int[5]; // second row - 5 elements
    z[2] = new int[9]; // third row - 9 elements
    //this is to check each element in the array, like one "row"
    for (int i=0; i<z.length; i++) {
     //check every element in the row 
    for (int j=0; j<z[i].length; j++) 
     System.out.print(j);
    System.out.println();
    }
  }
}