package pkg1;

public class c2 extends c1 {
	
	public void arithmatic(int x,int y) {
		
		int z;
		z=x-y;
		System.out.println("Result is "+z);
	}
	
	public static void main(String[] args) {
		
		c2 obj = new c2();
		obj.arithmatic(12,2);
	}

}
