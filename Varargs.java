public class Varargs {
    public static void main(String[] args) {  
     System.out.println("output : "+sum(1,2,3));
     System.out.println("output : "+sum(10,20));
     System.out.println("output "+sum());

     //second question
     System.out.println(concatenate("Hello", "world"));
     //concatenate("Java", "varargs", "are", "useful");
     //concatenate();
}
static int sum(int ...arr){
    int s = 0;
    for(int ans : arr){
    s += ans ;
    }
    return s;
}


//second question
static void concatenate(String ...str1){
}
}
