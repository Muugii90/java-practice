package day42_CustomClasses_encapsulation;

public class Balance {
	
	private String accHolderName="Moogii";
	private String accNumber="12345";
    private String accBalance="$1000";
	
    public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String Name) {
		this.accHolderName = Name;
	}
	public String getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}
	public String getAccBalance() {
		return accBalance;
	}
	public void setAccBalance(String accBalance) {
		this.accBalance = accBalance;
	}


	
	
}
