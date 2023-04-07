/*
 	1. 조건문 / 선택문
 		------------- 상세보기, 검색 , 로그인 , 아이디체크 , 우편번호 검색
 		------------- 댓글 , 수정 , 삭제 ...
 		형식)
 			if(조건문) => 조건문 (부정연산자, 비교연산자, 논리연산자)
 			{
 				출력내용 =>true일때만 수행하는 문장
 			}
 			예) => 번호 3번인 내용을 출력해라 => 상세
 			---------------------------------- 
 			단일 : 속도가 늦다(독립적인 문장) => 중복적으로 수행
 			----------------------------------------
 			다중조건 : 
 			
 			true/false를 나눠서 처리
 			---------------------
 			if(조건문)
 			{
 				조건이 true 일때 처리
 			}
 			else
 			{
 				조건이 false 일때 처리
 			}
 			
 			예)
 				if(로그인이 되었다면)
 				{
 					main으로 이동해라
 				}
 				else
 				{
 					회원가입으로 이동
 				}
 				
 				if(아이디 중복체크=>중복?)
 				{	
 					중복ㅇ, 이미 사용 중인 아이디입니다
 					다른 아이디를 입력하세요
 				}
 				else
 				{
 					중복x, 사용 가능한 아이디입니다
 				}
 				
 				if(검색된 내용이 있는 경우)
 				{	
 					검색된 내용 출력
 				}
 				else
 				{
 					검색 결과가 없습니다
 				}
 				
 			다중조건문 : 조건이 많은 경우 해당되는 조건만 수행 가능
 			if()
 			{	
 				조건문이 true 일때 수행되는 문장 ===> 수행 시 종료
 				조건문이 false일때 =ㄱ
 			}					 ↓
 			else if(조건문)			
 			{
 				조건문이 true 일때 수행되는 문장 ===> 수행 시 종료
 				조건문이 false일때 =ㄱ
 			}					 ↓
 			else if(조건문)
 			{
 				조건문이 true 일때 수행되는 문장 ===> 수행 시 종료
 				조건문이 false일때 =ㄱ
 			}					 ↓
 			else
 			{
 				위의 조건 중 해당사항이 없는 경우 수행되는 문장
 			}
 			
 			조건이 두개인 경우 ==> && 
 			if(아이디가 같고 비밀번호가 같으면 )
 		   =if(id.equals("") && pwd.equals(""))
 		   {
 		   }
 		   
 		   웹 => 일반사용자 => 최대한 서비스로 아이디/비밀번호 각각 확인하는 프로그램을 짜는게 좋다
 		   ///////////////////////////
 		   if(id.equals(""))		//다중X 중첩조건문 O
 		   {
 		   		if(pwd.equals(""))
 		   		{
 		   			로그인 성공!
 		   		}
 		   		else
 		   		{
 		   			비밀번호가 일치하지 않습니다
 		   		}
 		   	}
 		   	else
 		   	{
 		   		아이디가 존재하지 않습니다
 		   	}
 		   ///////////////////////////
 		    
 		   선택문 : 네트워크 , 게임 (키값)
 		   switch(정수, 문자,문자열)	==> 해당 위치로부터 break가 나올 때까지 수행
 		   				   ----- 자바는 문자로 처리해서 사용할 수 있다?
 		   {
 		   	 case "Find":	-  
 		   	 case "Login":  - 다음 break까지 두 개를 동시에 처리할 수 있다
 		   	 	처리
 		   	 	break;
 		   	 case "Logout":
 		   	 	처리
 		   	 	break;
 		   	 ...
 		   	 ...
 		   	 default:
 		   	 	해당 문자열이 없는 경우 처리
 		   }
 		   =======> 1	2(문장2,3,4 수행)
 		   case 1:
 		   	문장1	  => 수행 후 종료
 		   	break;
 		   case 2:
 		   	문장2
 		   case 3:
 		   	문장3
 		   case 4:
 		    문장4
 		    break;
 		   case 5:
 		    문장5
 		   
 		   switch()
 		   {
 		   	case 1:
 		   		int a=10;
 		   		System.out.println(a);
 		   		break;
 		   	case 2:
 		   		int a=20;
 		   		System.out.println(a);
 		   		break;
 		   	case 3:
 		   		int a=30;
 		   		System.out.println(a);
 		   		break;					====> !!!오류!!!! 같은 블록 안에는 같은 변수명을 사용해서는 안된다!! 
 		   										블록을 따로따로 사용해야한다
 		   										혹은/ 데이터형 제외 후 a값만 바꿔준다   int a=10 ===> a=10
 		   	}
 		   
 	2. 반복문
 		------------- 목록, 페이징 (화면 출력)
 		1) for	: 반복횟수가 지정된 경우
 		2) while: 반복횟수가 없는 경우
 			=> 파일 읽기 , 데이터베이스
 		3) do~while : 한번 이상을 수행 ...
 	   
 	3. 반복 제어문
 		------------- 페이징
 
 */

import java.io.*;
import java.util.Scanner;
public class 제어문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int i=1;
		switch(i)
		{	
		case 1:
		{
			int a=10;
			System.out.println(a);
		}
		   	
		   	break;
		case 2:
		{
			int a=20;
			System.out.println(a);
		}
		   	
		   	break;
		case 3:
		{
		   	int a=30;
		   	System.out.println(a);
		 }
		   		
		   	break;	
		}
	}*/
		String[] title= {"Kitsch","CHRISTIAN","꽃","Ditto","Hype boy","Teddy Bear","사건의 지평선","OMG","심 (心)",
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
		System.out.println("총 "+title.length+"곡");	
		int page=0;
		if(page==0)
			page=1; 			// 1페이지를 디폴트로 만들 때 쓰는 방법
		while(true)
		{
		int j=0;
		int rowSize=10;
		int pagecnt=(page*rowSize)-rowSize;	//start
		/*
		 * 	start    end
		 * 	0		  9			=> 1page
		 *  10		 19 		=> 2page
		 * ~~~	  ~~
		 */
		
		// => **오라클 (인라인뷰) ; 자동 나눔 기능이 있음. 자바는 매 루프를 돌려서 오래걸리나, 오라클은 그렇지 않음.
		for (int i=0;i<title.length;i++)
		{
			if(j<rowSize && i>=pagecnt)		// 0~9 skip 
											//페이지를 나누는 문장( j<10//rowSize개씩 가져오기 , i>=pagecnt//10페이지 넘어가면 다음으로)
			{
				System.out.println((i+1)+"."+title[i]);
				j++;
			}
		}
		Scanner scan=new Scanner(System.in);
		System.out.print("페이지 입력: ");
		page=scan.nextInt();
		break;
		}												//=====> !! 페이징 기법 !!
		
		System.out.println("while문 사용");
		try
		{
			//FileReader = 파일 읽기 FileWriter = 파일 쓰기
			FileReader fr=
					new FileReader("C:\\javaDev\\javaStudy\\Chapter4_문자열배열\\src\\문자열_2.java");
			int i=0;
			while((i=fr.read())!=-1)
			{
				System.out.print((char)i);
			}
		}catch(Exception ex) {}
		
		
}
}