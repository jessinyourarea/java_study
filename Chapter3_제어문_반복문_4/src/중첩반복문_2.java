/*
 * 	★
 * 	★★
 * 	★★★
 * 	★★★★
 * 
 * 	 i   j
 * 	줄수	별표
 *   1	 1
 *   2   2
 *   3   3		 i와 j의 관계를 찾아라!
 *   4   4    ===> i=j	==>	j<=i
 *   
 * 	★★★★
 * 	★★★
 * 	★★
 * 	★	
 * 
 *   i   j		
 * 	줄수	별표
 *   1	 4
 *   2   3
 *   3   2
 *   4   1	===> 역순이면 + 더해요/ 
 *   			===> i+j=5 ==> j=5-i
 */


/*
 * A
 * BC
 * DEF
 * GHIJ
 * 
 * 
 * A
 * AB
 * ABC
 * ABCD
 * 
 * 
 * 	#234
 * 	1#34
 * 	12#4
 * 	123#
 * 
 * 	---------
 *   i   k   j   ===> i와k 관계 / i와j 관계
 * 	줄수	공백	별표		  역순>i+k=4	 / j=i
 * 	 1	 3   1			k=4-i
 *   2   2   2
 *   3   1   3
 *   4   0   4
 *   
 * 	   ★
 * 	  ★★
 * 	 ★★★
 * 	★★★★
 * 
 *  ★★★★
 *   ★★★
 *    ★★
 *     ★
 *     
 *     		★   	1
 *     	   ★★★
 *        ★★★★★
 *       ★★★★★★★
 * 	/*
 * 		i<=4
 * 		j<=7-i
 * 		k<=i*2-1
 */

/*	
 * 
 * 		==> 정렬
 * 		==> 빈도구하기
 * 		==> 등수구하기
 * 		==> 마름모 / 나비  / 모래시계 출력하기
 * 
 * 
 * 
 */
public class 중첩반복문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{	
				System.out.print("★");
			}
			
		System.out.println();
		} */
		
		
		
		/* for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(c++);
			}
			System.out.println();
		}*/
		
		
		for(int i=1;i<=4;i++)
		{
			char c='A';
			for(int j=1;j<=i;j++)
			{
				System.out.print(c++);
			}
		System.out.println();
		}				// 변수 char c='A';를 첫번째 for문 안에 넣었더니 c값이 고정되었다!!!!!!!!!
		
		
		/* for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(i==j)
					System.out.print("#");
				else
					System.out.print(j);
			}
			System.out.println();
		} */
		
	}

}
