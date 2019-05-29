package day43_encapsulation_constructor;

public class WhatsApp {
		
	private String toNumber;
	private String message;
	private boolean delivered;
	
	
	public WhatsApp() {
		
		System.out.println("No-Args constructor");
	}
	public WhatsApp(String toNumber, String message) {
		this();
		System.out.println("Two Args Constructor");
		this.message = message;
		this.toNumber = toNumber;
	}
	public WhatsApp(String toNumber) {
		this(toNumber, "Hello");
		System.out.println("One Args Constructor");

	}
	
	
	@Override
	public String toString() {
		return "WhatsApp [toNumber=" + toNumber + ", message=" + message + ", delivered=" + delivered + "]";
	}
	public String getToNumber() {
		return toNumber;
	}
	public void setToNumber(String toNumber) {
		this.toNumber = toNumber;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isDelivered() {
		return delivered;
	}
	public void setDelivered(boolean delivered) {
		this.delivered = delivered;
	}
	
	
}
