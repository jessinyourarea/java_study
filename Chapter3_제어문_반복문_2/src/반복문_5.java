/*
 *  가위바위보 게임
 */
import java.util.Scanner;
/*
 * 	컴퓨터 	 사용자
 * 		가위(0)	가위(0)   0	same
 * 				바위(1)	-1	사용자
 * 				보(2)	-2	컴퓨터
 * 		바위(1)	가위(0)	1
 * 				바위(1)	0
 * 				보(2)	-1
 * 		보(2)	가위(0)	2
 * 				바위(1)	1
 * 				보(2)	0
 * 		비기는 경우 : 0
 * 		사용자	 : -1, 2
 * 		컴퓨터 	 : -2, 1
 * 
 */
public class 반복문_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int win=0,lose=0,same=0;
		while(true)	//while문의 무한루프, 조건이 true일때 수행하고 false면 멈추니까 true가 들어가면 멈추지 않는다.
		{
			System.out.print("가위(0),바위(1),보(2),종료(9):");
			// 컴퓨터가 난수를 발생시켜야하니
			int com=(int)(Math.random()*3); //0,1,2
			int user=scan.nextInt();
			
			if(user==9)
			{
				System.out.println("게임 종료!!");
				//System.exit(0);
				break;	//while문 종료
			}
			
			// 컴퓨터와 사용자의 가위바위보 확인 필요
			if(com==0)
				System.out.println("컴퓨터:가위");
			else if(com==1)
				System.out.println("컴퓨터:바위");
			else if(com==2)
				System.out.println("컴퓨터: 보");

			if(user==0)
				System.out.println("사용자:가위");
			else if(user==1)
				System.out.println("사용자:바위");
			else if(user==2)
				System.out.println("사용자: 보");
			
			//결과값 출력
			switch(com-user)
			{
			case -1: case 2:
				System.out.println("사용자 Win!!");
				win++;
				break;
			case 1: case -2:
				System.out.println("컴퓨터 Win!!");
				lose++;
				break;
			case 0:
				System.out.println("비겼다!!");
				same++;
				break;
			}
			
			
		}
		//while 종료 시점
		System.out.println("=====결과값=====");
		int total=win+lose+same;
		System.out.printf("%d전 %d승 %d패 %d무\n",total,win,lose,same);
	}

}
