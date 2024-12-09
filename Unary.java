public class Unary{
    public static void main(Str[] args) {
      /* */  //unary not operator this operator convert true to false and false to true.
        System.out.println("unary not operator");
        int not1 = 10;
        int not2 = 20;
        System.out.println("not1>not2 = " + !(not1 > not2));
        System.out.println("not1<not2 = " + !(not1 < not2));
        // increment operator

        System.out.println("post increment operator");

        int posti = 10;
        System.out.println("ans =" + posti++);
        System.out.println("after the increment = " + posti++);
        
        //preincrement operator 
        System.out.println("preincrement operator");
        int prei = 20;
        System.out.println("ans = " + ++prei);

        //decrement operator
        System.out.println("post decrement operators");
        int postd = 50;
        System.out.println("post decrement = " + postd--);
        System.out.println("post decrement again then ans : = " + postd--);
//predecrement operators
        System.out.println("predecrement operators");
        int pred = 50;
        System.out.println("predecrement operators = " + --pred);
        
        int a = 10 , b = 10;
        System.out.println(a++ + ++a);
        System.out.println(b++ + b++);
        int a1 = 10 , a2 = -10;
        System.out.println(~a1);
        System.out.println(~a2);
    }
}