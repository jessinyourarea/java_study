package com.sist.io;
/*
 
 */
import java.util.*;
import java.io.*;
public class Object_InputOutput_2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// 1)파일을 읽어오고
		FileInputStream out=
				new FileInputStream("c:\\java_datas\\sawon.txt");
		// 2) 읽은 파일을 객체단위로 저장할 공간을 생성한다
		ObjectInputStream ois=
				new ObjectInputStream(out);
		//객체 단위로 값을 읽어온다
		List<Sawon> list=(List<Sawon>)ois.readObject();
		for(Sawon s:list)
		{
			System.out.println(s.getSabun()+" "
					+s.getName()+" "
					+s.getDept()+" "
					+s.getJob()+" "
					+s.getPay());
		}
	}

}
