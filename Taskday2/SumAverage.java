public class SumAverage 
{
	public static void main(String[] args) 
	{
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
		int num3=Integer.parseInt(args[2]);

		int sum=num1+num2+num3;
		double average=sum/3.0;

		System.out.println("the total sum of three numbers is:"+sum);
		System.out.println("the average of three number is:"+average);
	}
}
