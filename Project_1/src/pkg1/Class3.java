package pkg1;

public class Class3 {
	
	public void method1()
	{
		this.method4(12,13,24);
		System.out.println("Default method");
		this.method2(3);
		this.method3(12,13);
		this.method5(10,11,12,13);
		this.method6(2, 3, 5, 6, 7);
	}
	public void method2(int a)
	{
		System.out.println("One parameterized method");
	}
	public void method3(int a, int b)
	{
		System.out.println("Two parameterizedmethod");
	}
	public void method4(int a,int b,int c)
	{
		System.out.println("Three parameterized method");
	}
	public void method5(int a,int b,int c,int d)
	{
		System.out.println("Four parameterized method");
	}
	public void method6(int a, int b, int c,int d,int e)
	{
		System.out.println("Five parameterized method");
	}
	
	public static void main(String[] args) {
		Class3 obj = new Class3();
		obj.method1();
	}
	
	

}
