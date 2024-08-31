public class L2E5_BinarySearch {
  public static void main(String[] args) {
  int[] nums = {-8, -1, 23, 54, 59, 71, 88};
  int key = 88;
  System.out.println("The index is "+ search(nums, key));
   }

  
  public static int search(int[] nums, int key) {
   int low = 0;
   int high = nums.length - 1;
   int mid;
   while(low<=high){
     mid = low + (high-low)/2;
     if (nums[mid] == key){
       return mid;
     }
     if(nums[mid]>key){
       high = mid - 1;
     }
     if(nums[mid]<key){
       low = mid + 1;
     }
   }
    return -1;
  }
  }