package com.sist.exception;
/*
 	예외처리
 	=> 직접처리 (프로그래머 처리)
 	   ------ 예외에 대한 복구 ==> 예외복구 (catch절) //잡아서 처리할 목적/ 직접처리가 더 많이 사용됨.
 	   try~catch~finally 
 	=> 간접처리 (가상머신/JVM에 맡긴다)
 	   ------ 예외를 복구할 수 없음 ==> 시스템에서 건너뛰고 처리할 수 있게 만들어줌. **"건너뛰기"**
 	   throws 
 	   형식)
 	   		method() throws 예외처리클래스, 예외처리클래스 ...
 	   		  		 ------------------선언 (정해진 순서가 없다)
 	   		=> method()를 호출하는 프로그래머가 예외처리 후에 사용
 	   			=> 예외 떠맡기기
 	   				1) 예외 떠맡기기
 	   				2) try~catch 로 처리 가능함
 	   				3) 라이브러리 이용=> 사용자에게 떠맡기기
 	   		예) 
 	   			void method() throws ArrayIndexOutofBoundsException,
 	   								 NumberFormatException
 	   			void 예외처리() throws ArrayIndexOutofBoundsException,
 	   								 NumberFormatException
 	   			{
 	   			}
 	   			void 예외처리()
 	   			{
 	   				try
 	   				{
 	   				} catch(ArrayIndexOutofBoundsException e)
 	   				{
 	   				}catch(NumberFormatException e)
 	   				{
 	   				}
 	   			}
 	   			void 예외처리()
 	   			{
 	   				method();
 	   			}
	---------------------------------------------------------------------------
 	=> 사용자 정의 예외처리 : 지원하지 않기 떄문에 직접 예외처리 제작
 	   => 거의 없다 (if을 이용하는 것이 더 좋다)
 	   class MyException extends Exception
 	   {
 	   }
 	=> 자동 호출 시에 자바는 자바에서 만든 예외처리만 호출된다
 	   ==> 임의로 발생해서 찾는다 (throw)
 	   
 	   
 	 try ~ with ~ resource
 	 finally를 사용하기 않고 프로그램 종료할 수 있는 다른 절
 	   
   
 	   
 	   
 	   
 	   
 */
public class 예외복구_정리 {
	public static void method() throws ArrayIndexOutOfBoundsException,
		 								NumberFormatException
	{
		
	}
	public static void execute() throws ArrayIndexOutOfBoundsException,
		 								NumberFormatException
	 {
		 
	 }
	public static void execute2()
	{
		try
		{
			method();
		}catch(ArrayIndexOutOfBoundsException e) {}
		catch(NumberFormatException e) {}	
	}
	public static void execute3()
	{
		try
		{
			method();
		}catch(RuntimeException e){}
	}
	public static void execute4()
	{
		try
		{
			method();
		}catch(Exception e) {}
	}
	public static void execute5()
	{
		try
		{
			method();
		}catch(Throwable e) {}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method(); //실행시 에러이기 때문에 예외 처리를 생략할 수 있다
	}

}
