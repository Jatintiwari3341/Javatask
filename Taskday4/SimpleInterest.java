public class SimpleInterest 
{
	public static void main(String[] args) 
	{
		double principal=Double.parseDouble(args[0]);
		double rate=Double.parseDouble(args[1]);
		double time=Double.parseDouble(args[2]);
		  
		  double si=(principal*rate*time)/100;
		  double finalAmount=si+principal;
		  System.out.println("the principal amount is"+principal);
		  System.out.println("the rate is"+rate);
		  System.out.println("the time is "+time);
		  System.out.println("the simple interest is"+si);
		  System.out.println("the final amount is "+finalAmount);
	}
}
