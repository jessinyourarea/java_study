package com.sist.inter;
import java.util.*;
import com.sist.manager.*;

public interface BoardInterface {
	// 기능
	// 1. 목록 출력
	public List<BoardVO> boardListData(int page);
	// 2. 상세보기
	public BoardVO boardDetailData(int no);
	// 3. 글쓰기
	public void boardInsert(BoardVO vo);
	// 4. 수정하기
	public BoardVO boardUpdatedData(int no);
	// 5. 실제 수정 적용하기
	public String boardUpdate(BoardVO vo);	//비밀번호 확인 절차
	// 6. 삭제
	public String boardDelete(int no, String pwd);	//비밀번호 확인 절차
	// 7. 자동 증가번호
	public int noIncrement();	//번호 중복없이 만들기 위해
	
	// 댓글, 답변은 추후 추가 ...
}
