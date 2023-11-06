class A
{ 
int a=1;
int b=5;
static int c=2;
void show()
{
System.out.println(a);
System.out.println(b);
System.out.println(c);
display();
xyz();
System.out.println("hello");
}
static void display()
{
System.out.println("welcome");
}
void xyz()
{
System.out.println("java");
}
static void cat()
{
System.out.println(a);
System.out.println(b);
System.out.println(c);
display();
xyz();
System.out.println("RED");
}
}