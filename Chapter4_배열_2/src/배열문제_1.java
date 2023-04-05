/*
 * 1에서 100까지 3의 배수를 더하는 while 문의 빈칸에 적절한 코드를 삽입하라.

/ 반복제어문
 * => 특정 부분을 제외하고 반복 수행할 것이냐 (continue;)
 * => 반복을 종료할 것이냐 (break;)
 */
public class 배열문제_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0, i=1;
		while (i<100) {
			if(i%3 != 0)
			{
				i++;
				continue;
			}
			else 
				sum += i;
				i++;
		}
		System.out.println(sum);
	}

}
