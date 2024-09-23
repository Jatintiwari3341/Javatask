public class CalculateDay
{
	public static void main(String[] args) 
	{
		int days=Integer.parseInt(args[0]);
		System.out.println("number of days is"+days);
		int y,m,w,d;
		y=days/365;
		days=days%365;
		m=days/30;
		days=days%30;
		w=days/7;
		d=days%7;
		
		System.out.println("number of year"+y);
		System.out.println("number of month is"+m);
		System.out.println("number of week is"+w);
		System.out.println("number of days is"+d);

		
		
	}
}
