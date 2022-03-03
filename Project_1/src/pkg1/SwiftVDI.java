package pkg1;

public class SwiftVDI extends Swift {
	
	public void modeltype() {
		
		System.out.println("model is VDI");
	}
	
	public static void main(String[] args) {
		SwiftVDI s = new SwiftVDI();
		s.modeltype();
		s.model();
		s.baseprice();
		
	}
	

}
