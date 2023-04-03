/*
 * 
 * /*Web 개발/호스팅(AWS) 운영체제와 고정ip를 빌ㄹ려서 (PaaS)
		java/Oracle/HTML/CSS/JavaScript/
						-------------------------> Spring/MyBatis/JPA
		Java: 데이터 관리
		Oracle: 데이터 저장(공유)
		HTML/CSS: 브라우저에서 인식하는 언어
		JavaScript: 동적(클라이언트)
		*/
/*
 * 	성적 계산하는 프로그램 => Rank, 정렬 ...
 *  3개의 정수를 받아서 평균을 구해서 -> 등급을 출력
 *  다중 조건문 사용
 * 	
 * 	>=90
 * 	>=80
 * 	>=70
 * 	>=60
 * -------else(<60)
 */

import java.util.Scanner;
public class 다중조건문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);	
		// System.in 키보드 입력값을 받음. 받은 후 메모리에 저장하는 역할을 수행함.
		// 정수를 받을 떄: nextInt(), 실수: nextDouble(), 논리: nextBoolean(), 문자열: next()
		// chat는 존재하지 않는다.
		//Scanner는 도스창에서만 사용이 가능하다. window나 web에는 사용X
		System.out.print("세 개의 정수 입력(10 20 30):");
		int kor=scan.nextInt();
		int eng=scan.nextInt();
		int math=scan.nextInt();
		int avg=(kor+eng+math)/3;
		
		System.out.println("국어점수:"+kor);
		System.out.println("영어점수:"+eng);
		System.out.println("수학점수:"+math);
		
		System.out.println("총점:"+(kor+eng+math));
		System.out.printf("평균:%.2f \n",(kor+eng+math)/3.0);
		
		//학점 계산
		char score='F'; // 값 변경이 없는 경우= default
		if(avg>=90)
			score='A';
		else if(avg>=80)
			score='B';
		else if(avg>=70)
			score='C';
		else if(avg>=60)
			score='D';
		else // 생략이 가능
			score='F';

		System.out.println("학점:"+score);

	}

}
