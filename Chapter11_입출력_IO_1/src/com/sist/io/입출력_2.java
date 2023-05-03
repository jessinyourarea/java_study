package com.sist.io;
// 파일 읽기
// FileInputStream (1byte)  / FileReader (2byte)
// 한글이 포함되어있다면 반드시 2byte씩 읽어야 한글깨짐방지 가능.
import java.io.*;
public class 입출력_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader reader=null;
		try
		{
			reader=new FileReader("C:\\javaDev\\movie.txt");
			BufferedReader in=
					new BufferedReader(reader);
			//네트워크 통신시에도 많이 사용
			int i=0; //한글자씩 읽기 => Read를 이용
			//int read() => 글자의 ACS코드값을 읽어온다 (정수형)
			// A => read() => 65
			// int read(byte[],int,int)===> 읽은 바이트수
			long start=System.currentTimeMillis();
			/*while((i=in.read())!=-1)
			{
				System.out.print((char)i);
			}
			*/
			while(true)
			{
				String data=in.readLine();
				if(data==null) break;
				System.out.println(data);
			}
			long end=System.currentTimeMillis();
			System.out.println("읽은 시간:"+(end-start));
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				reader.close();
			}catch(Exception ex) {}
		}
	}

}
