package com.sist.io2;
/*
 	데이터 연결 : 자바 응용프로그램
 			   ------------ .java
 	   |
 	  데이터저장 (변수,배열,클래스,파일,오라클)
 	  		  ------------
 	  		  	메모리에 저장 = 단점: 한번 사용하면 지워진다
 	  		  	파일 : 영구적으로 저장 가능 (보안에 취약, 다른 파일과 연결이 어렵다)
 	  		  	------------------------------- 
 	  		  	Spring : Web 제어
 	  		  	MyBatis : Mapper(데이터베이스 연결)
 	  		  	 => 이 두개를 이용해서 AWS 호스팅
 	  		  	-------------------------------
 	  데이터 => 읽기/쓰기
 	  -----
 	   |
 	   파일 	/ 오라클
 	   --InputStream : reading ===> Reader
 	   	 OutputStream : Writing ===> Writer
 	   	  1byte씩             		2byte씩
 	   	  	|						=> 한글이 포함된 파익 제어
 	   	주로 업로드/다운로드(.zip,png...)
 	 => 읽기 / 쓰기  ==> 동시에 수행 불가능
 	    --------
 	     파일도 동시 수행이 불가능 => 단방향
 	     => 파일 읽기 통로
 	     => 파일 쓰기 통로 // 개별로
 	      		   ----> 데이터가 이동하는 통로 : 스트림(Stream)
 	  --------------------------------------------------
 	  전송 속도가 빠른형태의 클래스
 	  Buffered~
 	  ObjectInputStream / ObjectOutputStream
 	  File 정리    		         
 	  
 	  read/readLine	,	write	, close
 */
public class IO_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
