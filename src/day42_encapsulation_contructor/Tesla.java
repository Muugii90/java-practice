package day42_encapsulation_contructor;

public class Tesla {

		private String model;
		private int range;
		private double zeroTo60;
		private double price;
		private boolean selfDriving;
		
		
		
		
		@Override
		public String toString() {
			return "Tesla [model=" + model + ", range=" + range + ", zetoTo60=" + zeroTo60 + ", price=" + price
					+ ", selfDriving=" + selfDriving + "]";
		}
		public String getModel() {
			return model;
		}
		public void setModel(String model) {
			//call isValidModel there then assign if true;
			//if false: Invalid model - Camry
			//assign "unknown" to 
			if(isValidModel(model)== true) {
				this.model = model;
				}else {
				System.out.println("Invalid model");
				this.model ="unknown";
				}
			}
			

		public int getRange() {
			return range;
		}
		public void setRange(int range) {
			this.range = range;
		}
		public double getZetoTo60() {
			return zeroTo60;
		}
		public void setZetoTo60(double zetoTo60) {
			this.zeroTo60 = zetoTo60;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public boolean isSelfDriving() {
			return selfDriving;
		}
		public void setSelfDriving(boolean selfDriving) {
			this.selfDriving = selfDriving;
		}
		public boolean isValidModel(String model) {
			model = model.toLowerCase();
			if(model.equals("model s") || model.equals("model 3") ||
			   model.equals("model x") || model.equals("model y") ||
			   model.equals("roadster")) {
				return true;
			}else
			return false;
			
			
			}
		
		public void setTeslaInfo(String model, int range, double zeroTo60, double price, boolean selfDriving) {
		
	    setModel(model);
		setRange(range);
		setZetoTo60(zeroTo60);
		setPrice(price);
		setSelfDriving(selfDriving);
		}
	}

		
			

		
		

