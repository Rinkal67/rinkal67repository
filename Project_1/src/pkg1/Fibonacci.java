package pkg1;

public class Fibonacci {
	
	public static void main(String[] args) {
	
    //0 1 1 2 3 5 8 13 21 34 55 89
	
	int a=0,b=1;
	System.out.print(a+" "+b);
    int c;
	for(int i=1;i<=10;i++) {
		c=a+b;
		System.out.print(" "+c);
		a=b;
		b=c;
		
	}

}
}