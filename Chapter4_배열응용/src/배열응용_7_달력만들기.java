/*
 * 		달력 해당 달의 1일 요일을 가장 먼저 찾은 후,
 * 					
 */

import java.util.Scanner;
public class 배열응용_7_달력만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("년도 입력:");
		int year=scan.nextInt();
		
		System.out.print("월 입력:");
		int month=scan.nextInt();
		
		System.out.println(year+"년 "+month+"월");
		System.out.println("\n");
		char[] strWeek= {'일','월','화','수','목','금','토'};
		for(char c:strWeek)
		{
			System.out.print(c+"\t");
		}
		System.out.println();
		// 1. 1년도 1월 1일 부터 ~ 전년도 (2022.12.31)
		int total=(year-1)*365
				+(year-1)/4
				-(year-1)/100
				+(year-1)/400;
		// 2. 전달까지의 날수(2023.03.31)
		int[] lastday= {31,28,31,30,31,30,
				31,31,30,31,30,31}; 	//각 달의 마지막 날짜
		if((year%4==0 && year%100!=0)||(year%400==0))
		{
			lastday[1]=29;				//윤년은 마지막 날짜가 29일.
		}
		for(int i=0;i<month-1;i++)
		{
			total+=lastday[i];
		}
		// 3. +1 ==> (2023.04.01 의 요일)
		total++; 	//1더함
		
		// 요일 구하기
		int week=total%7;
		
		// 달력 출력
		for(int i=1;i<=lastday[month-1];i++)
		{
			if(i==1)		//맨처음
			{
				for(int j=0;j<week;j++)
				{
					System.out.print("\t");
				}
			}
			System.out.printf("%-2d\t",i);
			week++;
			if(week>6)
			{
				System.out.println();
				week=0; //한줄 띄우고 일요일로 와라
			}
		}
	}

}
