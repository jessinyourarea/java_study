/*
 * 중첩 switch / case값 다음에 switch중첩문이 들어감.
 * 			// 특별한 경우가 아니면 거의 사용 빈도가 없음.
 * 
 * 		switch ()
 * 		{
 * 		case 값: 
 * 			switch()
 * 			{
 * 			}
 * 		}
 */
// 가위바위보
/*
 *  경우의 수 : 가위/  가위
 *  			    바위	
 *  				 보
 *  		바위 /  바위	
 *  			   가위
 *  				보
 *  		보	/	가위	
 *  				바위	
 *  				보
 */
import java.util.Scanner;
public class 선택문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 순서: 컴퓨터가 먼저 가위바위보를 설정.
		int com=(int)(Math.random()*3); // 0(가위) 1(바위) 2(보)
		// 사용자 입력.
		Scanner scan=new Scanner(System.in);
		System.out.print("가위(0), 바위(1), 보(2) 입력:");
		int user=scan.nextInt();
		
		switch(com) {
		case 0:
			System.out.println("컴퓨터:가위");
			break;
			// break 밑에 소스 코딩이 있는 경우에 오류 발생. 종료점 다음에 코드가 있으면 안됨!!
		case 1:
			System.out.println("컴퓨터:바위");
			break;
		case 2:
			System.out.println("컴퓨터:보");
			break;
		}
		switch(user) {
		case 0:
			System.out.println("플레이어:가위");
			break;
			// break 밑에 소스 코딩이 있는 경우에 오류 발생. 종료점 다음에 코드가 있으면 안됨!!
		case 1:
			System.out.println("플레이어:바위");
			break;
		case 2:
			System.out.println("플레이어:보");
			break;
		} 
		
		// 비교(처리) => 결과값을 출력
		switch(com)
		{
		case 0: //가위
			switch(user)
			{
			case 0: //가위
				System.out.println("비겼다!!");
				break;
			case 1: //바위
				System.out.println("사용자 WIN!!");
				break;
			case 2: //보
				System.out.println("컴퓨터 WIN!!");
				break;
			}
			break;
		case 1: //바위
			switch(user)
			{
			case 0: //가위
				System.out.println("컴퓨터 WIN!!");
				break;
			case 1: //바위
				System.out.println("비겼다!!");
				break;
			case 2: //보
				System.out.println("사용자 WIN!!");
				break;
			}
			break;
		case 2: //보
			switch(user)
			{
			case 0: //가위
				System.out.println("사용자 WIN!!");
				break;
			case 1: //바위
				System.out.println("컴퓨터 WIN!!");
				break;
			case 2: //보
				System.out.println("비겼다!!");
				break;
			}
			break;
		}
		
		// 변수 설정= 변수에 대한 처리(연산자, 제어문) => 결과값을 출력
		
	}

}
