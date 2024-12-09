import java.util.Arrays;
public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {4,1,2,3};
        int ans = missingNumber(arr);
      System.out.println(ans);
    }

        public static int missingNumber(int[] nums) {
           int i = 0;
    while(i<nums.length){
        int currect = nums[i]-1;
          if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[currect]) {
            swap(nums,i,currect);
          }
        else{
            i++;
        }
        
    }
    for(int index = 0 ; index<nums.length ; index++){
        if(nums[index] != index + 1){
            return index+1;
        }
    }
    return nums.length+1;
        }
    
    static void swap(int[]nums , int f, int s){
        int temp = nums[f];
        nums[f] = nums[s];
        nums[s] = temp;
    }
        }