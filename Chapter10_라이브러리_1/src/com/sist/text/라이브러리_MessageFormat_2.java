package com.sist.text;

import java.text.MessageFormat;

/*
 	
 	
 	
 */
public class 라이브러리_MessageFormat_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t");
		//String msg="{0}\t{1}\t{2}\t{3}\t{4}\t{5}\t";
		String msg="이름:{0}\n국어:{1}\n영어:{2}\n수학:{3}\n평균:{4}\n평균:{5}\n";
		Object[] obj1= {"홍길동",90,90,90,270,90.0};
		System.out.println(MessageFormat.format(msg, obj1));
		System.out.println("==============================");
		Object[] obj2= {"심청이",90,90,90,270,90.0};
		System.out.println(MessageFormat.format(msg, obj2));
		System.out.println("==============================");
		Object[] obj3= {"박문수",90,90,90,270,90.0};
		System.out.println(MessageFormat.format(msg, obj3));
		System.out.println("==============================");
		
		
		}
	}

