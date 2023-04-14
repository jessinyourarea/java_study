package com.sist.main;
/*
 * 초기화
 * 1. 디폴트 값
 * 	  int => 0 , String => null boolean=> false
 * 2. 명시적 초기화 : 직접 값을 설정
 * 	  class A
 * 	  {
 * 
 * }
 * 3. 생성자초기화
 * {
 * 			int a;a(){}
 * 			
 * 
 * }int a=
 * 
 * 4. 초기화 블록
 * 	class A
 * {
 *  int a;
 *  a==Jsoo
 *  
 * = a=1000
 *  }

 *	디폴트=명시적=> 초기블록=> 생산자
 *  int a=100 int a=1000
 *
 */



/*class Student{
	int hakbun;
	String name;{
	}
	Student (){}
	{hakbun=100;
	}
	Student() {
		hakbun=1000;
	}*/
	
class Student{
	int hakbun;
	String name;
	Student(){
		System.out.println("Student() Call...");
		hakbun=1;
		name="홍길동";
	}				//매개변수 없을 땐 적어놓은 특정 값 1개만 나옴
	Student(int h,String n)	
	{
		hakbun=h;
		name=n;				//매개변수를 여러개 둘수도 있음. 초기값을 다르게 갈 수 있다.
	}
}
public class 생성자_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		System.out.println(s.hakbun);
		System.out.println(s.name);
		
		Student s1=new Student();
		System.out.println(s1.hakbun);
		System.out.println(s1.name);
		
		// 생성자 호출 시에는 new 가 꼭!꼭! 붙여야 호출 가능 ( Student(); XXX/ new Student(); OOO)
		//new Student();
		Student s2=new Student(2,"심청이");
		System.out.println(s2.hakbun);
		System.out.println(s2.name);
		Student s3=new Student(3,"박문수");
		System.out.println(s3.hakbun);
		System.out.println(s3.name);
		
	
	}

}
