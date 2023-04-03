/*
 * 	문제6. 임의의 문자를 추출하여 대문자인지 소문자인지 확인하는 프로그램 작성
 * 
 * 
 *	91
 */
public class 조건문문제_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=(int)(Math.random()*2);		//0,1
		char ch;
		if(no==0)
			ch=(char)(Math.random()*26+65);		//대문자
		else
			ch=(char)(Math.random()*26+97);
		
		//System.out.println(ch);
		
		if(ch>='A' && ch<='Z')
			System.out.println(ch+"는(은) 대문자입니다");
		else
			System.out.println(ch+"는(은) 소문자입니다");
	}
	

}
