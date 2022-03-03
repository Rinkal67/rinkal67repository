package pkg1;

public class Class2 {
	
	public Class2 ()
	{
		this(12,13,14);
		System.out.println("default constructor");
	}
	
	public Class2(int a)
	{
		this(12,13,24,34);
		System.out.println("one parameterized construcotr");
	}
	
	public Class2(int a,int b) {
		this();
		System.out.println("two parameterized construcotr");
	}
    public Class2(int a,int b,int c) {
		
		System.out.println("three parameterized construcotr");
	}
    
  public Class2(int a,int b,int c,int d) {
		this(12,13);
		System.out.println("four parameterized construcotr");
	}
  
  
  public static void main(String[] args) {
	  
	  Class2 Rinkal = new Class2(12);
	
}
	

	

}
