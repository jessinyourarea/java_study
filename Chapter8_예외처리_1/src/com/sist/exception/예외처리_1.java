package com.sist.exception;
/*
 * 	에러=> 컴파일(javac) / 실행시 (interpreter=java)
 * 		  -----------    -----------------------
 * 			check			Uncheck => 생략 가능
 * 			 |					
 * 			자바문법(반드시 예외처리)
 * 	에러
 * 		= 수정이 불가능한 에러 (=심각한 오류) : e.g. 메모리가 부족함, 윈도우 덤프
 * 		   Error
 * 		= 수정 가능한 에러 (=가벼운 오류) : 소스 안에서 수정 가능한 정도
 * 		 							e.g. 파일명이 틀리다(파일읽기) , 배열 인덱스를 벗어난다,
 * 										 웹 연결 시 URL주소가 틀리다
 * 		   Exception (예외처리)
 * 	 에러가 발생하는 경우
 * 		1. 프로그래머의 실수
 * 			=> 초기화값이 없는 상태에서 비교 
 * 			=> 배열인덱스 오류
 * 			=> 무한 루프
 * 			=> 파일명 오류 ... 
 * 		2. 사용자 입력 오류
 * 			=> 계산기 나누기를 0과 함께 사용
 * 			=> 정수에 문자열을 입력한 경우 (웹에서 유효성 검사)
 * 
 * 	예외처리하는 이유는? : 견고한 프로그램을 만들기 위해 사용
 * 					  ----------- : 비정상을 방지하고 정상상태 유지하는
 * 							    기능) 사전에 에러를 방지하는 프로그램
 *   1. 예외처리 방식
 *   	= 고려사항 : if문 =>예외처리
 *   	= 예외처리 : 복잡한 에러, if문으로 해결할 수 없을때
 *   	   웹: 404, 500(소스오류), 415(한글변환), 400(값을 잘못 받았을떄=bad request), 403(접속거부) ...
 *   		   404: 파일이 없는 경우 
 *   2. 예외처리 종류
 *   	= 예외 발생 시 => 복구할때
 *   	  try~catch
 *   		형식)	
 *   			try	
 *   			{
 *   				정상수행하는 문장
 *   				int a=10;
 *   				int b=0;
 *   				double d=a/(double)b;	==> 0으로 나누면 !오류!==> catch로 이동!
 *   				System.out.println(d);	(수행X)(컴백 없음)
 *   			}catch(Exception e)
 *   			{	
 *   				예외 발생 시 처리하는 영역 
 *   			}
 *   			
 *  			특정 오류
 *  			catch(NumberFormatException e){}
 *  			catch(ArrayIndexOutOBoundsException e){}
 *  			catch(나누기..)  {}
 *  			기타 모든 오류를 catch(Exception e){}
 *   	
 *   			사용자로부터 문자열을 받아서 정수로 변경 후에 
 *   					 -----잘못 입력했을때
 *   			배열에 저장
 *   			--------배열인덱스를 잘못 줫을때
 *   			나누기를 한 후에 출력
 *   			---------0으로 나눌까봐
 *   			
 *   			
 *   			
 *   	= 예외 발생 시 => 회피할때(건너뛰기)
 *   	  throws
 *      = 예외발생 시키기 =>테스트할때 
 *        throw
 *      = 사용자 정의 예외
 *        => 지원하지 않는 예외가 존재
 *      
 *      예외처리의 계층구조
 *        Object
 *      	|
 *      Throwable
 *      	|
 *      -------------------------
 *      |						|
 *     Error				Exception
 *     							|
 *     				----------------------------
 *     				|							|
 *     	    CheckException (←실존클래스아님→) UncheckException
 *     				|→반드시 예외처리				| →필요시에만 사용
 *     									RuntimeException
 *     											|
 *     									 NumberFormatException
 *     										문자열을 정수형으로 변경 오류  =====> 사용자가 정상값을 입력한다는 가정 하에 예외처리를 하지 않아도 된다(하지만 잦은 경우 하는것도 괜춘)
 *     										(예) page=1 ==> page= 1 (띄어쓰기 하나도 정수로 반영)	
 *     									 NullPointerException
 *     										=> 객체 초기화가 안된 상태
 *     										=> 참조할 주소가 없는 경우(선언)
 *     									ArrayOutOfBoundsException
 *     										=> 배열 범위 초과시 발생
 *     									ArithmeticException
 *     										=> 0으로 나눌 경우
 *     									ClassCastException
 *     										=> class형변환이 틀린 경우
 *     									IllegalArgumentException
 *     										=> 부적절한 인자 전달
 *     									IndexOfOutBoundsException
 *     										=> 문자열 관련
 *     			IOException (입출력) 
 *     				=> 메모리 입출력 , 파일 입출력 , 네트워크 입출력 
 *     				java.io=>클래스가 동일
 *     			SQLException(오라클 연동 시 사용)
 *     				java.sql=> 네트워크 통신
 *     				자바응용프로그램 <=====> 오라클
 *     					(C)				 (S)
 *     				  Client			Server
 *     				=>웹에 출력하는 모든 데이터가 오라클에 저장된다
 *     				=>자바  ================  오라클
 *     						오라클이 인식하는 언어를 전송(SQL)
 *     						SELECT * FROM 테이블명
 *     			ClassNotFoundException ==> 클래스명이 틀린 경우
 *     			Class.forName("패키지.클래스명")
 *     
 *     			....
 *     			MalformedURLIOpil
 *     				=> URAL주소가 틀린 경우
 *     			InterruptedException
 *     				=> 쓰레드 충돌
 *     
 *     263page
 *     예외 의미: 프로그램에서 돌발적으로 (의도하지 않은 상황에서) 문제가 발생했을 때
 *     							  -------------- 
 *     			처리를 어떻게 할지 			예외
 *     			=> 프로그램은 에러 시에 비정상으로 종료함, 이를 방지하고 
 *     				정상적으로 종료 가능하게 만드는 과정 (==예외처리)
 *     
 *     			
 *     
 */	
class BBBBB
{
	
}
class CCCCC extends BBBBB
{	
	public void disp(int a,int b,int c)
	{
		System.out.println("1");
	}
	public void disp(int a,char b,byte c)
	{
		System.out.println("2");
	}
	public void disp(int a,char b,int c)
	{
		System.out.println("3");
	}
}
public class 예외처리_1 {
	static String s;	//null
	static A a;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ss="Hello Java!!";
		System.out.println(ss.substring(ss.indexOf("K"),ss.lastIndexOf("J")));
		
		//a.display();
		CCCCC cc=new CCCCC();
		cc.disp('A', 10, 'B');
		System.out.printf("%d %c %s\n",10,65,"30");
		System.out.println(10/0);
		System.out.println("1");
		int[] arr=new int[2];
		//arr[2]=10;
		if(s.equals("Hello"))
		{
			System.out.println("OK");
		}
		System.out.println("2");
		int a=10;
		int b=0; // 사용자로부터 값을 받았을 떄
		// 처리
		if(b!=0) //정상수행	==> try
		{
			int c=a/b;
			System.out.println("c="+c);
		}
		else // 예외처리 ==> catch
		{
			System.out.println("0으로 나눌 수 없습니다");
		}
		//int c=a/b;
		//System.out.println("c="+c);
		
		//1. 정상적으로 종료가 되게 만든다.
		//2. 우선적으로는 if문으로 처리 가능한지 여부 =>안된다면, 자바에서 제공하는 예외처리를 이용한다
		//3. if는 주로 => 검색용도 , 사용자 입력 제한... 등에서 사용한다
		// 예외 처리 필요한 예시: Thread.sleep(100); int i=System.in.read();
		String page=" 1";
		System.out.println(Integer.parseInt(page));
		
		
		
		
		
		
		
		
		
		
		
	}

}
