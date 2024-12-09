import java.util.Arrays;
import java.util.Scanner;  

public class TwoDArray {  
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  
        /* int[][] arr = new int[3][3];  
        
        for (int i = 0; i < 3; i++) {  
            for (int j = 0; j < 3; j++) {  
                System.out.print("Enter Element: ");  
                arr[i][j] = sc.nextInt();  
            }  
        }  
        
        System.out.println("Printing Elements...");  
        
        for (int i = 0; i < 3; i++) {   
            for (int j = 0; j < 3; j++) {  
                System.out.print(arr[i][j] +"\t");  
            }  
           System.out.println();
        }  */
          int i;
int TD [][] = new int[2][5];
 for( i = 0 ; i < 2; i++){
    for(int j = 0 ; j < 5 ; j++){
        TD[i][j]= sc.nextInt();
    }
 }
 for(int k = 0 ; k < 2 ; k++){
 System.out.println(Arrays.toString(TD[k]));
}
}
}