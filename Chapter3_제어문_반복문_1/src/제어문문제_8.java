/*
 * 8) 2+4+6+....100까지의 정수의 합을 구하고 출력하라 (for 사용)
2의 배수, 합
 */
public class 제어문문제_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0, sum=0;
		for(i=2;i<=100;i++)
		{
			if(i%2==0)
				sum+=i;
		}
		System.out.println("2+4+6+....100의 합:"+sum);
	}

}
