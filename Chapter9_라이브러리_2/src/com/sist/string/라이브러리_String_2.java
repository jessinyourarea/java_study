package com.sist.string;
import java.io.*;
public class 라이브러리_String_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//느린버전
		try
		{
			long start=System.currentTimeMillis();
			FileReader fr=new FileReader("c:\\javaDev\\movie.txt");
			int i=0; // to read String by int
			String data="";
			while((i=fr.read())!=-1) //-1== EOF== End of File
			{
				data+=(char)i;
			}
			long end=System.currentTimeMillis();
			fr.close();
			System.out.println(data);
			System.out.println("걸린 시간:"+(end-start));

		}catch(IOException ex)
		{	
			ex.printStackTrace(); //to print error message 
		}
		
		
		//빠른버전
		try
		{
			long start=System.currentTimeMillis();
			FileReader fr=new FileReader("c:\\javaDev\\movie.txt");
			int i=0; // to read String by int
			StringBuffer data=new StringBuffer();
			while((i=fr.read())!=-1) //-1== EOF== End of File
			{
				data.append((char)i);	//StringBuffer with append
			}
			long end=System.currentTimeMillis();
			fr.close();
			System.out.println(data.toString());
			System.out.println("걸린 시간:"+(end-start));

		}catch(IOException ex)
		{	
			ex.printStackTrace(); //to print error message 
		}
	}
		
}
