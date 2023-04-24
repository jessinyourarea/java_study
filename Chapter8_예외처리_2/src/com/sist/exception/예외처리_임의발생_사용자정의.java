package com.sist.exception;
/*
 		throws : 예상되는 에러를 선언해둔다
 				 => 메소드를 사용 시에 다른 메소드에서 처리 후 사용
 				 => 선언만 할 수 있다/ 처리 후에 사용 할 수 있다
 				 => 다른 메소드로 전가(떠맡기기 from 라이브러리)
 				 => 라이브러리가 보통 선언을 하고 있다
 				 	------- 선언(CheckedException만 등록)
 				    IO / NET / Thread / Web / JDBC 多 ==> 웹 관련
 				    
 		throw : 고의로 예외를 발생 (테스트용) 
 	
 */
import java.util.*;
public class 예외처리_임의발생_사용자정의 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*try
		{
			Scanner scan=new Scanner(System.in);
			System.out.print("점수 입력:");
			int score=scan.nextInt();
			//System.out.println("score="+score);
			if(score<0)
			{
				throw new IllegalArgumentException();
			}
			System.out.println("score="+score);
		}catch(IllegalArgumentException e)
		{
			System.out.println("점수는 음수를 사용할 수 없습니다");
		}*/
		Scanner scan=new Scanner(System.in);
		System.out.print("점수 입력:");
		int score=scan.nextInt();
		if(score<0)
		{
			System.out.println("점수는 음수를 사용할 수 없습니다");
		}
		else
		{
			System.out.println("score="+score);
		}
	}	

}
