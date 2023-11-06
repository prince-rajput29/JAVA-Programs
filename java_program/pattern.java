class Pattern
{
 public static void main(String k[])
{
 int i,j;
 for(i=1;i<=5;i++)
{
 for(j=1;j<=(2*i-1);j++)
{
 System.out.print(j+" ");
}
for(j=2;j<=i;j++)
{
 System.out.print(j+" ");
}
 System.out.println();
}
}
}