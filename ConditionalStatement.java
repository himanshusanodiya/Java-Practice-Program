import java.util.Scanner;

public class ConditionalStatement {
    public static void main(Str[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("CONDITIONAL STATEMENT IF ");
        /*
         * System.out.print("ENTER YOUR AGE :");
         * int age = sc.nextInt();
         * if(age<=18){
         * System.out.println("YOU ARE ELIGIBLE FOR VOTTING ");
         * }
         * 
         * 
         * System.out.print("ENTER A DIGITE TO CHECK EVEN OR ODD NUMBER : ");
         * long num = sc.nextLong();
         * if(num%2==0){
         * System.out.println("this is a even number ");
         * }
         * else{
         * System.out.println("this is a odd number ");
         * }
         * 
         * System.out.print("how much you have money : ");
         * int money = sc.nextInt();
         * if (money >= 6000) {
         * System.out.println("GO WITH RUSSIAN GIRL");
         * } else {
         * System.out.println("GO WITH DESHI GIRL");
         * }
         * System.out.print("enter years to find leap or commen year : ");
         * int year = sc.nextInt();
         * if((year%4==0 && year%100 !=0)||(year % 400==0)){
         * System.out.println("THIS IS  A LEAP YEAR ");
         * }
         * else{
         * System.out.println("THIS IS  A COMMEN YEAR");
         * }
         * 
         * // write a program to check students grad
         * 
         * System.out.println("write a program to check students grad");
         * System.out.print("ENTER YOUR PERCENTAGE : ");
         * int grade =sc.nextInt();
         * if(grade>=85){
         * System.out.print("A+ GRADE");
         * }
         * else if(grade>=75){
         * System.out.print("A GRADE");
         * }
         * else if(grade>=60){
         * System.out.print("B GRADE");
         * }
         * else if(grade>=40){
         * System.out.print("C GRADE");
         * }
         * else if(grade>=33){
         * System.out.print("PASSING MARKS");
         * }
         * else{
         * System.out.print("YOU ARE FAILLED");
         * }
         * 
         * //white a prgram to check positive negative or zero
         * 
         * System.out.print("ENTER A NUMBER :");
         * int num1 = sc.nextInt();
         * if(num1>=1){
         * System.out.println("THIS NUMBER IS A POSITIVE NUMBER");
         * }
         * else if(num1<0){
         * System.out.println("THIS NUMBER IS A NEGATIVE NUMBER");
         * }
         * else{
         * System.out.println("THIS IS ZERO");
         * }
         * 
         * //write program for blood donation
         * System.out.print("enter your age :");
         * int age1 = sc.nextInt();
         * System.out.print("enter your weight :");
         * int weight1 = sc.nextInt();
         * if((age1>=18)&&(weight1>=50)){
         * System.out.print("you are eligible for blood donation ");
         * }
         * else{
         * System.out.print("you are not eligible for blood donation ");
         * }
         * 
         * //Write a Java program to find the maximum of two numbers using conditional
         * statements.
         * System.out.print("enter first number ");
         * long n1 = sc.nextLong();
         * System.out.print("enter second number ");
         * long n2 =sc.nextLong();
         * if(n1>n2){
         * System.out.println("number one is maximum");
         * }
         * else{
         * System.out.println("number second is maximum");
         * }
         */

        // conditional switch statement in java
        System.out.print("WHO IS ELIGIBLE TO BE PRIME MINISTER?:");
        int option = sc.nextInt();
        switch (option) {
            case 1:
                System.out.println(" ARVIND KEJRIWAL");
                System.out.println("wronge answer");
                break;
            case 2:
                System.out.println("NARENDRA MODI");
                System.out.println("Right Answer");
                break;
            case 3:
                System.out.println("RAHUL GANDU");
                System.out.println("wronge answer");
                break;
            case 4:
                System.out.println("Non of these");
                System.out.println("wronge answer");
                break;
        }
    }
}
