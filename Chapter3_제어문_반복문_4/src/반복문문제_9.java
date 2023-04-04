/*9. 0~12까지 2의 배수, 3의 배수의 합을 구하여라.

*/
public class 반복문문제_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a2=0, a3=0;
		for(int i=0;i<=12;i++)
		{
			if(i%2==0)
				a2+=i;
			if(i%3==0)
				a3+=i;
		}
		System.out.println("sum="+(a2+a3));
	}

}
