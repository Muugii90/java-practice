package day50_Inheritance03;

public class Company {

	public static void main(String[] args) {
	
		Employee emp1 = new Employee();
		
		FullTimeEmployee ft = new FullTimeEmployee();
		
		Constractor ct = new Constractor();
		
		emp1.calculaterPay(40, 65);
		ft.calculaterPay(40, 45);
		ct.calculaterPay(40, 50);
	}

}
