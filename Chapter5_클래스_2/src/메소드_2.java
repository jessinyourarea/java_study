/*
 * ID, pwd를 받아서 로그인 처리
 * 
 * 
 */
import java.util.Scanner;
	/*리턴형은 경우의 수
	두개의 수 -> boolean
	세개   ==> int, String
			  id가 없는 경우	=> NOID
			  id는 존재, password가 틀리는 경우 => NOPWD
			  ID, PWD => LOGIN
			  ------------------------------
			  1. 재사용
			  2. 견고
			  3. 가독성 
	*/

public class 메소드_2 {
	static String isLogin(String id, String pwd)
	{
		String[] ids= {"hong","park","shim","lee","kang"};
		String[] pwds= {"1234","3456","4567","5678","6789"};
		String[] names= {"홍길동","박문수","심청이","이순신","강감찬"};
		// 이후 파일, 오라클에서 가져오는 연습 할 예정 (지금은 메모리에 저장된 상태/ 휘발성)
		
		//id 검색
		int index=0;
		boolean bCheck=false;
		for(int i=0;i<ids.length;i++)
		{
			if(id.equals(ids[i]))
			{
				bCheck=true; //ID가 존재한다
				index=i;
				break;
			}
		}
		String result="";
		
		if(bCheck==true)
		{
			//ID 존재
			//비밀번호 검색
			if(pwd.equals(pwds[index]))
			{
				result=names[index];	// 로그인된 상태
			}
			else
			{
				result="NOPWD";	// 비밀번호 틀림
			}
		}
		else
		{
			result="NOID";//ID 없는 상태
		}
		return result;
	}
	
	
	
	static void process()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("아이디 입력:");
		String id=scan.next();
		
		System.out.print("Password 입력:");
		String pwd=scan.next();
		
		//검증	(로그인 처리)
		String result=isLogin(id,pwd);
		
		if(result.equals("NOID")) //ID 없는 상태
		{
			System.out.println("아이디가 존재하지 않습니다!!");
		}
		else if(result.equals("NOPWD")) //비번 틀린 상태
		{
			System.out.println("비밀번호가 틀립니다!!");
		}
		else //로그인된 상태
		{
			System.out.println(result+"님 로그인 되었습니다");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
