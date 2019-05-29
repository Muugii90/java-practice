package day47_blocks;

public class AllBlocks {
	int nonStaticInt =10;// instance variable
	static int staticInt =10;
	
	static {
		System.out.println("STATIC BLOCK -  I run first and olny once");
		staticInt--;
	}
	
	{
		System.out.println("INIT BLOCK - I run each time object is created. Before constructer");
		nonStaticInt+=5;
		staticInt +=5;
	}
	public AllBlocks() {
		System.out.println("CONSTRUCTOR - I run each time object is created. after init block run.");
		nonStaticInt+=3;
		staticInt +=3;
	}
}
