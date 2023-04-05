/*
 * 		데이터 저장 						- 데이터 처리(사용자) 	- 데이터 출력
 * 		한개의 데이터 저장(메모리에); 변수				|
 * 		= 데이터형(정수실수논리문자)					|
 * 										연산자
 * 										= 단항연산자(증감,부정,형변환)
 * 										= 이항연산자(산술,비교,논리,대입)
 * 										= 삼항연산자
 * 										제어문
 * 										= 조건문,반복문,반복제어문
 * 
 * 		* 1. 데이터 여러개를 모아서 관리 ; 배열
 * 			(관련있는 데이터/같은 데이터)	
 * 		  2. 다른 데이터를 모아서 관리	; 클래스
 * 
 * 
 * 
 * 		배열 : 관련된 데이터를 여러개 모아서 한개의 이름으로 관리/제어
 * 			  ----------             --------
 * 			  데이터형이 동일하고,		 
 * 			1) 데이터를 배열로 모아서 관리 => 연속적인 메모리 공간으로 만든다
 * 										--------------
 * 			2) 단점: 고정적이다(한번 지정되면 추가,삭제 불가능)
 * 					--------가변형 (컬렉션 프레임워크 제공)
 * 			3) 한개의 이름으로 사용 (구분자: 인덱스) => 0,1,2 ...
 * 			예) 
 * 				int a=10,b=20,c=30,d=40,e=50;
 * 				
 * 				  RAM
 * 				0-------
 * 				 이클립스에서 사용중
 * 				4-------
 * 					10		-> a
 *  			8-------
 *  			 이클립스에서 사용중
 *  			12-------
 *  				20		-> b
 *  			16-------
 *  			 이클립스에서 사용중
 *  			20-------
 *  				30		-> c
 *  			24-------
 *  
 *  			28-------
 *  				
 *  			배열 => 데이터를 5개 배치해달라.	=> arr
 *  			------------------------------------------
 *				|	10	 |	20	|	30	|	40	| 	50	|  
 *  			------------------------------------------
 *  			|		 |		|		|		|	
			   100		104		108		112		116
			   arr		arr=1	arr+2	arr+3	arr+4
			   맨 앞의 번지를 알고 있으면 된다.
			   ==> 100+0*4	arr[0]
			   ==> 100+1*4	arr[1]
			   ==> 100+2*4  arr[2]
			   ==> 100+3*4	arr[3]
			   ==> 100+4*4	arr[4]		 
			   =====================index번호는 0~부터 시작해서 갯수만큼 (0~갯수)  
 *  			* index번호는 순차적으로 만들어진다.
 *  			** 갯수확인 => length
 *  
 *  
 *  			1. 배열 선언
 *  				데이터형[] 배열명;	=> 권장 사항
 *  				데이터형 배열명[];	=> C언어 파생
 *  			2. 배열 초기화
 *  				1)선언과 동시에 초기화
 *  				  데이터형[] 배열명;= {10,20,30,40,50} =>예/5개를 동시에 저장하는 공간을 만들어줌.
 *  				  데이터형[] 배열=new 데이터형[]10;
 *  					   --->X, 요기는 비었음.
 *  					   new를 사용하면 자동으로 기본 디폴트값으로 채운다
 *  					   byte,short,int => 0
 *  					   long =>0L
 *  				       char => '\0'
 *  					   float => 0.0F
 *  				       double => 0.0
 *  					   boolean ->false
 *  			3. 데이터 읽기
 *  				int a=10;
 *  				System.out.println(a)
 *  				int[] arr={10,20,30,40,50}
 *  				System.out.println(arr[1]) ==>20
 *  
 *  			4. 변경
 *  				int a=10;
 *  				a=20;
 *  
 *  				int[] arr={10,20,30,40,50}
 *  				arr[3] = 200;
 *  						arr={10,20,30,200,50}
 *  			
 */
public class 배열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수 5개를 연속적으로 배치 ==> 배열
		//int[] arr=new int[10000];	// 0 0 0 0 0
		
		/*for(int i=1;i<arr.length;i++)	//
		{
			System.out.println("arr["+i+"]="+arr[i]);
		}*/
		int a1=(int)(Math.random()*100)+1;
		int a2=(int)(Math.random()*100)+1;
		int a3=(int)(Math.random()*100)+1;
		int a4=(int)(Math.random()*100)+1;
		int a5=(int)(Math.random()*100)+1;
		int a6=(int)(Math.random()*100)+1;
		int a7=(int)(Math.random()*100)+1;
		int a8=(int)(Math.random()*100)+1;
		int a9=(int)(Math.random()*100)+1;
		int a10=(int)(Math.random()*100)+1;
		
		System.out.println("a1="+a1);
		System.out.println("a2="+a2);
		System.out.println("a3="+a3);
		System.out.println("a4="+a4);
		System.out.println("a5="+a5);
		System.out.println("a6="+a6);
		System.out.println("a7="+a7);
		System.out.println("a8="+a8);
		System.out.println("a9="+a9);
		System.out.println("a10="+a10);
		
		int max=a1;
			if(max<a2)
				max=a2;
			if(max<a3)
				max=a3;
			if(max<a4)
				max=a4;
			if(max<a5)
				max=a5;
			if(max<a6)
				max=a6;
			if(max<a7)
				max=a7;
			if(max<a8)
				max=a8;
			if(max<a9)
				max=a9;
			if(max<a10)
				max=a10;
			System.out.println("최대값:"+max);
			
			
		
	}

}
