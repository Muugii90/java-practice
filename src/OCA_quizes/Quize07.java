package OCA_quizes;

import java.sql.Array;
import java.util.ArrayList;

public class Quize07 {

	public static void main(String[] args) {
		 dosum( 10, 20 );
         dosum( 10.0, 20.0 );

   }

public static void doSum(Integer x, Integer y) {
 System.out.println("Integer sum is "+(x+y));

}

public static void dosum(double x, double y) {
    System.out.println("double sum is "+(x+y));

}

public static void dosum(float x, float y) {
  System.out.println("float sum is "+(x+y));

}

public static void dosum(int x, int y) {
    System.out.println("int sum is "+(x+y));


		ArrayList<String> list=new ArrayList<>();
        list.add("Cybertek");
        list.add("Batch 11");

boolean b = list.remove("Cybertek");
System.out.println( b );

ArrayList<String> list1=new ArrayList<>();
list.add("Cybertek");
list.add("Batch 11");

boolean b1 = list.remove("Cybertek");
if( b ) {
System.out.println( list );
}else {
System.out.println( b );
}
ArrayList<String> names=new ArrayList<>();
names.add("Robb");
names.add("Bran");
names.add("Rick");
names.add("Bran");

if( names.remove( "Bran" ) ) {
names.remove("John");
}
System.out.println(names); ArrayList<String> colors=new ArrayList<>();

colors.add("green");
colors.add("red");
colors.add("blue");
colors.add("yellow");
colors.add(3, "cyan");

System.out.println( colors );

ArrayList<Integer> list2 = new ArrayList<>();
Integer a = 1 ;
System.out.println(  list2.remove(a));

Boolean[] bool = new Boolean[2];
bool[0] = Boolean.valueOf( Boolean.parseBoolean("true") );
bool[1] = Boolean.valueOf(null);
System.out.println( bool[0] + "   "+ bool[1] );

Boolean[] bool1 = new Boolean[2];

bool[0] = new Boolean ( Boolean.parseBoolean("true") );

               bool1[1] = Boolean.valueOf(null);

     System.out.println( bool1[0] + "   "+ bool1[1] );

     }
}






