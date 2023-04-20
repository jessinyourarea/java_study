package com.sist.main;
/*
 	인터페이스 : 추상 클래스의 일종(보완)
 	  1) 다중 상속 가능
 	  2) 인터페이스는 클래스와 동일하다 ? (상속을 받으면 상위 클래스다/다중상속 가능)
 	  3) 설계만 되어 있다 (구현 안된 메소드들만 모아놓아서 선언)
 	  4) 장점 
 	  	 ---1) 기능 설계가 가능하다
 	  	  = 기능 설계에 들어가는 개발 시간 단축 ==> e.g. 8개월
 	  	      		3mons		   1mon
 	  	    		아키텍쳐(PM)	   DBA
 	  	  		= 요구사항 분석 => 데이터베이스 설계 => 데이터 수집
 	  	    	--------------------------    
 	  	    	추상클래스 / 인터페이스 설계과정 동일            
 	  	               	=> 화면 UI (Publisher) => 1mon
 	  	               	=> 구현  (Web Programmer) => 2mons
 	  	               	=> 테스팅 (Tester) => 1mon
 	  	               	=> 배포  (PL)
 	      = 표준화 가능: 같은 메소드를 사용
 	                   e.g. 스프링(통합)	
 	      = 서로 관계없는 클래스 연결해서 사용이 가능
 	      = 유지보수가 편하다
 	      = 독립적으로 사용 가능하다
 	  ------------------------------------------------------------
 	    클래스 여러개를 묶어서 한개의 이름으로 제어가 가능하다
 	    		List (******) 가변형 Map , Set
 	    		 |
 	  -----------------------------------
 	  |		 	| 		 | 		 | 		|
  ArrayList  LinkedList	Vector	Queue  Stack
	List list=new ArrayList()
	list=new Vector()
	list=new LinkedList() 
 	list=new Queue()
 	list=new Stack()
 	
 	웹에서 가장 많이 사용하는 라이브러리 :
 	  1. String
 	  2. List
 	  3. Integer(int를 사용하기 편리하게 만든 클래스)
 	  	  웹/윈도우 의 모든 데이터형(String)
 	  	  데이터에 기능을 첨가해주는 클래스:Wrapper 예) page=1 => "1" => 1
 	  
 	  => 형식)
 	  [접근지정어] interface InterfaceName
 	  {
 	   ---------------------------------
 	    상수
 	     int a; ==> !오류!
 	     (public static final) int a=10;
 	     --------------------자동추가 
 	   -----------------------------------
 	    추상메소드
 	    	void display();
 	    	(public abstract) void display();
 	   -----------------------------------
 	   자동추가
 	   1) import java.lang.*; => String, Math, System ...
 	   2) 메소드 => void aaa()
				 	{
				 	 => return;
				 	  }
	   3) 생성자 => class A
				   {
				   	-> A(){}
				   }
 	   4) 인터페이스
 	   	 	변수 선언 시 => (public static final) int a=10;
 	   	 				 (public abstract) void disp();
 	   	 				 구현이 가능한 메소드
 	   	 				 (public) default void aaa(){}
 	   	    interface는 상수,메소드 => public만 사용한다
 	  = 선언만 되어있다 => 상속을 내려야한다
 	    => 상속받은 클래스를 구현해서 사용 (오버라이딩 기법)
 	  = 다중상속을 지원한다
 	    ------
 	    상속과정
 	    ------
 	    interface A
 	    class B extends A==> !오류!
 	     		-------확장해서 사용
 	    class B implements A
 	    		----------구현해서 사용
 	    		
 	    interface ==> interface로 상속
 	    Interface A
 	    interface B( extends) A
 	    class  ====> 	interface
 	    --------------------
 	    interface A
 	    class B (implements) class
 	    interface ==> class로 상속
 	    -------------------
 	    interface B A ====>오류
 	    class ==> interface로 상속
 	    class A
 	    
		interface B
 	    interface B extends A
 	    class C implements B
 	    
 	    interface A
 	    interface B
 	    class C implements A,B ==>다중상속
 	    
 	    interface A
 	    interface B
 	    class C
 	    class D extends C implements A B
 	    class E extends JFrame implements , MouseListenr , KeyListener, 
 	    						ActionListener,Re
 	    
 	    => Game : 마우수이용, 키보드이용, 러튼이용,, 쓰레드
 	  
 	  247page
 	  일반메소드 
 	  interface A
 	  {
 	   	  JDK 1.8이상
		  default void disp(){}
		  ()abstract void doGame)(;
		  
	  interface A
	  {
	  void==aaa() ; ==> 오류
  	  }
 	` class B implements A
 	{
 		public void aaa(){} =>오류

	   249page
	   1)인터페이스는 객체를 생성할 수 없다(구현안된 메소드를 가지고 있기 때문에 메모리에 저장 불가능)
	   인터페이스 = new 구현한 클래스()
	   	==> 자체 익명의 클래스를 이용하면 객체 생성할 수 있다
	   2) 인터페이스는 다중상속이 가능하다
	    class A implements 인터페이스,인터페이스 ...
 *
 */
interface AA
{
	int a=10;
	void aaa();
}
interface BB
{
	int a=20;
	void bbb();
}
class CC implements AA,BB
{
	//AA.a BB.a 두개가 같은 변수
	public void print()
	{
		System.out.println(AA.a);
		System.out.println(BB.a);
	}

	@Override
	public void bbb() {
		// TODO Auto-generated method stub
		System.out.println("BB.bbb()구현");
	}

	@Override
	public void aaa() {
		// TODO Auto-generated method stub
		System.out.println("AA.aaa()구현");
	}
}
public class 인터페이스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CC c=new CC();
		//c.print();
		CC c=new CC(); // 다중 상속 시에는 본인 클래스로 객체 생성
		c.print();
		c.aaa();
		c.bbb();
		
		
		//////////////////////
		AA aa=new CC(); // implements도 extends와 동일하게 적용 상위=new 하위
		//bbb()는 호출할 수 없다
		aa.aaa();
		//aa.bbb(); X
		
		BB bb=new CC();
		bb.bbb();
		
	}

}
