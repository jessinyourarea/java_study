package com.sist.main;
/*
 	1. 제어어
 	-------
 	1) static : 공통적인
 		=> 예) Math 의 모든 메소드는 static으로 되어있음
 		
 	2) final : 마지막 => 변수(상수)/class(종단 클래스=>확장불가, 상속할 수 없음)
 		=> class final ClassName
 		   = System,String,Math,StringBuffer => 있는 그대로 사용해야함(상속X확장X)
 		   	 java.lang의 대부분은 final
 	3) abstract : 추상적인 => 공통점을 모아서 프로그램에 맞게 구현함.
 	-------------------------------------------------------------------------
 	= 클래스의 종류 
 	  1) 추상 클래스
 	  	 형식) 
 	  	 	  public abstract class ClassName
 	  	 	  {
 	  	 	  ---------------------------------------------
 	  	 	   1. 변수(멤버변수)
 	  	 	  -----------------------------------------------
 	  	 	   2. 메소드 : 구현된 메소드
 	  	 	  -----------------------------------------------
 	  	 	   3. 메소드 : 구현되지 않은 메소드(선언만 한 상태)
 	  	 	      => 자신이 메모리할당 불가능
 	  	 	      예)
 	  	 	      	 abstract class A
 	  	 	      	 {
 	  	 	      	 }
 	  	 	      	 A a=new A();===> 오류(구현안되어있어서)
 	  	 	      	 그럼 어떻게 활용? > 상속을 받아서 구현 안 된 메소드를 구현 후에 사용
 	  	 	      	 => 오버라이딩
 	  	 	      	 class B extends A
 	  	 	      	 {
 	  	 	      	 }
 	  	 	      	 A a=new B(); => 묵시적 형변환(자동형변환)
 	  	 	      	     ------- a가 가지고 있는 메소드는 B로 대체
 	  	 	      	 B b=new B();
 	  	 	  -------------------------------------------------
 	  	 	   4. 생성자
 	  	 	  -----------------------------------------------
 	  	 	  }
 	  2) 인터페이스 : 추상 클래스의 단점을 보완
 	  			1. 자바 단점인 단일 상속을 보완해 => 다중 상속을 하기 위해
 	  			2. 추상 클래스의 일종 (클래스를 내리는 것은 상위 클래스)
 	  			3. 구성요소 //생성자 음슴
 	  			public interface InterfaceName
 	  			{
 	  				--------------------------------
 	  				 변수 설정
 	  				 	상수형 변수
 	  				 	int a;==>오류
 	  				 	int a=10; ==>정상
 	  				 	=> 컴파일 시
 	  				 	public static final int a=10; 으로 변경됨.
 	  				 	-------------------
 	  				 	   자동 추가된다.
 	  				--------------------------------
 	  				 메소드
 	  				 	구현되지 않은 메소드
 	  				 	void display();
 	  				 	=> 컴파일 시
 	  				 	public abstract void display();
 	  				 	---------------
 	  				    자동 추가된다( 기본적으로 public을 생략하고 있음)
 	  				    문제점)
 	  				    	interface A
 	  				    	{
 	  				    		(public abstract) void display();
 	  				    	}
 	  				    	class B implements A
 	  				    	{
 	  				    		(default) void display() ==> 오류: !오버라이딩 조건 오류!
 	  				    		{								정상 수행하려면?==> public void display()로 변경해야함
 	  				    		}
 	  				    		=> 접근지정어가 축소 되었기 때문. public>default
 	  				    	}
 	  				    	** 인터페이스 안의 모든 메소드와 변수는 모두 public
 	  				    	** 다른 접근지정어를 쓰면 오류남 
 	  				--------------------------------
 	  				 	구현된 메소드 (JDK 1.8이상부터 사용됨)
 	  				 메소드 => 인터페이스에 선언된 메소드를 추가하게 되면 관련된 모든 클래스가 오류 발생
 	  				 	default void methodName()
 	  				 	------- 명시적으로 안 쓰면 public이 자동 추가됨(생략된 상태)
 	  				 	{
 	  				 	}
 	  				--------------------------------
 	  				 	구현된 메소드
 	  				 메소드
 	  				 	static void methodName()
 	  				 	------
 	  				 	public이 자동 추가됨(생략된 상태)
 	  				 	{
 	  				 	}
 	  				 	== public static void methodName()
 	  				--------------------------------
 	  			}
 	  			*** 추상클래스, 인터페이스는 상속을 받는 경우
 	  				반드시 선언만 된 메소드를 구현해서 사용한다 => 구현 안하면 !오류!
 	  			*** 추상클래스 : 입출력,네트워크,데이터베이스연결 등에 사용
 	  			*** 인터페이스 : 윈도우 이벤트 처리
 	  							버튼 클릭, 마우스 클릭, 키보드...
 	  3) 내부클래스(네트워크, 빅데이터)
 	  		멤버클래스 : 쓰레드 => 데이터를 공유할 목적으로 만듦
 	  		형식)
 	  			class A(Server)
 	  			{
 	  			  A,B,C,D,E => 변수나 메소드
 	  			  class B(통신)	=> A클래스에서 사용하는 변수나 메소드를 다 갖다쓸 수 있음 
 	  			  {
 	  			  	 A , B, ... //각자 다른 일을 할 수 있도록 만들어준 상태, 멤버 클래스
 	  			  }
 	  			} 
 	  		익명의 클래스 : 상속이 없는 상태로 오버라이딩이 가능하게 만드는 기능
 	  		형식) 
 	  			class A
 	  			{
 	  				B b=new B(){
 	  					void display(){}
 	  				}
 	  			}	
 	  			class B
 	  			{
 	  				void display(){}
 	  			}
 
 */
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
public class MainClass extends JFrame{
	
	

	

}
