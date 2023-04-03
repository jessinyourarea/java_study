// 중첩 조건문 = 3개의 정수를 받아서 총점 / 평균 / 학점(A+,A0,A-) 
// 97 A+ 94 A0 ~ A-
import java.util.Scanner;
public class 조건문_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor=0,eng=0,math=0,total=0;
		double avg=0.0;
		char score='A',option='-';
		
		//사용자의 입력값을 받는다
		Scanner scan=new Scanner(System.in);
		System.out.print("세 개의 정수 입력( 90 90 90 )");
		kor=scan.nextInt();
		eng=scan.nextInt();
		math=scan.nextInt();
		
		total=kor+eng+math;
		avg=total/3.0;
		
		int temp=(int)avg; // avg 실수를 정수로 바꿔주기 (계산하기 편할라구)
		if(temp>=90 && temp<=100)
		{
			score='A';
			if(temp>=97 && temp<=100)
				option='+';
			if(temp>=94 && temp<97)
				option='0';
		}
		if(temp>=80 && temp<90)
		{
			score='B';
		}
		if(temp>=70 && temp<80)
		{
			score='C';
		}
		if(temp>=60 && temp<70)
		{
			score='D';
		}
		if(temp<60)
		{
			score='F';
			option=' ';
		}
		
		
		System.out.println("국어점수:"+kor);
		System.out.println("영어점수:"+eng);
		System.out.println("수학점수:"+math);
		System.out.println("총점:"+total);
		System.out.printf("평균:%.2f\n",avg);
		System.out.println("학점:"+score+option);				// -가 안 붇음.. > 해결! 부등호 방향 기억하기
		
	}

}
