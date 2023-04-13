/*
    기초
    = 변수 , 데이터형 (정수:int , byte , long 실수 double 논리 boolean char)
    = 연산자 , 제어문
    ------- 단항연산자(++ -- ! (type)/형변환
    ------- 이항연산자(산술 비교 논리 대입)
    ------- 삼항연산자
    ------- 조건문 (단일 if, 선택if~else , 다중if~else if...
    ------- 반복문(for, while)
     			----- 이차 for, for-each
    ------- 반복제어문 (break)
    
    = 배열 : 1차
    = 문자열 저장 => String
       기능: 
       		*** 1)equals : 문자열 비교
       		   boolean equals(String s)
       		  DB : WHERE name='홍길동'
    		2)startsWith : 시작문자열
    		   boolean startsWith(String s)
    		  DB : WHERE name LIKE='홍%'
    		3)endsWith : 끝문자열
    		  boolean endsWith(String s)
    		  DB : WHERE name LIKE='%홍'
    		*** 4)contains : 포함
    	      boolean contains(String s)
	     	  DB : WHERE name LIKE='%홍%'

    	    5)length : 문자 갯수
    	      int length()
    	    6) indexOf : 문자, 문자열의 위치(처음부터 찾기)
    	       int indexOf(char)
    	       int indexOf(String)
    	       *** 문자열은 index번호가 0번부터 시작
    	       String s="Hello Java";
    	       				 	=
    	       s.indexOf('a'),s.indexOf("a") ==> 7 (7번째에 a가 있음)
    	    7) lastIndexOf : 문자, 문자열의 위치(뒤에서부터 찾기)
    	    	int lastindexOf(char)
    	       int lastindexOf(String)
    	        String s="Hello Java";
    	        				   =
    	       s.lastindexOf('a'),s.lastindexOf("a") ==> 9 (뒤에서부터 보면 맨뒤의 a가 제일 가까움)
    	    8) trim : 좌우의 공백 제거
    	       String trim();
    	    9) valueOf : 모든 데이터열을 문자열로 변환
    	    	valueOf(1) => "1"
    	       **윈도우/웹=> 모든 데이터형 문자열 (숫자없음)
    	       static String valudOf(모든데이터형): String에서 유일하다
    	       String.valueof(1)
    	       -----------------
    	    10) replace() : 변환(문자열,문자)
    	    	String replace(char, char)
    	    			   ----  -----
    	    			   OLD	  NEW
    	    	String replace(String, String)
    	    11) replaceAll : 변환(문자열)
    	    	String replaceAll(String, String)
    	    					  ------ RegExp => 정규식
    	    	replaceAll("[가-힣]","")
    	    	 [A-Z] [a-z] [0-9]
    	    12) substring() : 문자열을 자르는 경우
    	    	String substring(int s) > 여기부터 잘라와라
    	    	String s="Hello Java"
    	    	          0123456789
    	    	s.substring(6)= Java
    	    	String substring(int s,int e) > 어디부터 어디까지 잘라와라
    	    	s.substring(0,5)=Hello
    	    				  -  ---- -1 (마지막 숫자에서 1개 제외시키기)
   class: 설계 => 속성, 기능
      	    	 ---  --- - 메소드 
      	    	 변수
      	  웹 => 출력 내용 (변수)
      	    => 메뉴,버튼 => 기능
      	    ------------------ 요구사항분석(설계)
      	추상화 : 설계 (기능, 데이터) : 사물을 단순화 시켜서 설계 하는 작업을 추상화라고 한다
      	예)
      		사원: 사번 , 이름 ... 
      		 출근한다 퇴근한다 근무한다
    class 설계 =====> 메모리에 저장(인스턴스)
    				  new( 클래스에 저장할때는 new 필요행)
    				   ** Spring은 new를 사용하지 말라..고..?!
    				   ** new없이 저장이 가능 =>reflection 
 1. 구성요소
 	class ClassName
 	{
 	  -----------------
 	  	변수(속성)
 	  	 멤버변수
 	  	  = 인스턴스 변수 (new 사용 시마다 따로 메모리를 만든다)
 	  	  = 정적 변수 (static) => 한개의 공간만 생성 => 공유변수
 	  	    => 컴파일러에 의해 자동 생성
 	  -----------------
 	    메소드(동작) : 기능
 	  -----------------
 	    생성자 : 멤버변수 (인스턴스 변수) 초기화할때 쓰는 메소드
 	    		메모리에 저장 시 처음으로 호출되는 메소드
 	  -----------------
 	}
 2. 구성요소 사용법
 	1) 메모리에 저장
 	   class A
 	   {
 	      변수 / 메소드
 	   }
 	   
 	   A a; 선언
 	   a=new A();
 	   A a=new A();
 	   
 	   class A
 	   {
 	      int sabun;
 	      String name;
 	      String getName(){}
 	      int getSabun(){}
 	      void run(){}
 	   }
 	   A a=new A();
 	  ----
 	  
 	  
 	  a.sabun ==> ***이라는 메모리주소에 있는 sabun의 값을 가지고 온다
 	  				. -> 메모리 주소 접근 연산자
 	  --a--
 	  메모리주소 ***
 	  ----  ↘ 
 	  		  new = > 데이터메모리를 모아준다
 	  		메모리주소*** ---------
 	  		  			sabun 저장공간 1
 	  		  			name 저장공간 "홍길동" 	  		
	 	  				--------
						getSabun()  => a.getSabun()
						getName()  => a.getName()   ===> 참조 변수
 	  					---------

 3. 접근범위
 4. 객체지향의 3대 요소
 5. 클래스의 종류
 6. 예외처리
 -----------------------
 API- 지정된 라이브러리 사용법만 외우면 됨.
 
 
 	class Out
 	{
 	  int aa;
 	}
 	
 	static class System
 	{
 	  Out out =new Out();
 	}
 	
 	B b=new B();
 	System.out.aa
 
 
 
 
 
 */
class Student 
{
	int hakbun;
	String name;
	
}

public class 클래스의구성요소_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student hong=new Student();
		//hong이라는 주소 안에 hakbun과 name이 저장됨.
		hong.hakbun=1;
		hong.name="홍길동";
		Student shim=hong;//hong의 주소를 shim에 대입해서 같은 주소를 사용하게 됨. 
		shim.hakbun=2; //shim의 주소 안의 hakbun을 2로 설정함 == shim의주소==hong의주소 means hong의 hakbun도 2로 변경.
		shim.name="심청이";
		System.out.println(hong.hakbun);
		System.out.println(hong.name);
	}

}
