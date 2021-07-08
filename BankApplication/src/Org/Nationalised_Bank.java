package Org;

public class Nationalised_Bank extends Bank implements Insurance{
	
	public Nationalised_Bank(String name, String address)
	{
		this.setBankName(name);
		this.setBankAddress(address);
	}

	@Override
	public double interestRates(int no_of_years) {
		switch(no_of_years)
		{
		case 1:
			return 1.0;
		case 2:
			return 2.5;
		case 3:
			return 4.5;
		
		default:
			return 0;
		}
	}

	@Override
	public long amountInsured() {
		// TODO Auto-generated method stub
		long extraInsurance = 50000;
		
		return (extraInsurance + amountInsured);
	}

}
