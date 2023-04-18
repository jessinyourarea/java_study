package com.sist.exam3;
// A 소속은 ==> a, b,name, A(), print()
// 공유하는 것은 addr; display() => A가 마음대로 제어할 수 없음..
class A
{
	int a;
	int b;
	String name;
	static String addr;
	public A()
	{
		/*
		 *  	int a;
		 *  	int b;
		 *  	String name;
		 *  	static String addr;
		 *  	print()
		 *  	display()
		 */
		a=10;
		b=20;
		name="shim";
		print();
		display();
	}
	public void print()
	{

		/*
		 *  	int a;
		 *  	int b;
		 *  	String name;
		 *  	static String addr;
		 *  	print()
		 *  	display()
		 */
		a=10;
		b=20;
		name="shim";
		print();
		display();
	}
	public static void display()
	{
		//addr; 하나만 사용 가능.... static은 static만 사용 가능
		addr="";
		A aa=new A();		// static 안에서 사용하려면 객체를 생성한 다음 사용할 수 있다
		aa.a=10;			// 인스턴스는 객체 생성 후에 사용 가능하다
		aa.b=20;
		aa.name="shim";
		aa.print();
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
