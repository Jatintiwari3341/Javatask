public class CalculateProfit 
{
	public static void main(String[] args) 
	{
		double cp=32500;
		double profitPercent=27.0;
		double servicePercent=3.87;
		double vatPercent=12.7;

		double profit=(profitPercent/100)*cp;
		double sp=cp+profit;
		double serviceCharge=(servicePercent/100)*sp;
		double vatCharge=(vatPercent/100)*sp;

		double totalCost=sp+serviceCharge+vatCharge;

		System.out.println("Cost price"+cp);
		System.out.println("profit is"+profit);
		System.out.println("selling price is"+sp);
		System.out.println("Service charge is"+serviceCharge);
		System.out.println("vat charge is"+vatCharge);
		System.out.println("total cost is "+totalCost);
		 
	}
}
