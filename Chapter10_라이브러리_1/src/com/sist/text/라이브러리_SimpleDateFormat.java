package com.sist.text;
/*
 	java.text => 출력 형태를 만들어서 사용(변경)
 	--------------
 	SimpleDateFormat : 날짜 변경 
 	DecimalFormat : 숫자변환
 	----------------------------가격출력 10,000원
 	MessageFormat : 데이터베이스 > iNSERT UPDATE
 	
 	eg.
 	String name="",sex="", addr="",tel"";
 	int age=10;
 
 	String sql="INSERT INTO member VALUE {
 	String sql="INSERT INTO member VALUES('{1}','{2}','{3}','{4}',"{5}};
 */
import java.util.*;
import java.text.*;
public class 라이브러리_SimpleDateFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date();
		System.out.println(date);
		SimpleDateFormat sdf=new SimpleDateFormat("yyy년 MM월 dd일");
		// 가장 많은 형태는 yyyy-MM-dd , yyyy/MM/dd
		System.out.println(sdf.format(date));
		/*
		 yyyy 년도 ==> 오라클은 rrr
		 MM 월    			mm
		 dd 일				dd
		 hh 시간				hh24
		 mm 분				mi	
		 ss 초				ss
		 		 
		 */
	}

}






