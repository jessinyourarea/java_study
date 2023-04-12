/*
 
  
  
 
 */
//class가 되기 위한 조건 
// 1) 데이터 2) 기능 
   // 명사형    동사형
/*
 	번호 작성자 내용 제목 작성일 비밀번호 조회수   ... 명사형 (변수)
 	글쓰기 수정하기 내용보기 삭제하기 조회수올리기  ... 동사형 (메소드)
 	
 	학생 => 유형
 	게시판 => 무형
 	------------ 모든것 단순화 => 객체 지향 프로그램
 	
 	클래스
 	***= 변수 여러개 저장하는 공간 => 사용자정의 데이터형 (데이터형 클래스)
 	  ~VO(Spring) , ~DTO(MyBatis) , ~Bean(JSP) ====> 변수만 들어있는 폴더)
 	  		data transfer object(데이터를 묶어서 한번에 전송할 목적으로 만든 공간)
 	  value object 
 	***= 기능만 설정하는 클래스 : ~DAO , ~Service , ~Manager
 	  데이터베이스 연결(data access object), 브라우저 전송 , Jsoup(액션 클래스)
 	= 변수+메소드 혼합 => 극히 드물다
 */

//--- 커뮤니티 CURD insert update read delete
class Board{
	int no;				//0
	String name;		//null
	String subject;		//null
	String content;		//null
	String pwd;		// 본인여부 확인 null
	String regdate; 	//null
	int hit;			//0
}
public class 사용자정의_데이터형_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 첫번쨰 게시물
		Board b1=new Board();
		System.out.println("b1="+b1); //Board@515f550a > 7개를 저장할 수 있는 메모리 공간
		b1.no=1;
		b1.name="홍길동";
		b1.subject="메모리 공간 만들기(사용자 정의)";
		b1.content="class를 이용해서 데이터를 모아서 관리";
		b1.regdate="2023-04-12";
		b1.pwd="1234";
		System.out.println("게시물 번호:"+b1.no);
		System.out.println("작성자:"+b1.name);
		System.out.println("제목:"+b1.subject);
		System.out.println("내용:"+b1.content);
		System.out.println("작성일:"+b1.regdate);
		System.out.println("조회수:"+b1.hit);
	}

}
