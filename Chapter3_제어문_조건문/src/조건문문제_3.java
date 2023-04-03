/*
 * 		문제3. 1학년부터 4학년까지 중간고사 시험을 보았다. 
         4학년은 70점 이상이면 합격, 그 이외의 학년은 60점 이상이면 합격이다. 
         이를 판단하는 프로그램을 작성해보자.
         점수가 0미만 100초과이면 경고문구 출력!

		변수 1학년 2학년 3학년 /4학년
		/ 항상 if문을 어떻게 처리할건지 고민하고 시작하기.
		 * 
 * 
 */
import java.util.Scanner;
public class 조건문문제_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("학년을 입력하시오(1):");
		int grade=scan.nextInt();
		System.out.print("점수를 입력하시오(80):ㅣ");
		int score=scan.nextInt();
		if(score>100 || score<0)
			System.out.print("잘못된 입력입니다!!!");
		else
		{
			if(grade==4)
			{
				if (score>=70)
					System.out.print("합격입니다");
				else
					System.out.print("불합격입니다");
			
			}
			else
			{
				if (score>=60)
					System.out.print("합격입니다");
				else
					System.out.print("불합격입니다");
			}	
		}
	}

}
