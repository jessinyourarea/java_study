package com.sist.util;
/*
 	335page
 	컬렉션 => 집합체: 데이터를 묶어서 관리할 수 있게 만든 클래스
 			=> 배열의 단점을 보완
 	컬렉션 프레임워크 (프레임워크 => 표준화)
 	     -------> 모든 개발자가 동일한 형태로 소스코딩
 	     		  소스의 통일화 목적 : Spring, MyBatis,JQuery
 	     		                   VueJS , ReactJS
 				  일정 틀 => 쉽게 다른 개발자의 코딩을 분석 가능하게
 		 = 완전 통일화 : 라이브러리 
    Collection : 데이터 그룹 , 다수의 데이터 => 모아서 관리
    	  		----------------------------------
    	  				> 배열, 클래스
    	  				
    배열의 단점: 고정적/ 배열 크기를 정해놓고 작업하기 때문에
    				데이터 증가/ 감소 시 새로운 배열을 만들어서 처리
    	  			> 보완 위해, 배열을 크게 만들면 메모리 누수현상이 생김.
    	  
    	  <-> 데이터 크기에 맞게 클래스를 제작(가변적) -> 최적화된
    => 컬렉션 : 가변형
    			=> 디폴트 (10개 기준) => 추가되면 자동으로 10개씩...
    			=> 저장 메모리를 결정하지 않는다
    => 종류 
    		Collection
    			|
    	--------------------------------------
    	|					|				|
    	List			  Set				Map	===> Interface
    	 |-구현클래스			|				|
    	 			   ----------		---------------
    	 			   |		|		|			  |
    	 			 HashSet TreeSet   HashMap		HashTable
    	 					
   	-----------------
   	|	     |		|
 ArrayList Vector  LinkedList
 (most freq)   	  				
    	 
    List => ArrayList(비동기) => Vector를 보완한 프로그램 => 데이터베이스 연동
    		Vector(동기화) => 네트워크에서 주로 사용
    		LinkedList => C언어 호환
     List list=new ArrayList();
     list=new Vector();
     list=new LInkedList();
    
    Set => HashSet => 중복없는 데이터 저장
    	   TreeSet => 검색
    Map => HashMap
    	=> HashTable
 	
 	===> List
 		 1) 순서를 가지고 있다 (인덱스) ==> 0부터 시작
 		 2) 저장된 데이터 중복을 허용
 		 3) CURD 프로그램에 주로 사용
 		    ----
 		    Create	Update	Read  Delete
 		    저장		 수정	    읽기	   삭제
 		  Ora)Insert Update Select Delete
 		 4) 비동기화 => 데이터베이스 프로그램 연동 시 사용
 		 5) 주요메소드
 		 	= 데이터 추가 : add(Object)
 		 	= 데이터 삭제 : remove()
 		 	= 데이터 수정 : set()
 		 	= 데이터 읽기 : get()
 		 	= 저장된 데이터 갯수 : size()
 		 	= 전체 삭제 :clear()
 		 	= 데이터 존재여부 확인 : isEmpty()
 		 	= 오라클에서 데이터 읽어서 저장 (List)==>브라우저로 전송
 		6) 구현하고 있는 클래스
 			ArrayList / Vector / LinkedList
 		------------------------------------------------
 		Set
 		1) 정해진 순서가 없다(인덱스 번호가 없음) => 출력시 forEach이용
 		2) 데이터 중복을 허용하지 않는다
 		3) 주로 사용처 => List에 중복된 데이터를 제거할 때 ---코테에 나오기도 함(중복된 데이터 제거 후 출력하라)
 		4) 구현 클래스 : HashSet , TreeSet
 		5) 주요 메소드 
 			= 데이터 추가 : add(Object)
 		 	= 데이터 삭제 : remove()
 		 	= 데이터 수정 : set()
 		 	= 데이터 읽기 : get()
 		 	= 저장된 데이터 갯수 : size()
 		 	= 전체 삭제 :clear()
 		 	= 데이터 존재여부 확인 : isEmpty()
 		-------------------------------------------------
 		Map (웹에서 지원하는 모든 클래스는 Map형식을 가지고 있다)
 		     request, response, session, cookie
 		     new Cookie(key,값)
 		     			--- 얘로 값을 찾는다?
 		     	=> 사용자가 값 3개 보냄 => 데이터가 무슨 값인지 확인하는 기준이 Key
 		     	request.setAttribute("id","hong")
 		     	request.setAttribute("pwd","hong")
 		     	request.setAttribute("sex","man")
 		  => 키와 값을 쌍으로 저장
 		  => 키는 중복으로 허용하지 않는다 , 값은 중복이 가능
 		  	  => 키가 동일할떄는 덮어쓴다
 		  => 사용처 : 웹에서 주로 사용 (클래스 관리, SQL관리 시 많이 사용)
 		  						  ---------  ---------
 		  						 with Spring  with MyBatis
 		  
 		  => 구현된 클래스 : HashMap
 		  => 주요메소드
 		  	 => 저장 : put()
 		  	 => 읽기 : get(key)
 		---------------------------
 		
 			
 */
import java.util.*;
//ArrayList => 사용빈도가 가장 많다
/*
 	=> 배열과 유사 -> 인덱스 번호를 사용한다 => 자동으로 지정
 	=> 순차적이다 (인덱스가 항상 0~~)
 	=> 크기를 지정하지 않는다 (가변형)
 	=> 데이터베이스 연동
 	
 	생성
 	List list=new ArrayList(); => 기본생성자 => 메모리가 10개
 	ArrayList list=new ArrayList();
 	=>> 10개를 넘으면 자동으로 10개 추가...
 
 
 */
public class 라이브러리_List_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList(); // 저장 => 기본 default Object
		//list에는 모든 데이터형을 첨부할 수 있다( 클래스, 기본형..)
		// 가급적이면 같은 데이터형을 첨부하는 것이 관리하기 편리하다
		// list라는 공간 데이터 추가
		// 순서가 존재==> for
		list.add("홍길동"); // index =0			==list[0]="" 
		list.add("박문수"); // index =1
		list.add("심청이"); // index =2  >>> index=3  >> 4
		list.add("춘향이"); // index =3  >>> index=4  >> 5
		list.add("이순신"); // index=5   >>> index=5  >> 6
		list.add(2,"강감찬"); //index=2 ===> 인덱스가 새로 추가되면 다음 숫자로 변경된다
		list.add(3,"을지문덕");  // index=3 > 3부터 다시 다음 번호로 변경
		list.add("박문수"); // index=7
		//자동으로 인덱스번호가 변경된다
		//출력
		// 데이터 추가시 => add()를 이용한다
		// add => 오버로딩
		// add(Object o) , add(int index,Object o)
		// 맨마지막에 추가   					=> 속도가 늦다 (루프를 돌려 인덱스번호를 다시 넣느라 시간걸림)
		// 저장된 갯수 => size() ==> 배열의 length
		for(int i=0;i<list.size();i++)
		{
			System.out.println(i+"."+list.get(i));
		}
		System.out.println("===============삭제 ===================");
		/*
		 	0.홍길동
			1.박문수
			2.강감찬
			//3.을지문덕  ** 삭제
			3.심청이		==> 삭제 시 자동으로 다음 인덱스번호들이 변경된다
			4.춘향이
			5.이순신
		 
		 */
		//list.remove(index) list.remove("홍길동");
		// 실제값을 삭제 => 중복이 있는 경우 전부 삭제
		list.remove(3);
		/* 중간에 생략하는 번호 없이 순차적으로 자동 설정된다
	    0.홍길동
		1.박문수
		2.강감찬
		3.심청이
		4.춘향이
		5.이순신
		6.박문수
		==> 삭제 시에는 이름으로 삭제 요청하면 -> 가장 처음에 있는 이름만 삭제된다 
		*/
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(i+"."+list.get(i));
		}
		System.out.println("============ 수정 ===============");
		// 수정 => set=> set(index번호,변경할 데이터)
		list.set(0, "홍길수");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(i+"."+list.get(i));
		}
		System.out.println("==========저장된 갯수 확인==========");
		System.out.println("인원수:"+list.size());
		System.out.println("============전체 삭제 =============");
		list.clear();
		System.out.println("인원수:"+list.size());
		/*
		 	add(Object o)
		 	set(int index,Object o)
		 	remove(int index0
		 	**Object get(int index)
		 	**int size()
		 	**clear();
		 	
		 */
	}
	

}
