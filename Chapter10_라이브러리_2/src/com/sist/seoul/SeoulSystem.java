package com.sist.seoul;
import java.util.*;
import java.awt.MenuBar;
import java.io.*;
public class SeoulSystem {
	private static ArrayList data=new ArrayList();
	static
	{
		try
		{
			FileReader fr=new FileReader("c:\\javaDev\\seoul_location.txt");
			int i=0; 
			StringBuffer sb=new StringBuffer();
			while((i=fr.read())!=-1) //EOF
			{
				sb.append((char)i);
			}
			fr.close();
			System.out.println(sb.toString());

			String[] locations=sb.toString().split("\n");
			for(String s:locations)
			{
				StringTokenizer st=new StringTokenizer(s,"|");
				SeoulLocationVO vo=new SeoulLocationVO();
				vo.setNo(Integer.parseInt(st.nextToken()));
				vo.setName(st.nextToken());
				vo.setContent(st.nextToken());
				vo.setAddress(st.nextToken());
				data.add(vo);
			}
			
		}catch(Exception ex) {}
	}
	
	//메뉴 만들기 (목록, 상세보기, 명소 검색, 시스템 종료)
	public int seoulListMenu()
	{
		System.out.println("===========SEOUL LIST ============");
		System.out.println("1. 목록 출력");
		System.out.println("2. 상세 보기");
		System.out.println("3. 명소 검색");
		System.out.println("9. 시스템 종료");
		System.out.println("==================================");
		Scanner scan=new Scanner(System.in);
		System.out.print("메뉴 선택:");
		return scan.nextInt();
	}
	
	public ArrayList locationListData(int page)
	{
		int totalPage=(int)(Math.ceil(data.size())/10.0);
		int start=(page-1)*10;
		int end=page*10;
		if(page==totalPage)
		{
			end=start+data.size()%10;
		}
		ArrayList locationList=new ArrayList(data.subList(start, end));
		return locationList;
	}
	public static void main(String[] args) {

		int totalPage=(int)(Math.ceil(data.size())/10.0);
		System.out.println(totalPage);
	}

	
	//목록 출력
	//상세보기
	//명소검색
	//조립
	public void process()
	{
		while(true)
		{
			int menu=seoulListMenu();
			if(menu==9)
			{
				System.out.println("프로그램 종료!!");
				break;
			}
			else if(menu==1)
			{
				Scanner scan=new Scanner(System.in);
				System.out.print("페이지 입력:");
				int page=scan.nextInt();
				ArrayList sList=locationListData(page);
				for(int i=0;i<sList.size();i++)
				{
					SeoulLocationVO vo=(SeoulLocationVO)sList.get(i);
					System.out.println(vo.getNo()+"."+vo.getName());
				}
			}
		}
		
	}
	

}