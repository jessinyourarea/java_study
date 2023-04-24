package com.sist.exception;
/*
 	 임의발생 : 테스트 목적
 	 ----------------- 베포전 (배포: 상용화 하기 전)
 	 
 	 형식)
 	 	 throw new 예외처리생성자()
 	 
 	 
 */
public class 예외처리_임의발생_1 {

	public static void main(String[] args) {
	try
	{
		int a=10;
		if(a%2==0)
		{
			System.out.println("임의로 예외 발생 !!!");
			throw new NumberFormatException("정수 변환이 안됨"); //생성자를 통해 내가 원하는 오류문구를 직접 넣을 수 있음(기본 영어오류문구 대신)
			//  throw  => 사용자 정의 예외처리
			
			//  ==> catch 로 이동 => 소스코딩을 할 수 없다
			// getMessage변경 -> 생성자 매개변수 이용
			/*
			  	class NumberFormatException extends Exception
			  	{
			  		private String message="default 문자열";
			  		public NumberFormatException ()
			  		{
			  		}
			  		public NumberFOrmatException(String message)
			  		{
			  		 	this.message=message;
			  		}
			  		getter/setter
			  	}
			 */
			//Integer.parseInt(" 10");
		}
	}catch(ClassCastException e) {
		System.out.println(e.getMessage()); 
		//에러 확인 목적===> 에러 확인해서 부분 수정 
	}catch(NumberFormatException e) {
		System.out.println("NumberFormatException:"+e.getMessage());
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println(e.getMessage());
	}
	}

}
