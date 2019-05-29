package day43_encapsulation_constructor;

public class Shoes {

		private String type;
		private String made;
		private int price;
		
		
		public Shoes(String type, String made,int price) {
			System.out.println("Show me the list");
			this.type = type;
			this.made = made;
			this.price = price;
			
		}
		
		
		@Override
		public String toString() {
			return "Shoes [type=" + type + ", made=" + made + ", price=" + price + "]";
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getMade() {
			return made;
		}
		public void setMade(String made) {
			this.made = made;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		
		
}
