package com.sist.main3;

import java.util.*;
public class MusicMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("선택(Genie(1),Melon(2)):");
		int select=scan.nextInt();
		//상속=> 클래스를 통합할 수 있다
		/*
		 	상속
		 	=> 객체 생성
		 	=> 상위클래스 뒤에 하위클래스
		 	  -------------------------
		 	  
		 	
		 */
		GenieMusicSystem ms=null;
		if(select==1)
			ms=new GenieMusicSystem(); //musicAllData() 있음
		else
			ms=new MelonMusicSystem(); //musicAllData() 있음 from 상속
		
		//1. 목록 출력
		Music[] music=ms.musicAllData();
		for(Music m:music)
		{
			System.out.println(m.getRank()+"."+m.getTitle());
		}
	}

}
