import java.util.Arrays;

public class SweetJava {
       public static void main(String[] args){
           int[] nums = {2,7,9,12};
           System.out.println(Arrays.toString(twoSum(nums, 9)));
       }
       public static int[] twoSum(int[] nums, int target) {
             for (int i = 0; i < nums.length; i++) {
                 for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] + nums[i] == target) {
                       int [] x = new int[] { i, j };
                       return x;
                    }
                 }
             }
             int y [] = {0,0};
           return y;
       }
}