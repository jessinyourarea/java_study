/*
 정수를 입력 받아서 이진법을 출력하는 메소드 작성(3개의 메소드)
		정수 입력 process1
		이진법 처리 / 입력받은 정수를 이진법으로 process2
		출력 

	method => 140page
	1) 메소드 형식  => 기능 처리
	   --------
	   	
	   	리턴형 메소드명(매개변수..) => 선언부
	   	{
	   		구현부
	   	}
	 	= 리턴타입(리턴형)
	 	  처리 후 결과값 한개만 전송이 가능하다
	 	  ** 여러개인 경우: 배열 , 클래스
	 	  ** 한개인 경우 : 일반 기본형 , String
	 	  1) 결과값이 있는 경우
	 	  	리턴형 메소드명(매개변수..)
	 	  	----
	 	  	{
	 	  		return 값;
	 	  			   --- ===> 리턴형과 값은 일치 (혹은 리턴형이 클 수도 있다)
	 	  	}
	 	  	
	 	  	예) 
	 	  		int method()
	 	  		{
	 	  			return 10.5; ==> !!오류!! int<double
	 	  		}
	 	  		
	 	  		int method()
	 	  		{
	 	  			return (int)10.5; 
	 	  		}
	 	  		==> int a=method(); ==> a=10
	 	  			==> method(); //넘겨주는 값을 저장/출력할 수 없음. 넘겨준 값을 받을 변수가 제시되지 않음.
	 	  		double method()
	 	  		{
	 	  			return 10;
	 	  		}
	 	  		==> double d=method()
	 	  			==> 결과값을 받아서 처리
	 	  			예) 오라클에서 데이터를 읽기
	 	  				-----------------
	 	  				=> 브라우저로 보내기 위해
	 	  		int[] method()
	 	  		{
	 	  			int[] arr={1,2,3,4,5};
	 	  			return arr;		// 배열은 주소(배열명)만 넘겨준다
	 	  		}
	 	  		==> int[] =method();
	 	  		
	 	  		String method()
	 	  		{
	 	  			return "";
	 	  		}
	 	  		===> String s=method();
	 	  2) 결과값이 없는 경우
	 	  		void method()
	 	  		----
	 	  		{
	 	  			return; // 메소드 종료
	 	  		}
	 	  		void method1()
	 	  		{
	 	  			생략=> 컴파일러가 자동으로 추가 return
	 	  		}
	 	  		=> import 추가
	 	  		   import java.lang.* => 자동 추가
	 	  		   		  System
	 	  		   		  String
	 	  		   		  Math
	 	  		   		  -----------
	 	  		   		  
	 	  		===> method();
	 	  		
	 	= 메소드명 => 식별자와 동일
	 				길이에 제한이 없다 => 의미부여하며~
	 	- 매개변수 : 사용자 요청값
	 	
 
 
 */
import java.util.Arrays;
import java.util.Scanner;
public class 메소드문제_1 {
	static void process1()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("0~32767까지의 정수 입력:");
		int num=scan.nextInt();
		//api
		System.out.println(Integer.toBinaryString(num));
		//while
		int[] binary=new int[16];
		int index=15;
		while(true)
		{
			binary[index]=num%2;		//2로 나눈 나머지값들을 인덱스 뒷순서부터 앞으로 값을 주기
			num=num/2;
			if(num==0)					//
				break;
			index--;
		}
	for(int i=0;i<binary.length;i++)
	{
		if(i%4==0 && i!=0)			//4비트씩 나눠서 출력함
			System.out.print(" ");
		System.out.print(binary[i]);
	}
	}
	
	
	// 임의의 정수를 배열로 생성해서 입력하고 정렬하는 프로그램 작성 
	static void process2()
	{	
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*10)+1;	//1~9
			for(int j=i+1;j<arr.length;j++)
			{	
				if(arr[i]<arr[j]) // 
				{
						int temp= arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}	//select sort, bubble sort, api sort (Arrays.sort())
		
	
	//  3. 년도를 입력 받아 윤년여부를 확인하는 프로그램 작성
	static void process3()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("년도 입력:");
		int year=scan.nextInt();
		if((year%4==0 && year%100!=0) || year%400==0)
			System.out.println(year+"년도는 윤년입니다.");
		else
			System.out.println(year+"년도는 윤년이 아닙니다.");
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process2();
	}	

}
