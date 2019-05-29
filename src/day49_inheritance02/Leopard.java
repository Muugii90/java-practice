package day49_inheritance02;

public class Leopard extends Animal{
	public Leopard() {
		super();
		System.out.println("Leopard Constructor");
		setType("Leopard");
		
	}
	public Leopard(String type) {
		super(type);// call Animal (String type) constructor
		System.out.println("Leopard 1 args constructor");
	}
}
