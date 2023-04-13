package com.sist.main;	// 패키지는 한번만 사용. 항상 가장 위에 위치함.
// 폴더개념 => 관련된 클래스/java파일을 저장 => 클래스 찾기 용이하게 하는 목적
// 다른 패키지의 클래스를 불러올때는 반드시 import 사용.
// import java.util.*; import java.io.*; import java.net.*;
//import com.sist.main.클래스구성요소_1; (패키지가 다른 경우 항상 import를 붙여서 가져와야 함)
//import com.sist.main.* ; (이 패키지 안에 있는 모든 클래스를 다 가져와라)
//import java.util.*;
//주의점: 키워드는 사용할 수 없다 (대소문자 구분, 소문자 권장)
// 숫자를 앞에 사용할 수 없다
// com.sist.class X com.sist.public X com.sist.int X => 오류
// 다른 패키지에서는 같은 이름의 클래스를 만들 수 있다

/*
 	=> 두번째 구성요소는 메소드.
 		메소드 => 접근방식 .을 이용한다
 		 = 인스턴스 메소드 : static이 없는 메소드 => 메모리에 따로 저장 되는
 		  */

//클래스의 분리
/*
  	클래스
  	 = 데이터형 
  	 = 액션(동작) =>메소드만
  	 -------------------
  	 
  	 1. 데이터형
  	 2) 데이터 처리 기능 
  	 3) 조립 클래스 제작 => 항상 main에 위치. => 컴퓨터로 치면 메인보드~.~
  	 
  	 --------------------------------------------------------------------
  	 메소드 => 140
  	 1. 메소드의 구성요소
  	 리턴타입(결과값) 메소드명(매개변수 -> 요청데이터) => 선언부
  	 --------------- 데이터형 일치해야함
  	 {
  	 	구현부
  	 	return 결과값
  	 		   -----
  	 }
  	 
  	 리턴타입 : 사용자가 요청한 내용을 처리 후에 결과값의 데이터형
  	          1) 결과값이 있는 경우
  	          2) 결과값이 없는 경우 => void
  	          리턴타입 /  return 값은 항상 일치하지는 않는다
  	          -----     --------
  	          항상 리턴타입이 결과값보다 크거나 같아야 한다
  	          	예) ---    ----
  	          	   int     10.5   => 오류
  	          	   double   10    => 정상수행
  	          3) 리턴타입이나 결과값은 1개만 나온다
  	              ** 여러개일 경우 : 배열 , 클래스를 이용한다
  	              
  	            예)int[] display()
  	             {
  	             	int[] arr=new int[5];
  	             	return arr;
  	             }
  	             
  	             = int[] arr=display();
  	               int[] arr=new int[5];
  	               int[] arr2= arr;
  	               
  	              String display()
  	              {
  	                String s="Hello";
  	                return s;
  	              }
  	              
  	              리턴형 : 기본형, 배열, 클래스 (사용자 정의 데이터형)
  	              return int => 10...
  	             		 double => 10.5
  	             		 char -> 'A'
  	             		 배열 => 배열명(주소)
  	             		 int[] arr=new int[5];
  	             		 return arr;
  	             		 클래스=> 객체명(주소)
  	             		 A a=new A();
  	             		 return a;
  	        매개변수 : 사용자 요청값
  	           getView(int page) //int page에 해당 되는 걸 보여달라 고 요청
  	           findData(String s/사용자 입력값=매개변수)
  	           login(String id, String pwd)	 
 */
class Student// 데이터를 모아서 데이터형처럼 사용한다 ( 그냥 int라고 생각하고 사용해보기) 
{
	int hakbun;
	String name;
	String sex;
	int kor;
	int eng;
	int math;
}

	 class StudentSystem {
		 Student getData()	{
				Student s=new Student();
				s.hakbun=2;
				s.name="심청이";
				s.sex="여자";
				s.kor=90;
				s.eng=90;
				s.math=100;
				
				return s;
			}
		}
	 /*
	  *int getHakbun() { return 1; } String getName() { return "홍길동"; } String getSex() { return "남자"; } int getKor() { return 90; } int
	 * getEng() { return 80; * } int getMath() { return 78; }
	 */
public class 클래스구성요소_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentSystem ss=new StudentSystem();
		Student shim=ss.getData();
	}	
		
		/*//Student hong=new Student(); hong.hakbun=ss.getHakbun(); hong.name=ss.getName(); hong.sex=ss.getSex();
		 * hong.kor=ss.getKor(); hong.eng=ss.getEng(); hong.math=ss.getMath();
		 */ 
		
		
		
	

}
