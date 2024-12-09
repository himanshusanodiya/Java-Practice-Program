
public class Typecating {
    public static void main(String[] args) {
         System.out.println("manual / down casting in java");
        // manual typecasting in java
        double d1 = 1234567.6996;
        float f1 = (float) d1;
        long l1 = (long) d1;
        int i1 = (int) l1;
        short s1 = (short) i1;
        byte b1 = (byte) s1;
        System.out.println(d1);
        System.out.println(f1);
        System.out.println(l1);
        System.out.println(i1);
        System.out.println(s1);
        System.out.println(b1);

        System.out.println("automatic or upcasting casting in java");

        // upcasting / automaticCasting in java
        
        byte b2 = 127;
        short s2 = b2;
        int i2 = s2;
        long l2 = i2;
        float f2 = l2;
        double d2 = f2;
        System.out.println(b2);
        System.out.println(s2);
        System.out.println(i2);
        System.out.println(l2);
        System.out.println(f2);
        System.out.println(d2);

        // advance typecasting premitive to non pre..

      System.out.println("advance typecasting premitive to non premitive");
        int myint = 10;
        String mystr = String.valueOf(myint);
        System.out.println(myint); //how to check myint + myint
        System.out.println(mystr); //how to check mystr + mystr
        double dvar = 12.93;
        String svar = String.valueOf(dvar);
        System.out.println(dvar+dvar);
        System.out.println(svar+svar);

        //"advance type casting in java nonpremitive to premitive data type

        System.out.println("advance type casting in java nonpremitive to premitive data type");
        String  svariable = "1";
        double dvariable = Double.parseDouble(svariable);
        String strvar = "55";
        int intvar = Integer.parseInt(strvar);
        System.out.println(svariable);
        System.out.println(dvariable);
        System.out.println(strvar);
        System.out.println(intvar);
    }
    
}
