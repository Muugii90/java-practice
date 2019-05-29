package Office_hours;

public class CallPeople {

	public static void main(String[] args) {
		
		//need to crate object to access
		People hard = new People();
		System.out.println(hard.hardToGet);
		//no need to create object to access
		//static variable
		System.out.println(People.easyToGet);
		//use object to access the non static method
		hard.sayMyName();
		
		// use class to access the static method
		People.whatMyName();
		
		
	}

}
