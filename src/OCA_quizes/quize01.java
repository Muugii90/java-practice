package OCA_quizes;
import java.util.*;
public class quize01 {

	public static void main(String[] args) {
		
		
	     
	     
	    // 1. What's the result of the following code fragments?
	     
	        int[][] arr=new int[][] { {1,2}, {3,4} };
	                arr[1] = arr[0];
	            System.out.println(arr[0][1]);
	            
	       /*     A. Compile Error                             B. [ 1, 2 ]
	            C. [ 3, 4 ]                                  C. hashcodes  (correct answer) */
	    
	        
	        
	    
	    
	    /*
	     
	     2. which one of the following will give compile error?
	     
	        A. int[][] arr=new int[2][];
	        B. double[][] arr=new double[][] { {1,2}, {3,4} };
	        C. long[][] arr=new long[2][] { {1,2}, {3,4} };//correct answer
	        D. int[][] arr ={ {'A', 'B'}, {'C' , 'D' } }; 
	            
	     
	     */
	        
	    
	     
	    
	    /*
	     
	     3. what's the result of the following code fragment?*/
	                int[][] arr3= { {1,2,3}, {3,4} };
	            for(int i=0; i<2; i++) {
	                for(int j=0; j<2; j++) {
	                    System.out.println(arr3[i][j]+" ");
	                }
	            }
	            
	           /* A.  1 2 3 3 4                             B. 1 2 3 4 // correct answer
	            C.  1 2 3                                 D. Throws an Exception
	            E. Compile Error
	     
	     */
	    
	    
	        
	    
	    
	    /*
	     
	      4. Which Three lines fail to compile? */
	              int ivar = 100;
	               double dvar = 123;
	               float fvar = 200; 
	                  
	               		//ivar = fvar;
	                   fvar = ivar;
	                   dvar = fvar;
	                  // fvar = dvar;
	                   dvar = ivar; 
	                  // ivar = dvar;
	            
	      /*  A. line 3, line 5, line 8                        B. line 4, line 7, line 9
	        C. line 5, line 6, line 9                        D. line 4, line 5, line 8
	     
	     */
	    
	        
	    
	    
	    /*
	     5. Which code fragment, when inserted at line 3, enables the code to print 10:20?
	            public static void main(String[] args) {
	            
	                 line 3 **
	                 arr[0]=10;
	                 arr[1]=20;
	                 System.out.println(arr[0]+" "+ arr[1]); 
	            }
	            
	            A. int arr[2] ;                           B. int[] arr n = new int[2];
	            C. int[] arr;     arr = int[2];           D. int arr[] = new int[2]; // correct answer
	 
	     
	     */
	    
	    
	    
	    
	     /*
	            6.  What's the result?*/
	           // public static void main(String[] args) {
	        
	                    System.out.println("Result A"+0+1);
	                    System.out.println("Result B"+(1)+(2));
	                    System.out.println("5 + 2 = "+3+4);
                        System.out.println("5 + 2 = "+(3+4));
                        String str = " ";
                        str.trim();
                    System.out.println(str.equals("") +"   "+str.isEmpty()); 
	                
	
	
	int[][] arr5=  { {1,2}, {3,4} };
    for(int i=arr5.length-1; i>=0; i-- ) {
        for(int j=0; j<arr5.length; j++) {
            System.out.println(arr5[i][j]+" ");
        }
    }
	       /* A. ResultA01     ResultB12   //correct answer B. ResultA01     ResultB3
	        C. ResultA1      ResultB3                      C. ResultA1      ResultB12
	      
	      */
	    
	        
	    
	    
	    
	      /*
	                7.  What's the result?
	                
	                public static void main(String[] args) {
	        */
	                       
	                        
	                    
	            
	        /*    A. 5 + 2 = 34     5 + 2 = 7 //correct answer    B. 5 + 2 = 34    5 + 2 =34
	            C. 7 = 7        7 + 7                             D. 5 + 2 = 3 + 4     5 + 2 = 7
	       
	       
	       */
	    
	    
	    
	    
	      
	       /*
	          8. What's the result?
	          
	            public static void main(String[] args) {
	                    String str = " ";
	                        str.trim();
	                    System.out.println(str.equals("") +"   "+str.isEmpty());    
	                }
	                
	           A. false     true                    B. true    true
	           C. false     false   //correct                 D. true    false
	     
	     
	       */
	    
	        
	    
	    
	        
	        /*
	            9. what's the result ?
	                    public static void main(String[] args) {*/
	                            
								
	                        
	                        
	          /*  A.  3 4 1 2     //correct                    B. 1 2 3 4
	            C.  4 3 2 1                         D. 2 1 3 4
	            
	         
	         */
	    
	    
	    
	        
	        /*
	             10. Which statement is true about Java byte code?
	                  A.  it can run on any platform.
	            
	                  B. it can run on any platform only if it was compiled for that platform.
	            
	                  C. It can run on any platform that has the Java Runtime Environment.// correct
	            
	                  D. It can run on any platform that has a Java compiler.
	                  
	         
	         */

	}
}

