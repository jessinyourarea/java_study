/*
 * 		문제1. 정수 한 개를 입력받아서, 그 수가 50 이상의 수인지 50미만의 수인지 
         판단해보자.
 * 										--------------------------
 * 										조건이 2개/true와 false > 그럴 땐 if~else!
 * 
 */
import java.util.Scanner;
public class 조건문문제_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		int num=scan.nextInt();
		if(num>=50)
			System.out.printf("%d는(은) 50이상 입니다.",num);
		else
			System.out.printf("%d는(은) 50미만 입니다.",num);

	}

}
