//	정수를 입력받아서 3의 배수, 5의 배수, 7의 배수인지 확인, 아닌 경우에는 배수가 아니다 를 출력.

public class 조건문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=(int)(Math.random()*100)+1;
		System.out.println(num);
		if(num%3==0)
		{
			System.out.println(num+"는(은) 3의 배수입니다.");
		}
			if(num%5==0)
			System.out.println(num+"는(은) 5의 배수입니다.");
		if(num%7==0)
			System.out.println(num+"는(은) 7의 배수입니다.");
		if(!(num%3==0 || num%5==0 || num%7==0))
			System.out.println("해당 배수가 아닌 수입니다.");
	}

}
