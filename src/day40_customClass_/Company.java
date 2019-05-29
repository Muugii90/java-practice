package day40_customClass_;

public class Company {

	public static void main(String[] args) {
		
		Employee employ = new Employee();
		employ.name = "Munkhnasan Enkhbayar";
		employ.jobTitle = "SDET";
		employ.salary = 150;
		
		
		employ.indroduce();
		employ.work();
		employ.attendMeeting();
		
		employ.jobTitle = "Team Lead";
		employ.salary = 220500.2;
		
		employ.indroduce();
		
	}

}
