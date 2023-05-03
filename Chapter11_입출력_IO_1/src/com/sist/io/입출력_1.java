package com.sist.io;
/*
 	IO => InputStream/OutputStream
 		  ------------------------
 		  	 |				|	
 		  	입력			   출력
 		 => 입출력시 사용하는 라이브러리
 		 	====
 		 	1) 메모리 입출력 => 표준입출력
 		 					System.in , System.out 「 JavaScript연동「 스프링부트
   		    2) 파일 입출력 => 웹)업로드/다운로드 (파일명 XML , JSON , Properties)
 		    								   ㄴ스프링프레임워크, MyBatis 
 		    		         외부에서 데이터 읽기 임시 저장용 (파일명 txt)
 		    		         오라클 데이터 백업 (CSV : MySQL , MSSQL , MariaDB)
 		    		                        e.g. seoul.go.kr , data.go.kr
 		    3) 네트워크 입출력 : 웹서버는 이미 구현된 상태 (like Tomcat)
 		      -------> 저장 / 읽기 / 수정 / 삭제 => CURD
 		      
 		      자바 => 입출력을 하기 위한 장치 with Stream(데이터가 이동하는 통로)
 		      		데이터 이동
 		      		1) 1byte 이동			2) 2byte 이동
 		      	~InputStream				~Reader
 		      	~OutputStream				~Writer
 		      	--------------				--------
 		      	바이트 스트림					문자 스트림
 		      	=> byte						=> char   ==> 메소드(read(),write())
 				   => (read(),write())
 				   => IO => CheckedException(예외처리 필수)
 				   		 => IO 라이브러리 사용 시 반드시 닫기 => close();
 			    
 			    = 지원하는 라이브러리
 			      FileInputStream	FileOutputStream
 			      FileReader		FileWriter
 			      -----------------------------------
 			      ObjectInputStream	ObjectOutputStream => 객체 단위 저장
 			       => 단점: 속도가 느리다 --> 그래서 속도를 빠르게 하는 Buffer를 이용한다
 			    = Buffer => 한번에 데이터를 모아서 한번에 전송
 			       			=> 속도가 빠르다
 			       			 입출력 : BufferedReader , BufferedWriter
 			       			 		--------------   --------------
 			       			 		String			  String
 			       			  원리: 관련된 데이터를 묶어서 한번에 이동이 가능
 			       			    
 			       			
 			      
 */	
import java.util.*;
import java.io.*;
public class 입출력_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try
		{
			long start=System.currentTimeMillis();
			fis=new FileInputStream("C:\\유틸\\eclipse-jee-2023-03-R-win32-x86_64.zip");
			//BufferedInputStream
			BufferedInputStream bis=
					new BufferedInputStream(fis);
			fos=new FileOutputStream("c:\\java_datas\\eclipse_1.zip");
			//BufferedOutputStream
			BufferedOutputStream bos=
					new BufferedOutputStream(fos);
			// 파일 복사 == 업로드
			int i=0; // 읽은 바이트 수
			byte[] buffer=new byte[1024]; //파일 모아서 복사하려고
			while((i=bis.read(buffer, 0, 1024))!=-1)
			{
				bos.write(buffer, 0, i);
			}
			long end=System.currentTimeMillis();
			System.out.println("파일 복사 시간:"+(end-start));
		}catch(Exception ex)
		{
			//오류확인(monitoring)
			ex.printStackTrace();
		}
		finally
		{
			
		}try
		{
			fis.close();
			fos.close();
		}catch(Exception ex) {}
	}

}





