public class TotalBill 
{
	public static void main(String[] args) 
	{
		int chicken_rolls=60;
		int vegetable_rolls=25;

		int chick=Integer.parseInt(args[0]);
		int vege=Integer.parseInt(args[1]);
		 
		 int chickbill=chick*chicken_rolls;
		 int vegebill=vege*vegetable_rolls;

		 int total_bill=chickbill+vegebill;
		  
		  int discount=50;

		  int final_bill=total_bill-discount;

		  System.out.println("the chickenroll bill is"+chickbill);
		  System.out.println("the vegetableroll bill is"+vegebill);

		  System.out.println("the total bill is"+total_bill);
		  System.out.println("the final bill after discount"+final_bill);

	}
}
