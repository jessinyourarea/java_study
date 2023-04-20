package com.sist.main;
class A
{
	public A() {
		System.out.println("A() Call...");	//기본생성자
	}
	public A(int a) {
		System.out.println("A(int a) Call..."); //오버로딩: 매개변수가 있는 생성자
	}
}
class B extends A
{
	public B() {
		System.out.println("B() Call..."); //원활한 상속을 위해서는 기본생성자가 포함되어있어야한다
	}
}
public class MainClass_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();///원래
		//A a=new A();
		A aa=new B();/// 인터페이스 추상클래스 에서 주로 사용
		//B bb=(B)aa; //강제형변환은 클래스와 생성자가 동일해야만 가능하다 aa=B();
	}

}
