/*
 *			start
 *			  |
 *			변수선언
 *			  |
 *			 조건 1	-false>조건2	-false>조건3 - false>문장수행
 *			  |			 |			|			|
 *			true		true	  true			|
 * 		  (문장수행)	  (문장수행) 	  (문장수행)		|
 * 			  |			 |			|			|
 * 			  -----------------------------------
 * 							|
 * 						   end						
 * 
 * 		if(조건문)
 * 			문장수행 =>
 * 		else if(조건문)
 * 			문장수행
 * 		else if(조건문)
 * 			문장수행
 * 		else if(조건문)
 * 			문장수행
 * 		else if(조건문)
 * 			문장수행
 * 		else			=> 맞는 조건이 없는 경우, 생략 가능함.
 * 			문장수행
 * 
 * 
 * 		= switch ~ case 선택문
 * 		반복문 -> for문까지.
 * 		연산자 => 제어문 => 배열/클래스
 * 						-----------> 모아서 관리하는 상태
 * 		
 * 
 * 데이터 저장
 * 	한개 저장: 변수/상수
 * 	관련된 데이터 여러개: 배열(같은데이터)
 * 	클래스(다른데이터형을 모아서 관리)
 * 
 * 데이터 처리
 * 	사용자 요청
 * 	결과값을 추출
 * 	연산처리/제어(흐름)
 * 	연산자/제어문-> 메소드
 * 
 * 요청 결과 출력
 * 	application
 * 	web application
 * 	mobile application
 * 
 * 		component : 클래스 안에서 제작=> 재사용 목적		
 * 									변경,추가: 객체지향: 최종목적-> 유지보수
 * 
 /*	다중조건문 : 조건이 맞는 문장을 수행하고 종료(한개 문장만 수행)
 *			=> 조건이 맞는 여러개의 문장을 수행하고 싶다면 다중X 단일조건문을 이용하세요. ( keypoint: 중. 복. 성)
 *	예) 1~100까지 숫자 중 3의 배수,5의 배수,7의 배수의 합을 출력한다.
 *					  ---------------------> 조건이 3개가 들어가야하니 단일조건문3개를 써야함.
 *	형식)
 *		if(조건문)
 *		{
 *			true 일 때 수행하는 문장 작성	===> 종료
 *			false 	
 *		}	 ↓
 *		else if(조건문)
 *		{
 *			true 일 때 수행하는 문장 작성	===> 종료
 *			false 				
 *		}	 ↓
 *		else if(조건문)
 *		{
 *			true 일 때 수행하는 문장 작성	===> 종료
 *			false 
 *		}	 ↓
 * 		else ====> 생략이 가능하다.
 *		{	
 *			위 중 해당 조건이 없는 경우에 처리되는 문장
 *		}
 *			사칙연산 (+, - , / , *)를 제외한 나머지(예:%)는 else에서 사용.
 *		
 *		원래 else문은 바로 위의 if와만 작동하는데,
 *		다중조건문만 전체 조건과 작동한다.
 */


//사칙연산 처리

import java.util.Scanner;
public class 다중조건문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("첫번째 정수 입력:");
		int num1=scan.nextInt();
		System.out.print("두번째 정수 입력:");
		int num2=scan.nextInt();
		System.out.print("연산자 입력(+,-,/,*):");
		char op=scan.next().charAt(0); // 문자열 중에 첫번째에 있는 문자 하나를 추출할 때 // +-*/ => chatAt(1)(0은첫번째자리.1은두번째.2는세번째...)
										// 자바의 단점: char는 받을 수 없다..(문자열)
		// 경우의 수 +, - , / , * , 다른 문자 입력 시 (else)
		if(op=='+')
		{
			System.out.printf("%d+%d=%d\n",num1,num2,num1+2);
		}
		else if(op=='-')
		{
			System.out.printf("%d-%d=%d\n",num1,num2,num1-2);
		}
		else if(op=='*')
		{
			System.out.printf("%d*%d=%d\n",num1,num2,num1*2);
		}
		else if(op=='/')
		{
			if(num2==0)
					System.out.println("0으로 나눌 수 없습니다!!");
			else // \ num2!=0 영이 아니라면
			System.out.printf("%d/%d=%.2f\n",num1,num2,num1/(double)num2);
		}
		else 
		{
			System.out.println("잘못된 연산자입니다!");
		}
	}

}
