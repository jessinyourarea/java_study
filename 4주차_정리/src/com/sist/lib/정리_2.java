package com.sist.lib;
/*
 	제네릭 (JDK 1.5에 도입 시작)
 	 => JDK 1.8 (호환성) - 17버전(Spring-Boot)/ 14버전(SpringFrame)
 	 
 	 1. 제네릭이 도입된 이유 
 	 	1) 컬렉션(ArrayList,Set,Map)의 데이터형(매개변수,리턴형)이 Object로 되어있음.
 	 		그래서 반드시 형변환 후 사용해야함. 
 	 		오류 발생이 많다 => 모든 데이터형을 사용할 수 있다 => 방지
 	 	2) 데이터형을 통일화 할 수 있음 , 데이터 타입의 안정성을 위해서 데이터형을 고정.
 	 	3) 데이터형을 명시화하기 때문에 가독성이 좋다
 	 		List<Object> list=new ArrayList<Object>(); ==> 가독성이 떨어지는 상태
 	 		    -------- Object형은 생략 가능.==default
 	    	List<String> list=new ArrayList<String>();
 	    	    -------- 				   -------- 				
 					|--------- 데이터형 일치 --------|
 			*** 기본형은 사용할 수 없다 ==> Wrapper
 		=> 데이터형을 모르는 경우 (와일드 카드)
 		   List<?> list=new ArrayList<String>(); 
 		   	   ---	 ==> 뒤에 들어오는 데이터형에 맞춰서 바뀌는 형식! 
 		  예) 
 		  	 class Box<T> => 임시 클래스 (temporary class) == default T=> Object
 		  	 {
 		  	 }
 		  	 Box<String> => Object -> String으로 바뀜 : 매개변수와 리턴형을 변경해줌.
 		  	 <>안에는 라이브러리만 첨부하는 것이 아니고 사용자정의 클래스 첨부 가능
 		  	 Box<MovieVO> ...
 		  	 임시제네릭
 		  	 -------
 		  	 T => 임시 데이터형 (클래스형) type
 		  	 	  e.g. 사용자 정의 제네릭
 		  	 E => 임시 데이터형 (클래스형) element
 		  	 	  e.g. ArrayList<E> , Vector<E> , LinkedList<E>
 		  	 K => key (클래스형) 
 		  	 V => value (클래스형)
 		  	 	  e.g. Map<K,V>
  ---------------------------------------------------------------------------------------
  
  		Iterator
  			hasNext() , next() , remove()
  		ListIterator
  			hasNext() , next() , remove(), hasPrevious()
  			순서가 없는 경우 주로 사용 Set,Map
  		ArrayList => for(index를 가지고 있다)
  		
  			  	 	
 */
import java.util.*;
public class 정리_2 {
	public static void main(String[] args) {
		/*List<String> list=new ArrayList<String>();
		//초기화 : 값을 첨부
		list.add("사과");
		list.add("배");
		list.add("수박");
		list.add("딸기");
		list.add("바나나");
		// 일반 출력 with for-each
		for(String f:list)
		{
			System.out.println(f+" ");
		}
		System.out.println();
		System.out.println("==========Iterator==========");
		// 출력이 어려운 경우 => 단방향
		Iterator<String> it=list.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+"	");
		}
		System.out.println();
		System.out.println("==========재출력==============");
		while(it.hasNext())
		{
			System.out.println(it.hasNext());
		}*/
		//ListIterator = List 안에서만 사용이 가능
//		List<?> list=new ArrayList<Integer>();
//		List<String> list1=new ArrayList<String>();
//		list1=new ArrayList<Integer>();
		
//		List<?> list=new ArrayList<String>();
//		list.clear();	//와일드카드 이용 후 데이터형 추가 전 리스트를 clear 하는 게 좋다.
//		list=new ArrayList<Integer>();	//와일드카드를 이용하면 데이터형을 바꿀 때 유용함.
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
	/*	
			list.add(5);
		for(int i=0;i<list.size();i++)
		{
			System.out.print(list.get(i)+" ");
		}
		System.out.println("\n=============================");
		for(int i=list.size()-1;i>=0;i--)
		{
			System.out.print(list.get(i)+" ");
		}		*/
		
		ListIterator<Integer> it=list.listIterator();
		while(it.hasNext())
		{
			System.out.println(it.next()+" ");
		}
		System.out.println("\n=================");
		while(it.hasPrevious())
		{
			System.out.println(it.previous()+" ");
		}
		
	}
}
