package day47_blocks;

public class VariableAccess {

	int myInstancevar = 40;
	static int myStaticVariable = 55;
	
	
	public static void main(String[] args) {
		System.out.println(myStaticVariable);
		
		//create object of variableAccess and print myInstanceVar
		VariableAccess v = new VariableAccess();
		System.out.println(v.myInstancevar);
		
		System.out.println(v.myStaticVariable);
		
		//access static variable using classname
		System.out.println(VariableAccess.myStaticVariable);
		
		
		
	}

}
