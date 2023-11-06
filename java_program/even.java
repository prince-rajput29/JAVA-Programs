import java.util.*;
class Leap
{
public static void main(String k[])
{
Scannner sc=new Scanner(System.in);
int n;
Stystem.out.print("Enter the number:");
n=sc.nextInt();
if(n%4==0)
{
if(n%100==0)
{
if(n%400==0)
{
System.out.println("Leap year");
}
else
{
System.out.println("Not Leap Year");
}
else
{
System.out.println("Not Leap Year");
}
else
{
System.out.println("Not Leap Year");
}
}
}
}
}
