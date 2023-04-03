// 1-2+3-4+5-6+7-8+9-10  ==> 값
// for문은 반드시 숫자의 패턴이 있어야함

public class 반복문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			if(i%2==0) //짝수
			{
				sum-=i;
			}
			else //홀수
			{
				sum+=i;
			}
		}
		System.out.println("sum="+sum);			// for문 안에서 빼서 수행하도록, 밖에서 작성.
	}

}
