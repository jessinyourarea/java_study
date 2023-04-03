/*
 * 		컴퓨터 / 사용자 => 가위바위보
 * 		누가 이겼는지 확인해주는 것
 * 		가정 0-가위, 1-바위, 2-보
 * 
 * 			컴퓨터가 난수(랜덤 0~2)을 발생하고 
 * 			사용자가 입력
 * 			컴퓨터 / 사용자 확인
 * 			이긴자 결과값
 */
import java.util.Scanner;  //입력값을 받을 수 있는 상태로 만들기 위해서는..
public class 삼항연산자_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int com=(int)(Math.random()*3);
		Scanner scan=new Scanner(System.in);
		System.out.println("가위(0),바위(1),보(2) 입력:");
		int user=scan.nextInt(); 	// 사용자 입력값
		//확인
		System.out.println(com==0?"컴퓨터:가위":"");
		System.out.println(com==1?"컴퓨터:바위":"");
		System.out.println(com==2?"컴퓨터:보":"");
		
		System.out.println(user==0?"플레이어:가위":"");
		System.out.println(user==1?"플레이어:바위":"");
		System.out.println(user==2?"플레이어:보":"");
		
		System.out.println("======결과======");
		/*System.out.println(com==0 && user==0?"Same":"");
		System.out.println(com==0 && user==1?"User win":"");
		System.out.println(com==0 && user==2?"Com win":"");
		
		System.out.println(com==1 && user==0?"Com win":"");
		System.out.println(com==1 && user==1?"Same":"");
		System.out.println(com==1 && user==2?"User win":"");
		
		System.out.println(com==2 && user==0?"User win":"");
		System.out.println(com==2 && user==1?"Com win":"");
		System.out.println(com==2 && user==2?"Same":""); */
		
		/*int res=com-user;
		System.out.println(res==0?"Same":"");
		System.out.println(res==-1 || res==2?"User Win":"");
		System.out.println(res==1 || res==-2?"Com Win":"");*/
		
		/*
		 * 		com			user					com-user
		 * 		0(가위)		0(가위)	=> 비김				0	
		 * 					1(바위)	=> user win			-1
		 * 					2(보) 	=> com win			-2
		 * 		1(바위)		0(가위)	=> com win			1
		 * 					1(바위)	=> 비김				0
		 * 					2(보) 	=> user win			-1
		 * 		2(보)		0(가위)	=> user win			2
		 * 					1(바위)	=> com win			1
		 * 					2(보) 	=> 비김				0  			// 1과 -2는 Com Win, 0은 Same, -1,2는 User Win
		 */
	}

}
