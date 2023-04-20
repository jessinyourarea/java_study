package com.sist.main;
/*
	page 232
	-------- 추상 클래스 (abstract)
			 => 메소드 관련( 구현이 안된 메소드)
			 ---------------------------상속 관련 오버라이딩 기법
			 ** 오버라이딩 조건
			    -------
			    = 상속을 받아서 기존의 기능을 변경해서 사용
			    => 조건
			    1) 상속관계가 존재
			       => 추상클래스는 단독으로 사용이 불가능
			          - 미완성된 클래스이기 때문
			       => 사용법은 상속을 내린 후에 상속 받을 클래스를 통해서
			       	   메모리 할당되는 상태
			       	   class A
			       	   class B extends A
			       	   => A a=new B();
			       	      A a=new A() ==> !오류!
			    2) 메소드명 동일
			    3) 리턴형 동일
			    4) 매개변수 동일 (매개변수가 다른 경우 오버로딩)
			    5) 접근지정어는 확대할 수 있고/축소하면 오류 발생
			       -------
			       private < default< protected <public
	      
	      *** 기본 목적 : 여러개의 클래스를 모아서 한 개의 이름으로 제어할 목적
	                    ----              -----
	      *** 프로그램 설계 (미완성된 클래스)
	      	  = 요구사항 분석
	      	    벤치마킹 : 여러개 사이트를 참조
	      	    예) 로그인 =>
	      	       회원가입
	      	       예약
	      	       결제

 			  = 프로그램에 맞게 구현해서 사용
 			    예) 
 			    	void btnClick();
 			    	{	계산기 1번
 			    	}
 					=> 로그인 버튼을 하고 싶은데 구현내용은 계산기가 들어가있으면 활용 XX
 					
 					void getConnection();
 					=> 데이터베이스 연결하는/
 					=> 구현되어있으면 안됨. 왜냐? 연결 가능한 오라클/MS-SQL/MySQL/MariaDB이 방식이 다 다르니까
 			  = 한 개의 객체로 여러개를 제어하는 프로그램
 			  
 			추상클래스
 			==========
 			 ==> 공통적으로 사용하는 부분(코딩 내용을 다르게 만들 경우)
 			 
 			 예) 게시판 : 목록출력 , 찾기 , 글쓰기 , 내용보기 , 수정하기 , 삭제하기
 			 묻고답하기 : 목록출력 , 찾기 , 글쓰기 , 내용보기 , 수정하기 , 삭제하기 ,(new)답변하기
 			 댓글게시판 : 목록출력 , 찾기 , 글쓰기 , 내용보기 , 수정하기 , 삭제하기 , (new)댓글
 			 후기게시판 : 목록출력 , 찾기 , 글쓰기 , 내용보기 , 수정하기 , 삭제하기, (new)업로드
 			 
 			 abstract class Board
 			 {
 			 	목록출력();
 			 	찾기(){} // 찾기 기능은 기능이 다들 비슷핧 것으로 보이니까 구현부 오픈!
 			 	글쓰기();
 			 	내용보기();;
 			 	수정하기();
 			 	삭제하기();
 			 }
 			 
 			 ** 권장사항 ==> 한개 이상의 추상메소드를 포함한다
 			 *						------- 구현안된메소드
 			 	abstract void find(); //추상메소드구나! 우리가 구현해야하는구나
 			 	Board content(){}
 			 	void write(){}
 			 	
 		 추상클래스의 특징
 		 1)단일 상속이 기본 => extends
 		 2)미완성 클래스 : 메소드가 구현이 안된것이 있으면 미완성이라고 한다. 
 		 				메모리에 단독 저장 안됨XXXX
 		 				abstract class A
 		 				 => A a=new A() => 오류
 		 3)상속을 내려서 구현된 클래스를 이용해서 메모리 할당
 		   abstract class A
 		   class B extends A
 		   ------------------ 구현이 안된 메소드가 있으면 무.조.건 구현해야한다
 		   => A a=new B(); (묵시적 형변환) 앞 상위 뒷 하위
 		   	  double d=10; 자동형변환
 		   => A a=new B();
 		      B b-(B)a; ==> 명시적 형변환 page 226
 		   ** 클래스는 상속관계,포함관계가 있어야 크기를 잴 수 있다
 		      상속을 내리는 클래스> 상속을 받는 클래스
 		      포함하고 있는 클래스> 포함되지 있는 클래스
 		      
 		      class A
 		      class B extends A ==> A>B --> is-a
 		      class A
 		      {
 		      	B b=new B(); // 포함 클래스
 		      }
 		      class B ==> A>B  -->has-a
 		 4)목적 : 관련된 여러 클래스를 묶어서 하나의 이름으로 관리
 		 		 -------------
 		 		  => 공통적인 기능 
 		 		  => 버스,마을버스,고속버스,좌석버스
 		 		    ------------------------ ==버스(추상클래스:하나로 묶어버렸쟈나)
 		 		  => 개,돼지,말 ...
 		 		     -------- ==동물(추상클래스)
 		 		  => 선, 네모, 삼각형 , 원 ..
 		 		     -------------------- 도형
 		 		  => red , green , blue ...
 		 		     -------------------- == 색상
 		 		     
 		 5)선언된 메소드가 있으면 => 상속 시 반드시 구현해야함 (강제성)
 		 
 		
 */
import java.io.*;
abstract class 도형
{
	//무조건 구현이 필요하다
	public abstract void draw();
	// 필요에 따라 오버라이딩
	public void color() {
	 System.out.println("검정색");
	} // 보통의 색상은 검정색이 기본. 그래서 선언 대신 구현으로 최초값을 부여(검정) => 추후 원한다면 오버라이딩 할 수 있음
}
class 선 extends 도형
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("선을 그린다");
	}
	
}
class 원 extends 도형
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("원을 그린다");
	}
	
}
class 네모 extends 도형
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("네모를 그린다");
	}
	
}
/*interface A
{
	
}
/*
 * 	1. 일반 클래스 => new   (O)
 *  2. 추상 클래스 => 구현 후 사용
 *  3. 인터페이스 => 추상 클래스와 동일 (O)
 *  4. 종단 클래스 => 상속해서 확장 불가능
 *  5. static   => 메모리 => 클래스명으로 접근
 *  ------------------------------------
 *  
 *  
 */
abstract class A
{
	public abstract void aaa();
	public abstract void bbb();
	public abstract void ccc();
	public abstract void ddd();
	public abstract void eee();
}
class B extends A
{

	@Override
	public void aaa() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bbb() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ccc() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ddd() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eee() {
		// TODO Auto-generated method stub
		
	}

}
public class 추상클래스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//오버라이딩 기법
		도형 a=new 선();
		a.draw();
		a=new 원();
		a.draw();
		a=new 네모();
		a.draw();
		//OutputStream out;
	}

}
