package day47_blocks;

public class MainTestData {

	public static void main(String[] args) {
		
		System.out.println(TestData.url);// printing static class in other class
		String birteErpUrl = TestData.url;
		System.out.println(birteErpUrl);
		
		System.out.println(TestData.email);
		//TestData data = new TestData();
		//System.out.println(data.email);// because of data is private now
		
		
	}

}
