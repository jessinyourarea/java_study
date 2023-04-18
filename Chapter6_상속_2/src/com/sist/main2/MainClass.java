package com.sist.main2;
/*
 	오버라이딩 : 재정의
 		= 변수 오버라이딩 : 변수명이 동일
 		= 메소드 오버라이딩 : 메소드명이 동일
 		------------------------------
 		
 				오버로딩			오버라이딩 ===> 다형성
 ---------------------------------------------
   클래스 관계		같은 클래스		상속관계
 ---------------------------------------------
   메소드명		동일 				동일
 ---------------------------------------------
   리턴형			관계없음			동일
 ----------------------------------------------
   매개변수		갯수,데이터형 다름	동일
 ----------------------------------------------
   접근지정어		관계없음			확장
 ----------------------------------------------
   목적 			새로운 기능 추가 	기존기능을 수정
 ----------------------------------------------
  => 오버라이딩은 메소드를 변경하는 것이다(204page)
  
 */
class Human{
	int a=10;
	// super=> object
}
class Student extends Human{
	int a=20;
	public Student()
	{
		this.a=100;
		int a=30;
		System.out.println("a="+a); 		// 지역 변수
		System.out.println("a="+this.a);	// Student의 변수
		System.out.println("a="+super.a);	// Human의 변수
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
	}

}
