package com.sist.exception;
/*
 
 */
//사용자 정의 => Exception을 상속
import java.util.*;
class MyException extends Exception
{
	public MyException(String message)
	{
		super(message);	//== getMessage()
	}
}
public class 예외처리_사용자정의 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		int num=scan.nextInt();
		try
		{
			if(num%2==0)
			{
					throw new MyException("짝수입니다!!"); //사용자 정의는 반드시 예외를 임의로 발생시켜야지만 사용 가능, 없을땐 오류뜸
			}
		}catch(MyException e)
		{
			System.out.println(e.getMessage());
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
