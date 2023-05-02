package com.sist.io2;
//file => 영구적인 저장장치를 만든 것
/*		단점: 보안 (다른 사람들이 언제든지 볼 수 있다)
 			파일은 독립적 => 여러개의 파일을 연결할 수 없다 (==> 그래서 이럴 때 간개형 데이터베이스인 오라클을 이용해서 연결해주기도 함)
 	    임시용도: 댓글 읽기 , 크롤링 => 추출 => 오라클로 보냄
 	           --------------==빅데이터 ==> 분석 (필요한 데이터만 추출/데이터전처리)
 */
public class Student {
	private int hakbun;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	public int getHakbun() {
		return hakbun;
	}
	public void setHakbun(int hakbun) {
		this.hakbun = hakbun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
}
