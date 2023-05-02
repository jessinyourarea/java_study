package com.sist.util;

import java.util.ArrayList;
import java.util.Collections;

//List의 메소드
/*
 	 add,remove,set,size,clear
 	 ------------------------- 기본 메소드
 	 containsAll() => 두개의 list에서 중복된 데이터를 모아서 관리
 	 	=> JOIN
 	 retainAll => 두개 list에서 중복된 데이터만 남기기
 **	 addAll => 데이터 전체 복사
 	 subList => 부분적 데이터를 복사할 경우에 사용 
 	 -------------------------주 사용처: 장바구니 예매
 	 						  ------ 중복구매
 */
public class 라이브러리_List_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		list.add(3); //0
		list.add(5);
		list.add(7);
		list.add(6);
		list.add(9);
		list.add(2);
		list.add(1);
		list.add(4); //7
		//출력
		for(Object i:list)
		{
			System.out.println(i);
		}
		// 일부만 추가
		ArrayList list2=new ArrayList(list.subList(1, 4)); // index 1~ 4되기전까지 즉,3 
		list2.add(10);
		list2.add(11);
		list2.add(12);
		
		System.out.println("=================");
		for(Object i:list2)
		{
			System.out.println(i);
		}
		System.out.println("=================");
		// sort
		Collections.sort(list);
		for(Object i:list)
		{
			System.out.println(i);
		}
		System.out.println("=================");		
		//같은 데이터가 있는지 없는지~
		System.out.println(list.containsAll(list2));
		for(Object i:list)
		{
			System.out.println(i);
		}
		//중복된 데이터만 추출=intersect == 교집합
		System.out.println(list.retainAll(list2)); //같은 수가 있는지
		for(Object i:list)
		{
			System.out.println(i);
		}
		ArrayList list3=new ArrayList();
		System.out.println("=================");		
		
		list3.addAll(list);	//카피뜨기
		for(Object i:list3)
		{
			System.out.println(i);
		}
		
		
	}

}
