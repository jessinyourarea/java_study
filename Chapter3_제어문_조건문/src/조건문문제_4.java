/*
 * 		문제4. 사용자로부터 세 개의 정수를 입력받아, 그 수들의 
 * 		최대값과 최소값, 합계와 평균을 구해보자.
 * 		max min	total avg
 * 
 */
import java.util.Scanner;
public class 조건문문제_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("3개의 정수 입력(10 20 30):");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		
		int total=a+b+c;
		double avg=total/3.0;
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("total="+total);
		System.out.printf("평균:%.2f\n",avg);
		
		// 최대값 
		int max=a;
		if(max<b)
			max=b;
		if(max<c)
			max=c;
		System.out.println("최대값:"+max);
		
		//최소값
		int min=a;
		if(min>b)
			min=b;
		if(min>c)
			min=c;
		System.out.println("최소값:"+min);
		


		
		
	}

}
