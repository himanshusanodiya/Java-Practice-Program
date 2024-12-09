import java.util.Scanner;
public class ShiftOT {
    public static void main(Str[] args) {
        Scanner sc = new Scanner(System.in);

        //right shift operator

        System.out.print("enter first number for right shift");
        int r1 = sc.nextInt();
        System.out.print("enter second number for right shift");
        int r2 = sc.nextInt();
        int rshift =(r1>>r2);
        System.out.println("after right shiftting your ans:" + rshift);

        //left shift operator

        System.out.print("enter first number for left shift");
        int l1 = sc.nextInt();
        System.out.print("enter second number for left shift");
        int l2 = sc.nextInt();
        int lshift =(l1<<l2);
        System.out.println("after left shiftting your ans:" + lshift);
    }
}
