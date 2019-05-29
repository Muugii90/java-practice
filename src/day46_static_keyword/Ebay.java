package day46_static_keyword;

public class Ebay {

	public static void main(String[] args) {
		
		Customer cm1 = new Customer("Munkhnasan Enkhbayar","moogii.mogi@yahoo.com");
		Customer cm2 = new Customer("Tsolmon Baasandorj","tsoomoo_ba@yahoo.com");
		Customer cm3 = new Customer("Michael Remerscheid","mike_remer@yahoo.com");
		Customer cm4 = new Customer("Haliuna Baasan","haku_ba@yahoo.com");
		
		System.out.println(cm3.count);
		System.out.println("Total of Customer: "+Customer.count);
		cm1.count = 10;
		System.out.println("After it: " +Customer.count);
	}

}
