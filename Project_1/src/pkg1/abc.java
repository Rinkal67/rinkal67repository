package pkg1;

import java.util.Scanner;

public class abc {
	
	public static void main(String[] args) {
		
		System.out.println("please enter a number");
		Scanner s= new Scanner(System.in);
		int marks = s.nextInt();
		if((marks>=0)&&(marks<35)) {
			
			System.out.println("failed");
		}
		
		else if((marks>=35)&&(marks<60)) {
			System.out.println("pass");
		}
		
		else if((marks>=60)&&(marks<80)) {
			System.out.println("first division");
		}
		else if((marks>=80)&&(marks<100)) {
			System.out.println("merit");
		}
		
		else {
			System.out.println("please enter a correct answer");
		}
	}
}