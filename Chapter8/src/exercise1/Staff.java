package exercise1;




public class Staff extends UEmployee {
	
	private String jobTitle; 

		public Staff(String Fn, String Ln, double Sal, String jb) {
			super(Fn, Ln, Sal);
			
			jobTitle = jb;
			
		}


		public String toString() {
			return(super.toString() + " " + jobTitle);

		}

}