package day29_GoOver;

public class WhileLoop {

	public static void main(String[] args) {
		 String a = "aaaaaaaaaaaaabbaaaaaaaaaadfghjklaaaaaaaaaaaaaaaa"
	        		+ "ppppppppppuuuuuuuuuuuuuttttt"
	        		+ "bbbbbbbbbbbbaaaaaaaaaaaaaaaaaaa"
	        		+ "hjyhaaaaaaaaaaaaaaa";
	       
	    while(a.contains("a")) {
	    	a=a.replace("a", "");
	   }
	    System.out.println(a);
	    
	    
	    for (int i = 0; i < a.length(); i++) {
			if(a.contains("a")) {
				a =a.replace("a", "");
			}
		}
	    System.out.println(a);
	    String b = "aaaatsolmonaaaaaaaaatsolmonaadfghjklaaaaaaaaaaaaaaaa"
        		+ "ppuuuuuuttttt"
        		+ "bbbbbbbbbtsolmonbbbaaaaaaaaaaa"
        		+ "hjyhaaaaaatsolmonaaa";
       while(b.contains("tsolmon")) {
    	   b=b.replace("tsolmon", "hello");
       }
       System.out.println(b);
	   
       String reverse = "Hello";
       int num = reverse.length()-1;
      
       while(num>=0) {
    	   String rev ="";
    	   rev+=reverse.charAt(num);
    	   num--;
      System.out.print(rev);
     
	}
       System.out.println();
       
       for (int i = reverse.length()-1; i>=0; i--) {
    	   System.out.print(reverse.charAt(i));
	}
	}
	
	
	
	
	
	
	
	
	
	
}