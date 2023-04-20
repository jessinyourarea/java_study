package com.sist.main3;
/*
 	인터페이스 간의 상속
 	interface A
 	interface B extends A
 				-------
 				
    interface A
    {
    	void aaa();
    }
    interface B extends A
    {			-------   인터페이스끼리 상속은 extends
    	void bbb();
    }
    
    class C implements B
    {		----------  인터페이스를 class에 상속하는 것은 implements
    	public void aaa(){}
    	public void bbb(){}
    }
 */
interface A
{
}
interface B extends A // A>B
{
}
class C implements B // B>C  ==> interface도 클래스와 동일하게 상속 시 상속내린 것이 더 큼. 구분(클래스는 단일상속,인터페이스 다중상속)
{
}
public class MainClass_instanceof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new C();
		B b=new C();
		C c=new C(); // good! 다중상속시에는 클래스를 객체생성하는 편이 가장 편함
		
		/*if(c instanceof A)	//c객체는 A에 포함되어있다 C<A
			System.out.println("OK");	
		if(c instanceof B)	// C < B
			System.out.println("OK2");
		if(b instanceof A)	// B < A
			System.out.println("OK3");
		if(a instanceof C) // A == C
			System.out.println("OK4");	
		if(a instanceof B) // A < B
			System.out.println("OK5"); */
		
		String s="";
		StringBuffer sb=new StringBuffer();
		Object o=new Object();
		if(s instanceof Object)
			System.out.println("OK");
		if(sb instanceof Object)
			System.out.println("OK2");
		if(o instanceof String) //O<String !오류!
			System.out.println("OK3");
		//instanceof 객체 크기를 잴 때 
		//오른쪽 클래스가 크거나 같으면 true/ 반대면 false
		
		//if(s instanceof StringBuffer) ==> !오류! 상속이나 포함 관계가 아닌 경우는 크기를 잴 수 없다
			
		
	}

}
