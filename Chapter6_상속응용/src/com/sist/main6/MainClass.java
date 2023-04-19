package com.sist.main6;
class Super{
	int a=10;
	int b=20;
}
class Sub extends Super{
	int a=100;
	int b=200;
	public Sub()
	{
		System.out.println("a="+a+",b="+b);
		this.a=1000;
		this.b=2000;
		System.out.println("a="+a+",b="+b);
		System.out.println("a="+super.a+",b="+super.b);
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub sub=new Sub();
		
	}

}
