import java.util.Arrays;

/*
 	1. 달력 만들기
 	
 		기능
 		 1. 년도 /월 입력
 		 2. 1일자의 요일 확인 ==> 세분화
 		 3. 1일부터 달력 출력
 		 --------------------
 		 =====> 재사용할 수 있는 메소드는 오직...(윤년 체크뿐..)
 		 
 
 	2. 숫자 야구게임
 		난수 발생
 		사용자 입력
 		비교
 		힌트 제공
 		종료여부 확인
*/
/*
 		40 30 10 50 20
 		> 셀렉트 정렬
 		맨 앞의 숫자를 고정해서 그 다음 인덱스의 순서대로 하나씩 비교하며 정렬하고,
 		그렇게 그 다음 인덱스의 순서대로 숫자를 고정하며 다음의 순서들을 하나씩 비교 정렬.
 		
 */


public class 메소드조립법_1_정렬 {
	static void sort(int[] arr,int n)	//n=1 ASC , n=2 DESC
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				boolean bCheck=false;
				if(n==1)
					bCheck=arr[i]>arr[j];		// i>j 면 뒷숫자가 작아야 하니 esc (순위 결정, e.g.음악/노래)
				else
					bCheck=arr[i]<arr[j];		// i<j 면 앞숫자가 작아야하니 desc (목록, 최신걸 확인할때, e.g.게시판)
				
				if(bCheck) // 
				{
						int temp= arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
				}
			}
		}
	}
	static void rand(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];
		rand(arr);
		System.out.println("정렬 전:"+Arrays.toString(arr));
		sort(arr,1);
		System.out.println("정렬 후(ASC):"+Arrays.toString(arr));
		sort(arr,2);
		System.out.println("정렬 후(DESC):"+Arrays.toString(arr));
		
	}

}
