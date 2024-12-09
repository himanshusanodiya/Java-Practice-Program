import java.util.Arrays;
public class Leetcode {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubble (int[] arr){
        boolean swappped = false;
        for(int i = 0; i<arr.length; i++){
            swappped = false;
            for(int j = 1 ; j<arr.length-i ; j++){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swappped = true;
                }
            }
           
            if(swappped==false){
                break;
            }
        }
    }
}
             