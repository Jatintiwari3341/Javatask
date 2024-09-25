 public class CompoundInterest 
{
	public static void main(String[] args) 
	{
		double principal=Double.parseDouble(args[0]);
		double rate=Double.parseDouble(args[1]);

		double amount=principal*((1+rate/100)+(1+rate/100)+(1+rate/100));
		System.out.println("the amount of  three years"+amount);
	}
}
