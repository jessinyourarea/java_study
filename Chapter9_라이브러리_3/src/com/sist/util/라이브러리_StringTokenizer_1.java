package com.sist.util;
/*
  StringTokenizer : 문자열 분리
  1) split() 대체 
  2) 주 사용처 : 빅데이터 / 네트워크 / 웹
  ----------------------------------
  기능
  	= 생성자
  	  String s1="코미디/드라마/어드벤쳐";
  	    	  StringTokenizer st=new StringTokenizer(s1,"/");
  	  String s2="박서준아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬";
  	    	  StringTokenizer st=new StringTokenizer(s2); => 공백 기준
  	    	  
  	**  StringTokenizer st=new StringTokenizer("구분할 문자열",구분자)
  	**  StringTokenizer st=new StringTokenizer("구분할 문자열") => 공백을 구분자로 할 때
  	1) countTokens() : 분리된 데이터 갯수 가져올 때
  	2) nextToken() : 분리된 데이터 읽기
	3) hasMoreTokens() : 분리된 갯수만큼만 루프를 수행할 때 사용	
 */
import java.util.*;
public class 라이브러리_StringTokenizer_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  	  String s2="박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬 "
	  			  +"박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬 "
	  			  +"박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬 "
	  			  +"박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬 "
	  			  +"박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬 "
	  			  +"박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬 "
	  			  +"박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬 ";
	  	  StringTokenizer st=new StringTokenizer(s2);    	 
	  	  while(st.hasMoreTokens()) //hasMoreTokens 
	  	  {
	  		  System.out.println(st.nextToken());
	  	  }
	  	  /*
	  	  int a=st.countTokens();
	  	  for(int i=0;i<a;i++)
	  	  {
	  		  System.out.println(st.nextToken());
	  	  }
	  	  /*
	  	  System.out.println(st.countTokens());
	  	  System.out.println(st.nextToken());  
	  	  System.out.println(st.nextToken());  
	  	  System.out.println(st.nextToken());  
	  	  System.out.println(st.nextToken());  
	  	  System.out.println(st.nextToken());  
	  	  System.out.println(st.nextToken());  
	  	  System.out.println(st.nextToken());  
	  	  System.out.println(st.nextToken());  
	  	  System.out.println(st.nextToken());  
	  	  System.out.println(st.nextToken());  */
	  	  

	}

}
