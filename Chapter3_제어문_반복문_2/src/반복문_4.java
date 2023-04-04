/*
 * 	while문은 갯수가 확인되지 않을 때 많이 쓰인다는 거 기억하기!!!!
 * 
 */

import java.io.*;
public class 반복문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int i=0;
			FileReader fr=
						new FileReader("C:\\javaDev\\javaStudy\\Chapter3_제어문_반복문_2\\src\\반복문_3.java");
			while((i=fr.read())!=-1)	// -1은 파일 종료할때까지 문장을 읽으라는 뜻
			{
				System.out.print((char)i); 	//네트워크로 파일 전송
			}
		}catch(Exception ex) {}
	}

}
