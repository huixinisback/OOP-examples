public class L2E4_BubbleSortNumber {
  public static void main(String[] args) {
   boolean noMoreSwap;
   int[] c = {88, -8, -1, 59, 54, 71, 23};
    for (int i = 0; i<c.length -1; i++){
      for(int j = 0; j<c.length-1; j++){
        noMoreSwap = false;
        if(c[j]>c[j+1]){
          int temp = c[j];
          c[j]=c[j+1];
          c[j+1]=temp;
        }
       if(noMoreSwap==true){break;}
        else{noMoreSwap=true;}

      }
     
    }
    for(int i: c){
      System.out.println(i);
    }
    }
  
}