public class ArrayManipulation {
  public static void main(String[] args) {
    int[] c = {11,22,33};
    int[] d ={44,55,66,77};
    // method to display array 1
    for(int x=0; x<c.length; x++){
      System.out.println(c[x]); // 11 22 33
    }
    //method to display array 2
    for (int x : c){
      System.out.println(x); // 11 22 33
    }

    
      System.out.println("WRONG USE");
      for(int x=0; x<c.length; x++){
        System.out.println(x); // 11 22 33
      }

    System.out.println("Array Copy");
    //from array c[0] to d[0] for 3 indexes.
    System.arraycopy(c,0,d,0,3);
    
    for(int x:d){
      //now the first 3 index of d will be the same as c[0] to c[2]
      System.out.print(x);
    } 

    double a[] = {1.1,2.2,3.3};
    double b[] = {4.4,5.5,6.6,7.7};
    //they will refer to the same memory and the orginal array of A will be gone
    a = b;

    a[3]=8.8;
    System.out.print("Array A\n");
    for(double x:a){
      System.out.print(x+"\n");
    }
    System.out.print("Array B\n");
    for(double x:b){
     System.out.print(x+ "\n");
    }

  double z[] = {1.1,2.2,3.3};
  double y[] = {4.4,5.5,6.6,7.7};
  System.arraycopy(z, 1, y, 2, 2);
  System.out.print("Changed array using array copy y \n");
    for(double x:y){
      System.out.print(x+"\n");
    }
    System.out.print("Source array z\n");
    for(double x:z){
      System.out.print(x+"\n");
    }
  }
}
