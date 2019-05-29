package Interview_Java_Question;

public class ChangeTheValue {

	public static void main(String[] args) {
		
		int a = 20;
		int b = 10;
		a = a + b;//30
		b = a - b;//20
		a = a - b;//10
		
		System.out.println(a);
		System.out.println(b);
		
		
		String str1 = "word";
		String str2 = "word";
		if(str1 == (str2)) {
			str1.substring(str1.length()-1);	
			}else {
				System.out.println(str1);
			}
		}
	}


