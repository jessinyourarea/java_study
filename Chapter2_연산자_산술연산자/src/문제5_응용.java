import java.util.Scanner;
public class 문제5_응용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int a,b,c;
		System.out.println("정수 세 개를 입력하세요(20 30 40):");
		a=scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();
		
		System.out.printf("%d*%d+%d=%d",a,b,c,a*b+c);
	}

}
