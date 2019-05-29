package day43_encapsulation_constructor;

public class Job {
 
	private String title;
	private String company;
	private double annualSalary;
	
	public Job() {
		System.out.println("No=args constructor");
		this.title = "undedined";
		this.company = "undefined";
		
	}
	
	public Job(String title) {
		System.out.println("One-arg constructor");
		this.title = title;
		this.company = "undefined";
		
	}
	public Job(String title, String company, double annualSalary) {
		
		System.out.println("Three-arg constructor");
		setTitle(title);//this.title = title;  
		this.company = company;
		this.annualSalary = annualSalary;
		
	}
	
	@Override
	public String toString() {
		return "\n Job [title=" + title + ", company=" + company + ", annualSalary=" + annualSalary + "]";
	}
	public String getTitle() {
		
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCompnay() {
		return company;
	}
	public void setCompnay(String compnay) {
		this.company = compnay;
	}
	public double getAnnualSalary() {
		return annualSalary;
	}
	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}
	
	
}
