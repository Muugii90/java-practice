package day46_static_keyword;

public class Customer {

		private String name;
		private String email;
		
		static int count;
		
		
		public Customer() {
			name = "undifined";
			this.email = "undifined";
			count++;
		}
		public Customer(String name, String email) {
			
			this.name = name;
			this.email = email;
			count++;
		}
	
		public String toString() {
			return "Customer [name=" + name + ", email=" + email + "]";
		}
		
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
}
