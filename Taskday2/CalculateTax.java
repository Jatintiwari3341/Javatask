public class CalculateTax 
{
	public static void main(String[] args) 
	{
		int income=Integer.parseInt(args[0]);
		double rate=Double.parseDouble(args[1]);

		double totalTax=income*(rate/100);
		System.out.println("the total tax is :"+totalTax);
	}
}
