package com.sist.main;
/*
 	 상속이 있는 경우 => 객체 생성 방법
 	 묵시적 타입 변환: 오른쪽의 데이터가 왼쪽보다 크기가 작으면 자동으로 묵시적 타입변환을 처리한다
 	 
 	 class A
 	 class B extends A
 	 
 	 	A (상위클래스)
 	 	↑
 	 	B (하위클래스)
 	 	==> 크기 (범위) 상위 >하위
 	 	    -------- 상속 , 포함
 	 	    A > B
 	 	    ----- 
 	 	A a=new A();
 	 	A b=new B();
 	 	B c=new B(); 
 	 	B d=new A(); ==> !!오류!! 
 	 	B e=(B) new A(); ==> !오류!
 	 	** 그럼 형변환은 어떻게 할까?
 	 	like (int)10.5 
 	 	
 	 	상속
 	 	1. 형식
 	 	   class A extends B => 단일상속
 	 	2. 클래스 크기
 	 	   상속을 내리는 클래스 > 상속을 받는 클래스
 	 	3. 형변환
 	 	   작은 클래스 = 큰 클래스를 받을 때
 	 	4. 자바의 최상위 클래스 => Object
 	 	5. 상속의 예외 : static=> 공유, 초기화블록, 생성자, private 접근이 안됨
 	 	-----------------
 */
class Human
{
	int a=10;
	int b=20;
	static int c=30;
	public void display()
	{
		System.out.println("Human:display() call...");
	}
}
class Student extends Human
{
	int d=40;
	int e=50;
	//오버라이딩 =매개변수 같고, 메소드 같고, 리턴형 같아야함.
	/*
	 1. 상속 => 재정의
	 2. 메소드명 동일
	 3. 매개변수 동일
	 4. 리턴형 동일
	 5. 접근지정어는 확장 가능/축소 불가능(오류)
	 */
	public void display()
	{
		System.out.println("Student:display() call...");
	}
}
public class MainClass_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//클래스명과 생성자가 다른 경우
		/*
		 * 클래스명 변수명=new 생성자()
		 * -----           ------
		 * Human h2=new Student();
		 * 1) 변수 제어 ==> 클래스 파일을 따라감 Human
		 * 2) 메소드 제어 ==> 생성자를 따라감 Student
		 */
		Human h=new Human(); // a,b,c
		h.display();
		Student s=new Student(); // a,b,c,d,e
		s.display();
		Human h2=new Student(); // ****** a,b,c
		h2.display();
		//Student s2=new Human(); ==> 오류!!
		//Student s2=(Student)new Human();
		Student s2=(Student)h2;	// ***** 생성자가 동일해야만 형변환이 가능하다
		s2.display();
		
		//Student s3=(Student)h; ClassCastException => 형변환 오류
		
		// 사용범위 ==> 상위 클래스는 하위 클래스의 추가된 내용에 접근이 불가능하다
		// 변수 접근 => 선언된 클래스에 등록 변수까지만 접근 가능
		// 실제 상속 => 라이브러리(윈도우, 데이터베이스 상속)
		
	}

}
