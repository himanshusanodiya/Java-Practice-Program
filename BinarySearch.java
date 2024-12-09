import java.util.Arrays;
 class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 11, 11, 11, 11, 11, 45, 78, 90, 122, 344, 666};
        int target = 11;
        int[] result = searchBinary2(arr, target);
       System.out.println(Arrays.toString(result));
    }

    static int[] searchBinary2(int[] arr, int target) {
        int[] ans = {-1, -1};
        
      int start = searchBinary1(arr, target, true);
        // If the first occurrence is found, find the last occurrence
       
           int end = searchBinary1(arr, target, false);
           ans[0] = start;
           ans[1] = end;
        
        return ans;
    }

    // Helper method to perform binary search
    static int searchBinary1(int[] arr, int target, boolean findFirst) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                ans = mid; // Target found
                if (findFirst) {
                    // Move left to find the first occurrence
                    end = mid - 1;
                } else {
                    // Move right to find the last occurrence
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}

/*
 
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int target = 2;
        int[] result = searchRange(arr, target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(nums.length == 2 && target == nums[0] && target== nums[1]){
                return new int[] {0,1};
            }
            else{
                
            if (target < nums[mid]) {
                end = mid - 1;
            }
            
            else if (target > nums[mid]) {
                start = mid + 1;
            } 
            
            else {
                return new int[] {start, mid}; // Fixed: Returning mid for both start and end
            }}
        }
        return new int[] {-1, -1};
        }
    }


 */