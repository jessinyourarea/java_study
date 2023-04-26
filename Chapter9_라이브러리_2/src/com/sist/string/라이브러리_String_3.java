package com.sist.string;
/*
 	String 메소드 (문자열 제어하는 기능)
 		
 	 String은 문자열 배열
 	 ------ 문자마다 인덱스번호를 가지고 있다( 0부터 시작)
 	  String s="Hello Java"
 	  		    0123456789 ==> 오라클은 1번
 	  		    자바) == != substring(0,3)=> 0 1 2 
 	  		    오라클) = <> substr(1,5) => 1번부터 5개 
 	  		    자바스크린트) === !==
 	  주요 기능 (310page)
 	  
 */
import java.util.Scanner;
public class 라이브러리_String_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*String msg="Hello Java";
		for(int i=0;i<msg.length();i++)
		{
			System.out.println((i+1)+"번째 문자:"+msg.charAt(i));
		}
		
		for(int i=msg.length()-1;i>=0;i--)
		{
			System.out.print(msg.charAt(i));
		} */
		
		//알파벳 문자열을 입력받아ㅓㅅ 대문자 몇개ㅡ, 소문자 몇개를 출력하는 프로그램
		Scanner scan=new Scanner(System.in);
		System.out.print("문자열 입력:");
		String data=scan.nextLine(); //next는 공백을 포함하지 않음. nextLine은 엔터 전까지 모두 입력 가능.
		int a=0,b=0; // a b는 대소문자의 갯수. 변수부터 잡기

		for(int i=0;i<data.length();i++)
		{
			char c=data.charAt(i);
			if(c>='A' && c<='Z')
				a++;
			else if(c>='a' && c<='z')
				b++;
		}
		System.out.println("대문자 갯수:"+a);
		System.out.println("소문자 갯수:"+b);
		
	
	}
}
