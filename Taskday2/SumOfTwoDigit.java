public class SumOfTwoDigit 
{
	public static void main(String[] args) 
	{
		int num=Integer.parseInt(args[0]);
		int digitSum=num%10+num/10;
		System.out.println("the sum of digit is"+digitSum);
		
	}
}
