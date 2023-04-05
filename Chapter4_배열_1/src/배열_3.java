/*
 * 		3명의 학생, 국어 영어 수학 점수 => 총점 , 평균 , 학점, 등수
 * 		
 * 		2차원 배열
 * 		[3][7]
 * 		학생3명당 7개의 데이터를 가지고 있다 / 웹에서 잘 쓰지 않아서 할 필요 없다.
 */

import java.util.Scanner;
public class 배열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] kor=new int[3];	// 0 1 2
		int[] eng=new int[3];	// 0 1 2 
		int[] math=new int[3];	// 0 1 2 
		
		int[] total=new int[3];
		double[] avg=new double[3];
		char[] score=new char[3];
		int[] rank=new int[3];
		// object[][] student=new objet[3][] ; object는 모든 데이터 통합형
		
		Scanner scan=new Scanner(System.in);
		//성적 입력
		for(int i=0;i<kor.length;i++)
		{
			System.out.print((i+1)+"번째 국어점수 입력:");
			kor[i]=scan.nextInt();
			System.out.print((i+1)+"번째 영어점수 입력:");
			eng[i]=scan.nextInt();
			System.out.print((i+1)+"번째 수학점수 입력:");
			math[i]=scan.nextInt();
			
			total[i]=kor[i]+math[i]+eng[i];
			avg[i]=total[i]/3.0;	
		}
		//학점 계산
		for(int i=0;i<kor.length;i++)
		{
			switch((int)avg[i]/10)		//10으로 나눈 이유:case 숫자를 100>10으로 줄이려고
			{
			case 10:
			case 9:	//avg>=90
				score[i]='A';
				break;
			case 8:
				score[i]='B';
				break;
			case 7:
				score[i]='C';
				break;
			case 6:
				score[i]='D';
				break;
			default:
				score[i]='F';
			}
		}
		//등수 계산	이중포문에 if를 넣음+배열로 3x3=9를 2번으로 끝냄.
		for(int i=0;i<kor.length;i++)
		{
			rank[i]=1;		//i번을 1등으로 지정해놓고,i보다 큰 수가 나올때마다 1+n 시키기
			for(int j=0;j<kor.length;j++)
			{
				if(total[i]<total[j])
				{
					rank[i]++;
				}
			}
			
		}
		
		System.out.println("====================성적표====================");
		for(int i=0;i<kor.length;i++)
		{
			System.out.printf("%-5d%-5d%-5d%-7d%-7.2f%-3c%-5d\n",
					kor[i],eng[i],math[i],total[i],avg[i],score[i],rank[i]);
		}
	}

}
