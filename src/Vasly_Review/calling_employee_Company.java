package Vasly_Review;

public class calling_employee_Company {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.firstName = "Munkhnasan";
		emp1.lastName = "Enkhbayar";
		emp1.age = 29;
		emp1.email ="moogii.mogi@yahoo.com";
		emp1.isInsured = true;
		emp1.gender = 'F';
		emp1.employee_id = 12345;
		emp1.title = "SDET";
		emp1.hourlyRate = 100;
		emp1.printInfo();
		
		Employee emp2 = new Employee();
		emp2.firstName = "Tsolmon";
		emp2.lastName ="Baasan";
		emp2.email = "tsolmon_ba@yahoo.com";
		
		
		emp1.createEmail();
		emp1.printEmail();
		emp2.createEmail();
		emp2.printEmail();
		emp1.setEmail("234445@");
		emp1.email = "newemail@gmail.com";
		emp1.setJobTitle("PO");
		
		emp1.printInfo();
		
		
		
		
		
		
		
	}

}
