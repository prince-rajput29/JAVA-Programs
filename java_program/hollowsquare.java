class pattern
{
public static void main(String k[])
{ 
int i,j;
int n=4;
int m=5;
for(i=1;i<=n;i++)
{
for(j=1;j<=m;j++)
{
if(i==1||j==1||i==n||j==m)
{
System.out.print("*");
}
else
{
System.out.print(" ");
}
}
System.out.println();
}
}
}