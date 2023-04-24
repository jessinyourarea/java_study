package com.sist.exception;
// 예외 발생 시 메세지 확인 ==> 자바에서 지원
/*
 		getMessage() => 에러에 대한 메세지만 전송
			=> 에러에 대한 숙달이 되어 있는 상태에서 이용 ( 아니면 아래 메소드를 이용해서, 어디서 몇번쨰 줄에서 에러가 났는지 확인해야함)
 		printStackTrace() ==> 실행하는 과정 -> 어디서 에러가 발생했는지 확인
 		-------------------
 		
 		
 	
 */
public class 예외처리_예외복구_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int[] arr=new int[100];
			arr[100]=100;
			
		}catch(ArrayIndexOutOfBoundsException e)
		{
			//e.printStackTrace();
			//System.out.println(e.getMessage());
			System.err.println(e.getMessage()); //권장사항 : 출력 결과가 빨간색으로 표시됨.
												//PMD : 프로그램 정적 분석: 어느 부분에서 틀렸는지 확인해주는 ...따로 다운로드 받아야함.
		}
	}

}
