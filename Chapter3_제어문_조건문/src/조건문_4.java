/*
 * 		54page
 * 		단일조건문
 * 		1.형식
 * 		if(조건문)
 * 		{
 * 			수행문 => 조건이 true일 경우에만 수행이 가능
 * 		}
 * 		=> {}블록이 없는 경우에는 바로 다음의 한 개의 문장만 수행. 
 * 		=> 여러 개를 동시에 제어 시에는 반드시 {}블록을 사용한다.
 * 		
 * 		2. if 중첩 조건문
 * 		if(조건)			=====> if (조건 && 조건)
 * 		{
 * 			if(조건)
 * 			{
 * 			}
 * 		}
 */
// 계산기 만들기 (사측연산만 가능한)   ==> 1. 정수2개, 2, 연산자 3. 

import java.util.Scanner;
public class 조건문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("첫번째 정수 입력:");
		int num1=scan.nextInt();
		System.out.print("두번째 정수 입력:");
		int num2=scan.nextInt();
		System.out.print("연산자를 입력(+,-,*,/):");
		char op=scan.next().charAt(0); // 문자열을 받아서 char를 한개 가져오는 메소드
		
		System.out.println("num1="+num1);
		System.out.println("num2="+num2);
		System.out.println("op:="+op);
		
		//계산기
		if(op=='+')
		{
			System.out.printf("%d+%d=%d\n",num1,num2,num1+num2);
		}
		if(op=='-')
		{
			System.out.printf("%d-%d=%d\n",num1,num2,num1-num2);
		}
		if(op=='*')
		{
			System.out.printf("%d*%d=%d\n",num1,num2,num1*num2);
		}
		if(op=='/')
		{
			if(num2==0)
				System.out.println("0으로 나눌 수 없습니다");					// 이 조건을 달지 않으면 0으로 나눌 수 없기 때문에 오류로 프로그램이 비정상 종료된다.
			if(num2!=0)
				System.out.printf("%d/%d=%d\n",num1,num2,num1/num2);			//중첩조건문 (if문 안의 if문)
		}
	}

}
