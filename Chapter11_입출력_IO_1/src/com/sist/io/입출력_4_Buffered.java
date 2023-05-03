package com.sist.io;
//BufferedReader BufferedWriter ==> 필터스트림
// FileWriter FileReader ==> 기반스트림 / 필터스트림의 생성자 인자로 전달됨. 358page
import java.io.*;
public class 입출력_4_Buffered {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileWriter out=new FileWriter("c:\\java_datas\\movie_1.txt");
		//자동으로 지정된 파일을 생성 (없으면 새로 만들고, 있으면 덮어쓰는 기능)
		// 추가 기능 FileWriter out=new FileWriter("c:\\java_datas\\movie_1.txt",true); true == append모드 
		FileReader in=new FileReader("c:\\javaDev\\movie.txt");
		BufferedReader br=new BufferedReader(in);
		BufferedWriter bw=new BufferedWriter(out);
		while(true)
		{
			String data=br.readLine();
			if(data==null) break;
			bw.write(data+"\n");
			
		}
		System.out.println("읽기/쓰기 완료");
		in.close();
		out.close();
	}

}
