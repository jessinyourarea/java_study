/*
 	메소드
 	 1) 구조화된 프로그램 (문장을 기능별로 나눠서 작업)
 	 2) 반복 제거 => Spring(AOP) / 똑같은 코딩을 얼마나 없앨 수 있는가가 가장 핵심
 	 3) 메소드는 한개의 기능만 수행
 	 --------------------------------------------------------------
 	 리턴형 : 처리 후 결과값 ( 한개만 설정이 가능)
 	 매개변수 : 사용자가 요청하는 값 (여러개 보낼 수 있다)
 	 		  => 요청하는 값이 3개 이상이면 [],class로 넘겨서 처리하는게 good
 	 형식)
 	 	 리턴형	메소드명(매개변수...)
 	 	 			   --------  갯수와 상관없다 (사용자 요청값)
 	 	 ----	------ 한 자바파일 안에 모든 메소드명이 달라야 된다(X)
 	 	 			   같은 메소드명이 있을 수 있다(매개변수가 틀리면 된다)
 	 	 요청 결과값 (한개만) ===> 여러개가 나온다면: int[],class
 	 	 
 	 	 ** 사용자가 요청한 값(매개변수)을 받아서 처리 후에 결과값을 보내주거나 화면에 출력
 	 	 *													   ---------
 	 	    --------------------- 입력 , 마우스 클릭 , 버튼 클릭 ...		|
 															 결과값이 없는 상태를 void라고 한다
 															 
 		 정수 두 개를 보내고 더한 값을 받는다
 		   => return a+b;
 		   	 System.out.println("a+b="+(a+b))
 		 단을 보내고 해당 단의 구구단을 출력
 		   => 써야할게 많으니, 자체출력이 편하다
 		   	  
 		 main메소드에서는 가급적이면 => 연결(변수선언X)
 		 
 		 
 		 
 
 */
// void 사용 
// 구구단 => 단을 입력 받아서 => 자체에서 출력 가능하게 만들기

import java.util.Scanner;
public class 메소드_1 {
	static void gugudan(int dan)
	{
		for(int i=1;i<=9;i++)
		{
			System.out.printf("%d*%d=%d\n",dan,i,dan*i);
		}
	}
	
	static void process()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("단을 입력:");
		int dan=scan.nextInt();
		
		gugudan(dan);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();				//main에 변수명을 입력하지 않고, 메소드 1개만 호출하면 바로 값이 나오도록 프로그래밍하는 것이 point!!!!
	}

}
