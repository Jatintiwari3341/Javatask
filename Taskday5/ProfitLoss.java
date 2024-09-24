public class ProfitLoss 
{
	public static void main(String[] args) 
	{
		double cp=Double.parseDouble(args[0]);
		double sp=Double.parseDouble(args[1]);
		if(sp>cp){
          double profit=sp-cp;
          double profit_percent=(profit /cp) * 100;
           System.out.println("profit is"+profit);
		   System.out.println("profit percentage is"+profit_percent);


	}
	else if(sp<cp){
		double loss=cp-sp;
		double loss_percent=(loss /cp) * 100;
		  System.out.println("loss is"+loss);
		   System.out.println("loss percentage is"+loss_percent);
}

else{
	System.out.println("no profit no loss");
	}
	}
}