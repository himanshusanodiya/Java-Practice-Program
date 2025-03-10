import java.util.Scanner;
public class javaString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

                int[] arr = {99, 45, 23, 21, 11, 9, -12, -8, -3, -1, 0};
                int target = 0;
                int ans = searchBinary(arr, target);
                System.out.println(ans);
            }
            static int searchBinary(int[] arr , int target ){
                int start = 0 ;
                int end = arr.length - 1;
                while(start<= end){
                    int mid  = start +(end - start)/2;
                    if(target < arr[mid]){
                        start = mid + 1;
                    }
                    else if(target > arr[mid]){
                        end = mid - 1;
                    }
                    else{
                        return mid;
                    }
                }
                return -1;
            }
        }
