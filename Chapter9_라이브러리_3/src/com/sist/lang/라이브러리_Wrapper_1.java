package com.sist.lang;
/*
 Wrapper : 전체를 깜싼다
 ---------- CSS (container)
 프로그램 개발 => 기본형 데이터형을 객체단위로 저장할떄
 
 List<int> -> 오류
     ----- 클래스형
 List<Integer>
 => 기본형을 클래스화해서 사용
    ------------- Wrapper
    
     기본형		 클래스형		=> 기본형에 기능을 추가해서 클래스화시킨것(Wrapper)
     int 		 Integer
     long 		 Long
     byte		 Byte
     double		 Double
     boolean	 Boolean
 */
public class 라이브러리_Wrapper_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="4.3";
		double d=Double.parseDouble(s);
		//사용처 : 문자열을 원하는 데이터형으로 변경할때 주로 사용
		// => 클라이언트에 배포 => 윈도우/브라우저 / 핸드폰 등등으로~~
		// 윈도우 도스는 ======>모든 데이터형이 문자열이라 숫자 등을 구분하지 못한다 => 그래서 기본형 데이터로 변경해서 사용하는 방법
		// 클래스명 : 객체단위로 저장
		// 문자열을 변환 => 해당 데이터형으로 변환=> 형식)parseXxxx -->  static
		// 오토박싱/언박싱 
		/*
		   오토박싱 : 클래스에 해당 데이터값을 설정
		   Integer i=new Integer(10);
		   == Integer i=10;	//클래스 안에 기본 데이터형을 넣는 형태: 메모리할당 대신 
		   언박싱 : 기본형에 클래스 객체를 설정		   
		   int aa=i;
		   
		 */
		Integer i=100; //오토박싱
		System.out.println("i="+i);
		int aa=i; //언박싱
		System.out.println("aa="+aa);
	
		//List<Integer> list=new ArrayList<Integer>();
		/*
		 * 	1.  문자열을 해당 데이터형으로 변환 (기본형의 기능을 부여)
		  		문자열 ==> 정수형	Integer.parseInt("10")
		  		문자열 ==> 실수형	Double.parseDouble("4.3")
		  		문자열 ==> 논리형	Boolean.parseBoolean("true")
		   2. 객체 단위로 저장할 떄가 있다 ** (자료 구조=>Collection)
		   
		   
		  		
		 */
	}

}
