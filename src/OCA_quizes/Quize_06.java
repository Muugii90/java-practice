package OCA_quizes;

import java.util.ArrayList;

public class Quize_06 {


               public static void main(String[] args) {
            	  
            	   ArrayList<Integer> list1=new ArrayList<>();
                   list1.add(1);
                   list1.add(2);
                   list1.add(3);

                   int a1=1;
             list1.remove(a1);

    System.out.println(list1); 

    String[][] chs = new String[2][];
    chs[0] = new String[2];
    chs[1] = new String[5];
int i=97;

for(int a = 0; a < chs.length; a++) {
for(int b = 0; b < chs.length; b++) {
     chs[a][b] =""+i; 
         i++;
    }
}

for(int a = 0; a < chs.length; a++) {
for(int b = 0; b < chs[a].length; b++) {
   System.out.print( chs[a][b] + " ");
           }
}
               }
}



 
