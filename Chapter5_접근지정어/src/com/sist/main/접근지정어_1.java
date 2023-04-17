package com.sist.main;
/*
 객체지향 프로그램
 1) 구성요소 => 클래스 (모델링)
 2) 3대요소
 	= 캡슐화 : 데이트를 보호( 데이터손실 방지, 변경)
 		= 접근하는 범위 (접근지정어)
 	= 상속/포함: 재사용기법
 	= 오버라이딩/오버로딩 = 다형성 (수정, 추가 가능)
 3) 클래스의 종류
    = 추상 클래스 / 인터페이스
 	= 내부 클래스
 	= 종단 클래스
 	= 공유 클래스
 	--------------------------------------- 객체지향
 4) API : 자바에서 지원하는 클래스 (라이브러리)
 	java.lang
 	java.util
 	java.io
 	java.net
 5) 클래스 조립법 : 사용자 정의 + 라이브러리
 ----------------------------------------------
 
 접근지정어의 종류
			 --------------------------------------------------------------------------------
			  클래스 내에서만 사용	같은 패키지상에서 사용	같은 패키지상에서 사용	   모든 클래스에서 접근 가능
			  (자신의 클래스 내)						 (상속받은 클래스는
			  									  다른 패키지상에서 접근 가능)
------------------------------------------------------------------------------------------------
    private	 			O				X					X						X
   	 은늑화
   (멤버변수多)
   class A
   {
   	private int age;
   }
 ------------------------------------------------------------------------------------------------
 	default				O				O					X						X
 	class A
 	{
 	 int age;
 	}
 --------------------------------------------------------------------------------------
 	protected			O				O					O						X
 	class A
 	{
 	 protected int age;
 	}
 ----------------------------------------------------------------------------------------
 	public				O				O					O						O
 	class A
 	{
 	 public int age;
 	}
 --------------------------------------------------------------------------------------------
 		
 	1) 변수 ==> private
 	2) 메소드 ==> 다른 클래스와 연결(통신수단)  ==> public
 	3) 생성자 ==> public (다른 클래스에서 메모리 할당 후에 사용)
 	4) class ==> public 
 	5) 조립 : 모든 클래스가 연결(변수 제외)
 	    	 변수는 private으로 => 접근 메소드를 통해서 사용
 	    	 --------------은닉화 ==> 캡슐화 과정을 거침
 	    	 1. 변수를 다른 클래스나 자신의 클래스에서 사용
 	    	 	--- 읽기/쓰기
 	    	 	getter / setter			====> page 152
 	    	 	lombok 을 이용하면 자동 지정 가능
 	    	 	
 	
 	    	 	
 */

class Student {
	// 한 명의 학생에 대한 정보를 은닉화
	private int hakbun;
	private String name;
	private int kor,eng,math;
	// 변수에서 읽기 쓰기 기능을 가져올것 ==> Getter Setter 메소드 (오른쪽 마우스클릭> source> generate Getter and Setter)
	public int getHakbun() {
		return hakbun;
	}
	/*
	 	1. 지역변수
	 		메소드 안에 선언변수 , 매개변수
	 	2. 멤버변수
	 	-----------------------저장 위치가 다르다 (변수명이 동일할 수 있다)
	 	class Human
	 	{
	 		String name;		//멤버변수 => 클래스 영역(클래스 전체에서 사용)
	 							  => 다른 클래스에서도 사용 가능. Heap에 저장됨.
	 		public void setName(String name)	
	 		{					----------- 매개변수
	 			int a=10; //지역변수  ==> 저장 메모리공간: stack
	 			==> 지역변수 우선순위
	 			System.out.println(name)
	 			=> 지역변수와 멤버변수가 같은 경우 구분.
	 			 	this (클래스 자신)
	 			 	=> this.name => Human이 가지고 있는 name 변수 라는 뜻.
	 			=> 변수명이 다른 경우
	 				1. 지역변수 찾기 2. 멤버변수 찾기
	 		}
	 	}
	 		
	 
	 */
	public void setHakbun(int hakbun) {
		this.hakbun = hakbun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
}
public class 접근지정어_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1명의 학생정보 저장
		Student hong= new Student();
		//hong => hakbun,name,kor,eng,math 가 생김
		// 1. 변수의 초기값
		//    --------- 생성자 or 직접 대입!?
		hong.setHakbun(1);		//== hong.hakbun=1 
		hong.setName("홍길동");
		hong.setKor(89);
		hong.setEng(90);
		hong.setMath(78);
		
		System.out.println(hong.getHakbun()+" "
				+hong.getName()+" "
				+hong.getKor()+" "
				+hong.getEng()+" "
				+hong.getMath()+ " ");
		/*
		 * 
		 *  캡슐화를 사용하는 이유
		 *  외부에서 잘못된 사용이나 변수에 대한 손상을 방지하기 위해 사용
		 *   => 캡슐화를 사용하기 위해서 만드는 방법 => 접근지정어(private)
		 */
		
	}

}
