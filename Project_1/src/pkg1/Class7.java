package pkg1;

public class Class7 extends Class6 {
	
	public void m5() {
		super.m4();
		super.m1();
		super.m3();
		super.m2();
		System.out.println("child default method");
		this.m8();
		this.m6();
		this.m7();
	}
	
	public void m6() {
		
		System.out.println("child 1 parameterized method");
	}
	
	public void m7() {
		
		
		System.out.println("child 2 parameterized method");
	}
	
	public void m8() {
		
		System.out.println("child 3 parameterized method");
	}
	
	
	public static void main(String[] args) {
		Class7 obj = new Class7();
		obj.m5();
	}
	
	

}
