// 16비트 => 0,1
//2진법 만들기

import java.util.Scanner;
public class 배열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		int input=scan.nextInt();
		System.out.println(Integer.toBinaryString(input));
		//저장 공간(0,1)
		int[] binary=new int[16];
		int index=15;				// 뒤에서부터 채워 나가기 위해서 index를 가장 뒷번호부터 줌.
		while(true)
		{
			binary[index]=input%2;
			input=input/2;
			if(input==0)
				break;
			index--;			// index 15였으니까 뒤에서~앞으로 오게끔 15~14~~
			
		}
		for(int i=0;i<binary.length;i++)
		{
			if(i%4==0 && i!=0)		//i!=0 맨처음에 0을 안 띄게 하려고 부정시켜버림.(0이면 0이 나오니까)
			{
				System.out.print(" ");
			}
			System.out.print(binary[i]);
		}
	}

}
