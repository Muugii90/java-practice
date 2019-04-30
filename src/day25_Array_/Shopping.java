package day25_Array_;

public class Shopping {

	public static void main(String[] args) {
		 String [] product = {"Dress", "Sandal", "Ring", "Shirt", "Bag"};
		 double [] price = {500.0, 550.0, 1999.0, 50.0, 499.0};
		 int []itemsID = {1234, 1235, 1236, 1237, 1238};
		 
		 System.out.println("Product count: "+ product.length);
		 
		if(product.length == price.length && product.length == itemsID.length) {
			System.out.println("Shopping list looks good"); 
		}	else {
			System.out.println("Something is wrong in this list");
			return;
		}
		//for each loop
		 for(String temp : product) {
			 System.out.println(temp);
		 }
		 for(double temp1 : price) {
			 System.out.println(temp1);
		 }
		System.out.println();
		for(int i=0; i< price.length; i++) {
			System.out.println(price[i]);
		}
		for(int i=0; i < itemsID.length; i++) {
			System.out.println(itemsID[i]);
		}
		System.out.println();
		System.out.println(itemsID [itemsID.length -1]);// printing last one
		System.out.println();
		for(int i = itemsID.length-1; i>=0; i--) {
			System.out.println(itemsID[i]);
		}
		System.out.println("######My shopping receipt########");
		double total =0;
		for(int i=0; i< product.length; i++) {
			System.out.println("Item "+ (i+1)+": "+ itemsID[i]+ " - "+ product[i]+ " - $"+ price[i] );
			total= total+ price[i] ;
			System.out.println("Total $"+total);
		}
		int maxIndex = 0; 
		double maxPrice = 0;
		for(int i = 0; i< price.length; i++) {
			if(price[i]> maxPrice) {
				maxPrice =price[i];
				maxIndex = i;
			}
		}
		System.out.println("Max price: "+ itemsID[maxIndex]+ " - "+ product[maxIndex]+ " - $"+ maxPrice);
		
		
}

}
