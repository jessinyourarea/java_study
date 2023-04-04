/*
 * 1~1000까지에서 7의 배수의 합 ,9의 배수의 합
 */
public class 제어문문제_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum7=0,sum9=0;
		for(int i=1;i<=1000;i++)
		{
			if(i%7==0)
			{
				sum7+=i;
			}
			if(i%9==0)
			{
				sum9+=i;
			}
		}
		System.out.println("7의 배수:"+sum7);
		System.out.println("9의 배수:"+sum9);
		System.out.println("7의 배수+9의 배수:"+(sum7+sum9));


	}

}
