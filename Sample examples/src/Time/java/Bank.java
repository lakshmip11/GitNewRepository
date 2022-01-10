package Time.java;

public class Bank {
float l=10000;
double axisbankintrest=0.08*l;
double sbibankintrest=0.09*l;
double hdfcbankintrest=0.1*l;
double axisbankfinalamount, sbibankfinalamount, hdfcbankfinalamount;

public void axisbankloan()
{
	axisbankfinalamount=l+axisbankintrest;
	System.out.println("Total axis bank loan amount:"+ l + "+"+ axisbankintrest+"="+axisbankfinalamount );
	
	}
public void sbibankloan()
{
	sbibankfinalamount=l+sbibankintrest;
	System.out.println("Total sbi bank loan amount:"+ l + "+"+ sbibankintrest+"="+sbibankfinalamount );
	
	}
public void hdfcbankloan()
{
	hdfcbankfinalamount=l+hdfcbankintrest;
	System.out.println("Total hdfc bank loan amount:"+ l + "+"+ hdfcbankintrest+"="+hdfcbankfinalamount );
	
	}
public static void main	(String [] args)
{
	Bank obj = new Bank ();
	obj.axisbankloan();
	obj.sbibankloan();
	obj.hdfcbankloan();
}

}
