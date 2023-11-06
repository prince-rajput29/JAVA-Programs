class T
{
T()
{
System.out.println("RED");
}
T(int k)
{
 System.out.println("Blue");
}
}
class M extends T
{
M()
{
super(10);
System.out.println("Apple");
}
M(int k)
{
System.out.println("Mango");
}
}
class Y
{
Public static void main(STring k[])
{
new M();
new M(25);
}
}