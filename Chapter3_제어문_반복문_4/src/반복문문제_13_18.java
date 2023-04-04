/*
 * 13. 다음 결과를 출력하는 프로그램
 
 출력예) ********** (5행10열) 
           ********** 
           ********** 
           ********** 
           **********
14. 다음 결과를 출력하는 프로그램
 
 출력예) 1 1 1 1 1 
          2 2 2 2 2 
          3 3 3 3 3 
          4 4 4 4 4 
          5 5 5 5 5 

16. 다음 결과를 출력하는 프로그램
 
 출력예) 1 2 3 4 5 
          1 2 3 4 5 
          1 2 3 4 5 
          1 2 3 4 5 
          1 2 3 4 5

17. 다음 결과를 출력하는 프로그램
 
 출력예) A B C D E
          A B C D E
          A B C D E
          A B C D E
          A B C D E

18. 다음 결과를 출력하는 프로그램
 
 출력예) A A A A A         
          B B B B B               
          C C C C C
          D D D D D
          E  E E E E

 */
public class 반복문문제_13_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=10;j++)
			{
				System.out.print("*");
			}
			System.out.println( );
		}
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println( );
		}
		//18//
		System.out.println( );
		char c='A';
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(c+" ");
			}
			System.out.println();	//줄 띄우고
			c++;					//변수값 증가시키기
		}
	}

}
