/*
 * 	숫자 야구게임
 *	1. 컴퓨터 => 임의의 숫자 3개 발생	(1~9까지 중복없는 난수)
 *	(예) 3 6 9 
 *	2. 사용자 => 숫자 입력해서 발생된 난수를 맞추는 게임
 *	3. 힌트
 *	   2 9 6 
 *	   ----- 0S-2B (S는 같은위치 같은숫자/ B는 다른위치 같은숫자)
 *	   3 7 8 
 *	   ----- 1S-0B
 *	   3 9 8 
 *	   ----- 1S-1B 
 *	   3 6 9 
 *	   ----- 3S-0B 
 *			종료!!!!!
 */

import java.util.Arrays;
import java.util.Scanner;
public class 배열응용_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] com=new int[3];		// 난수(랜덤), 저장
		int[] user=new int[3];		// 입력받아야하는 수
		for(int i=0;i<com.length;i++)
		{
			com[i]=(int)(Math.random()*9)+1;	//난수 발생!
			for(int j=0;j<i;j++)	// 중복 없이 만드는!
			{
				if(com[i]==com[j])
				{
					i--;
					break;
				}
			}						
		}																	// 컴퓨터의 난수 발생
																			// 자주 나오는 코드는 메소드화하면 다시 입력할 필요없이 재사용 가능!
		// System.out.println(Arrays.toString(com));
		// 사용자가 입력하기 시작~
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			System.out.print("세자리 정수 입력:");
			int input=scan.nextInt();
			if(input<100 || input>999)
			{
				System.out.println("잘못된 입력입니다!!");
				continue;	//처음부터 다시 수행 ↑ if 이전의 while문으로 돌아가
			}
			//세자리 정수를 입력했다면~
			user[0]=input/100;		// input369 => 3
			user[1]=(input%100)/10;	// input369 => 69/10 => 6
			user[2]=input%10;		// input369 => 9
			
			//1. 같은 정수를 입력하면 안된다
			if(user[0]==user[1]||user[1]==user[2]||user[2]==user[0])
			{
				System.out.println("중복된 수는 사용할 수 없습니다");
				continue;	//
			}
			
			//2. 0을 포함할 수 없다
			if(user[0]==0||user[1]==0||user[2]==0)
			{
				System.out.println("0은 사용할 수 없습니다");
				continue;
			}
						
			// 힌트 준비
			int s=0,b=0;
			for(int i=0;i<com.length;i++)
			{
				for(int j=0;j<user.length;j++)
				{
					if(com[i]==user[j])
					{
						if(i==j)	//i와j는 인덱스 번호! 자리 확인을 위해 사용함.
							s++;	//같은 자리에 있는지?
						else
							b++;	//다른 자리에 있는지?
					}
				}
			}
			//힌트 제공
			//System.out.printf("Input:%d,Result:%dS-%dB\n",input,s,b);
			// 종료 시점 == S=>3
			System.out.println("===================");
			System.out.print("S:");
			for(int i=0;i<s;i++)
			{
				System.out.print("●");
			}
			System.out.print("\nB:");
			for(int i=0;i<b;i++)
			{
				System.out.print("○");
			}
			System.out.println("\n===================");

			if(s==3)
			{
				System.out.println("Game Over!!");
				break;							// while문 종료!!
			}
		}
		
		
	}

}
