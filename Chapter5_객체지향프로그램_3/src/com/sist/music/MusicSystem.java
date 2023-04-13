package com.sist.music;

import java.util.Scanner;

public class MusicSystem {
	Music[] music=new Music[50]; //1)null
	// List<Music> // 라이브러리 방식 List=배열
	//1. 메소드 => 생성자
	void init()
	{	
		for(int i=0;i<MusicData.title.length;i++) //MusicData는 이미 static으로 저장되었기 때문에 new없이도 바로 호출가능.
		{
			//System.out.println("메모리 할당전:music["+i+"]="+music[i]);
			music[i]=new Music(); // 2) Music크기의 메모리공간을 50개 생성
			//System.out.println("메모리 할당후:music["+i+"]="+music[i]);
			music[i].title=MusicData.title[i];
			music[i].singer=MusicData.singer[i];
			music[i].album=MusicData.album[i];
			music[i].state=MusicData.state[i];
			music[i].modify=MusicData.modify[i];
			/*
			 * 인스턴스 : 객체 생성 => 객체명.변수 , 배열.. => 이럴땐 new를 써줘야 클래스명으로 호춢이 가능하다
			 * static: 클래스명.배열명..
			 * 
			 * int[] arr=new int[10];
			 * for(int i=0;i<10;i++)
			 * {
			 * 	  arr[i]=(int)(math.random()*100)+1;
			 * }
			 */
		}
	}	
	
	int menu()
	{
		System.out.println("==============Menu===================");
		System.out.println("1.목록보기");
		System.out.println("2.검색");
		System.out.println("3.상세보기");
		System.out.println("9.프로그램 종료");
		System.out.println("=====================================");
		Scanner scan=new Scanner(System.in);
		System.out.println("메뉴 선택:");
		return scan.nextInt();
	}
	
	Music[] musicListData()
	{
		return music;
	}
	Music musicDetailData(int no)
	{
		return music[no-1]; //index값 이용하가ㅣ
	}
	
	Music[] musicFindData(String title)
	{
		int count=0;
		for(Music mm:music)
		{
			if(mm.title.contains(title)) {
				count++;
			}
		}
		Music[] m=new Music[count];
		int i=0;
		for(Music mm:music)
		{
			if(mm.title.contains(title)) {
				m[i]=mm;
				i++;
			}
		}
		return m;
	}
}
/*	public static void main(String[] args) {
		MusicSystem ms=new MusicSystem();
		ms.init();
		Scanner scan=new Scanner(System.in);
		System.out.println("검색어 입력:");
		String title=scan.next();
		Music[] data=ms.musicFindData(title);
		int i=0;
		for(Music m:data)
		{
			System.out.println(i+"."+m.title);
			i++;
		}
		System.out.println("================================");
		System.out.println("상세보기(1~50):");
		int no=scan.nextInt();
		Music mm=ms.musicDetailData(no);
		System.out.println("곡명:"+mm.title);
		System.out.println("가수명:"+mm.singer);
		System.out.println("앨범명:"+mm.album);
		System.out.println("상태:"+mm.state);
		System.out.println("변동폭:"+mm.modify);
	}
*/
