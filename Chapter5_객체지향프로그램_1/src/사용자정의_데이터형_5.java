/*
 	
 
 */
import java.util.Scanner;
class Sawon{
	/////	인스턴스 변수 //////// (클래스가 메모리에 저장)
	int sabun;
	String name;//이름
	String dept;//부서
	String job;	//직위
	String loc;	//근무지
	long pay;	//연봉
	
	static String company;	//메모리 공간 1개만 설정=> 컴파일러에 의해 자동 생성 (이게 없으면 각각 변수에 맞춰서 변한다)
							// 같은 공간을 공유하기 떄문에 (static) 바꾸면 모두 바뀐다
							// new없이 사용이 가능
	///////////////////////////
}
public class 사용자정의_데이터형_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sawon.company="KKK";
		// 클래스변수명.변수명 ==> hong.company
		// 클래스명.변수명 ==> Sawon.company
		// 공유변수 , 클래스변수 (클래스명으로 접근 가능)
		// 인스턴스 변수 ==> 인스턴스명.변수
		
		
		
		
		
		Sawon hong=new Sawon();
		hong.sabun=1;
		hong.name="홍길동";
		hong.dept="개발부";
		hong.job="대리";
		hong.loc="서울";
		hong.pay=4500;
		hong.company="ABC";
				
		Sawon shim=new Sawon();
		shim.sabun=2;
		shim.name="심청이";
		shim.dept="개발부";
		shim.job="사원";
		shim.loc="서울";
		shim.pay=3300;
		shim.company="ABC";
		
		Sawon park=new Sawon();
		park.sabun=3;
		park.name="박문수";
		park.dept="개발부";
		park.job="과장";
		park.loc="서울";
		park.pay=6200;
		park.company="ABC";
		
		hong.company="BCD";	// 저장 공간이 1개만 생긴다
		shim.company="CDE";
		park.company="DEF";
		System.out.println("회사명:"+hong.company);
		System.out.println("회사명:"+shim.company);
		System.out.println("회사명:"+park.company);
		 
		// 예) ABC회사가 망했다 > 회사명을 변경해보라> BCD
		hong.loc="부산"; 
		System.out.println("근무지:"+hong.loc);
		System.out.println("근무지:"+shim.loc);
		System.out.println("근무지:"+park.loc);

	}

}
