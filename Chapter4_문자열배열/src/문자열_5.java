/*
 	분리 작업
 	
 		문자를 자르기 : substring()
 		문자 분리 : split()
 		문자 변경 : replace() , replaceAll()
 		모든 데이터형 문자열 변경 : valueof()
 		
 
 
 */
public class 문자열_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] music={"Kitsch","CHRISTIAN","꽃","Ditto","Hype boy","Teddy Bear","사건의 지평선","OMG","심 (心)",
				"I Don't Think That I Like Her","사랑은 늘 도망가","건물 사이에 피어난 장미","우리들의 블루스","빙글빙글 (Prod. by R.Tee)",
				"가질 수 없는 너","After LIKE","다시 만날 수 있을까","밤이 무서워요 (Lonely Night)","이제 나만 믿어요","London Boy","파이팅 해야지 (Feat. 이영지)",
				"Polaroid","무지개","Attention","아버지","A bientot","LOVE DIVE","손이 참 곱던 그대","사랑인가 봐","사랑해 진짜","연애편지","보금자리","인생찬가",
				"ANTIFRAGILE","NIGHT DANCER","Dangerously","Zero","The Drum","Like Crazy","바보가슴","Nxde","사랑하기 싫어","새삥 (Prod. by ZICO) (Feat. 호미들)",
				"That's Hilarious","Nostalgia","흔들리는 꽃들 속에서 네 샴푸향이 느껴진거야","Monologue","VIBE (Feat. Jimin of BTS)","Dynamite","오르트구름","그때 그 순간 그대로 (그그그)",
				"다정히 내 이름을 부르면","TOMBOY","너의 모든 순간","해요 (2022)","Pink Venom","Unholy","Shut Down","취중고백",
				"Dreamers (Music from the FIFA World Cup Qatar 2022 Official Soundtrack) (Feat. FIFA Sound)","그라데이션","Stay",
				"That That (Prod. & Feat. SUGA of BTS)","사랑하지 않아서 그랬어","Loving You Girl (Feat. Hkeem)","고백","Set Me Free Pt.2","내가 아니라도","Cookie",
				"Love Me Like This","Say I Love You","보고싶었어","나의 X에게","NOT SORRY (Feat. pH-1) (Prod. by Slom)","Candy","D N D","그대를 알고","그중에 그대를 만나",
				"아모르 파티","ELEVEN","너를 보는게 지친 하루에","Rush Hour (Feat. j-hope of BTS)","Butter","아로하","봄날","When I Get Old","Say My Name","잘가요","희재","2002",
				"모든 날, 모든 순간 (Every day, Every Moment)","정이라고 하자 (Feat. 10CM)","나의 목소리로","Blueming","FEARLESS","발걸음","당신을 만나",
				"Every Second","봄여름가을겨울 (Still Life)","LOVE me","나비무덤","딱 10CM만","결국엔 너에게 닿아서","자격지심 (Feat. ZICO)","Off My Face","밤하늘의 별을 (2020)",
				"인생은 뷰티풀","신호등","빛이 나는 사람","Face-off","주마등","Permission to Dance","오래오래","Bad Habits","주저하는 연인들을 위해","슬픈등","친구",
				"Celebrity","Made You Look","Bad","Love story","약속 (約束)","INVU","Il Mare Calmo Della Sera","Alone","벚꽃 엔딩","떠나보낼 준비해 둘걸 그랬어",
				"내 기쁨은 너가 벤틀리를 끄는 거야","At My Worst","내 손을 잡아","사계 (Four Seasons)","Love in Portofino","마지막 사랑","Left and Right (Feat. Jung Kook of BTS)",
				"위대한 사랑 (Un Amore Cosi Grande)","나비 (Outro)","비와 당신","우린 그렇게 사랑해서","OHAYO MY NIGHT","Poppy (Korean Ver.)","Stronger (What Doesn't Kill You)",
				"strawberry moon","풍등","Yet To Come","Ai Wo Tsutaetaidatoka","Feel My Rhythm","찰나가 영원이 될 때 (The Eternal Moment)","예뻤어","새벽에 걸려온 너의 전화는","라일락",
				"오늘도 빛나는 너에게 (To You My Light) (Feat.이라온)","어떻게 이별까지 사랑하겠어, 널 사랑하는 거지","그댄 행복에 살텐데 (2022)","That's Not How This Works (Feat. Dan ＋ Shay)",
				"Cupid","on the street","한 페이지가 될 수 있게","비도 오고 그래서 (Feat. 신용재)","바라만 본다","Next Level","첫눈처럼 너에게 가겠다","Weekend","있잖아","Switch","BETELGEUSE","팡파레",
				"헤픈 우연","WHEN I MOVE","En Garde (준비,시작!)","도깨비불 (Illusion)","Tiny Riot","사이렌 Remix (Feat. UNEDUCATED KID & Paul Blanco)","마이웨이 (MY WAY) (Prod. by R.Tee)",
				"건배","회전목마 (Feat. Zion.T & 원슈타인) (Prod. by Slom)","GHOST TOWN","12 : 45 (Stripped)","에잇 (Prod. & Feat. SUGA of BTS)","트위스트고고",
				"너의 번호를 누르고 (Prod. by 영화처럼)","그대가 내 안에 박혔다 (그내박)","Expectations","시작","언제나 사랑해","MY BAG","나와 함께 가시렵니까","봄 사랑 벚꽃 말고",
				"KISS ME (Feat. BIG Naughty)","처음부터 너와 나","너를 생각해","Way Back Home","오래된 노래","오.내.언.사 (Guitar Ver.)","Crazy","바람 같은 사람","스티커 사진",
				"좋아 (JOAH)","사나이 청춘","비 오는 날 듣기 좋은 노래 (Feat. Colde)","밥 한 번 먹자"};
		/*String s="Hello Java!!";
		//        01234567891011 인덱스 번호
		System.out.println("원본:"+s);
		String s1=s.substring(6);
		System.out.println(s1);
		String s2=s.substring(0,5);
		//						-- 마지막 숫자는 제외!  endIndex-1
		System.out.println(s2);
		String s3=s.substring(6,10);
		System.out.println(s3);	*/
		
		// String ss="That That (Prod. & Feat. SUGA of BTS)";  // 37글자
		//System.out.println(ss.length());
		/* for(String s:music)
		{
			if(s.length()>37)
			{
				String ss=s.substring(0,34)+"...";
				System.out.println(ss);
				
			}
			else
			{
				System.out.println(s);
			}
		} */
		String addr="서울특별시 성북구 개운사길 14"
				+ "지번 서울시 성북구 안암동5가 101-28";
		String s=addr.substring(0,addr.lastIndexOf("지")); 	// 문자열 내에서 특정 문자를 찾을때 lastIndexOf()
		System.out.println(s);
		/*
		 * 	인덱스가 있는 위치값 찾기
		 * 	lastIndexOf (뒤에서부터 찾기)
		 * 	IndexOf	    (앞에서부터 찾기)
		 */
		//String sss="Hello java";
		// a 
		String ss=addr.substring(addr.lastIndexOf("서울"));
		System.out.println(ss);
		String s1=addr.substring(addr.indexOf("서울"));
		System.out.println(s1);
		
		//replace
		String str="Hello Java!!";
		String sss=str.replace("a","b");
		System.out.println(sss);
		
		String s4="Java";
		String sss4=s4.replace("Java","Oracle");
		System.out.println(sss4);
		
		
		
}
}
