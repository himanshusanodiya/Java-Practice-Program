
import java.util.Scanner;

    /* static int T20WorldCup(int Year){
        String Country = "INDIA WILL WIN THE MATCH... ";
        if(Year == 2024){
            System.out.println(Country);
        }
        else{
            System.out.println("......");
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Current Year : ");
        int year = sc.nextInt();
        System.out.println(T20WorldCup(year));
        }*/


//     System.out.println("enter natural number for sum : ");

//     int sum = sc.nextInt();
//     System.out.println("sum of natural number is : "+ fun(sum));

// }
//   public static int fun(int n){
//     if(n==n)
//     return 1;
//     int s = fun(n-1) + fun(n-2);
//     System.out.println("fab : "+s);
//     return s;
// }
//}

class Recursion{
 public static void main(String[] args) {

    
//     System.out.println(rec(4));
// }

// static int rec(int n){
//     if(n < 2){
//         return 1;
//     }
    
//    return rec(n-1)+rec(n-2); 

/*
int sum = 1;
int subArr = nums[0];

for(int i = 0 ; i < arr.length ; i++){
    multi *= nums[i];
    subArr = Math.max(subArr , multi);
    if(multi < 0 && nums[i+1] < 0 ){
        multi = 1;
    }
    if(multi < 0){
        multi = 0;
    }
}
return subArr;
} 
 */
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 natural(1);
 }
 /*
 static void natural(int n){
    if(n==5){
        return;
    }
    System.out.println(n);
    natural(n + 1);
 }
    
} */
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 
static void natural(int n){
    if(n==5){
        return;
    }
    natural(n + 1);//4
    System.out.println(n);
 }
}