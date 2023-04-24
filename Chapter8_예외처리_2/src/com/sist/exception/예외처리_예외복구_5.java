package com.sist.exception;
//
/*
 * 	 finally (생략 가능) 
 	 try든 catch든 관계없이 무조건 수행되는 문장을 말한다
 	
 	파일닫기, 오라클 연결 해제, 서버 연결 해제 => 오라클 연결 ,네트워크 연결
 	
 	형식)
 		 try
 		 {
 		 	정상 수행 가능한 문장
 		 	==> 에러 (예상하지 못한 에러가 발생할 수 있다)
 		 	프로그래머의 실수 , 사용자의 입력값 오류..........
 		 }catch(예상되는 예외 클래스)
 		 {
 		 	에러 발생 시 처리
 		 	= 에러를 확인
 		 	= 복구를 할 수 있다 => 오류 메시지를 전송할 수도
 		 }
 		 finally  ==> (생략 가능 OO)
 		 {
 		 	무조건 수행하는 문장을 코딩
 		 	예) 파일 닫기, 오라클 연결 해제, 서버 연결 해제 => 오라클 연결, 네트워크 연결
 		 }
 		 
 		 실행 순서
 		 =======
 		 문장 1
 		 문장 2
 		 try
 		 {
 		 	문장 3
 		 	문장 4
 		 	문장 5
 		 }catch(예외처리 클래스1)
 		 {
 		 	문장 6
 		 }
 		 catch(예외처리 클래스2)
 		 {
 		 	문장 7
 		 }
 		 catch(예외처리 클래스3)
 		 {
 		    문장 8
 		 }
 		 finally
 		 {
 		 	문장 9
 		 }
 		 문장 10
 		 문장 11
 		 
  		=> 1. try가 정상 수행
  		    1-2-3-4-5	==> 9-10-11
  		   2. 문장 4 에러1 발생
  		   	1-2-3 ==> catch(1) 6 ==> 9-10-11
  		   3. 에러2 발생
  		   	1-2-3 ==> catch(2) 7 ==> 9-10-11
  		   4. 에러3 발생
  		   ==> 목적 에러 시에 제외를 하고 나머지 문장을 수행
    	
    	==> 멀티 예외처리
    	
  		    
 */
public class 예외처리_예외복구_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int[] arr=new int[2];
			arr[0]=10;
			arr[1]=0;
			System.out.println(arr[0]/arr[1]);
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
		{
			System.out.println("에러 발생!!");
		}
		System.out.println("프로그램 종료!!");
	}

}
