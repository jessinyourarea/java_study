import java.util.Scanner;
/*
 *   같은 문자열인지 확인
 *   => 기본형 (==,!=)
 *   => 문자열 비교 (equals() , !equals())
 *   => login => id , password
 *   
 
 */
public class 문자열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String ID="hong";
		final String PWD="H1234";
		
		Scanner scan=new Scanner(System.in);
		System.out.println("아이디 입력:");
		String id=scan.next();
		System.out.print("비밀번호 입력:");
		String pwd=scan.next();
		//String => 문자열 저장이 아니고 메모리 주소 저장..! (다른 변수에 저장되어있기 떄문에 메모리주소값이 다르다)
		//로그인처리
		//equals => 메모리에 저장되어 있는 실제 문자열 비교, 대소문자를 구분
		//대소문자를 구분하지 않는 기능은 ==> 검색 / equalsIgnoreCase
		//로그인처리 , 아이디찾기 , 아이디 중복체크 , 비밀번호 찾기 
		if(id.equals(ID) && pwd.equals(PWD))
		{
			System.out.println(id+"님 로그인되었습니다");
		}
		else
		{
			System.out.println("아이디나 비밀번호가 틀립니다");
		}
		
			
	}

}
