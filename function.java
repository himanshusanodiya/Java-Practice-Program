import java.util.Scanner;
public class function {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
System.out.println("Enter number to check armstrong or not ");
//int ans = sc.nextInt();
//System.out.println(armstrong(ans));
for(int i = 100; i<= 1000; i++){
    
    System.out.println("armstrong number betweenn 100 to 1000 : "+armstrong(i));
}
    }
    static int armstrong(int n){
        int orginal = n ;
        int sum = 0 ;
        while(n>0){
            int result = n % 10;
            n /= 10;
            sum = sum+result*result*result;
        }
        
        return sum==orginal;
    }
       
}