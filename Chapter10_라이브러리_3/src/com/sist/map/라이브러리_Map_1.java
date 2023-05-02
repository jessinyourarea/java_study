package com.sist.map;
/*
 	Map ==> 인터페이스
 	 |
   ------------------
   |				|
   HashTable	HashMap(****)
   특징) 
   	=>	두개를 동시에 저장할 수 있음! (key와 value)
   		(단 key는 중복할 수 없다)
   		("id","hong")
   		("id","shim") ===> 사용불가 ㅣ key의 중복
   		------------> 만일 id값을 가지고 온다면 shim을 가져옴(hong은 덮어써서 값없어짐)
   		("id1","hong")
   		("id2","hong") ===> 사용가능 ㅣ value의 중복은 관계없음
   	=> 사용처 : 웹에서 제공하는 모든 클래스는 Map형식
   	   HttpServletRequest
   	   	request.setAttribute("key","value")
   	   HttpServletResponse
   	   HttpSession
   	   Cookie
   	=> 스프링 , 마이바티스 => Map형식
   	   ----	  -------SQL ("all","SELECT * FROM emp")
   	   클래스 등록
   	   ("a",new A())
    => 저장 / 읽기
       ----------
       저장 : put("key","값")
       읽기 : get(key)
       -------------------- JSON , Properties
       => 데이터는 구분자를 필요로 한다
       			----
       			ArrayList => 구분자를 인덱스 번호로
       			Set 	  => 데이터 중복 없이
       			Map		  => Key로
       			오라클 	  => Primary Key
 				------------------------------
 				 영화		: 영화 고유번호
 				 뮤직		: 뮤직 번호
 				 맛집		: 맛집 번호
 				 게시판	: 게시판 번호
 				 회원관리	: ID
 			    ------------------------------ 정형화된 데이터
 			    비정형화=> 빅데이터 => 정형화된 데이터
 			    				  ==========
 			    				   통계/확률
 				 
 */
import java.util.*;
public class 라이브러리_Map_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map=new HashMap();
		// 데이터 저장
		map.put("id", "admin");
		map.put("password","1234");
		map.put("name","홍길동");
		map.put("sex", "남자");
		map.put("age",25);
		map.put("password","4567");	//key가 중복되면 덮어쓴다 
		// 데이터 출력
		/*System.out.println("ID:"+map.get("id"));
		System.out.println("PWD:"+map.get("password"));
		System.out.println("NAME:"+map.get("name"));
		System.out.println("SEX:"+map.get("sex"));
		System.out.println("AGE:"+map.get("age"));*/
		Set set=map.keySet();	//키 전체를 모아서 관리 ==> Object형
		System.out.println(set);
		for(Object o:set)
		{
			String key=(String)o;		//==> key는 String이니까 o를 변환
			System.out.println(key+":"+map.get(key));
		}
		
		/*
		 	clear() : 전체 삭제
		 	get() : 실제 데이터 값 읽을 떄
		 	put() : 데이터 추가
		 	imEmpty() : 데이터가 있는지 여부(true/false)
		 	size() : 저장된 갯수
		 	values() : 실제 저장된 값 전체
		 */
		for(Object o:map.values())
		{
			System.out.println(o);
		}
	}

}
