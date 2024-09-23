public class WholeSellBill 
{
	public static void main(String[] args) 
	{
		double amount =Double.parseDouble(args[0]);

		System.out.println("amount is "+amount);
		if(amount<5000){
			double discount1=5.0;
			double discountAmount=(amount*discount1)/100;
			double netBill=amount-discountAmount;
			System.out.println("Discount amount is"+discountAmount);
			System.out.println("net bill is"+netBill);

	}
	else if(amount>=5000 && amount<10000){
           double discount2=10.0;
			double discountAmount=(amount*discount2)/100;
			double netBill=amount-discountAmount;
			System.out.println("Discount amount is"+discountAmount);
			System.out.println("net bill is"+netBill);
	}
	else if(amount>=10000){
		double discount3=15.0;
			double discountAmount=(amount*discount3)/100;
			double netBill=amount-discountAmount;
			System.out.println("Discount amount is"+discountAmount);
			System.out.println("net bill is"+netBill);

			}

			

}
}