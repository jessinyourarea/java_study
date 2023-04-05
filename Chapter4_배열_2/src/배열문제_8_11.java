/*
 * 5개 정수를 입력받은 후 차례로 출력하는 프로그램 
입력예) 5 10 9 3 2
출력예) 5 10 9 3 2


문자 10개를 저장할 수 있는 배열을 선언하고 10개의 문자를 입력받아 입력받은 문자를 이어서 출력하는 프로그램 
입력예) A B C D E F G H I J
출력예) ABCDEFGHIJ



 

 */
import java.util.Arrays;
import java.util.Scanner;
public class 배열문제_8_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 8
		int[] arr1=new int[5];
		
		
		//9
		char[] arr2=new char[10];
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=(char)((Math.random()*26)+65);			
		}
		for(char c:arr2)
		{
			System.out.print(c);
		}
		System.out.println( );
		
		//10
		/*
		 정수 10개를 입력받은 후 세번째, 다섯번쨰와 마지막으로 입력받은 정수를 차례로 출력하는 프로그램 
         입력예) 5 3 9 6 8 4 2 8 10 1
         출력예) 9 8 1
		 */
		int[] arr3=new int[10];
		for(int i=0;i<arr3.length;i++)
		{
			arr3[i]=(int)(Math.random()*10)+1;			
		}
		System.out.println(Arrays.toString(arr3));
		System.out.println("3번째:"+arr3[2]);
		System.out.println("5번째:"+arr3[4]);
		System.out.println("마지막:"+arr3[arr3.length-1]);
		System.out.println(arr3[2]+" "+arr3[4]+" "+arr3[arr3.length-1]);
		
		//11
		/*
		 10개의 정수를 입력받아 그 중 가장 큰 수를 출력하는 프로그램
		 입력예) 5 10 8 55 6 31 12 24 61 2
		 출력예) 61
		 */
		int[] arr4=new int[10];
		for(int i=0;i<arr4.length;i++)
		{
			arr4[i]=(int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(arr4));
		
		int max=arr4[0];
		for(int i:arr4)
		{
			if(max<i)
				max=i;
		}
		System.out.println("최대값:"+max);
		
	}

}
