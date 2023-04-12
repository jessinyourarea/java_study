/*
 	1. 같은 자바 파일에 클래스 여러개 만들 수 있다
 	   ------------------
 	   public은 한개의 class에서만 사용 가능. 
 	2. 권장 사항 ==> 파일을 따로 만든다
 
 
 */
class Category
{
	int no;		//눈에 보이지는 않지만 구분자가 필요하다 
	String poster;
	String title;
	String subject1;
}
/*
 * 	멤버변수 (인스턴스 변수)
 * ---------------------
 * 1. 기본형
 * 2. 배열
 * 3. 클래스
 */
class FoodHouse
{
	int no;		//중복되지 않는 숫자 => primary key(상세보기 가능)
	int cno; //참조키(각 카테고리 번호)foreign key
	String[] poster=new String[5];
	String name;
	double score;
	String address1,address2;
	String tel;
	String type;
	String price;
	String parking;
	String stime,etime;
	String hol;
	String menu;
	
}
public class 사용자정의_데이터형_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
