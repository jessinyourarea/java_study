package com.sist.main5;
import java.util.*;
//객체지향 => 묶는것이다
/*
 	1. 관련된 데이터를 묶는다
 		배열/클래스
 	2. 관련된 명령문을 묶는다
 		메소드
 	3. 관련된 클래스를 묶는다
 		상속/ 인터페이스(***)
 		=> 하위클래스에서 기능을 추가하면 접근할 수 없다!! like Human/Member/Sawon 상속(sawon에c를 추가해도 메인에 뜨지 않음)
 	----------------------
 	4. 상속
 		접근지정어
 			=> default protected public 상속 가능
 			=> private : 상속은 되지만 but접근이 불가능 > 즉 사용 안됨.. 
 			   						=> 보완한 개념이 protected (같은패키지내including상속)
 		----------
 		제어어
 			=> 변수 : 접근지정어 , static , final
 			=> 메소드 : 접근지정어 , static , final , abstract
 			---------------------
 			=> 생성자 : 접근지정어만 사용한다
 		----------
 		
 
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Human h=new Human();	//객체는 1개만 만들어서, 상위클래스를 줘서 상속된/오버라이딩된 다른 메소드들을 활용
		h.print();
		
		h=new Member();
		h.print();
		
		h=new Sawon();
		h.print();
		*/
		Scanner scan=new Scanner(System.in);
		System.out.println("선택(Human(1), Member(2), Sawon(3)):");
		int select=scan.nextInt();
		
		/*if(select==1)
		{
			Human h=new Human();
			h.print();
			h.aaa();
			h.bbb();
		}
		if(select==2)
		{
			Member h=new Member();
			h.print();
			h.aaa();
			h.bbb();
		}
		if(select==3)
		{
			Sawon h=new Sawon();
			h.print();
			h.aaa();
			h.bbb();
		} */
		Human h=null; //클래스를 여러개 모아서 하나의 이름으로 재정의 하기 위해서: 상속을 사용하면 주 목적
		if(select==1)
			h=new Human();
		else if(select==2)
			h=new Member();
		else if(select==3)
			h=new Sawon();
		
		h.print();
		h.aaa();
		h.bbb();
	}

}
