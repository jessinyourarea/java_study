package com.sist.music;
/*
 * 1. 재사용기법
 * 		= 상속 => is-a
 * 		  기존의 클래스를 확장해서 사용
 * 					  ---- extends
 * 		=> 자바는 단일상속만 가능하다 (?= 두개는 안됨)
 * 			class A
 * 			class B extends A
 * 			
 * 			class A
 * 			class B
 * 			class C	extends A,B ==>!오류!(C언어 스타일)
 * 			C=A+B+알파
 * 			
 * 			Class A
 * 			Class B extends A
 *			Class C extends B
 *			------------------- 하나씩 하나씩 받아와야한다
 *			
 *			class A(int a,b,c,d) 16byte
 *			class B(int a,b) 8byte
 *			A > B 
 *			------------------- A와B는 다른 클래스 => 크기를 가지지 않는다
 * 		= 포함 => has-a (*****)
 * 			
 * 			class A (int a,b)
 * 			class B (int c) extends A
 * 							--------- int a, b, c
 * 			A > B => 상속을 내리는 클래스가 더 크다( 데이터값이 더 많아진다고 해서 크기가 더 커지는 것은 아니다)
 * 
 * 			동물
 * 			|
 * 			-----------------
 * 			|       |       |
 * 			포유류	
 * 			*모든 클래스는 Object 상속을 받고 있다
 * 				Object => 모든 클래스 최상위 클래스
 * 			*** 상속의 예외조건: 
 * 				생성자 , static , private , 초기화블록 은 상속되지 않는다
 * 
 */
public class Music {
	private int rank;
	private String state;
	private String title;
	private String singer;
	private String album;
	private int idcrement;
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public int getIdcrement() {
		return idcrement;
	}
	public void setIdcrement(int idcrement) {
		this.idcrement = idcrement;
	}
	
}
