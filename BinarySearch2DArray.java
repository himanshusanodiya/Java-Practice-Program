import java.util.Arrays;
public class BinarySearch2DArray {
    /* 
    public static void main(String[] args) {
        int[][] arr = {
            {10,20,30,40},
            {11,15,16,45},
            {28,29,37,49},
            {33,34,38,50}
        };
        System.out.println(Arrays.toString(binarySearch(arr, 99)));
    }
    public static int[] binarySearch(int [][] matrix, int target){
        int row = 0;
        int column = matrix.length - 1;
        while(row  < matrix.length && column >= 0){
            if(matrix[row][column] == target){
                return new int[]{row,column};
            }
            if(matrix[row][column] < target){
                row++;
            }
            else{
                column--;
            }
        }
        return new int[]{-1,-1};
    }
        */
        public static void main(String[] args) {
            System.out.println("Try programiz.pro");
            int[] arr = {5,7,7,8,8,10};
            int target = 2;
            int[] result = searchRange(arr, target);  // Store the result of searchRange
            System.out.println(Arrays.toString(result));  // Print the result using Arrays.toString
        }
        public static int[] searchRange(int[] nums, int target) {
            int start = 0;
            int end =  nums.length - 1;
            if(nums.length == 2 && start == end){
                    return new int[] {start,end};
                }
            while(start <= end ){
                int mid = start + (end - start ) / 2;
                
                if(target < nums[mid]){
                    end = mid - 1;
                }
                else if( target > nums[mid]){
                    start = mid + 1;
                }
                 
                else{
        return new int[] {start,mid};
                }
            }
                return new int[] {-1,-1};
        }
}
