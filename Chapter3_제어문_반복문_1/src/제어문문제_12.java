/*
 * 12) 1부터 30까지의 정수에서 짝수만 한 줄에 3개씩 출력하라
 * i%2==0
 * 3개씩..? 
 * 짝수의 갯수 세기> 이게 3일때 \n 이용
 * 
 */
public class 제어문문제_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int i=0;
		//int count=0;
		//count++;
		
		for(int i=1;i<=30;i++)
		{
			if(i%2==0)
			{	
				System.out.printf("%2d\t",i);
				if(i%3==0)
					System.out.println( );
			}
				
		}
	}			
}
