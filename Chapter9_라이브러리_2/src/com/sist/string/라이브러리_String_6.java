package com.sist.string;
/*
 concat : 문자열 결합 (+)
 
 	String s1="Hello ";
 	String s2="Java";
 	s1.concat(s2) ==> "Hello Java";  -----> 평소에는 +로 문자결합하는게 더 편함
 String(리턴형) concat(String s)
 	
 	따로 쓰임이 있는 곳: MySQL LIKE 문장을 만들 때
 		WHERE name LIKE CONCAT('%','홍길동','%')
 		WHERE name LIKE '%'||홍||'%'
 		
 endsWith : 끝나는 문자열이 같은 경우에 사용
 boolean(리턴형) endsWith(String s)
 
 ----------------
 charAt()
 equals() 대소문자 구분, equalsIgnoreCase() 대소문자구분없이
 -------ID PWD		  -------- 영어검색 , 영문이름
 indexOf() , lastIndexOf()-- 뒤에서부터 찾기
 ------ 위치 확인(문자나 문자열)
 		+ 앞에서부터 찾기
 length() : 문자 갯수
 startsWith() : 시작문자열이 같은 경우 = 검색어 suggest
 substring() : 원하는 문자열을 자를때
 trim() : 공백 제거할 때
 split() : 특정 문자로 자르는 경우
 contains() : 포함 문자열인지 확인하는 경우
 valueOf() : 모든 데이터형을 문자열로 변환하는 경우
 */
public class 라이브러리_String_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Hello "; //공백도 문자다. 
		String s2="Java!!";
		System.out.println(s1.concat(s2));
		System.out.println(s1+s2);
	
		if(s2.endsWith("!!"))
			System.out.println("does end with !!");
		else
			System.out.println("doesn't end with !!");
	
		// equals() 대소문자 구분, equalsIgnoreCase() 대소문자구분없이
		String[] data= {"Java","java","Java","JAva","JAVa","jaVA","javA"};
		for(String s:data)
		{
			if(s.equals("java"))
				System.out.println(s);
		}
		//equals는 대소문자를 구분해서 비교
		// 원형 : boolean equals(String s)
		// 사용처 : 로그인, 상세보기
		// 라이브러리 외우는 순서: 1)기능 2)리턴형 3)매개변수 4)사용처 
		System.out.println("=====equalsIgnoreCase=====");
		for(String s:data)
		{
			if(s.equalsIgnoreCase("java"))
					System.out.println(s);
		}
		//equalsIgnoreCase: 대소문자를 구분하지 않고 비교
		// 원형 : boolean equalsIgnoreCase(String s)
		// 사용처 : 검색 , 영문이름찾기 , 영문으로 된 데이터를 찾을 때
		// 한글 : equals 
		// 한글 : 자음으로 찾기 -> 사용자 정의 (자바,오라클)
		System.out.println("=============length() ====================");
		String[] data2= {"apple",
						"avocado",
						"banana",
						"blackberry",
						"blueberry",
				  	"cherry tomato",
				  	"cherry",
				  	"coconut",
				  	"grape",
				  	"kiwi",
				  	"lemon"
		};
		//1. 각 과일명의 문자길이를 출력
		for(String s:data2)
		{
			System.out.println(s+":"+s.length());
		}
		System.out.println("===========================");
		System.out.println("가장 긴 이름의 과일명을 출력하시오");
		
		/*String max = data2[0];
		for(int i=0;i<data2.length;i++)
		{
			if(max.length()<data2[i].length())
				max=data2[i];
		}
		System.out.println(max); */
		int max=0;
		for(String s:data2)
		{
			if(max<s.length())
				max=s.length();
		}
		for(String s:data2)
		{
			if(s.length()==max)
			{
				System.out.println(s);
			}
		}
		// length() : 문자 갯수
		// 원형 : int length()
		// 사용처 => 문자 제한이 있는 경우 , 비밀번호
		// 오라클에서는 => VARCHAR2(10)\
		
		System.out.println("======= startsWith ===========");
		// startsWith => 시작 문자열이 같은 경우
		// 원형 : boolean startsWith(String s)
		// 사용처 : 자동 완성기 (검색기) , 쿠키 검색
		// 쿠키 =>  key는 중복없이 -> 구분: hotel1 hotel2...
		for(String s:data2)
		{
			if (s.startsWith("c")) 
			{
				System.out.println(s);
			/*(	try
				{
					Thread.sleep(1000);
				}catch(Exception ex) {} */
			}
		}
		System.out.println("========= trim ===========");
		// trim() : 좌우 공백 제거
		// 원형 : String trim() +매개변수없음
		// 사용처 : 로그인 , 회원가입 , 검색 ...
		// 사용자가 입력 시 => space
		// String id="admin" != " admin"
		String id="admin";
		if(id.equals(" admin".trim()))
		{
			System.out.println("같은 ID");
		}
		else
		{
			System.out.println("다른 ID");
		}
		System.out.println("======== contains ========");
		for(String s:data2)
		{
			if(s.contains("a"))
			{
				System.out.println(s);
			}
		}
		// contains : 포함 문자열을 찾을 경우
		// 원형 : boolean contains(String s)
		// 사용처 : 검색 , 추천
		
		System.out.println("======= valueOf ===========");
		// valueOf : String에서 유일한 static 메소드
		// 모든 데이터형을 문자열로 변환
		// 원형 : static String valueOf((type)) ==> overloaded 
		// 사용처 :  자바에서 윈도우 전송 , 네트워크 전송 , 웹 (String만 인식)
		System.out.println(String.valueOf(10)+String.valueOf(30));
		//"10"+"30" ==> "1030"
		System.out.println("========= substring =============");
		// substring() indexOf() lastIndexOf()
		String ss="http://localhost:8080/JSPProject/main/main.do";
		String res=ss.substring(ss.lastIndexOf("/")+2);
		
		System.out.println(res);
		
		ss.substring(ss.indexOf("//")+2);
		System.out.println(ss);
		res=ss.substring(0,ss.indexOf("/"));
		System.out.println(res);
		
		ss="서울특별시 용산구 소월로2길 27 지번 서울시 용산구 후암동 445-8";
		res=ss.substring(0,ss.indexOf("지"));
		System.out.println(res.trim());
		
		res=ss.substring(ss.indexOf( "지")+2);
		System.out.println(res.trim());
				
				
				
		// substring() : 원하는 문자열을 자르는 경우
		// 오버로딩
		// substring(int s) : 시작문자열 s번쨰부터 마지막까지 잘라온다
		// substring(int s,int e) -> s부터 e-1까지 잘라온다
		// 원형 : String substring(int s)
		//		 String substring(int s,int e)
		// 사용처 : URL주소 제어 , 주소 제어 , 문자열이 긴 경우(...)
		
		ss="홍길동,이순신,강감찬,박문수,을지문덕,심청이,춘향이";
		String[] names=ss.split(",");
		// 특수문자별로 잘라서 배열에 저장
		// 원형 : String[] split(String regexp);
		// 구분이 되어있는 문자열이 있는 경우 분리
		System.out.println("============split ===========");
		for(String name:names)
		{
			System.out.println(name);
		}
		ss= ("깜빠뉴"+ "8,000원"
				+ "샤퀴테리"
				+ "16,000원"
				+ "당근샐러드"
				+ "4,500원"
				+ "야채볶음"
				+ "16,000원"
				+ "뇨끼"
				+ "25,000원");
			String[] menu=ss.split("원");
		for(String m:menu)
		{
			System.out.println(m+"원");
		}
		
		ss="red?blue?green?black?white?yellow";
		String [] colors=ss.split("\\?");  // | 얘는 정규식에서 사용하는 기호
		for(String c:colors)
		{
			System.out.println(c);
		}
		System.out.println("========= replace ==========");
		//replace() :문자/문자열 변경
		// 원형 : String replace(char old, char new);
		//		 String replace(String old, String new)
		ss="https://mp-seoul-image-production-s3.mangoplate.com/415676/923979_1597451518946_42091?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80";
		// 오라클에 저장하려고 하니 ==> &는 오라클에서 Scanner라는 뜻 // 변경해서 사용해야 한다
		res=ss.replace("&", "#");
		System.out.println(res);
		System.out.println(res.replace("#","&"));
	}

}
