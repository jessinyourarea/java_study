package com.sist.exception;
/*
 	
 
 */
import java.io.*;
//Checked Exception =>  꼭 예외처리를 쓰지 않으면 오류가 나는 상황
public class 예외처리_예외복구_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		/*FileReader fr=null; //지역변수의 일종
		try
		{
			fr= new FileReader("C:\\javaDev\\javaStudy\\Chapter8_예외처리_2\\src\\com\\sist\\exception\\예외처리_예외복구_1.java");
			while((i=fr.read())!=-1)	//-1은 문장이 끝날때까지 라는 뜻
			{
				System.out.print((char)i);
			}
		}catch(IOException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fr.close();
			}catch(IOException e) {}
		}*/
		//resource-with => 문장이 끝나면 fr을 자동으로 닫아서=> finally 사용하지 않아도 됨
		try (FileReader fr=new FileReader("C:\\javaDev\\javaStudy\\Chapter8_예외처리_2\\src\\com\\sist\\exception\\예외처리_예외복구_1.java"))
		{
			i=0;
			while((i=fr.read())!=-1)
			{
				System.out.print((char)i);
			}
		}catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
