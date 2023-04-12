/*
 	1. 벤치마킹(웹)
 		필요한 데이터 모아서 관리
 		= 변수(따로 저장)
 			=> 인스턴스 변수
 		= 공유하는 변수(업체명), 로그, 학원명 ...
 			=> 정적 변수(고정시켜놓는)
 		 
 		기능 처리
 		 	=> 메소드
 		 
 		 class Card				=> Card c1=new Card()
 		 {						   Card c2=new Card()
 		 	int number;			   Card c3=new Card()
 		 	String 무늬;
 		 	static int width
 		 	static int height		(공유변수는 static)
 		 							(따로 전환 시는 일반변수)
 		 }
 		 
 		 1> 한개만 설계 > 필요할떄 따로 저장 
 		 
 		 추상화 작업 => 단축 시키는 작업
 		 
 		 
 		 1. 클래스의 구성 요소
 		 class className
 		 {
 		   -----------------------------------------
 		 	변수설정
 		   ------------------------------------------
 		    생성자 설정	=> 필요시에만 => 설정하지 않는 경우에는 컴파일러가 자동으로 생성자를 만들어 준다
 		   ------------------------------------------
 		   메소드 설정
 		   ------------------------------------------
 		 }
 		 
 		 1) 변수의 종류
 		 ============
 		 	클래스 영역에 선언하는 변수 (멤버변수)
 		 	  = 인스턴스 변수: new를 사용할 때 저장되는 변수(new설정에 따라 따로 저장되는 변수)
 		 	  	= 클래스 객체명.변수명
 		 	  	Card c1=new Card();
 		 	  		--- 메모리를 모아놓은 장소이름(변수 여러개 저장)
 		 	  		    . 이란? 주소 접근 연산자
 		 	  	c1.number=10;
 		 	  = 정적 변수 : 한개의 공간에 저장
 		 	  Card c1=new Card();
 		 	  c1.number
 		 	  Card.number (********)
 		 	  ----------------- 프로그램 종료 시까지 사용하는 변수
 		 	메소드 영역에 선언하는 변수 (지역변수)	========stack
 		 	-------------------메소드가 종료되면 사라지는 변수
 		 	1) 메소드 영역에 선언되는 변수
 		 		void aaa()
 		 		{
 		 			int a=10;
 		 		}
 		 	2) 매개변수(지역변수)
 		 		void aaa(inta)
 		 		{
 		 		}
 		 	자바 메모리/구저
 		 	-------------
 		 	 Method Area = Method, static
 		 	-------------
 		 	 Stack : 메모리 자체에서 관리(생성/소멸 담당) => 블록변수
 		 	 		 매개변수, 지역변수
 		 	 		 => 변수의 초기화가 안된다( 반드시 초기화를 한 다음에 사아ㅛㅇ)
 		 	-------------		=> 메모리에서 자동저장
 		  	 Heap : 프로그래머 영역 (직접 메모리 크기를 만들어서 저장)
 		  	 		 자동 소멸이 안된다=>GC (system.gc() 사용)
 		    --------------
 		      heap, ,method area=> 변수 저장 시에 자동 초기화가 된다
 		      class ClassName{
 		      	int a; => 0이 되어서 따로 초기화할 필요가 없다
 		      	double d; => 0.0
 		      	boolean b; => false
 		      	char c; => '\u00000'
 		      	long l; => 0l
 		      	String s; =>null
 		      	** null은 참조타입 => 주소를 가지고 있지 않은 상태
 		      	*	String s; 
 		      	
 		      	}
 		   -----------------------------------------------------------------------------
 		   	변수유형			선언위치			메모리 저장위치			   사용범위	
 		   -----------------------------------------------------------------------------
 		   인스턴스변수		   클래스블록			new:
 		   				class ClassName	새로운 저강공간을 만든다 		클래스 전체
 		   				{						(heap메모리에 저장)
 		   					int a;
 		   				}
 		   -----------------------------------------------------------------------------
 		   정적변수		   클래스블록				컴파일 시 자동 저장
 		   				class ClassName
 		   				{
 		   					static int a;
 		   					=> 많이 사용되는 변수는 아니다
 		   -----------------------------------------------------------------------------
 		   지역변수		  class ClassName		메번 호출 시 메소드 안에서만 사용 가능하다
 		   				{
 		   					void display()
 		   					{
 		   					int a =10;
 		   					}
 		   				}
 		   				
 		   -----------------------------------------------------------------------------
 		 	1) 메모리 저장
 		 	   메모리에 저장된 상태;: 인스턴(객체)
 		 	   설계(어떤 데이터를 저장) ==> 메모리에 저장  ==============> 활용		====>소멸(메모리 해제)
 		 	   class ClassName  	ClassName c=new ClassName()	  c.변수명		c= null
 		 	   								  --	-----------	  c.메소드명
 		 	   {							해당 위치만	생성자
 		 	    String s;					제어 가능
 		 	    int a;
 		 	   }
 		 	   
 		 	   String s="";
				s.substring()
				s.trim()
				
				Scanner scan=new Scanner(system.in)
				scan.nextInt()
 		 	   
 		 	   *클래스는 한개에 대한 정보 설계
 		 	   *맛집: 5000개
 		 	   *----------- new를 이용해서
 		 	  	1개를 설계>저장공간을 5000천개 이상으로 바꿈
 		 	   
 */

class Student
{
	String name;
	int kor;
	int eng;
	int math;		
}
public class 사용자정의_데이터형_1 {
	/*
	 *  Student s1
	 *  ---------------name
	 *  
	 *  --------------kor
	 *  
	 *  -----------------eng
	 *  
	 *  -----------------math
	 *  
	 *  ------------------
	 * 
	 *  Student s2
	 *  ---------------name
	 *  
	 *  --------------kor
	 *  
	 *  -----------------eng
	 *  
	 *  -----------------math
	 *  
	 *  ------------------
	 * 
	 *  Student s3
	 *  ---------------name
	 *  
	 *  --------------kor
	 *  
	 *  -----------------eng
	 *  
	 *  -----------------math
	 *  
	 *  ------------------
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Student s1=new Student();
		 // 
		 System.out.println("s1="+s1);
		 //s1=name,kor,eng,math
		 s1.name="홍길동";
		 s1.kor=90;
		 s1.eng=80;
		 s1.math=78;
		 Student s2=new Student();
		 //s2=name,kor,eng,math
		 System.out.println("s2="+s2);
		 s2.name="김장군";
		 s2.kor=80;
		 s2.eng=70;
		 s2.math=68;
		 Student s3=new Student();
		 System.out.println("s3="+s3);
		 //s3=name,kor,eng,math
		 s3.name="김영희";
		 s3.kor=90;
		 s3.eng=80;
		 s3.math=78;

		 System.out.println(s1.name+" "+s1.kor+" "
				 +s1.eng+" "+s1.math);
		 System.out.println(s2.name+" "+s2.kor+" "
				 +s2.eng+" "+s2.math);
		 System.out.println(s3.name+" "+s3.kor+" "
				 +s3.eng+" "+s3.math);
	}	

}
