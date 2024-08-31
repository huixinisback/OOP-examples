import java.util.*;

public class L7E4_BinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 8, 9, 12, 45, 67, 80};

        int start = 0;
        int end = array.length-1;
        int key = 3;
        System.out.println(binarySearch(array, key, start, end));

        }


   public static int binarySearch(int[] array, int key, int start, int end ) {
       if (start <= end) {
           int mid = start + (end - start) / 2;
           if (array[mid]>key) return binarySearch(array, key, start,mid-1 );
           if (array[mid]<key) return binarySearch(array, key,mid+1, end);
           if (array[mid]==key) return mid;
       }
       return -1;
   }


}
