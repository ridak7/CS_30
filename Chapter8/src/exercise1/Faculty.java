package exercise1;




public class Faculty extends UEmployee {
	
	private String Deptname;
	
	public Faculty(String Fn, String Ln, int Sal, String D) {
		super(Fn, Ln, Sal);
	
		Deptname = D;
	}
	
	
	public String toString() {
		return(super.toString() + " " + Deptname);
		
	}	
	}