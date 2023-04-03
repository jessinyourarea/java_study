/*
 * 두 개의 정수를 입력 받아서 첫째 수를 둘째 수로 나눈 나머지를 출력하는 프로그램을 작성해 보자.
 * 
 * 정수를 랜덤으로 받는 걸로 만들어보았다
 */
public class 문제13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		a=(int)(Math.random()*100)+1;
		b=(int)(Math.random()*100)+1;
		System.out.printf("a=%d,b=%d,a%%b=%d",a,b,a%b);
	}

}
