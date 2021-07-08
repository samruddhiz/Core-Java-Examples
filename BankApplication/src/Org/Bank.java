package Org;

public abstract class Bank {
	
	private String bankName;
	private String bankAddress;
	
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankAddress() {
		return bankAddress;
	}
	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}
	
	

	/*public Bank(String bankName, String bankAddress) {
		super();
		this.bankName = bankName;
		this.bankAddress = bankAddress;
	}*/
	
	public void openAccount()
	{
		System.out.println("Your account has been opened with " + this.bankName + " address: " + this.bankAddress + " Rate of interest: " + this.interestRates(2) );
	}
	
	public abstract double interestRates(int no_of_years);
	
}
