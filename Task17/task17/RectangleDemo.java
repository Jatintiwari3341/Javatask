package com.task17;
class Test
{
	static String s="IronMan";
	String s1="Thor";
}
public class RectangleDemo {

	public static void main(String[] args) {
//	Rectangle r1=new Rectangle(10,5);
//	double Area=r1.getArea();
//	double Perimeter=r1.getPerimeter();
//	System.out.println("the area is "+Area);
//	System.out.println("the perimeter is "+Perimeter);
//		static  RectangleDemo d=new RectangleDemo();
		Test t=new Test();
		System.out.println(t.s+" "+t.s1);
		Test t2=new Test();
		t2.s="Hulk";
		System.out.println(t.s+" "+t.s1);
		

	}

}
