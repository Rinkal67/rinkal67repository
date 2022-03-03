package pkg1;

public class Class4 {
	
	public Class4() {
		this(10,20,30);
		System.out.println("Parent default constructor");
	}
public Class4(int a) {
		this(10,20);
		System.out.println("Parent 1 parameterized constructor");
	}
	
public Class4(int a,int b) {
	this();
	System.out.println("Parent 2 parameterized constructor");
}

public Class4(int a,int b,int c) {
	
	System.out.println("Parent 3 parameterized constructor");
}


	

}
