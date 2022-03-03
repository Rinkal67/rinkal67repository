package pkg1;

public class Class5 extends Class4 {
	
	public Class5() {
		super(10);
		System.out.println("child default constructor");
	}

public Class5(int a) {
		this(10,20,30);
		System.out.println("child 1 parameterized constructor");
	}


public Class5(int a,int b) {
	this(10);
	System.out.println("child 2 parameterized constructor");
}

public Class5(int a,int b,int c) {
	this();
	System.out.println("child 3 parameterized constructor");
}




public static void main(String[] args) {
	
	Class5 obj= new Class5(12,10);
}


}
