package OCA_quizes;

public class Quize2_my {

	public static void main(String[] args) {
		
		String str1="Java";
        String str2[] = {"J", "a", "v", "a"};
       String str3="";
  for(int i=0;  i<str1.length(); i++) {
         str3 = str3 +str2[i];
             }
System.out.println( str1==str3 );
System.out.println( str1.equals(str3) );


int num1=9;
if(++num1 < 10) {
        System.out.println(num1 + " Hello World!");
 } else {
        System.out.println(num1 + " Hello Universe!");
   }
short x =1;
switch(x) {
	case 1: System.out.println("One");
	break;
	case 2: System.out.println("Two");
	break;
	  }
	
}
}