public class CycleProfit 
{
	public static void main(String[] args) 
	{
		int oldCycleprice=1200;
		int repairCost=250;
		int coloringCost=350;
		int addAccessoriesCost=500;
		int profit=1500;
	
	int totalCost=oldCycleprice+repairCost+coloringCost+addAccessoriesCost;

	int sellingPrice=totalCost+profit;

	System.out.println("total cost is"+totalCost);
	System.out.println("sellingprice is "+sellingPrice);
	}
}
