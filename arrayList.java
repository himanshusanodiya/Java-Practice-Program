import java.util.ArrayList;
public class arrayList {
    
        public static ArrayList<Integer> xyz(int[] nums) {
            int i = 0 ;
            while(i<nums.length){
                int curr = nums[i]-1;
                if(nums[i] != nums[curr]){
                    swap(nums,i,curr);
                }
                else{
                    i++;
                }
            }
            ArrayList<Integer> result = new ArrayList<>();

            for(int j = 0 ; j<nums.length; j++){
                if(nums[j] != j+1){
                    result.add(nums[j]);
                }
               
            }
            return result;
        }
    
      
    static void swap(int[]arr , int f, int s){
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }

    public static void main(String[] args) {
        // Example array
        int[] numbers = {1,2,3,4,4,5,6,5};

        // Calling the xyz function and storing the result in an ArrayList
        ArrayList<Integer> result = xyz(numbers);

        // Printing the resulting ArrayList 
        System.out.println("ArrayList returned by xyz function: " + result);
    }
    }
    
    
    