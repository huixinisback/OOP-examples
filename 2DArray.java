public class 2DArray {
    public static void main(String[] args) {
    int[][] a = {{11,22,33},{44,55,66},{77,88,99}, {100,200,300}}; // like one array in each array element
    System.out.print( "Total = " + sumAll(a) );
    }
    static int sumAll(int a[][]){
    int sum=0;
    for (int row =0 ; row<a.length; row++) {
    for (int col = 0; col < a[row].length; col++)
    sum += a[row][col];
    }
    return(sum);
    }

}