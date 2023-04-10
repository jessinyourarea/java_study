/*
 * 
	
	
			
			2. 1~10까지 합을 구하는 메소드 구현
			
			



			3. 1~n까지 합을 구하는 메소드 구현
				n 매개변수
			4. 두 정수를 나눗셈 결과를 구해주는 메소드 구현
				두개정수 매개변수 나눗셈결과 리턴형
			5. 문자열의 소문자를 대문자로 바꿔주는 메소드 구현
			매개변수 소문자 -> 리턴형 대문자
			6. 문자열을 거꾸로 출력하는 메소드 구현
			
			static int method3(int n)
{
	
}

static String method5(String s)
{
	
}
			
			
			메소드 : 클래스의 구성 요소(동적)
			-----
			  1) 특정 기능을 수행하는 명령문의 집합
			  					 ---- 연산자/제어문
			  2) 한가지 기능만 수행할 수 있게 한다
			     예)
			     	댓글
			     	---------- 댓글 class
			     	댓글 목록 출력
			     	댓글 쓰기
			     	댓글 수정
			     	댓글 삭제
			     	-----------
			     	
			     	게시판 (Class)
			     	----------
			     	글쓰기
			     	목록 출력
			     	상세보기
			     	수정
			     	삭제
			     	----------
			     	
			     	영화 (CGV) ====> 상속(메가박스) ====> 상속(롯데시네마)
			     	----------
			     	목록 출력
			     	상세보기
			     	예약하기
			     	추천하기
			     	검색하기
			     	---------- 
			     	
			3) 메소드 구성 요소
				선언부
				void display()
				구현부
				{
					처리
				}
				
				선언부
				[접근지정어][옵션] 리턴형 메소드명(매개변수)
									-----  ------> 사용자가 요청한 값
												   0개 이상 ~ 여러 개가 올 수도 있음
									알파벳,한글로 시작(대소문자 구분)
									숫자 사용 가능(단, 맨처음은 금지)
									키워드는 사용 금지
									특수문제 ( _ , & )
									공백을 사용할 수 없음
									*** 소문자로 시작한다:약속
							   ---- 기본형(int,long,byte,double,char,boolean)
							   ---- 배열 , 클래스 가능
				--------  --- static/final/abstract 
				public/protected/default/private
				공공		상속 시	 같은 폴더내 같은자바에서만
				
				static int add(int a, int b)
				{			   a=10    b=20
					return a+b;
				}
				
				호출
				넘겨준 데이터를 받아서 저장
				int result=add(10,20);
				    ------ 30
				*** 메소드를 호출 시에는 메소드는 처음부터 끝까지 수행한 후에호출된 위치로 온다.
				*
				
				메소드 만드는 방법
				--------------
				리턴형	매개변수
				  O       O		=> String substring(int s,int e)
				  				   String s="Hello Java";
				  				   String ss=s.substring(0,5);
				  O		  X		
				  X		  O
				  X		  X
			    -------------
				
 */






public class 메소드문제_2 {
	//1. 1~10까지 출력하는 메소드 구현
	static void method1()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
		}	
		System.out.println();
	}

	//2. 1~10까지 합을 구하는 메소드 구현

	/* static void method2() 
	{
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			sum+=i;
		}
		System.out.println("sum="+sum);
	}	*/
	
	static int method2() 
	{
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			sum+=i;
		}
		return sum;
	}
	
	//3. 1~n까지 합을 구하는 메소드 구현
	static void method3(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum+=i;
		}
		System.out.println("sum="+sum);
	}
	//4. 두 정수를 나눗셈 결과를 구해주는 메소드 구현
	//   ------ 10 20 
		static double method4(int a, int b)
		{
			return a/(double)b;
		}
		
		
	//5. 문자열의 소문자를 대문자로 바꿔주는 메소드 구현
	
		static String method5(String s)
		{
			/*String result="";
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)>='A' && s.charAt(i)<='Z')
					result+=s.charAt(i);
				else if(s.charAt(i)>='a' && s.charAt(i)<='z')
					result+=(char)(s.charAt(i)-32);
			}*/
			return s.toUpperCase();
		}
	
	//	6. 문자열을 거꾸로 출력하는 메소드 구현
		
		static void method6(String s)
		{
			 for(int i=s.length()-1;i>=0;i--)
			{
				System.out.print(s.charAt(i));
			} 
			/*StringBuffer sb=new StringBuffer();
			sb.append(s);
			String ss= sb.reverse().toString();
			System.out.println(ss);*/
		}

	
	
	public static void main(String[] args) {
		method1();
		int sum=method2();
		System.out.println("sum="+sum);
		method3(100);
		
		double d=method4(10,3);
		System.out.printf("%.2f\n",d);
		
		String s=method5("Hello Java");
		System.out.println(s);
		
		method6("Hello Java");
		
	}
}

