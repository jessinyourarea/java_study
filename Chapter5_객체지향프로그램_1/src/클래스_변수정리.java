/*
 	클래스의 구성 요소
 	 class ClassName
 	 {
 	   ----------------------------
 	     변수(인스턴스 , 멤버, 공유)
 	      = 따로 저장되는 변수 (인스턴스 변수 => new)
 	      = 공통 저장 변수(컴파일러에 의해 자동으로 생성되는 변수) > 한개의 메모리만 생성됨.
 	   ----------------------------
 	   	 메소드 (멤버 메소드) => static이 없는 메소드
 	   -----------------------------
 	   	 생성자 두둥둥장: 멤버변수의 초기화 , 객체생성 시에 호출되는 메소드
 	   -----------------------------
 	 }
 	 
 	 **** class블럭에서는 연산자, 제어문을 사용할 수 없다
 	 				   오직 선언만 가능하다.
 	 				   변수값을 지정할때는 선언과 동시에 설정한다
 	 				   int i=100;  > ok
 	 				   
 	 				   int i; i=100; > no 오류!! 변수를 사용할 수 없다
 	 				   
 	 				   
 	 1. 객체 지향 프로그램 (OOP)
 	   = 여러개의 클래스를 만들어서 조립하는 프로그램 (CBD) component based development
 	   예) 웹사이트를 만들때
 	      회원 : 회원가입 , 탈퇴, 정보수정, 로그인, 로그아웃, 아이디찾기...
 	     -----
 	     게시판 : 글쓰기, 수정, 상세보기, 삭제, 찾기, ...
 	     -----
 	      맛집 : 목록, 상세보기, 댓글쓰기, 찾기, 추천, 예약 ...
 	     ----- 
 	      --------------------------------------------------------
 	      메뉴 
     2. 객체란 무엇인가..(객체지향의 객체가 무엇이냐, 객체지향의 특성이 무엇이냐~캡슐화/다형성/추상화/상속)
        ----
        물리적으로 존재하는 것(눈에 보인다)
        예) 자동차, 사람, 책 ... 
           자동차
           = 차량종류, 속도, 색상 ..번호(속성)  ==> 변수
           = 달린다, 속도높이기, 속도줄이기(동적) ==> 메소드
        추상적인 것(회사, 날씨 , 동물 ... 게임) => 속성, 동작
        ===> 자바에서 모델링할 때는 변수/메소드
        
        사람
        이름
        성별				==> class 사람{String name,sex,jumin;int age}
        주민번호									====> 메모리 저장(인스턴스)
        나이
        먹는다
        달린다
        걷는다
        말한다
        
     3. 객체지향 => 클래스끼리 상호작용을 한다
                   결과값응답 (메소드)
            사람 == > 계산기
        (actor)요청 (메소드)
     	class 사람
     	{
     	  계산기 >---NEW! actor를 결정하면 동작하는 목적어를 가지고 들어온다!
     	}
     	class 계산기
     	{
     	}
     	
     	객체와 클래스
     	
     	설계		====> 완성 (활용-메모리에 저장되는 과정)
       클래스			  =====>객체
       class		  new className() ==> 객체.메소드(변수)
       {
       	 변수, 메소드...
       }
       
       클래스로부터 객체 생성하기 위해서는 변수/메소드가 정의
       							  --------
       클래스를 저장하면 인스턴스가 된다...!?(객체)
       A a=new A()							  
   	   - -
   		 객체명
   	   int a=10;	 
   		   -변수명
   		   
   	   => IBM -> MainFrame -> Network(C/S) -> GridComputer (Cloud) -> 감성컴퓨터(AI)
   	   
   	   => 하나의 클래스로부터 여러 개의 객체를 생성 가능하다
   	   => 클래스는 한 개에 대한 정보를 가지고 있다
   	   => 데이터를 따로 저장하기 위해서는 new연산자를 이용한다
   	   	   => new는 새로운 메모리 공간을 만들어준다 
   	   	   => 사용법
   	   	   		new 클래스명() 
   	   	  class A
   	   	  A a=new A();
   	   	  A a;
   	   	  a=new A();																			malloc
   	   	  
   	   	  class A
   	   	  {
   	   	  	int a;
   	   	  	int b;
   	   	  	String s;
   	   	  	static int d;		// 총 필요한 메모리 양은 12byte
   	   	  						  static은 따로 생성되는 메모리/공유변수이기 때문에 
   	   	  						  해당 class A의 메모리와는 관계없다. 
   	   	  }
   	   	  
   	   	  변수
   	   	  이름 
   	   	  성별
   	   	  
   	   	  나이
   	   	  ------
   	   	  	class Human
   	   	  	{
   	   	  		String name;
   	   	  		String sex;
   	   	  		int age;
   	   	  	}
   	   	  
   	   	  
 */
public class 클래스_변수정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
