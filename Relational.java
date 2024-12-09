import java.util.Scanner;
public class Relational {
    public static void main(Str[] args) {
        System.out.println("relational operator in java");
        // != , < , > ,<= , >= etc...
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int num1 = sc.nextInt();
        System.out.println("enter second number");
        int num2 = sc.nextInt();
        boolean relation = num1 <= num2;
        System.out.println(relation);
    }
}
