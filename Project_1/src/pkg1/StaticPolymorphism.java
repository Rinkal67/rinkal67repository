package pkg1;

public class StaticPolymorphism {
	
	public void addition(int a, int b) {
		
		int c;
		c=a+b;
		System.out.println("Result is "+c);
	}
	public void addition(int a, int b, int c) {
		
		int d;
		d=a+b+c;
		System.out.println("Result is "+d);
	}	
		public static void main(String[] args) {
			
       StaticPolymorphism ob= new StaticPolymorphism();
       ob.addition(11, 12);
       ob.addition(11, 12, 13);
				
	}

}
