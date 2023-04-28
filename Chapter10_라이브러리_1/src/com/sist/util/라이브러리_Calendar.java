package com.sist.util;
/*
 	라이브러리
 		= 자바에서 지원
 		  java.lang , java.util , java.io , java.net , java.text
 		  java.sql
 		  => 웹 : javax.xml , javax.servlet ...
 		= 외부업체에서 지원
 		  Jsoup(HTML parser) , 셀레니움
 		  MyBatis , Spring , DBCP ...
 		= java.lang
 		  => Object , String ,System , Math , StringBuffer
 		  = import 생략
 		  = Object => 최상위 클래스 , 모든 데이터형을 받을 수 있다
 		    저장 => 일반 기본형 , 사용자정의 클래스 => 기본적으로 Object 설정
 		    주로 형변환시켜 적용 
 		    => 주요 기능
 		    	clone() : 복제(새로운 메모리 생성) => 디자인 패턴(GOF 23)
 		    	finalize() : 소멸자(자동호출 => 메모리해제)
 		    	toString() : 객체를 문자열화
 		    	equals() : 객체비교(기본은 객체의 주소값)
 		    = System : gc() garbage collection
 		    			System.out , System.in => 표준 입출력
 		    = Math : 수학
 		    		 = round() : 반올림
 		    		 = ceil() : 올림
 		    		 = random() : 난수 (임의의 수 추출)
 		    = StringBuffer : 문자열이 많은 경우 (제어)
 		    		 = append() :  문자열 결합
 		    		 = delete() :  문자 제거
 		    		 = insert() : 문자열 추가 
 		    	      ----------------------->  이 3가지는 String에 존재하지 않는다
 		    = String : 문자열을 쉽게 제어가 가능하게 만든 클래스 
 		    		   => 웹 , 윈도우 , 빅데이터(AI)
 		    		   => equals() , trim() , substring()
 		    		   	  length() , valueOf() , contains()
 		    		   	  startsWith() , split() , replace() , replaceAll() 
 		= java.util : 사용빈도가 많다
 			= StringTokenizer() : 
	 			= hasMoreTokens()
	 			= countTokens()
	 			= nextToken()
	 			
 			= Wrapper : 기본형을 클래스화 (기능을 수행)
 			------------------------
 			 	Integer => int
 			 	Double => double
 			 	Boolean => boolean
 			 	Long => long 
 			 	-------------------------parseInt(), parseDouble()
 			     						 parseBoolean(), parseLong()
 			     				=> 웹은 무조건 데이터가 String
 			     						 	String
 			     			    => 요청  =====> 요청처리(응답)
 			    기본형/Wrapper는 호환
 			    Integer i=10 ===> 실제값(리터럴) 대입
 			    -------------------------오토박싱(박싱)
 			    int a=new Integer(10) ==> 기본형에서 클래스 객체값을 받는다
 			    -------------------------언박싱
 			= Random
 				=> nextInt(int bound)
 				   nextInt(10) //0~9
 		    = Arrays : 배열을 쉽게 관리할 수 있다
 		    	=> sort() : 정렬
 		    	=> toString() : 배열 출력
 		    	=> asList() : List형 변환
 		    = 날짜 관련
 		    	=> Date : 기능이 거의 없으나, 다른 프로그램과 호환성이 좋음
 		    			  (e.g.오라클 MySQL에서 전송된 날짜 데이터를 받는 경우)
 		    			  날짜 저장용으로 주로 사용
 		    	=> Calendar : 날짜에 대한 기능이 필요 시 사용
 		    				  Date를 보환한 클래스
 		    				  날짜 설정
 		    				  = set() => 년도/월/일/시간/분/초 설정
 		    				  = get() 
 		    				  = 요일 읽기 -> get(Calendar.DAY_OF_WEEK)
 		    				  = 각 달의 마지막 날
 		    				    getActualMaximum() 
 		          = 배열을 대체 
 		              THIS IS 
 		             <컬렉션!!>												==> 3대 클래스 : String , Integer , List
 		             : 데이터를 쉽게 관리할 수 있게 만들어주는 기능
 		               -> 크기에 맞게 자동으로 저장공간이 설정
 		             		Collection
 		             		    |
 		            -------------------------------------------------
 		            |						|						|
 		           List					   Set					   Map
 		           	|						|						|
 		         (0)ArrayList			(0)HashSet				 (0)HashMap
 		           Vector				  TreeSet				   HashTable
 		    	   LinkedList-Queue
 		    	   ===> 제네릭스
 			     	
 			     
 */
//Calendar 응용
import java.util.*; // calendar / Scanner 포함
public class 라이브러리_Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사용자로부터 년도/월 받아서 예약/체크인,체크아웃
		Scanner scan=new Scanner(System.in);
		System.out.println("년도 월 입력(2023 4):");
		int year=scan.nextInt();
		int month=scan.nextInt();
		
		//1일자의 요일을 가지고온다(4=> 4월 1일)
		
		Calendar cal=Calendar.getInstance();
		// 추상클래스는 미완성클래스(메소드 구현 안된 상태)
		// 구현할 클래스를 이용한다 , 싱글턴 (newInstance(), getInstance())
		/*
		 	static => 클래스명.메소드명()
		 	Math.random() 
		 	클래스명 객체명 =new 생성자()
		 	-----            -----
		 			같으면 일반 클래스
		 			다르면 추상 클래스 or 상속 or 인터페이스
		 	클래스명 객체명=메소드() => 추상 클래스
		 */
		
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1); //month 0~11이므로 (만으로 세는 듯)
		cal.set(Calendar.DATE, 1);
		
		//요일 구하기
		int week=cal.get(Calendar.DAY_OF_WEEK)-1;	//Week는 1번부터 시작하기 때문에 -1해서 인덱스 세기
		//입력달의 마지막날 구하기
		int lastday=cal.getActualMaximum(Calendar.DATE);
		
		//달력 출력하기
		String[] strWeek={"일","월","화","수","목","금","토"};
		System.out.println(year+"년도 "+month+"월");
		System.out.println("\n");
		for(String s:strWeek)
		{
			System.out.print(s+"\t");
			
		}
		System.out.println();
		for(int i=1;i<=lastday;i++)
		{
			if(i==1) //공백을 설정
			{
				for(int j=0;j<week;j++)
				{
					System.out.print("\t");
				}
			}
		
			System.out.printf("%2d\t",i);
			week++;
			if(week>6)
			{
				week=0; //일요일 설정
				System.out.println(); // 다음줄에 출력
			}
		}
		
	}

}
