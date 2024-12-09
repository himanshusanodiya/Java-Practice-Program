import java.util.Scanner;
public class PatternPrinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Tangle Star Pattern ");
        System.out.println("");
        for(int i = 5 ; i>=1 ; i--){
            for(int j =1 ; j <= (5-i) ; j++){
               System.out.print(" ");
            }
            for(int k = 1 ; k <= i ; k++){
                System.out.print(" *");
            }
            System.out.println("");
        }
    }
}