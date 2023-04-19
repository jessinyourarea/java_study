package com.sist.main3;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class MelonMusicSystem extends GenieMusicSystem {
	//musics /musicAllData /musicFind => 초기화블록은 예외, 상속XX
	protected String title="멜론 TOP50";
			
	{
		try {
			Document doc=Jsoup.connect("https://www.melon.com/chart/index.htm").get();
			Elements title=doc.select("wrap_song_info div.rank01");
			Elements singer=doc.select("wrap_song_info div.rank02");
			Elements album=doc.select("wrap_song_info div.rank03");
			for(int i=0;i<50;i++)
			{
				System.out.println(i+1);
				System.out.println(title.get(i).text());
				System.out.println(singer.get(i).text());
				System.out.println(album.get(i).text());
				System.out.println("===========================");
				musics[i]=new Music();
				musics[i].setRank(i+1);
				musics[i].setTitle(title.get(i).text());
				musics[i].setSinger(singer.get(i).text());
				musics[i].setAlbum(album.get(i).text());
			}
			
		}catch(Exception ex) {}
	}
		 
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			MelonMusicSystem ms=new MelonMusicSystem();
	
		}


}
