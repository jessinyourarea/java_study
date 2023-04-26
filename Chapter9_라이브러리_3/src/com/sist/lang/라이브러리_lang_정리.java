package com.sist.lang;
/*
 	java.lang => 기본 ( 가장 많이 사용되는 클래스의 집합)
 	---------- import를 생략할 수 있다
 	 Object : 최상위 클래스 => 모든 클래스는 Object를 상속한다
 	 		  --------- 데이터형으로 사용(가장 큰 데이터형)
 	 		  Object o=10
 	 		  o=10.3
 	 		  o=""
 	 		  o='A'
 	 		  o=true
 	 		  o=new 클래스()
 	 		  ------------ 여러 개의 데이터형을 묶어서 관리
 	 		  Object[] oo={10,10.4,'A',"aaa" ...} 
 	 		  => 라이브러리에서 제공하는 메소드는 
 	 		  	  1)리턴형 2) 매개변수 둘 다==> 대부분 Object를 사용한다
 	 		  	  => 그래서 상황에 맞게 형변환이 필요하다 **중요**
 	 		  	  	=> 형변환 -> 제네릭스 (리턴형과 매개변수를 변경할떄 사용하는 기능)
 	 		  	   기본형 = 클래스	(언박싱)  ===!!
 	 		  	   클래스 = 기본형 (오토박싱)
 	 		  	   
 	 		  => 기능
 	 		  	 1) clone	:  복제(새로운 메모리를 만든다)
 	 		  	 2) toString : 객체를 문자열화
 	 		  	 3) finalize : 소멸자
 	 		  	 4) equals : 비교 (기본=> 주소값, 실제값 비교시 오버라이딩 해야함)
	 	 String : 문자열 저장 클래스
	 	 		 기능 
	 	 		 length()
	 	 		 substring()
	 	 		 trim()
	 	 		 charAt()
	 	 		 replace()
	 	 		 equals()
	 	 		 startsWith()
	 	 		 equalsIgnoreCase()
	 	 		 contains()
	 	 		 indexOf()
	 	 		 lastIndexOf()
	 	 		 valueOf()
	 	 		 
	 	 StringBUffer : append() 문자열 결합
	 	 Wrapper
	 	 	기본형을 클래스화 시킨 클래스 집합
	 	 	-------------------------
	 	 		int			Integer
	 	 		long 		Long
	 	 		double		Double
	 	 		boolean		Boolean
	 	 	-------------------------> 기본형을 객체형으로 저장 , 문자열을 기본형으로 변환
	 	 	 정수 변경 할때는 Integer.parseInt()
	 	 	 실수 변경 할때는 Double.parseDouble()
	 	 	 논리 변경 할떄는 Boolean.parseBoolean()
	 	 Math : 수학 
	 	 	= random() : 난수발생 (0.0~0.99 사이의 수)
	 	 	= ceil() : 올림메소드 => 사용처 : 총 페이지 구하기
	 	 	= round() : 반올림 => 사용처 : 평균, 통계
	 	 System
	 	 	= System.currentTimeMillis() : 실제 소요 시간 => long 
	 	 	   사용처 : 로그파일 => 웹
	 	 	= System.gc() : 가비지 컬렉션 호출 (메모리 회수)
 	 	 	= System.out : 화면 출력 시 (outputStream)
	 	 	= System.in : 키보드 입력값 받을 때, 파일 받을떄 (inputStream)
	 	 
 */
import java.util.*;
public class 라이브러리_lang_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list=new ArrayList();
		//List<String> list=new ArrayList<String>(); ==> Generics 데이터형과 매개변수를 String으로 받겠다고 설정.
		list.add("aaa");
		list.add(1);
		String a=(String)list.get(0);
		int b=(int)list.get(1); //<- 언박싱  | Integer == int 최근 버전에는 int도 호환 가능! 
		// Integer i=10 int i=10 (선언은 같지만, Integer은 (메소드)기능을 포함하고 있다.) 오토박싱.
		
	}

}
