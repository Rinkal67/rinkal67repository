package pkg1;

public class Class1 {
	
	public int multi(int a,int b) {
		int c;
		c=a*b;
		System.out.println("multi result is "+c);
		return c;
	}
		public int sub(int x,int y) {
			int z;
			z=x-y;
			System.out.println("Sub result is "+z);
			return z;
		}
           public int sum(int a1,int b1) {
			
			int c1;
			c1=a1+b1;
			System.out.println("sum result is "+c1);
			return c1;
           }
           public void div(int x1,int y1) {
   			
   			int z1;
   			z1=x1/y1;
   			System.out.println("final result is "+z1);
           }
           
           public static void main(String[] args) {
			
        	   Class1 obj=new Class1();
        	   int multiresult=obj.multi(10, 2);
        	   int subresult=obj.sub(multiresult, 2);
        	   int multiresult1=obj.multi(subresult,2);
        	   int sumresult=obj.sum(multiresult1,2);
        	   obj.div(sumresult, 2);
        	   
		}
   
}
