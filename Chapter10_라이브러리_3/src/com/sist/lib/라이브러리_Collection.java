package com.sist.lib;
/*
   컬렉션 프레임워크
   ============
  1. 다수의 데이터를 쉽고 효율적으로 처리할 수 있게 만든 표준화된 클래스의 집합
  					-------------------
  2. 데이터 => 수정,삭제,추가,읽기 (자료구조)
  3. 배열 => 정적 메모리 할당 (데이터 추가가 어려움)
  	  ---> 동적 메모리로 바꿔서 할당해주는 (추가가 쉬워짐)
  	  	   ----------------------추가될 때마다 자동으로 메모리 추가
  4. 컬렉션의 종류
  	 = 순서가 존재하고, 데이터 중복허용
  	 	List (인터페이스)
  	 	  |
  	 	ArrayList , Vector , LinkedList
  	 = 순서가 없고 데이터 중복을 허용하지 않는다
  	    Set
  	     |
  	   HashSet , TreeSet(검색)
  	   ------사용처: 웹 채팅, List에서 중복된 데이터 추출
  	 = 먼저 들어온 데이터를 먼저 출력
  	   Queue(FIFO) , Stack(LIFO) => 코테
  	   순서적으로			뒤에서
  	   <Queue>
  	   for(int i=0;i<arr.length;i++)
  	   {	
  	   	  값 설정
  	   }
  	   for(int i=0;i<arr.length;i++)
  	   {	
  	   	  출력
  	   }
  	   <Stack>
  	   for(int i=arr.length-1;i>=0;i++)
  	   {	
  	   	  값 설정
  	   }
  	 =key-value 동시에 저장
  		Map (인터페이스)
  		 |
  		HashMap , HashTable
  		-----HashTable의 단점을 보완
  --------------------------------------------------------
  		전체 상속도
  		Collection
  		    |
  	 ------------------------------------------------------
  	 |							|					|
  	List						Set				   Queue	 Map
 	  |																					
*---- ArrayList			   ---- HashSet					  ---- HashMap	*
 ---- LinkedList		   ---- TreeSet
 
 ---- Vector
 		| - (상속)
 	  Stack
  ---------------------------------------------------------
  	1. List
  	   중복 데이터를 저장해야할떄, 저장순서는 인데긋(순서적으로 저장)
  	   인덱스번호가 항상 0번부터 순차적으로 유지
  	   -----------------------------
  	  => 구현클래스
  	  ArrayList 
  	  ---------
  	  1. 단방향 포인터를 가지고 있다 , 조회하기 편리하다(성능이좋다)
  	  2. 검색이 빠르다 , 데이터 추가시 속도가 빠르다
  	  3. 단점) 수정, 중간에 추가, 삭제에 속도가 느려진다
  	  	----------------------------------LinkedList
  	  4. 변경, 삭제가 없는 상태에서 주로 사용
  	  	 --------------------------------- 데이터베이스(오라클)
		  데이터베이스가 핵심인 프로그램 => 웹
	  LinkedList
	  ----------
	  1. 양방향 포인터를 가지고 있다 
	  2. 주 사용처는 수정,삭제,추가가 많은 경우에 사용 한다
	  3. 단점은 검색 속도가 느린 편이다
	  
	  Vector : 유지보수 good
	  ------
	  1. 대용량 데이터 처리 => 채팅, 서버연결
	  					 ------------- 동기
	  2. 
	  3. 비동기화 보완된 프로그램이 => ArrayList / 요즘은 Vector보다 ArrayList를 주로 씀
	  
	  ***데이터는 반드시 구분이 되기 만들어야한다
	  예시)
	  hong1 홍길동 남자  (e.g. 로그인아이디 == 구분자)
	  hong5 홍길동 남자
	  hong2 홍길동 남자
	  
	2. Set
  	   순서가 없다 (인덱스 번호가 없다) => 그래서 데이터 중복을 허용하지 않는다
  	   => 장르별 / 부서별  ...
  	   => 데이터베이스 이용
  	     중복없는 데이터 => DISTINCT
  	   => HashSet에 처음 구현됨 => 속도가 빠름.
  	   => TreeSet => 정렬되어있는 상태( 정렬할 필요 없음), 검색 속도가 빠른편.
  	   
  	3. Map
  	   구분자를 써서 찾기 활용
  	   주 사용처: 웹에서 주로 사용, 클래스를 관리, 도서목록, 우편번호 등
  	   => HashMap => Key,Value를 동시에 저장
  	   => HashTable => HashMap보다 속도가 느리다 (그래서 주로 HashMap을 쓴다)
  	   
  	   Set클래스 (인터페이스)
  	   -------------------
  	   		Collection
  	   			|
  	   		Set	--------인터페이스
  	   		 |
  	   	-------------
  	   	|			|
  	   HashSet	  TreeSet
    => HashSet
   1)순서가 없다(인덱스 무존재)
   2)데이터중복을 허용하지 않는다
   3)주요메소드 
   	 데이터 저장: Add() => Object
   	 삭제 : remove(Object)
   	 전체삭제 : clear()
   	 isEmpty() : 빈공간(데이터 존재여부 확인)
   	 저장 갯수 : size()
   	 데이터를 한번에 모아서 관리 : iterator
   	
    =>TreeSet : 검색용으로 주로 사용
    			LIKE , REGEXP_LIKE(오라클)
    = headSet
    = tailSet
    
   	 
   	 
   	  */
import java.util.*;
public class 라이브러리_Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set=new HashSet();
		set.add("A"); //add(Object o)
		set.add("B");
		set.add("C");
		set.add("D");
		///////////////// 중복된 데이터는 허용하지 않는다
		set.add("A");
		set.add("B");
		set.add("C");
		
		//출력
		for(Object obj:set)
		{
			//for-each구문은 형변환이 안된다 
			String s=(String)obj;
			System.out.print(s+" "); // A B C D  중복된 값은 출력하지 않았다== 저장되지 않았다
		}
		
		
	}

}
