/*
 * 	do~while문 => 후조건이라 무조건 1번은 수행 가능하다.
 * 		
 * 		1. 초기화
 * 		2. 게임
 * 		3. 형식)
 * 				초기값			-----1
 * 				do
 * 				{
 * 					반복 실행문장  -----2
 * 					증가식		-----3
 * 				}while(조건식); => 증가된 변수로 조건검색
 * 
 * 	
 */

import java.util.Scanner; //= java.util.*; => *은 java.util.안에 있는 모든 클래스를 다 불러오는 것.
public class 반복문_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1~10까지 출력
		int i=1;
		do
		{
			System.out.print(i+" ");
			i++;
			// i=2 ... i=10 i=11(종료)
		}while(i<=10);
		System.out.println("\n=====================");
		Scanner scan=new Scanner(System.in);
		System.out.print("단 입력:");
		
		int dan =scan.nextInt();
		i=1;
		do
		{
			System.out.printf("%2d*%2d=%2d\n",dan,i,dan*i);   //printf "%2d" "%-2d" 앞(+)의 공간을 띌건지, 뒷(-)공간을 띌건지 정할때. (일정 간격을 띌 때 사용하는 형식)
			i++;
		}while(i<=9);
		System.out.println("====================================");
		i=10;
		for(i=10;i<10;i++)
		{
			System.out.println("i="+i);
		}
		System.out.println("=============while=================");
		i=10;
		while(i<10)
		{
			System.out.println("i="+i);
			i++;
		}
		System.out.println("=============do~while==============");
		i=10;
		do
		{
			System.out.println("i="+i);
			i++;
		}while(i<10);
	}
	

}
