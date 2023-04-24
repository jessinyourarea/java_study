package com.sist.exception;
/*
 	** 예외를 수정하는 것이 아니라 => 에러 발생한 소스를 건너뛴다
 	형식
    --  try
    	{
    		문장1
    		문장2
    		문장3
    	} catch(예외처리 종류)
    	{
    		문장4
    	}
    	문장5
    	문장6
    	
    	 	처리 순서 (오류 없을떄)=====> 문장1 > 문장2 > 문장3 > 문장5 > 문장6 
 		try
    	{
    		문장1
    		문장2 ==> 에러발생
    		문장3
    	} catch(예외처리 종류)
    	{
    		문장4
    	}
    	문장5
    	문장6
    		처리 순서 (오류 있을 때)=====> 문장1 > 문장4 > 문장5 > 문장6
    		 						 오류 발생 시 catch로 이동
    		 			** try 안에서 에러 발생 시에 에러난 위치부터  ㅅ교 끝까지는 수행하지 않느다
    		 			*  catch로 이동 => catch문장을 수행한다
 */
	
public class 예외처리_예외복구_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.println("문장1");
		System.out.println("문장2");
		System.out.println("문장3:"+(10/0)); // 비정상 종료
		System.out.println("문장4");
		System.out.println("문장5");*/
		System.out.println("moon1");
		System.out.println("moon2");
		try
		{
			System.out.println("moon3");
			System.out.println("moon4");	//정상수행 가능한 코딩
			int[] arr=new int[2];
			arr[2]=100;
			System.out.println("moon5:"+arr[2]); // 오류
			System.out.println("moon6");
			
		}catch(ArithmeticException e)// 에러 처리=> 0으로 나눌 경우만 처리가 가능
		{
			System.out.println("moon7:exception proceeded");
			
		}
		System.out.println("moon8");
		System.out.println("Exit");	// array열 외를 호출해서 오류남/ ArithmeticException으로는 잡을 수 없는 오류.
	}

}
