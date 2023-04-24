package com.sist.lib;
/*
 	1. java.lang
 		Object: 모든 클래스의 상위 클래스(모든 클래스는 Object 로 상속을 받는다)
 		기능(메소드)
	 		= toString() : 자주 사용된다, 객체를 문자열화 시킨다
	 					=> 오버라이딩 자주 된다
	 	    = clone() : 객체 복제 시 사용( 참조 X ) ==> prototype
	 	    		참조 : 같은 메모리를 이용 (얕은 복사)
	 	    		복제 : 다른 메모리를 제작 (깊은 복사)
	 	    = finalize() : 소멸자 함수(호출되면 메모리 해제)
	 	    = equals() : 객체 비교 
	 	String : 문자열 저장하고 관리하는 클래스
	 	기능(메소드)
	 		= equals() : 문자열을 비교할 때 사용
	 		== 주소값 비교 시 
	 		  e.g. 로그인처리 , 상세보기 , 아이디중복체크 , 비밀번호비교 ...
	 	    = startsWith : 시작문자열이 같은 경우
	 	      => 오라클 : 'A%'
	 	    = endsWith : 끝나는 문자열이 같은 경우
	 	      => 오라클 : '%A'
	 	    = contains : 포함된 문자열(가장 많이 사용)
	 	      e.g. 추천
	 	    = replace : 문자나 문자열을 변경할때
	 	      단점..) 
	 	    = replaceAll : 문자나 문자열을 변경할때(차이: 정규식을 이용함 => 문자열의 형태)
	 	      [0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}
	 	    = trim : 좌우의 공백 제거
	 	    = split : 특정 단어별로 나눠서 저장 => String[]
	 	    	=>  StringTokenizer
	 	    = valueOf :  모든 데이터형을 문자열로 변경
	 	    = length : 문자의 갯수를 가져올 때
	 	    = substring : 문자열을 자르는 경우에 사용
	 	StringBuffer , StringBuilder ...
	 	Wrapper : 기본형을 클래스화 시켜주는 
	 	 	Byte , Integer , Double , Boolean , Float , Long ...
	 	System
	 	Math
	 	Thread
	 	 ---------------------------------java.lang은 import를 생략할 수 있다는 장점!
 	2. java.util
 		Data/Calendar
 		StringTokenizer
 		Collection (자료구조) => 메모리상에 있는 데이터를 쉽게 관리
 			|
 	---------------------------------
 	|				|				|
 	List			Map			   Set(interface) -> HashSet/TreeSet
 	|			  -> HashMap/HashTable
 	ArrayList
 	Queue LinkedList
 	Vector
 	Stack
 	
 	2-1. java.text
 	3. java.io
 	4. java.net
 	5. java.sql 
 	------------------  기본코스 ~~
 	6.  javax.xml
 	7. javax.servlet.http
 	8. 외부 라이브러리 (자바에서 지원하는 것이 아니라 업체에서 지원)
 	   ==	Open API ==> JSoup, simple-json : mvnrepository.com
 	   org.
 	   com.
 	   
 	----------1. DB (MyBatis,Hibernate(JPA)
 			  2. XML,JSON(VueJS,Ajax,React)
 			  3. 프레임워크 : Spring / Spring-Boot / Struts
 			  ***JSP(deprecated) ==> instead HTML=ThymeLeaf
 			  
 			  현대 -> Spring-Boot / React
 			  삼성 -> Spring-Boot / VueJS
 */
class A
{
	int a=10;
	int b=20;

@Override
public String toString() {
	// TODO Auto-generated method stub
	return "a="+a+" b="+b;
}

}
public class 라이브러리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A aa=new A();
		System.out.println(aa.toString());
		System.out.println(aa);	//aa.toString 이 생략된 형태
	
}
}