/*
 * 3) Scanner 클래스를 이용하여 한 개의 정수를 입력 받아 정수의 절대값을 출력하라

 */
import java.util.Scanner;
public class 제어문문제_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 입력:");
		int a=scan.nextInt();
		if(a>=0)
			System.out.println(a);
		else
			System.out.println(-a);
	}

}
//Math.abs(num) > 절대값 출력하는 라이브러리