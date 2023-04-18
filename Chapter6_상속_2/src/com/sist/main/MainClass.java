package com.sist.main;
/*
 * 	Spring =>1) 가급적 상속 없이 독립적인 클래스를 만들자 (POJO 방식)
 * 			 2) new 사용을 지양하라 (대신 reflection 이용)
  	상속 => 재사용 (is-a)
  	단점 : 실행속도가 늦다 (사용빈도가 극히 드물다) => 포함 클래스(has-a)
  		  상속	/	포함
  		  --        ----> 제공한 그대로사용
  		                  ------------ 상속 사용 없이 오버라이딩이 가능해짐(익명의클래스)
  		  => 기능 수정(메소드)을 하거나 변수를 추가해서 사용 
    => 상속을 받는 경우 속도가 늦어짐.
    	class A
    	{
    		int a;
    		int b;
    		static int c;
    	}
    	class B extends A
    	{
    		int d;
    		int e;
    		//int a,b
    	}
    	
    	B b=new B();  => A객체가 먼저 생성 > 그후 B객체가 생성된다
 	
 		기존의 클래스를 재사용 가능, 수정 , 추가
 		--------------------
 			|
 			소스 코딩량을 줄일 수 있다 => 스프링(AOP)
 			코드를 공통적으로 사용하기 때문에 관리가 편하다
 			class A
 			{
 			  public void disp(){}
 			}
 			class B extends A
 			{
 			}
 			class C extends A
 			{
 			}
 			
 			
 */

class Super
{
	int a,b;
	static int c;
	
	public Super() // 생성자 호출 => 메모리 할당
	{
		System.out.println("Super클래스 메모리 할당");
	}
}
class Sub extends Super
{
	int d,e;
	public Sub()
	{
		System.out.println("Sub클래스 메모리 할당");
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub sub=new Sub();
		//Sub이란 이름이 만들어지고> new 공간을 만들어주고 >Sub는 초기값을 넣어준다
	}

}
