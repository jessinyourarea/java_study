import java.util.ArrayList;
import java.util.Arrays;

/*
 * 		정렬 : ASC(올림차순/ascend)/DESC(내림차순/descend)多
 * 		----------------------------------------------
 * 		선택정렬 / 버블정렬
 * 		선택정렬( select sort)
 * 
 * 		10 30 50 20 40	=> 10 20 30 40 50 ASC 50 40 30 20 10 DESC
 * 		-- -- 비교
 * 		30 10 크면 바뀜.
 * 		--	  -- 비교
 * 		50    30
 * 		--	     -- 비교
 * 		50		 20 작으면 그대로
 * 		--			-- 비교								   0번 선택됐을 때 4
 * 		50			40 ------------------------- 1Round => 0	-	4
 * 		--------------
 * 		50 10 30 20 40
 * 		-- -- --비교
 * 	   고정 30 10 
 * 		   --    --비교
 * 		   30    20
 * 		   --       --비교
 * 		   40       30 --------------------------2Round => 1	-	3
 * 		--------------
 * 		50 40 10 20 30
 * 			  -- --비교
 * 			  20 10
 * 			  --    --
 * 			  30    20 --------------------------3Round => 2	-	2
 * 			  --------
 * 		50 40 30 10 20
 * 				 -- --비교
 * 				 20 10 --------------------------4Round => 3	-	1
 * 		--------------
 * 		50 40 30 20 10
 * 					-- 						(length-1 round)
 * 		i		j	
 * 		start	횟수
 		0		4
 		1		3
 		2		2
 		3		1
 		---------	i+j=4 =>j=4-i;
 							 =length-1-i;	
 		
 * 			
 */
public class 배열응용_알고리즘_1_선택정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println("======정렬전 =======");
		System.out.println(Arrays.toString(arr));
		System.out.println("======정렬후(DESC) =======");
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}System.out.println("==== for "+(i+1)+"회차 ======");
			System.out.println(Arrays.toString(arr));

		} 
		
		System.out.println("========정렬후(ASC)======");
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.println("==== for "+(i+1)+"회차 ======");
			System.out.println(Arrays.toString(arr));
			
	}	

	}
}















