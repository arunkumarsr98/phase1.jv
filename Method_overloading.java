package phase1.jv;



public class Method_overloading {
	public void calculate (int a, int b)
	{
		System.out.println("1)addition of two nos: "+a+b);
		System.out.println("3)Area of rectangle: "+a*b);
		System.out.println("4)Area of square: "+a*a);
		}
	public void calculate (int a)
	{
		System.out.println("3)Area of rectangle: "+a*a);
		
		}
			
	public void calculate (float a)
	{
		
		System.out.println("2)Area of circle: "+3.14*a*a);
		}
	public static void main (String args[])
	{
		Method_overloading s = new Method_overloading();
		s.calculate(5);
		s.calculate(5,6);
		s.calculate(7);
	}
}
