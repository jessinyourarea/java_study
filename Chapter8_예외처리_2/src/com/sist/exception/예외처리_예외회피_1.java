package com.sist.exception;

import java.io.IOException;
import java.sql.SQLException;

//  예외 떠맡기기 == 예외 회피 ...
/* 
  => 메소드를 읽는다 => JVM에 이런 예외가 발생할 수 있다( 알려만 주는 것) => 예외선언
  => 메소드 호출 시에 반드시 => 직접, 선언
  => RuntimeException => 생략이 가능(예외처리를 안해도 된다)
  
  		상위 클래스를 이용해서 전체 처리가 가능하다
  			 Throwable (Exception/Error 포함)
  			 	|
  		-------------------
  		|       		  |
  	  Error			  Exception
  	  (X)				  |
  	  			 Check(필수)   		UnCheck(선택)
  	  			------------------------
  	  			|					  |
  	  		IOException				 RuntimeException
  	  		SQLException			  |
  	  		..						 NumberFormatException, Arr....
  	  		.. 
  	  		(순서 상관 없음)
  	  
  	  **== 필수 예외처리 필요한 메소드 ==> 관건: 필수 예외처리를 해야하는 메소드인지 파악하는게 중요
  	  void method() throws RuntimeException
  	 *** void method() throws Exception
  	  void method() throws NumberFormatException, ClassCastException
  	 *** void method() throws IOException
  	 *** void method() throws SQLException , NumberFormatException
  	  
 */
public class 예외처리_예외회피_1 {
	public static void methods() throws Exception
	{
		//예외처리 대상
	}
	public static void method1() throws Exception //간접처리 (JVM이 처리)
	{
		methods();
	}
	public static void method2()
	{
		try
		{
			methods();
		}catch(Throwable e)				//직접 처리
		{
			
		}
	}
	public static void method3() throws IOException, SQLException,ClassNotFoundException
	{
		
	}
	public static void method4() throws IOException, SQLException,ClassNotFoundException //그대로 쓰거나
	{
		method3();
	}
	public static void method5() throws Exception // 더 큰 상위 클래스를 쓰거나
	{
		method3();
	}
	public static void method6() throws Throwable //최상위 클래스를 쓰거나
	{
		method3();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
