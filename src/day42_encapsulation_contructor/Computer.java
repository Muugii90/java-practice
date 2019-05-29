package day42_encapsulation_contructor;

public class Computer {
	
	private String brand;
	private String os;
	private double price;
	
	public Computer() {
		System.out.println("Computer Constructer ... ");
		System.out.println("Waiting...");
		brand = "unknown";
		os = "unknow";
		price = 0.0;
		
	}
	
	public Computer (String brand, String os, double price) {
		System.out.println("In 3 args constructor...");
		this.brand = brand;
		this.os = os;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Computer [brand=" + brand + ", os=" + os + ", price=" + price + "]";
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
