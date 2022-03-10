package exercise1;




public class Staff extends UEmployee {
	
	private String jobTitle; 

		public Staff(String Fn, String Ln, int Sal, String Job) {
			super(Fn, Ln, Sal);
			
			jobTitle = Job;		
		}


		public String toString() {
			return(super.toString() + " " + jobTitle);

			
  }
}