public class Assignment {
    public static void main(Str[] args) {
        System.out.println("assignment operators");
        int add = 100;
        add += 5; // that means add : add(100) + 5 ; 105
        System.out.println(add);

        int minus = 100;
        minus -= 10;
        System.out.println(minus);
        float multi = 100.10f;
        multi *= 10;
        System.out.println(multi);
        int devision =100;
        devision /=10;
        System.out.println(devision);
        int reminder = 100;
        reminder %= 10;
        System.out.println(reminder);
        //type casting
        short a=10,b=20;
        int a1 =a+b;
        System.out.println("answer : "+a1);
    }
}
