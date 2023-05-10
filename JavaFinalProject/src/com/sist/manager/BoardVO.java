package com.sist.manager;
import java.io.Serializable;
/*	게시판
 	파일 입출력>
 	
 	클래스
 		= 데이터만 관리	=> 한 개에 대한 정보를 모아서 처리하는 방식
 						   ---- 예) 게시물 1개 전체 데이터를 모아서 관리
 						   			장점: 읽기/쓰기/검색이 편리하다
 						   		   여행지에 대한 정보/ 뮤직정보 등등...
 			~VO , ~DTO
 			---    ---
 				   Data Transfer Object => 한 개의 정보를 모아서 전송 목적
	Value Object   
	=>데이터 보호 목적: 변경 불가능하게 막아주는 역할
   ------------      캡슐화 시키기!
   			         - 데이터는 은닉화 하고 메소드를 통해서 접근
   			           ------------     ----------
   			           변수: private	     메소드:public (다른 클래스와 통신 목적)
   			        				  				   = 메세지
 		= 기능처리 => 액션 클래스 (메소드가 중심)
 		   ~Manager , ~System , ~DAO , Service
 		   ------------------	--------------> 오라클에서 제어
 		    -> 크롤링(웹에서 데이터 읽기)
 		= 유사한 기능을 가지고 있는 클래스가 여러 개
 		  => 공통된 메소드를 이용하는 것이 편하다 
 		     ----------이럴때 인터페이스 사용
 		     추상 => 공통적인
 		      => 인터페이스 하나로 관련된 여러개 클래스를 제어할 수 있다는 장점이 있음.
 		= 견고한 프로그램을 제작 (에러가 났을 때 복구해주는)
 		   사용자 에러 / 프로그램 에러 를 복구(피하기)해서 다음 문장으로 이동하도록 해야함
 		   => 예외처리
 		      직접처리 (예외 복구) => try~catch (*********)
 		      간접처리 (예외 회피) => throws => 유지보수 , 라이브러리
 		      => 기능(메소드)/ 이미 소스코딩이 된 상태에 추가
 		      				 -----------------------throws 추가 선호
 		      				 처음부터 메소드 제작
							 ----------------- try~catch 사용 선호
							 
 */
import java.util.*;
public class BoardVO implements Serializable{
	private int no;	//중복이 없게 처리(그래야 수정/삭제가 가능함)
	private String name;
	private String subject;
	private String content;
	private String pwd; //본인여부 확인용
	private Date regdate;
	private int hit;
		public int getNo() {
			return no;
		}
		public void setNo(int no) {
			this.no = no;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getSubject() {
			return subject;
		}
		public void setSubject(String subject) {
			this.subject = subject;
		}
		public String getContent() {
			return content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public String getPwd() {
			return pwd;
		}
		public void setPwd(String pwd) {
			this.pwd = pwd;
		}
		public Date getRegdate() {
			return regdate;
		}
		public void setRegdate(Date regdate) {
			this.regdate = regdate;
		}
		public int getHit() {
			return hit;
		}
		public void setHit(int hit) {
			this.hit = hit;
		}
	
}
