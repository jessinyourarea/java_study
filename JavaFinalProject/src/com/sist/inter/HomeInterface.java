package com.sist.inter;
import java.util.List;

import com.sist.manager.GenieMusicVO;
/*
 	인터페이스 => 기능 설계
 	=> 미완성 클래스 (메모리 할당을 할 수 없다)
 	=> 변수 : 상수형 변수
 	=> 메소드 : 추상 메소드
 	=> 다중상속 available
 	=> JDK 1.8
 		=> 구현 메소드가 가능하다
 			default , static
 		=> 인터페이스는 추상 클래스(단일상속/다중상속 구분)
 		=> 상속은 extends , 구현은 implements
 	=> 목적 ---> 면접 단골
 		표준화가 가능하다 (메소드 구현은 다를 수 있다, 메소드명이 동일)
 		----
 		관련된 클래스 여러개를 모아서 관리할 목적
 		독립적으로 사용 가능
 	=> 형식
 		public interface InterfaceName
 		{
 			(public static final) int a=10;			==> 괄호 안은 생략! 상수형 변수
 			(public abstract) void display();		==> 괄호 안은 생략!
 				구현?
 				(public) default void aaa()
 				{
 				}
 		}
 		===> 사용하기 위해서는 상속을 내리고 하위 클래스를 통해서 메모리를 할당 후 사용
 		interface A
 		class B implements A
 		
 		=> A a=new B();
 		=> Collection
 		   List list=new ArrayList()
 		   Map map=new HashMap()
 	
 	
 */

public interface HomeInterface {
	public void cardPrint(List<GenieMusicVO>list);
	public void cardInit(List<GenieMusicVO> list);
}
	