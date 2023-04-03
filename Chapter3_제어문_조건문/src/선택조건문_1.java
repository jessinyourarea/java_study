/*
 * 			시작													시작
 * 			 |													 |
 * 			 값 	int a=10;										 값
 * 			 |													 |
 * 			조건 a<10												조건
 * 			 |												「-------------ㄱ				
 * 	(true)	출력 System.out.println(a)					if(true) 		else(false)
 * 			 |												ㄴ-------------」	
 * 	(false)	종료														|
 * 																   종료
 *
 *			true/false => 나눠서 처리할 수 있음.
 *
 *			형식
 *				if(조건문) => 조건문 (비교연산자, 부정연산자, 논리연산자)
 *				{
 *					조건문이 true일때 처리하는 문장
 *				}
 *				else
 *				{	
 *					조건문이 false일때 처리하는 문장
 *				}
 * 					=> 예)로그인 여부 (true 로그인성공 false 로그인실패)
 * 						 아이디 중복체크
 * 						메뉴=> 관리자 로그인/ 사용자 로그인
 * 						로그인 처리를 했는지 여부
 * 						------------------------------------------
 * 
 * 				
 * 	
 */
// 알파벳을 하나 받아서 소문자, 대문자인지 나타내기
public class 선택조건문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no= (int)(Math.random()*2); //0,1
		char ch;
		if(no==0)
			ch=(char)((Math.random()*26)+65);
		else
			ch=(char)((Math.random()*26)+97);
		
		if(ch>='A' && ch<='Z')
			System.out.println(ch+"는(은) 대문자입니다!!");
		else
			System.out.println(ch+"는(은) 소문자입니다!!");
	}

}
