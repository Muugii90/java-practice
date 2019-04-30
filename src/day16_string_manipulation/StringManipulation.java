package day16_string_manipulation;
import java.util.*;
public class StringManipulation {

	public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	
	System.out.println ("Enter url: ");
	String url = scan.next();
	
	if (url.startsWith ("www.")) {
	System.out.println(" It includes www.");
	}else {
		System.out.println("Invalid url format");
		return;
	}

	int dotIndex = url.length()-4;     
	if(url.charAt(dotIndex)== '.') {
		System.out.println (" dot (.) is there before extension");
	}else {
		System.out.println("dot (.)is missing here");
	}
	String domain = url.substring(4, dotIndex);
	System.out.println("Domain: "+domain);
	String extension = url.substring(dotIndex+1, url.length());
		System.out.println("Extension: "+extension);
	}
	}
