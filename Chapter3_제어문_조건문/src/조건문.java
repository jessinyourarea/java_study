/*
 * 		자바에서 지원하는 제어문 : 반복 / 조건 / 선택 / 반복 제어
 * 		=> 변수/연산자/제어문을 이용해서 프로그램 짜는 것이 기본.
 * 			|  ------------ > 얘네가 메소드
 * 			여러개	
 * 		*** 자바에서 지원하는 모든 제어문은 밑에 있는 명령문만 제어할 수 있다.
 * 			if(조건)
 * 				문장 1 => 제어
 * 				문장 2 => if문과 관련없는 문장
 * 			=> 한 개 이상의 명령문을 수행 시에는 반드시 {} 블록 열고닫기로 묶기.
 * 			if(조건)
 * 			{
 * 				문장 1
 * 				문장 2
 * 			}
 * 		= 조건문
 * 			= 단일 조건문
 * 			  if(조건 => 부정연산자 (!) , 비교연산자 , 논리연산자) => 수행 결과값이 true/false 로만 나옴.
 * 			  {	
 * 					조건이 true일 경우에만 수행하는 문장을 작성/ false라면 해당 문장은 수행되지 XXX
 * 			  }
 * 			= 선택 조건문
 * 			= 다중 조건문
 * 			
 * 		= 선택문
 * 			
 * 		= 반복문
 * 			= while
 * 			= do~while
 * 			= for
 * 				= 일반 for
 * 				= 향상된 for =for-each (웹에서는 핵심적인 제어문)
 * 		= 반복제어문
 * 			= break;
 * 			= continue
 * 		=========================== 응용(연산자를 응용해서) => 54page
 * 
 * 			| start		|			main{ => start			
 * 				|
 * 			| 문장(명령문) |			} => end
 * 				|
 * 			| 문장(명령문) |							| 조건 |
 * 				|										|
 * 			| 문장(명령문) |							| 명령 |	
 * 				|
 * 			| end 평문	|
 * 
 * 
 * 			if 조건문.
 * 				
 */
//	조건문 (단일 조건문) => 예시) 짝수 / 홀수
import java.util.Scanner;

public class 조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		int num=scan.nextInt();		// 
		if(num%2==0) 	// 짝수 조건
			System.out.println(num+"는(은) 짝수입니다.");
			System.out.println("num="+num);	//앞의 if문과 관련없는 문장,
		if(num%2==1)	// 홀수 조건
			System.out.println(num+"는(은) 홀수입니다.");
			System.out.println("프로그램 종료!!");	//if문과 관련없는 문장
	}

}
