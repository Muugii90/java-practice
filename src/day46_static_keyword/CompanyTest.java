package day46_static_keyword;

public class CompanyTest {

	public static void main(String[] args) {
		
		System.out.println(Company.cname);
		
		System.out.println(Company.cname.toUpperCase());
		
		
		//Company.cname.toUpperCase();
		//System.out.println(); +++same+==
		
		Company c = new Company();
		c.compnayInfo();
		Company.compnayInfo();
		System.out.println(Math.round(455.631222));
	}

}
