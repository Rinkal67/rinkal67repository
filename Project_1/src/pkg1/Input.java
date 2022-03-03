package pkg1;

import java.util.Scanner;

public class Input {
	
	public int sum(int a,int b) {
		int c=a+b;
		return c; 
	}
	
	public int sub(int d,int e) {
		int f=d-e;
		return f;
	}
	
	public int multi(int g,int h) {
		
		int i=g*h;
		return i;
	}
	
	public int div(int j,int k) {
		int l=j/k;
		return l;
	}
        public static void main(String[] args) {
        	
        Scanner s= new Scanner(System.in);
		System.out.println("please enter a value of x1 :");
		int x1=s.nextInt();
		System.out.println("please enter a value of x2 :");
		int x2=s.nextInt();
		Input obj=new Input();
		int sumresult=obj.sum(x1,x2);
		System.out.println("please enter a value of x3 :");
		int x3=s.nextInt();
		int subresult=obj.sub(sumresult,x3);
		System.out.println("please enter the value of x4 :");
		int x4=s.nextInt();
		int sumresult1=obj.sum(subresult,x4);
		System.out.println("please enter the value of x5 :");
		int x5=s.nextInt();
		int multiresult=obj.multi(sumresult1, x5);
		System.out.println("please enter the value of x6 :");
		int x6=s.nextInt();
		int divresult=obj.div(multiresult, x6);
		System.out.println("The final result of (((((x1+x2)-x3)+x4)*x5)/x6): " + divresult);
		
        }	
	
		
		
	}

