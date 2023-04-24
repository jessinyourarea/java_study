package com.sist.exception;
//267page=> try~catch (예외복구)
/*
 *  try	: 정상 실행하는 코딩
 *  catch :예외가 발생 시에 복구하는 과정(여러개사용이가능=>순서) => 계층구조
 *  예외처리 => 소스상에서 수정이 가능한 에러(가벼운 에러)
 *  ------
 *  	   비정상 종료를 방지하고 정상종료가 가능하게 만드는 목적
 *  			
			   		<계층 구조>
			   	      Object : 모든 클래스 중 최상위 클래스
			            |
			         Throwable :에러의 최상위 클래스
			         	|
			-----------------------------------------------         
			|											|
		  Error										Exception
		  처리 불가능									처리 가능
		 => 메모리 부족								=> 0으로 나누는 경우
		 => 윈도우 충돌								=> 정수 변환의 문제
		 											=> 형변환, 파일명이 틀린 경우
		 											=> Web에서 URL/IP가 틀린 경우
		 											=> 객체가 null일때 주소에 접근하는 경우
		 				Exception : 예외처리의 최상위 클래스
		 				---------
		 				1)CheckedException : 컴파일 시에 예외처리를 했는지 여부 확인
		 									 반드시 예외처리를 해야 된다
		 				2)UncheckedException : 컴파일시에 예외처리를 확인하지 않는다
		 										필요시에만 예외처리
		 				Exception
		 					|
		 -------------------------------------------------------------------
		 |
		1)CheckedException (컴파일 시 입력)
		        |
		 =>IOException : 파일 입출력 , 메모리 입출력 , 네트워크 입출력
		   (java.io 안에 있음)]
		 =>SQLException : 오라클 연결할 때 사용 (오라클이 인식하는 언어 :SQL)
		   (JDBC ===> DBCP ===> ORM (MyBatis,JPA)
		   Web의 핵심은 데이터베이스를 연동하는 것
		   (java.sql 안에 있음)
		 =>MalformedURLException : IP/Web URL이 틀렸을 때 나타나는 오류 관련
		   (java.net 안에 있음)
		 => ClassNotFoundException : 클래스 이름으로 메모리 할당=> 클래스명, 패키지명이 틀린 경우
		   = 스프링에서 주로 사용하는 기술 (리플렉션)
		   							-------- private까지 접근 가능
		   A a= new A(); Class.forName("A") ==> 이렇게 작성해도 메모리 할당이 가능함.
		 => InterruptedException : 쓰레드(한 개의 프로세스 안에서 여러개의 프로그램을 동시에 사용) 관련 충돌과 관련.
		 => java.lang/ java.util =>예외 처리와 관련없는 클래스
		 => 예외 처리는 필.수. : 정상상태를 유지 => 견고한 프로그램 목적
		2)UnCheckedException : 예외처리는 필요한 경우에만 사용 가능하다
				Exception
					|
			 RuntimeException : 실행 시 입력 (인터프리터) => 사용자 입력, 프로그램 실수
			   		|
			 NumberFormatException : 정수 변환에서 에러
			 	=> Wrapper class에서 주로 이용 : 기본형을 사용하기 쉽게 클래스용으로 제작
			 					 boolean => Boolean
			 					 int     => Integer
			 					 double  => Double 
			 		Integer.parseInt(); => 정수형으로 변경=> 윈도우와Web에서는 문자열만 사용하기 때문에 정수가 필요할땐 변환해서 사용
			 			웹에서 전송된 데이터를 받는 경우
			 			 -String getParameter() => 유저가 브라우저를 통해 값을 넘겨주면 문자열로 변경 => 이걸 정수가 필요할 때 변형
			          	 Jsoup: 데이터 수집 (String으로)
			 ArrayIndexOutOfBoundsException : 배열 범위 초과시
			 								  컬렉션 
		     ArithmeticException : 0으로 나눌 경우
			 NullPointerException : 객체나 배열에 주소가 없는 경우 
			 ClassCastException : 클래스 형변환 문제 시
			 					class A
			 					class B extends A
			 					B b=(B)new A(); !오류 Exception발생! ===> A a=new B(); / B b= (B)a;
		예외처리의 기본 (267page)
		try ~ catch
		-----------
		형식)
		 	try
		 	{
		 		정상수행이 가능한 코딩 => 지금까지의 소스가 들어간다
		 	}catch(예외처리 종류 설정)
		 	{	
		 		수행 과정에 오류발생 시 처리되는 부분
		 	}
		 	-------------------------------------------------------------------------------------------------------
		 	
		 	try ~ catch => 소스 전체에서 처리: 프로그램 종료
		 				   -----------------
		 				   부분 처리에서는 제외 한다는 개념
		 				   예외처리를 어느 위치에 하느냐에 따라 처리방식이 달라짐
		 				   
 */
public class 예외처리_예외복구_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//try {
				
			for(int i=1;i<=10;i++)
			{
				try 
				{
				int j=(int)(Math.random()*3);	// 0 1 2 
			    int k=i/j;
				System.out.println("i="+i+",k="+k);
					
				}catch(Exception ex) {
					System.out.println("0으로 나눌 수 없다");
					}
			}
		//}catch(Exception ex) {
			//System.out.println("0으로 나눌 수 없다");
		//}
	}

}
