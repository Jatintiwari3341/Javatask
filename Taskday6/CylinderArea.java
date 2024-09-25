public class CylinderArea 
{
	public static void main(String[] args) 
	{
		double r=Double.parseDouble(args[0]);
		double h=Double.parseDouble(args[1]);
		double PI=3.14;
		double area=2*PI*r*r+2*PI*r*h;
		System.out.println("The area of cylinder is"+area);


	}
}
