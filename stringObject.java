import java.util.*;
import java.util.jar.Attributes.Name;
public class stringObject {
    public static void main(String[] args){
        // String a = "ram";
        // String b  ="ram";
        // its pointing same object 

        // System.out.println(a==b);

        // String s1 = new String("ram");
        // String s2 = new String("ram");
        // // its not pointing same object 
        // System.out.println(s1 == s2);

        // System.out.println(s1.equals(s2)); // it rrue because this eduals method does'nt care about different object (its compare value only)

        // float f = 12.1244f;
        // System.out.printf("%.2f",f);


        //STRING BUILDER BUILDER TIME COMPLEXSITY >>> O(N){ ITS UPDATING EMPTY STRING OBJECT} [MUTABLE]

    //     StringBuilder builder = new StringBuilder();
    //    String s = "";
    //    for(int i = 0 ; i < 26 ; i++){
    //      char ch = (char)('A'+i);
    //      builder.append(ch);
    //  }
    //      System.out.println(builder.toString());
    //      System.out.println(builder);
 


        // WITHOUT STRING BUILDER TIME COMPLEXSITY >>> O(N2) {ITS CREATING NEW OBJECT EVRYTIME THAN UPDATE } [IMMUTABLE]

        // String s = "";
        //  for(int i = 0 ; i < 26 ; i++){
        //  char ch = (char)('A'+i);
        //  s = s + ch;
        //  }
        // System.out.println(s);
        String name = "HimaNShu nitin shruti ";
        String surname = "Sanodiya";
        // System.out.println(Arrays.toString(name.toCharArray()));
        // System.out.println(name.equals("ram"));
        // System.out.println(name.length());
        // System.out.println(name.charAt(2));
        // System.out.println(name.compareTo(surname));// output 0 because they are equals
    //    System.out.println(name.concat(" sanodiya"));
    //    System.out.println(name.concat( surname));// for concate two string
       //System.out.println(name.indexOf('s')); // output : 5 {IT WILL RETURN THE CHARECTOR INDEX NUMBER }
       
    //    System.out.println(name.lastIndexOf(name));
    //    System.out.println(name.valueOf(name));
    //    System.out.println(name.isEmpty());
    //    System.out.println(name.toLowerCase());
    //    System.out.println(name.toUpperCase());
    //    System.out.println(name);
    //    System.out.println(name.trim()); // IT WILL TRIM THE STRING SPACE; 
    //    System.out.println(name.substring(1,5));
    //    System.out.println(Arrays.toString(name.split(" ")));// every space it will converted to array element
    //    System.out.println(Arrays.toString(name.split("a"))); //whenever  a is present in string it will splite thats part into string


/*
    StringBuilder builder = new StringBuilder();
        String s = "nitin";
        for(int i = s.length() ; i > 0 ; i--){
          char ch = (char)('n'+i);
          builder.append(ch);
      }
          System.out.println(builder.toString());
          */
// +++++++++++++++++++++ =================  REVERSE A STRING +++++++=
    
/*
  String st = "nitin";
        String temp = "";
        for(int i = st.length() - 1 ; i >= 0 ; i--){
            temp += st.charAt(i);
        }
        System.out.println(temp);
          */

          int n = 121;
          String s = String.valueOf(n);
          
          String temp = "";
          for(int i = s.length() - 1 ; i >=0 ; i--){
            temp += s.charAt(i);
          }

          System.out.println("value of s var : "+s);

          System.out.println("value of temp var : "+temp);

          if(temp != s){
            System.out.println("1");
          }
          else{
            System.out.println("-1");
          }


        // String ss = "himan5";
        // System.out.println(ss.length()-1);
        // Integer len =Integer.valueOf(ss.charAt(ss.length()-1));
        // if(len == ss.length()-1){
        //     System.out.println("1");
        // }
        // else{
        //     System.out.println("0");
        // }
        
             
    }
}
     