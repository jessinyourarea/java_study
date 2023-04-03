/*
 * 		1. if~else if(다중 조건문)과 switch는 유사한 제어문.
 * 			= if~else if: 범위가 있는 경우 주로 사용
 * 			= switch: 한 개가 선택될 경우 ( 웹에서는 많이 사용하지 않는다. 겜이나 앱에서 많이 씀)
 * 		2. switch에서 문법 사항
 * 			= switch에서 처리할 수 있는 데이터형(char, String, 정수)
 * 			= case 값:
 * 				   ----
 * 			= 종료 시에는 break;
 * 			= default는 생략 가능.
 * 			= 여러개를 같은 문장으로 처리 시 
 *			  case 10:
 *			  case 9:
 *			  case 8:
 *			     처리문장		==? no==10 || no==9 || no==8
 *
 */
public class 선택문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month=(int)(Math.random()*15)+1; // (1~15)
			System.out.println("month="+month);
		switch(month)
		{
		case 1: case 2: case 12:
			System.out.println("겨울입니다");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("봄입니다");
			break;
		case 6: case 7: case 8:
			System.out.println("여름입니다");
			break;
		case 9: case 10: case 11:
			System.out.println("가을입니다");
			break;
		default:
			System.out.println("해당 계절이 아닙니다");
		}
	}

}
