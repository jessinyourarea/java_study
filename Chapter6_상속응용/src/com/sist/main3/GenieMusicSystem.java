package com.sist.main3;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class GenieMusicSystem {
   protected Music[] musics=new Music[50];	//모든 사람에게 공유
   protected String title="지니뮤직 TOP50";
   
   //1. 초기화 기능 
   /*	----------------
    * 	인스턴스 블록
    *   static 블록 (*****)
    *   ----------자동 호출↑
    *   생성자(***)
    *   
    *   예외처리
    *   -------
    *      |
    *     에러 => 소스상에서 처리할 수 없는 심각한 에러
    *     		 e.g. 메모리 공간이 부족하다 
    *     예외 => 수정 가능한 가벼운 에러
    *     	  => 예외복구 / 예외회피 둘 중 선택 가능
    *     	  => 목적)비정상 종료를 방지하고 정상 수행이 가능하게!
    *         => io,net,thread,web
    *            -- --- ------ ---
    *  			    		  Web 404(파일을 못찾을때) 500(소스상에러) 403(접근권한) 412(한글변환코드 잘못됐을때) 400(다른 데이터형을 받았을때)
    *  				 thread 충돌          
    *           net IP/URL
    *           io 파일 경로명, 파일명
    *         => 에러가 나는 경우? 1)사용자 입력 문제 2)프로그래머의 실수
    */
   
   {
	   try {
		   Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
		   // 문서를 저장하는 공간 => HTML == 웹 크롤링 
		   // System.out.println(doc.toString());
		   /*
		    * 	HTML => tag형식으로 이루어짐 <> => Markup language 
		    * 	<a>값</a>
		    *  Element => tag /자바에서는 태그를 엘리먼트 라고 부름
		    *  Elements => 같은 태그 여러개를 모아준 것
		    */
		   // 노래명 <table class="list-wrap">
		   // 구분자 => 모든 태그에 구분자가 있음 class(중복) /id(중복이 없다)
		   // class -> . id=> # 
		   Elements title=doc.select("table.list-wrap td.info a.title");
		   
		   // 가수명
		   Elements singer=doc.select("table.list-wrap td.info a.artist");
		   // 앨범명
		   Elements album=doc.select("table.list-wrap td.info a.albumtitle");
		   // 상태
		   Elements etc=doc.select("table.list-wrap td.number span");
		   //System.out.println(etc);
		   
		   for(int i=0;i<title.size();i++)// length대신size (HTML)
		   {
			   	/*System.out.println("순위:"+(i+1));
			   	System.out.println("노래명:"+title.get(i).text());
			   	System.out.println("가수명:"+singer.get(i).text());
			   	System.out.println("앨범:"+album.get(i).text()); */
			   	String s=etc.get(i).text();
			   	String state="";
			   	String value="";
			   	if(s.equals("유지"))
			   	{
			   		state="유지";
			   		value="0";
			   	}
			   	else
			   	{
			   		state=s.replaceAll("[0-9]", "");
			   		value=s.replaceAll("[^가-힣]", "");
			   	}
			   	/*
			   	 *  split
			   	 *  replaceAll
			   	 *  ------------------정규식 (한글형태,숫자형태 => 패턴)
			   	 *  [0-9] => 숫자전체
			   	 *  [가-힣] => 한글 전체
			   	 *  [A-Za-z] => 알파벳 전체
			   	 *  
			   	 */
			   	/*System.out.println("상태:"+state);
			   	System.out.println("등폭:"+value);
			   	System.out.println("========================================="); */
		   
			   	musics[i]=new Music();
			   	musics[i].setRank(i+1);
			   	musics[i].setTitle(title.get(i).text());
			   	musics[i].setSinger(singer.get(i).text());
			   	musics[i].setAlbum(album.get(i).text());
			   	musics[i].setState(state);
			   	musics[i].setIdcrement(value);
			   	
		   }
		   // 등폭
	   }catch(Exception ex) {} // 이건 복구. //document 제이숲커넥트 겟은 항상 예외처리가 필요하다
	   
   }
   //2. 기능 (어떤 기능? => 메소드)
   public Music[] musicAllData()
   {
	   return musics;
   }
  
   //2-1 목록출력
   public Music[] musicFind(String fd,int type)
   {
	   int i=0;
	   for(Music m:musics)
	   {
		   boolean bCheck=false;
		   if(type==1)
		   {
			   bCheck=m.getTitle().contains(fd);
			   if(bCheck==true)
				   i++;
		   }
		   else
		  {
			   bCheck=m.getSinger().contains(fd);
			   if(bCheck==true)
				   i++;
		  }
		   
	   }
	   	System.out.println("i="+i);
		  Music[] mm=new Music[i];
		  i=0;
		  for(Music m:musics)
		  {
			  boolean bCheck=false;
			   if(type==1)
			   {
				   bCheck=m.getTitle().contains(fd);
				
			   }
			   else
			  {
			  	  bCheck=m.getSinger().contains(fd);
			  	 
			  }  
			   if(bCheck==true)
			   {
				   mm[i]=m;
				   i++;
			   }
		  }
		  return mm;
   }
   
   /*
    *  결과값을 전송해줄건지 or 자체출력 할건지
    *  		:리턴형 유			void
    *  
    */
   //2-2 검색
   
   public static void main(String[] args) {
	GenieMusicSystem g=new GenieMusicSystem();
	Music[] aa=g.musicFind("사", 2);
	for(Music a:aa)
	{
		System.out.println(a.getSinger());
	}
		
	
}
}
