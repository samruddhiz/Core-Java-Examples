package Org;

public class Cooperative_Bank extends Bank implements Insurance {
	
	public Cooperative_Bank(String name, String address)
	{
		this.setBankName(name);
		this.setBankAddress(address);
	}
	

	@Override
	public double interestRates(int no_of_years) {
		switch(no_of_years)
		{
		case 1:
			return 1.5;
		case 2:
			return 3.5;
		case 3:
			return 5.5;
		
		default:
			return 0;
		}
	}


	@Override
	public long amountInsured() {		
		return amountInsured;
	}
}
