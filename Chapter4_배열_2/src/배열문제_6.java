/*
 * 양의 정수 10개 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력하는 프로그램을 작성하라
 */
import java.util.Arrays;
import java.util.Scanner;
public class 배열문제_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		Scanner scan=new Scanner(System.in);
		System.out.println("양의 정수 10개 입력:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
		
		//출력 3의배수
		for(int i:arr)
		{
			if(i%3==0)
			{
				
				System.out.println(i);
			}
			
	
	}
	}
}
