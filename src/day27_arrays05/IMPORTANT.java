package day27_arrays05;

public class IMPORTANT {

	public static void main(String[] args) {
		String st1 = "apple,orange,orange";
		String st2 = "apple,apple,orange";
		
		String[] strArr1 = st1.split(",");
		String[] strArr2 = st2.split(",");
		for(int i = 0; i < strArr1.length; i++ ) {
		    if(!strArr1[i].equals(strArr2[i])){
		        System.out.println("Mismatch: " + strArr1[i] +" "+ strArr2[i]);
		        
		        //Same as above
		        //Arrays.equals(st1.split(",") , st2.split(","));
		        
		    }
		}

	}

}
