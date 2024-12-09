
/* import java.util.Scanner;
public class HackerRank {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine(); 
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

        scan.close(); 
    }
}*/
import java.util.Scanner;

public class HackerRank {
    
    public static void main(String[] args) {
        /* 
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            for(int j=1;i<3;i++){
            for(int k=1;i<3;i++){
            Str s1 = sc.next();
            int x = sc.nextInt();
            Str s2 = sc.next();
            int x2 = sc.nextInt();
            Str s3 = sc.next();
            int x3 = sc.nextInt();
            System.out.println(s1 +"           "+ x);
            System.out.println(s2 +"           "+ x2);
            System.out.println(s3 +"           "+ x3);
            // Complete this line
        }
        System.out.println("================================");

    }
}*/

String myStr = "Split a string by spaces, and also punctuation.";
String regex = "[,.\\s]";
String[] myArray = myStr.split(regex);
for (String s : myArray) {
    if (!s.isEmpty()) { // Check if the string is not empty
        System.out.println(s);
}
    }
}}