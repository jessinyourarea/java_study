package com.sist.main2;
class Common
{
	int a=10;
    int b=20;
    public void display() {
    	System.out.println("Common:display call ...");
    }
	
}
class Child extends Common //(is-a)
{
	//a.b
	public void display() {
    	System.out.println("Child:display call ...");
    }
}
class Child2{
//상속 없이 오버라이딩 -> 익명이 클래스
	Common c=new Common(); //a,b, (has-a)
	public void display() {
    	System.out.println("Child2:display call ...");
    }
}
public class MainClass_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c1=new Child();
		System.out.println(c1.a);
		System.out.println(c1.b);
		c1.display();
		
		Child c2=new Child();
		System.out.println(c2.a);
		System.out.println(c2.b);
	}
}
