package com.sist.manager;
import java.util.*;
import java.io.*;
public class BoardManager {
	//게시물 전체를 가지고 있는다 = List를 이용해서 => 접속한 모든 사람에게 공유되게. 
	private static List<BoardVO> list=
			new ArrayList<BoardVO>();
	/*		
	 		Collection
	 			|
	 		---------------------------
	 		|				|		
	 	  List			   Set				Map => Interface
	 	    |				|				 |
	 	  ArrayList       HashSet		  HashMap
	 	 =>List: 순서 존재(인덱스 순대로), 데이터 중복 허용
	 	 	예) 게시판
	 	 =>Set: 순서 없음 , 데이터 중복 불허용
	 	 	예) 회원가입
	 	 =>Map: 순서 없음 , 두 개를 동시 저장 (Key, Value) 
	 	   								K는 중복X, V는 중복가능.
	 	   	예) 데이터 송/수신 => 웹에서 지원하는 대부분의 클래스가 Map형식
	 	   	    ---------- 웹(C/S) 방식이니까					
	 	
	 */
}
