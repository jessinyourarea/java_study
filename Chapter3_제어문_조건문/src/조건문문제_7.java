/*
 * 		문제7. 정수 3개를 입력받아서 총점과 평균을 구하고 학점을 구하는 프로그램
        작성 ( 90이상이면 A,80이상이면 B, 70이상이면 C,60이상이면 D, 
        나머지는 F)
 		
 		double[] limit= {50,60,70,80,90};
 *		String[] grade={"F","D","C","B","A"};
 *		int[] score={100,
 *		ChoiceFormat form=new ChoiceFormat(limit,grade);
 *		for(int i=0;i<score.length;i++)
 *		{ system.out.rpintln(score[i]+":"+form.format(score[i]))
 *		}	
 
 */
import java.util.Scanner;

public class 조건문문제_7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("점수 3개 입력(1 2 3):");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		int total=a+b+c;
		double avg=total/3.0;
		System.out.println(total);
		System.out.printf("평균:%.2f \n",avg);
		
		int temp=(int)total/3;
		char ch='A';
		if(temp>=90 && temp<=100)
			ch='A';
		if(temp>=80 && temp<90)
			ch='B';
		if(temp>=70 && temp<80)
			ch='C';
		if(temp>=60 && temp<70)
			ch='D';
		if(temp<60)
			ch='F';
		System.out.println("학점:"+ch);
	}

}
