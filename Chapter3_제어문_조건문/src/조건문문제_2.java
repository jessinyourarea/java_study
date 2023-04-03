/*
 * 			문제2. 정수 한 개를 입력받아서, 그 수가 3의 배수인지 판단해보자.
 * 
 * 
 * 
 * 				Random할때 0~100 숫자는 (math.random()*100)+1
 */
import java.util.Scanner;
public class 조건문문제_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("하나의 정수 입력:");
		int num=scan.nextInt();
		if(num%3==0)
			System.out.printf("%d는 3의 배수입니다.",num);
		else
			System.out.printf("%d는 3의 배수가 아닙니다.",num);

	}

}
