package com.sist.test;
/*
 * 인스턴스 변수: 데이터를 각각 저장 시에 사용
 * 정적 변수(공유변수) : 공통으로 사용되는 변수 => 메모리가 1개만 생성
 * ----------------------------프로그램 종료시까지 메모리유지
 * 지역변수 : 메소드에서 선언되는 변수 (지역변수, 매개변수)
 * => 메소드 안에서만 사용 {}을 벗어나면 사라진다
 * => 반드시 초기화 후에 사용
 * 
 * 
 * 생성자
 * 1)모든 생성자의 이름은 클래스명과 동일하다
 * 2)생성자는 객체를 생성하기 위한 것이다 (X) -> 객체생성은 new, 생성자는 초기화담당
 * 3)클래스에는 생성자를 반드시 하나 이상 있어야한다 (X) -> 없어도 상관없음
 * 4)생성자가 없는 클래스는 컴파일러가 자동으로 기본생성자를 추가한다. 
 * 5)생성자는 오버로딩을 지원한다 (O) 
 * 			-------> 같은 이름의 메소드를 여러개 만들어서 사용
 *	  		= 생성자를 여러개 만들 수 있다
 *   ** 오버로딩의 조건
 *   = 한개의 클래스나 상속 관계의 클래스
 *   = 메소드명 동일 , 
 *   = 매개변수의 갯수나 데이터형이 다르다
 *   = 리턴형은 관계없다
 *   
 *   class A
 *   {
 *   	public void display(){}
 *   	public int display(int a){}
 *   }
 *   class B extends A
 *   {
 *   	//public void display(){}
 *   	//public int display(int a){} ==> 오버라이딩(같은거)
 *   	public int display(int a, int b){} ==> 오버로딩(매개변수 다른거/ 새로운 기술 더해)
 *   }
 *   
 *   this
 *   
 *   1) 모든 클래스는 this를 가지고 있다
 *   2) 객체 자신을 가리키는 참조변수(static Object this) => new 메모리 할당했을때
 *   	=> this는 생성자 , 인스턴스 메소드에서 사용 가능하다!!!
 *   class A
 *   {
 *   	public A(A this){} // 매개변수 안에 this라는 객체가 있다고 생각하기.
 *   	public void display(A this){}
 *   	public static void aaa(){}
 *   }
 *   3) 클래스 내에서는 어디든지 사용이 가능하다 (X) > static에서는 사용할 수 없다!!
 *   4) 지역변수와 인스턴스 변수를 구분할때 사용한다
 *   	class A
 *   	{
 *   		private String name;	=> heap에 저장
 *   		public void display(String name) => stack에 저장
 *   		{
 *   			this.name= name(매개변수)
 *   			--------
 *   			A 클래스에 설정된 변수 
 *   		} 
 *   	}
 *   5) 클래스 메소드(static) 내에서는 사용할 수 없다 
 *   	인스턴스 메소드 , 객체 메소드
 *   	 객체명.메소드
 *   	정적메소드, 공유메소드 , 클래스메소드
 *       클래스명.메소드
 *       
 *       
 *   오버로딩 조건
 *   1) 메소드명이 동일 ( 한개의 이름으로 여러개의 새로운 기능을 추가)
 *   2) 매개변수의 갯수나 데이터형이 달라야 한다
 *   3) 리턴형은 관계없다
 *   4) 매개변수의 이름이 달라야한다
 *   	void display(int a) ==> 아래와
 *   	void display(int b) ==> 같은 이름이 저장된다 display(int)
 *   
 *   다음 중 초기화에 대한 설명으로 옳지 않은 것은? (모두 고르시오)
		a. 멤버변수는 자동 초기화되므로 초기화하지 않고도 값을 참고할 수 있다 O.
		   ----- 인스턴스변수,정적변수 => 자동초기화
		   int => 0
		   double => 0.0
		   boolean -> false
		   String -> null
		   null => 참조하는 주소가 없는 경우
			=> String s=null
			if(s==null)
			String s="";
			if(s.equals(""))
		b. 지역변수는 사용하기 전에 반드시 초기화해야 한다.
		==> 지역변수는 자동 초기화 되지 않기 때문에 초기화 후에 사용해야 한다
		c. 초기화 블럭보다 생성자가 먼저 수행된다.
			명시적 초기화 => 초기화 블럭 => 생성자(클래스변수 =>인스턴스) 
		d. 명시적 초기화를 제일 우선적으로 고려해야 한다.
		   ----------
		   class A
		   {
		   	int a=100;
		   }
		e. 클래스변수보다 인스턴스변수가 먼저 초기화된다 
		   -------컴파일 시 초기화/ 인스턴스는 new사용 시

	 기본값-명시적초기화-초기화블럭-생성자 
	 				static => instance
	 		(명시적초기화를 쓰는 경우> 초기화블럭+생성자에서 쓰지 않음
	 		 			쓰지 않으면> 초기화블럭+생성자에서 씀
	 		 			
	 지역변수
		c. 지역변수에도 접근 제어자를 사용할 수 있다.   
		지역변수는 static, 접근지정어, abstract는 사용 불가능
		지역 변수 중에 유일하게 사용: final

 *   
 */
class A
{
	int a=10;			//인스턴스
	static int b=20;	//클래스
	{
		a=100;
		System.out.println("a="+a);
	}
	
	static
	{
		b=200;
		System.out.println("b="+b);
	}
	A(){
		a=1000;
		b=2000;
		System.out.println("a="+a+",b="+b);
	}
}

class PlayingCard { 
	int kind; 
	int num; 
	static int width; 
	static int height; 
	PlayingCard (int k, int n) { 
		kind = k; 
		num = n; 
	}
	
}
public class 문제_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		
	}

}
