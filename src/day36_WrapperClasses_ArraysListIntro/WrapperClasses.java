package day36_WrapperClasses_ArraysListIntro;

public class WrapperClasses {

	public static void main(String[] args) {
		int n =10;
		Integer num = new Integer (20);
		Integer int1 = Integer.valueOf(1234);
		Integer int2 = Integer.valueOf("456");
		System.out.println(num);
		System.out.println(int1);
		System.out.println(int2);
		
		double d1 = 44.5;
		Double d2 = new Double(123.3);
		Double d3 = new Double("5.2");
		
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(n);
		System.out.println("Sum "+d1+d2+d3);
		
		char ch1 = 'a';
		Character ch2 = new Character('b');
		System.out.println(ch1);
		System.out.println(ch2);
		
		
		byte b1 = 100;
		Byte b2 = new Byte((byte)10);
		Byte b3 = new Byte("-55");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		
		
		Boolean bool1 = Boolean.valueOf(true);
		Boolean bool2 = Boolean.valueOf("false");
		
		System.out.println(bool1);
		System.out.println(bool2);
		
		Integer i = 222;//  new Integer (222);
		System.out.println(i);
		
	}

}
