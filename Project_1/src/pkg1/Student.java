package pkg1;

public class Student {
    int age;
	int roll_no;
	
	public void display1() {
        System.out.println("Welcome to all of you");}
		public void display2() {
		System.out.println("Automation is very easy");
		System.out.println("Added the line");
	}
		public static void main(String[] args) {
			
			Student Rinkal=new Student();
			Rinkal.age=29;
			Rinkal.roll_no=5;
			Rinkal.display1();
			Rinkal.display2();
			
			System.out.println(Rinkal.age);
			System.out.println(Rinkal.roll_no);
		}
	}

