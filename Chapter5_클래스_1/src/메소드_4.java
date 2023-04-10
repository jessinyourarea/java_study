import java.util.Arrays;

/*
 		리턴형	매개변수
 	1	 O		  O
 	2	 O		  X
 	3	 X        O
 	4	 X        X
 	
 	--------------------
 	1) 2단~9단까지 구구단을 출력	(매개변수가 없고 걍 출력이니까 4번이 편함)
 		static void gugudan()
 		{
 		}
 	2) id,pwd를 받아서 로그인 가true/부false		( 매개변수도 있고, 처리되는 값도 리턴해야하니까 1번이 편함)
 		static boolean isLogin(String id,String pwd)
 		{
 		}
 	3) 검색어를 입력받아서 검색된 노래명들을 출력			(3번)
 		static void find(String fd)
 		{
 		}
 	   검색어를 입력받아서 검색된 노래명들을 받아서 출력			(1번)
 		static String[] find(String fd)
 		{
 		}
 	4) 5개 정수를 넘겨주고 정렬된 정수를 가져와라.
 		static int[] sort(int a,int b,int c,int d,int e)	=====> 결과값이 여러개일 경우에는
 		static int[] sort(int[] arr)							   리턴명이 배열이 될 수도 있단거 기억하기!
 		{
 		}
 */

//6개의 난수를 발생해서 => 전송 받은 다음 => 총합 , 평균 구하기
public class 메소드_4 {
	
	//6개 난수 발생
	static int[] rand()
	{
		int[] arr=new int[6];
		for(int i=0;i<6;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		
		return arr;
	}
	// 최대값, 최소값
	static int max(int[] arr)
	{
		int m=arr[0];
		for(int a:arr)
		{
			if(m<a)
				m=a;
		}
		return m;
	}
	static int min(int[] arr)
	{
		int m=arr[0];
		for(int a:arr)
		{
			if(m>a)
				m=a;
		}
		return m;
	}
	
	static void process()
	{
		int[] arr=rand();		//얕은 복사(주소값만 받기)
		int total=0;
		for(int a:arr)
		{
			total+=a;
		}
		System.out.println(Arrays.toString(arr));
		
		
		System.out.println("총합:"+total);
		System.out.printf("평균:%.2f\n",total/(double)arr.length);
		System.out.println("최대값:"+max(arr));
		System.out.println("최소값:"+min(arr));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
