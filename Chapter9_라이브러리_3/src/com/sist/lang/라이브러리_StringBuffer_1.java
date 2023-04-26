package com.sist.lang;
/*
 delete, insert : 원본 변경
 substring : 원본 변경 없다
 */
public class 라이브러리_StringBuffer_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("홍길동입니다");
		sb.delete(3, 6); //delete (int s.int e) => s~ e-1 까지
		System.out.println(sb.toString());
		sb.insert(3, "입니다"); //자체 변경
		System.out.println(sb.toString());
		sb.substring(3); //자체 변경되지 않고 새로운메모리에 다시 저장하라는 문구
		
		System.out.println(sb.toString());
		System.out.println(sb.substring(4));
		
	}

}
