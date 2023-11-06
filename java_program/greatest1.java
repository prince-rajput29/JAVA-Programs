import Java.util.*;
class Greatest
{
 public static void main(String k[])
{
 Scanner sc=new Scanner(System.in);
 int a,b,c;
 System.out.println("Enter the first number");
 a=sc.nextInt();
 System.out.println("Enter the second number");
 b=sc.nextInt();
 System.out.println("Enter the third number");
 c=sc.nextInt();
 if(a>b||a>c)
 {
   System.out.println(a);
 }
  else if(b>a||b>c)
 {
   System.out.println(b);
 }
 else
  {
    System.out.println(c);
  }
 }
}   