import java.util.Scanner;
    /*public static void evenOdd(int num){
        if(num%2==0){
            System.out.println("this number is even ");
        }
        else{
            System.out.println("this number is odd");
        }
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("enter a number to check even or odd");
       int num = sc.nextInt();
       public evenOdd(num);*/

    // static void MyMethod(){
    //     System.out.println("my mehod is printing ");
    // }
    // public static void main(String[] args) {
    //     MyMethod();
    //     MyMethod();
    //     MyMethod();

 /* static void myMethod3(String name, int age){
    System.out.println(name +" : " + age);
}
public static void main(String[] args) {
    myMethod3("himanshu sanodiya",19);
    myMethod3("ram", 18);
    myMethod3("vishal sanodiya", 21);
}*/

/*
static int method4(int x , int y){
    return y + x;
}
public static void main(String[] args) {
    int z = method4(20, 40);
    System.out.println("method answer after calling : " +z);
}
*/
//================= that is a program to check votting by using method  ============================

/*
    static int checkAge(int age){
        if(age>=18){
            System.out.println("you are eligible for votting ");
        }
        else{
            System.out.println("you are not eligible for votting ");
        }
        return age;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age");
        int age = sc.nextInt();
       checkAge(age);
    }
    */
    /*
    
        static int sum(int a , int b){
            return a+b;
        }
        public static void main(String[] args) {
            int c = sum(10, 20);
            System.out.println(" sum of a and b id :"+c);

        }*/

        /*

        public class Method{
            public static int findMinMax(int a, int b, int c){
                if(a>b && a>c){
                    System.out.println("first number is graterthan b and c");
                }
                else if(b>a && b>c)
                {
                    System.out.println("second number is graterthan a and  c");
                }
                else {
                    System.out.println("third number is graterthan a and b");
                }
                return 0;
            }
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("enter first number : ");
                int a = sc.nextInt();
                System.out.print("enter second number : ");
                int b = sc.nextInt();
                System.out.print("enter third number : ");
                int c = sc.nextInt();
                System.out.println(findMinMax(a, b, c));
            }
            */
            /* 
            public class Method{
                public static int product(){
                    Scanner sc = new Scanner(System.in);
                    System.out.print("enter first number : ");
                    int a=sc.nextInt();
                    System.out.print("enter second  number : ");
                    int b=sc.nextInt();
                    int c  = a*b;
                    System.out.println("product  : "+c);
                    return c;
                }
                public static void main(String[] args) {
                   product();
                   product();
                   product();
                }
            }*/
           
           

                /*public static void pattern(){
                    for(int i = 1 ; i<= 4 ; i++){
                        for(int j = 1 ; j<i ;j++){
                            System.out.println("*");
                        }
                        System.out.println("*");
                    }
                }
                */

                /* public class Method{
                public static void main(String[] args) {
                    for(int i = 1 ; i<= 4 ; i++){
                        for(int j = 1 ; j <= i ; j++){
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                }
            }
             */

           /*  public class Method{
                 static void str(){
                     System.out.println("hellow eveyone, my name is Himanshu sanodiya ");
                    }
                    static void name(String name1){
                        System.out.println("my name is : "+ name1);
                    }
                    static void checkAge(int age){
                        if(age>18){
                            System.out.println("you are 18+ ");
                        }
                        else{
                            System.out.println("you are not 18+ ");
                        }
                    }
                    static int sum(int a , int b){
                    int s = a+b;
                    System.out.println("sum of two numbers is : "+s);
                    return s ;
                }
                public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    str();
                    name("himanshu sanodiya");
                    name("rajkumar yadav");
                    name("kishore kumar");
                    checkAge(20);
                    checkAge(17);
                    System.out.print("enter first number ");
                     int a = sc.nextInt();
                    System.out.print("enter second number ");
                    int  b = sc.nextInt();
                    sum(a,b);
                }
             }*/
              
               public class Method{
                public static void main(String[] args) {
                    InnerMethod in =  new InnerMethod();
                    int c = in.substraction(23, 20);
                   double multi = in.substraction(2, 3, 40);

                   in.Int_str(23,"hiamsnhu");

                }}


                class InnerMethod {
                static int substraction(int a , int b ){
                 int c = a - b ;
                 System.out.println("substraction of a and b is : "+c);
                 return c;
                }
                static double substraction(double a , double b , double c){
                    double multi = a* b* c;
                    System.out.println("multiplication of three veriable is : " +multi);
                    return multi;
                }
                static void Int_str(int rollno , String name){
                System.out.println("Roll-No :" + rollno + " " + "Name :" + name); 
            }
                }

               
               
               
            