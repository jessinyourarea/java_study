package com.sist.common;
// 기능설정
// 클라이언트가 서버로 요청할 때 어떤 기능인지 설정한다 with 번호.
// 웹은 파일명으로 구분
// 내부 프로토콜 : 서버와 클라이언트의 약속 
/*
 	방 들어가기 => 먼저 들어간 사람 / 지금 들어가는 사람
 				
 	방 나가기  => 남아 있는 사람 / 나가는 사람
 	
 	채팅 종료하기 => 남아 있는 사람 / 채팅을 종료하는 사람
 	
 	서버 => 쓰레드 사용법
 		   => 내부 클래스
 	 흐름파악
 	  서버 : 요청을 받아서 처리 후에 응답하는 역할
 	  	    => 1) 오라클 서버 2) 웹 서버 ==> 1/2 이미 만들어져있어서 설치만 하면 됨
 	  	       
 	  클라이언트 : 요청 후 결과값을 받아서 출력하는 역할
 	   			=> DAO (JDBC) , JSP , Spring 
 	   			   -------------------------
 	   			    => 브라우저에 출력== Front-end
 	
 
 */

public class Function {
	public static final int LOGIN=100; //로그인처리1 (이미 로그인된 유저)
	public static final int MYLOG=110; //로그인처리2 (로그인 하는 유저)
	public static final int CHAT=200; //채팅
	public static final int MSGSEND=300; //쪽지보내기기능
	public static final int INFO=400; //회원정보보기
	public static final int MYEXIT=900; //나가는 사람
	public static final int EXIT=990; //남아있는 사람
}
