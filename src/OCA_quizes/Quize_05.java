package OCA_quizes;

public class Quize_05 {

	public static void main(String[] args) {
		 String[] arr= {"A", "B", "C", "D"};
         for(int i=0; i< arr.length; i++) {

            System.out.print ( arr[i] + " " );
                if(arr[i].equals("A")) {
                              continue;
                         }

        System.out.println("Work done");
                 break;
         } 
         int i = 10;
         int j =20;
      int k = j += i /5;
System.out.println( i + " : " + j + " : " + k);

float f1 =  (12_345.1 > 123_45.0) ? 12_456 : 124_56.02f ;
float f2 = f1 + 1024;
System.out.println( f2 );


	 float  f3  =  ( 1_560.00 > 12_60.00 )  ?  10  :  20 ;
     System.out.println(f1);
     
     int arr1[] = { 1, 2, 3, 4};
     int i1=0;
do {
   System.out.println( arr[ i1 ] +"  " );
    i1++;
        } while(i1 < arr.length -1);


int x = 1;
int y = 0;
if( x++ > ++y ) {
System.out.print("Hello ");
} else {
System.out.print("Welcome ");
 }
System.out.println("Log "+x+" : "+y);

}
}

    

	

