package day49_inheritance02_2;

import day49_inheritance02.Device;
//IPad IS-A  Device. IPad is a subclass in different package
public class IPad extends Device{
	
	public void readEBook(String title) {
		System.out.println("Reading a book "+ title + " using "+  brand + " tablet");
		System.out.println("Model - "+ model);
		//System.out.println(price); NOT visible
		
	}
}
