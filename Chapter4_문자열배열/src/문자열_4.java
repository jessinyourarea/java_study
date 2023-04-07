// length()	=> 문자갯수 => 
// trim() ==> 좌우 공백 제거
// javascript => java와 메소드 동일 => jquery / vuejs / reactjs
import java.util.Scanner;
public class 문자열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner scan=new Scanner(System.in);
		System.out.println("문자열 입력:");
		String s=scan.next();
		System.out.println("입력된 값:"+s);
		System.out.println("문자 갯수:"+s.length()); */
		
		String s=" Hello Java!! ";
		System.out.println(s.length());
		System.out.println(s.trim().length());	// 좌우 공백만 제거, 가운데는 XXX
	}

}
