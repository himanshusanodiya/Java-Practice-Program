import java.util.Scanner;
public class Array {
    public static void main(Str[] args) {
       
      /* int[] marks = new int [3];
      marks[0] = 101;
      marks[1] = 10;
      marks [2] = 29;
      System.out.println(marks[1]);
*/

// String [] name = new String[3];
// name[0] = "himanshu";
// name[1] = "sanodiya";
// name[2] = "nitin sanodiya";
// System.out.println("value of array is : " + name[2]);
/*
String [] name = {"ram","mohan","sohan","razaa","mazaa","khaza","sozaa"};
for(int i = name.length-1 ; i >= 0 ; i--)
{
System.out.println(name[i]);
}     */
    

Scanner sc = new Scanner(System.in);

//==========================problem number one how to sum of array element in java ========================
/*
int [] arr = new int [5];

for (int i = 0 ; i<arr.length ; i++)
{
  System.out.println("enter five time number : ");
  arr[i]= sc.nextInt();
}
int sum = 0;
for (int i = 0 ; i<arr.length ; i++)
{
  sum += arr[i];
}
System.out.println(sum);
 */


//==========================problem number second : how to find specific number in array present or not========================
/*
int [] arr = new int [5];
for (int i = 0 ; i<arr.length ; i++)
{
  System.out.print("enter five time number : ");
  arr[i]= sc.nextInt();
}
System.out.print("enter number to check: ");
int num = sc.nextInt();
boolean bvar = false;
for(int ans : arr)
if( num == ans ){
  bvar = true;
  break;
}
if(bvar)
{
  System.out.println("this number is present in array ");
}
else
{
  System.out.println("this number is not present in array ");
}  //*/

//============================= problem number three how to find avg of students marks ============================
/*
int [] arr = new int [5];
System.out.print("enter five sumbject  marks : ");
for (int i = 0 ; i<arr.length ; i++)
{
  
  arr[i]= sc.nextInt();
}
int sum = 0;
for (int i = 0 ; i<arr.length ; i++)
{
  sum += arr[i];
}
System.out.println("student got total marks = "+sum);
float avg = sum/5;
System.out.println("avg marks = "+ avg);
 */

// ================== problem 4: how to add 2 x 3 matrix in array ========================
/* 
int arr1 [][] = {{1,2,3},{1,2,3}};
int arr2 [][] = {{1,2,3},{1,2,3}};
int result[][] = {{0,0,0},{0,0,0}};
for(int i = 0 ; i< arr1.length ; i++){
  for(int j = 0 ; j<arr1[i].length ; j++){
     result[i][j] = arr1[i][j] + arr2[i][j];
     System.out.print(" ");
     System.out.print(result[i][j]);
  }System.out.println();
} 
  
*/
// for(int i = 0 ;i< arr1.length ; i++){
//   for(int j = 0 ; j<arr1[i].length ; j++){
//      result[i][j] = arr1[i][j] + arr2[i][j];
//      System.out.print(" ");
//      System.out.print(result[i][j]);
//   }System.out.println();
//======================== problem 5 :  how to revese array element in java ===================

/*
int rev[] = {1,2,3,4,5,6,7,82,90};
for(int i = rev.length-1 ; i>=0 ; i--){
  System.out.println("reverse array : " +rev[i]);
} */

//======================== how to find maximum element is the array================================
  /*
int [] array1 = {211,433,667,244,6878,4222,775};
int max = 0; 
for( int el : array1){
  if  (max>el){
    max = el ; 
  }
  
}
System.out.println(" maximum number is this array is : " + max);
 */
}
}
