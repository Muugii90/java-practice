package day49_inheritance02;

public class BarnesAndNobles {

	public static void main(String[] args) {
		
		EBook  ebook = new EBook();
		ebook.setTitle("Introduction to Java");
		ebook.setAuthor("Savitch");
		ebook.setPages(1016);
		ebook.setPrice(170);
		ebook.setSize(500);
		ebook.setType("Tech Book");
		System.out.println(ebook.getTitle());
		System.out.println(ebook.getAuthor());
		System.out.println(ebook.getPages());
		ebook.readEbook(10);
		ebook.readEbook(631);
		
		AudioBook aBook = new AudioBook();
		aBook.setTitle("OCA prepration");
		aBook.setAuthor("Jeanne");
		aBook.setNarritor("Marufjon");
		
		
		PaperBack pb = new PaperBack();
		pb.setAuthor("Malcom Gladwell");
		pb.setTitle("Outliers");
		pb.setType("Biography");
		pb.setPrice(20);
		pb.setPages(304);
		
		System.out.println(pb.toString());
		
	}
	

}
