package phase1.jv;

public class Shape {
Shape()
{
System.out.println("default is printed");
String s="the values are:";
}
Shape (int d)
{
	int a=d;
	areasqure(a);
}
Shape(int l,int b)
{
	int a=l;int c=b;
	arearec(a,c);
}
Shape (float l)
{
	float a=l;
	areacir(a);
}
void areasqure(int f)
{
	int are=f*f;
	System.out.println("Square:"+are);
	
}
void arearec(int f,int l)
{
	int are=f*l;
	System.out.println("Rectangle:"+are);
}
void areacir(float f)
{
	float are=f*f*3.14f;
	System.out.println("Circle:"+are);
}
void arearob(int r, int s)
{
int are=r*s/2;
System.out.println("Rhombus:"+are);
}
void areatri(float b, float h)
{
	float are=b*h/2;
	System.out.println("Triangle:"+are);
}
public static void main (String[] args)
{
	Shape s1=new Shape();
	Shape s2=new Shape(5);
	Shape s3=new Shape(5,10);
	Shape s4=new Shape(4.5f);
	Shape s5=new Shape();
	s5.arearob(10, 20);
	s5.areatri(10.0f, 20.0f);
}
}
