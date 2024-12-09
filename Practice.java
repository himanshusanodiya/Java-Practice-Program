 /*  class Practice{
public static void main(String[] args) {
    int[] arr = {-12, -11, -3, 5, 6, 15, 16, 18};
    int k = 19;
    int n = 4;
    int ans = BinarySearchK(arr, k,n);
    System.out.println(ans);
}
public static int BinarySearchK(int[] arr, int k , int n){
    int less ;
    int start = 0;
    int end = n-1;
    while(start<=end){
        int mid = start +(end-start)/2;
        if(arr[mid] > k){
            end = mid - 1;
        }
        else if(arr[mid]<k){
            start = mid + 1;
        }
        else{
            return mid;
        }
    }
    // for(int i = start ; i<end ; i++){
    //     if(arr[i]<0){
    //         less = (k-k)+i;
    //         return less;
    //     }
    // }
    if (end >= 0) {
        return arr[end];  
    }
    return  -1;
}
}
*/

class Practice {
    public static void main(String[] args) {
        int [] arr = {1,3,4,2,2};
        for(int i = 0 ; i<arr.length ; i++){
            System.out.println(i);
        }
    }
}
