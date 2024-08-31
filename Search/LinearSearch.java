
public class LinearSearch {
  public static void main(String[] args) {
  int[] nums = {2, 12, 15, 11, 88, 19, 45};
  int key = 88;
  System.out.println(search(nums, key));
   }
  public static int search(int[] nums, int key) {
  for (int i=0; i<nums.length; i++){
   if (nums[i]==key) return(i);
   }
  return(-1);
  }
  }