/*
 * 100~999 사이의 4의배수가 아닌 수의 갯수,합을 출력하는 프로그램 작성
 */

public class 제어문문제_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0,sum=0;
		for(int i=100;i<=999;i++)
		{
			if(i%4!=0) // == if(!(i%4==0))
			{
				count++;
				sum+=i;
			}
		}
		System.out.println("갯수:"+count);
		System.out.println("합:"+sum);
	}

}
