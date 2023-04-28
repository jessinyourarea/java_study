package com.sist.text;
import java.text.*;
public class 라이브러리_DemicalFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df=new DecimalFormat("##,###,###");
		// 오라클 => 99,999,999 => TO_CHAR(123456798,"999,999,999")
		int won=12345678;
		System.out.println(df.format(won)+"원");
		
		System.out.println("=======================================");
		double[] limit={59,60,70,80,90};
		String[] grade= {"F","D","C","B","A"};
		int[] score= {100,90,85,90,80,72,60,58};
		ChoiceFormat cf=new ChoiceFormat(limit, grade);
		for(int i=0;i<score.length;i++) 
		{
			System.out.println(score[i]+":"+cf.format(score[i]));
		}
	}

}
