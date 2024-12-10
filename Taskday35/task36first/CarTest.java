package com.task36first;

public class CarTest {
	
	public static void stop(String action)
	{
		try
		{
		if(action.equalsIgnoreCase("stop")) {
			throw new CarStopped("Car is stopped for some reason");
		}
		else {
			System.out.println("Car not stall");
		}
		}
		catch(CarStopped e)
		{
//			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
	public static  void puncture(String action)
	{
		try
		{
		if(action.equalsIgnoreCase("puncture")) {
			throw new CarPuncture("Car is puntured for some reason");
		}
		else {
			System.out.println("Car not punctured");
		}
		}
		catch( CarPuncture e)
		{
			e.printStackTrace();
		}
		
	}
	public static void carHeat(int temp) 
	{
		try
		{
if(temp>50) {
	throw new CarHeated("Car is heated more than the 50 degress");
}
else {
	System.out.println("car temprature is normal");
}
	
	}
	catch(CarHeated e)
	{
		e.printStackTrace();
	}
}
}
