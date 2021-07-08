package Org;

public class User {
	public static void main(String[] args)
	{
		//Bank branch1 = new Bank("MyBank","Chennai");
		//branch1.openAccount();
		
		Nationalised_Bank branch1 = new Nationalised_Bank("MyNBank","Chennai");
		//branch1.setBankName("MyBank");
		branch1.openAccount();
	   System.out.println("amount insured for Nationalised bank:" + 	branch1.payInsuranceAmount());
		
		Cooperative_Bank branch2 = new Cooperative_Bank("MyCBank", "Mumbai");
		branch2.openAccount();
		System.out.println("amount insured for Nationalised bank:" + 	branch2.payInsuranceAmount());
	}
}
