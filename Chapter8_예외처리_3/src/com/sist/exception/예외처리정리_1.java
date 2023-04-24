package com.sist.exception;
/*
   	1) 예외 방법과 형식
   		-----
   	**	= 직접 처리(예외 복구) : 프로그래머 usage多
   		   try
   		   {
   		   	 실행 가능한 소스 코딩 (정상수행)
   		   }catch(예외처리 종류)
   		   {
   		   	 try에 있는 소스를 실행하는 과정에서 에러 발생 시 처리영역
   		   }
   		   finally //생략가능
   		   {
   		   	생략 가능 : 무조건 수행하는 문장 
   		   	e.g. 서버닫기 , 오라클 닫기, 파일 닫기 ...
   		   }
   		   catch는 에러발생 시 예외 복구하는 영역
   		   ----- 다중으로 사용 가능(여러 개를 구현할 수 있다)
   		          ------------ 한개의 예외로 통합 가능
   		          				= Exception / Throwable
   		   **catch절은 순서가 존재한다 => 상위 클래스는 아래에 배치한다
   		   **try절이 정상 수행 하면 catch절은 수행하지 않는다
   		   **try절에서 에러 발생시에는 에러가 난 곳부터는 수행하지 않는다
   		       => 대신 catch를 수행해서 에러 복구 => 종료
   		    try
   		    {
   		    	-------
   		    	-------
   		    	------ ==> 에러 발생 => 아래 문장 수행 XX => catch로 이동!
   		    	-------
   		    	-------
   		    } catch
   		    => catch는 위에서 한개씩 검색한 후에 해당 예외처리 클래스를 찾아준다
   		    		  -------------- 다중 조건문과 동일 ( catch는 한개만 수
   	**	= 간접 처리(예외 회피) : 자바나 오픈 라이브러리
   	      예외에 대해 예측되는 예외클래스를 선언만 해주는 역할
   	      => 다른 메소드에서 호출할 때 처리 후 사용 가능 (try~catch)
   	      => 예외 클래스의 순서가 존재하지 않는다
   	      => UnCheckException은 사용하지 않고 보통 CheckException만 사용한다
   	      => 라이브러리에
   	      	 java.lang / java.util => Usually UnCheckException
   	      	 	=> 예외처리를 반드시 하는 것은 아니다
   	      	 java.io / java.net / java.sql =>Usually CheckException
   	      	    => 예외처리를 반드시 한다 
   	      => 형식)
   	      	[접근지정어] 리턴타입 메소드명() throws 예외처리클래스(,...)
   	      	=> 처리
   	      	메소드() throws 예외처리클래스{
   	      		메소드호출
   	      	}
   	      	-------------------------------권장사항
   	      	메소드()
   	      	{
   	      		try
   	      		{	메소드호출
   	      		}catch(예외처리클래스){}
   	      	}
   	    -------------------------------------------------------------------
   		= 임의 발생 : 테스트용으로 보통 사용
   		  throw new 예외처리클래스(); => 해당 예외처리클래스가 있는 catch로 이동
   		= 사용자 정의 예외처리
   		예외처리 클래스를 상속 받아서 처리
   		class MyException extends Exception
   						  ----------------- => if~else
 */
public class 예외처리정리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
