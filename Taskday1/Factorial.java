public class Factorial 
{
	public static void main(String[] args) 
	{
		int num=Integer.parseInt(args[0]);
		int fact=1;
		while(num>0){
			fact=fact*num;
			num--;
		}
			System.out.println("the factorial of the number is"+fact);
	}
}
