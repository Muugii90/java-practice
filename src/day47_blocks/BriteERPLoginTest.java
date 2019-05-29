package day47_blocks;
import static day47_blocks.BriteERP.*;
public class BriteERPLoginTest {

	public static void main(String[] args) {
		//call static methods. ClassName.methodName
		
		//when i import my package and my static class. I don't need to mention 
		//ClassName again  BriteERP.enterPasssword();
		
		enterEmail();
		enterPasssword();
		verifyLogin();

	}

}
