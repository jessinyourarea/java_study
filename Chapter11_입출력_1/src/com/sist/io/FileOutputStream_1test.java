package com.sist.io;
/*
	school2 txt 파일에 메세지를 입력하려고 한다. 실행할 때마다 동일한 메시지를 추가하도록 만들라.
*/
import java.io.*;
public class FileOutputStream_1test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File file=new File("c:\\java_datas\\school2.txt");
		if(!file.exists())
		{
			file.createNewFile();
		}
		FileOutputStream fos=
				new FileOutputStream(file,true);
		String msg="공부중입니다\n";
		fos.write(msg.getBytes());
		fos.close();
		System.out.println("테스트 완료!");
	}
}
