package day42_encapsulation_contructor;

public class MicroCenter {

	public static void main(String[] args) {
		Computer com1 = new Computer();
		Computer com2 = new Computer();
		
		System.out.println(com1.toString());

		System.out.println(com2.toString());
		com1.setBrand("Mac Book");
		com1.setOs("macOS High Sierra");
		com1.setPrice(2000);
		
		com2.setBrand("HP");
		com2.setOs("Windows10");
		com2.setPrice(800);
		System.out.println(com1.toString());
		System.out.println(com2.toString());
		Computer com3 = new Computer("ASUS", "Windows7", 600.50);
		System.out.println(com3.toString());
		com3.setOs("Windows11");
		System.out.println(com3.toString());
		com3.setPrice(com3.getPrice()-200);
		System.out.println(com3.toString());
}
}
