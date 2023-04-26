package com.sist.string;
//charAt(i)
// 코테 :  문자열을 입력해서 좌우대칭인지 확인
import java.util.Scanner;
public class 라이브러리_String_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String data="";
		//오류 처리 ************** 없으면 틀린것
		while(true)
		{
			System.out.println("문자열 입력:");
			data=scan.next();
		

			break;
		}
		///////////////////////////////////
		System.out.println("data="+data);
		boolean bCheck=false;
		for(int i=0;i<data.length()/2;i++)
		{
			char s=data.charAt(i);
			char e=data.charAt(data.length()-1-i);
			if(s==e)
				bCheck=true;
		}
		if(bCheck==true)
		{
			System.out.println(data+"는(은) 좌우대칭입니다");
		}
		else
		{
			System.out.println(data+"는(은) 좌우대칭이 아닙니다");
		}

	}

}
