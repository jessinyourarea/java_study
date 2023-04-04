/*
 * 11. 10개의 정수를 입력받아 그 수들 중 짝수의 개수가 몇개인지 출력하는 프로그램 작성
 * 12. 10개의 정수를 입력받아 3의 배수의 개수와 5의 배수의 개수를 각각 출력하는 프로그램
 * 
 */
public class 반복문문제_11_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=1;i<=10;i++)
		{
			int num=(int)(Math.random()*100)+1;
			System.out.println("num="+num);
			if(num%2==0)
				count++;
		}
		System.out.println("=========결과값===============");
		System.out.println("짝수의 총 갯수:"+count);
		
		int count3=0,count5=0;
		for(int i=1;i<=10;i++)
		{
			int num=(int)(Math.random()*100)+1;
			System.out.println("num="+num);
			if(num%3==0)
				count3++;
			if(num%5==0)
				count5++;
		}
		System.out.println("=========결과값===============");
		System.out.println("3의 배수의 총 갯수:"+count3);
		System.out.println("5의 배수의 총 갯수:"+count5);
	}

}
