package com.sist.manager;
import java.util.*;

import com.sist.inter.BoardInterface;

import java.io.*;
public class BoardManager implements BoardInterface{
	//게시물 전체를 가지고 있는다 = List를 이용해서 => 접속한 모든 사람에게 공유되게. 
	private static List<BoardVO> list=
			new ArrayList<BoardVO>();
	/*		
	 		Collection
	 			|
	 		---------------------------
	 		|				|		
	 	  List			   Set				Map => Interface
	 	    |				|				 |
	 	  ArrayList       HashSet		  HashMap
	 	 =>List: 순서 존재(인덱스 순대로), 데이터 중복 허용
	 	 	예) 게시판
	 	 =>Set: 순서 없음 , 데이터 중복 불허용
	 	 	예) 회원가입
	 	 =>Map: 순서 없음 , 두 개를 동시 저장 (Key, Value) 
	 	   								K는 중복X, V는 중복가능.
	 	   	예) 데이터 송/수신 => 웹에서 지원하는 대부분의 클래스가 Map형식
	 	   	    ---------- 웹(C/S) 방식이니까					
	 	
	 */
	static 
	{
		/* 		 *초기화 하기
			 멤버변수에 대한 초기화
			 ------
			    인스턴스 변수 : new를 이용해서 메모리 저장 시마다 따로 저장된다
			    			 (heap공간에 저장)
			    정적변수(static) : 컴파일 시 자동 저장
			    
			    3중 1택..
			    1) 명시적인 초기화
			    2) 생성자를 이용한 초기화
			    3) 초기화 블럭을 이용한 초기화
			    	= 인스턴스 변수를 초기화
			    	  {
			    	  }
			    	= static 변수를 초기화
			    	  static
			    	  {
			    	  }
			   
			   여기서는 명시적 초기화는 X, 선언과 동시에 값을 부여하는데, 구현이 필요할 경우에는 사용하지 못한다
			   											      ---(파일 읽기, 데이터 읽기, 메소드 호출 등)
			   											         (이런 건 클래스 블록에서는 구현이 불가능하기 때문)
		 */
		// 파일을 List<Board>형으로 읽어옴.
		FileInputStream fis=null;
		try
		{
			fis=new FileInputStream("c:\\java_datas\\board.txt");
			ObjectInputStream ois=
					new ObjectInputStream(fis);
			list=(List<BoardVO>)ois.readObject();
			ois.close();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try {
				fis.close();
			}catch(Exception ex) {}
		}
	}
	//기능 설정




	// 1. 목록 출력
	@Override
	public List<BoardVO> boardListData(int page) {
		// TODO Auto-generated method stub
		List<BoardVO> bList=
				new ArrayList<BoardVO>();
		int j=0;
		int rowSize=10;
		int start=(page-1)*rowSize;
		// 오라클은 => 인라인뷰 이용 예정
		// WHERE no BETWEEN 1 AND 10(no)
		// LIMIT 1(no) AND 10(갯수) ==> MySQL,MariaDB 방식
		for(int i=0;i<list.size();i++)
		{
			if(j<10 && i>=start)
			{
				bList.add(list.get(i));
				j++;
			}
		}
		return bList;		//페이지가 나눠진 listData를 출력
	}
	//1-1 총페이지
	public int boardTotalPage()
	{
		return (int)(Math.ceil(list.size()/10.0));
	}
	// 3. 상세보기
	@Override
	public BoardVO boardDetailData(int no) {
		BoardVO vo=new BoardVO();
		// 조회수 증가 
					// SQL에서는 ...
					// UPDATE board SET
					// hit=hit+1
					// WHERE no=1;
		for(BoardVO bvo:list)
		{
			if(no==bvo.getNo())
			{
				bvo.setHit(bvo.getHit()+1); 	//먼저, 조회수 증가
			}
		}
		//상세 볼 내용 가져오기
		for(BoardVO bvo:list)
		{
			if(no==bvo.getNo())	
			{
				vo=bvo;							//그다음, 상세볼 내용 가져오기
			}
		}
		return vo;
	}
	// 2. 글쓰기
	@Override
	public void boardInsert(BoardVO vo) {
		int no=noIncrement();
		vo.setNo(no);
		vo.setRegdate(new Date());
		list.add(vo);
		try
		{
			FileOutputStream fos=
					new FileOutputStream("c:\\java_datas\\board.txt");
			ObjectOutputStream oos=
					new ObjectOutputStream(fos);
			oos.writeObject(list);
			fos.close();
			oos.close();
		}catch(Exception ex) {}
	}
	// 4-1 수정
	@Override
	public BoardVO boardUpdatedData(int no) {
		BoardVO vo=new BoardVO();
		for(BoardVO bvo:list)
		{
			if(bvo.getNo()==no)
			{
				vo=bvo;
			}
		}
		return vo;
	}
	// 4-2. 수정
	@Override
	public String boardUpdate(BoardVO vo) {
		// TODO Auto-generated method stub
		return null;
	}
	// 5. 삭제
	@Override
	public String boardDelete(int no, String pwd) {
		// TODO Auto-generated method stub
		return null;
	}
	//자동 증가번호
	// CREATE SEQUENCE no_seq START WITH 1 INCREMENT BY 1	==> 오라클
	// AUTO_INCREMENT 	==> MySQL
	
	@Override
	public int noIncrement() {
		// TODO Auto-generated method stub
		int max=0;
		for(BoardVO vo:list)
		{
			if(vo.getNo()>max)
			{
				max=vo.getNo();
			}
		}
		return max+1;
	}
	
	

}
