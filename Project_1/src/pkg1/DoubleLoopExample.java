package pkg1;

public class DoubleLoopExample {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {//this is the loop for rows
			
			for(int j=5;j>=i;j--) {//this is the loop for coloumn
				
				System.out.print("*");
				
			}
			System.out.println();
		}
		
	}
			
}