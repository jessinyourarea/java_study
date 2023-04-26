package com.sist.util;
/*
 	java.util ==> 프로그램 개발 시 유용하게 사용할 수 있는 클래스의 집합
 	=> 반.드.시. import를 사용해야 한다 (import java.util.*)
 	
 	1) Random : 난수 발생
 	2) Date/Calendar : 날짜 / 시간
 	3) StringTokenizer : 문자열 분리
 	4) Collection
 			|
 	  -----------------------		
 	  |			 |			|		==> 전부 Interface
 	List	    Set		   Map
 	  |			 |			|
 ArrayList	  HashSet	  HashMap     *****비중 높다*****
 	
 		List : 순서가 존재, 데이터의 중복을 허용
 		Set : 순서가 없음, 데이터의 중복을 불허용 => 사용처 : 장르
 		Map : 순서가 없음, 저장시에 키와 값을 동시에 저장 => 클래스관리
 		-----------------------------------------------------
 		
 		
 	Arrays => 배열을 제어하는 기능
 	-------  배열 데이터 출력 toString()
 	------- sort : 정렬
 	------- Arrays.asList() => 배열을 ArrayList로 변경
 	
 	Random() => nextInt() => int범위
 				nextInt(5) ==> //0~4
 				nextInt(101) ==>//0~100
 				nextInt(100)+1 ==>//1~100
 	
 
 */
import java.util.*;
public class 라이브러리_Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Random r=new Random();
		int a=r.nextInt(100)+1; //1~100
		System.out.println(a); */
		
		int[] numbers=new int[10];
		Random r=new Random();
		for(int i=0;i<numbers.length;i++)
		{
			numbers[i]=r.nextInt(100)+1;
		}
		System.out.println("=================정렬전    ===================");
		System.out.println(Arrays.toString(numbers));
		Arrays.sort(numbers);
		System.out.println("=================정렬후(ASC)===================");
		System.out.println(Arrays.toString(numbers));
		System.out.println("=================정렬후(DESC)===================");
		for(int i=numbers.length-1;i>=0;i--)
		{
			System.out.print(" "+numbers[i]+"  ");
		}
	}

}
