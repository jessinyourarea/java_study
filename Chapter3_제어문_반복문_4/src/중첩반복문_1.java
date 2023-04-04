/*
 * 	2차 for문
 * 
 * 		중첩
 * 		조건문
 * 			if()
 * 			{
 * 				if()
 * 				{
 * 				}
 * 			}
 *		for(4)		===>줄수
 *		{
 *			for(5)	===>출력 개수  //한줄에 몇개를 출력할것인지.
 *			{
 *			}
 *		}
 * 		
 * 		 1	 2	 3	 4	 5	
 * 		 6	 7	 8	 9	10	
 * 		11	12	13	14	15
 * 		16	17	18	19	20
 * 
 * 		A	B	C
 * 		D	E	F
 * 		G	H	I
 * 		J	K	L
 * 		M	N	O
 * 			  1    2	4
 * 		for(초기값;조건식;증가식)		==========> 몇줄인지
 * 		{
 * 				|
 * 			-----------------------------------------
 * 				 1	   2    4
 * 			for(초기값;조건식;증가식) =========> 실제 출력물
 * 			{
 * 				반복 수행문장 3
 * 			}
 * 			===> 2번에서 false	===> 1차 foranswmdrktlrdmfh dlehd
 * 			-----------------------------------------
 * 			다음줄로 내려주는 일 수행
 * 		}
 * 
 * 	2*1=2 3*1=3 ... 9*1=9
 * 	----
 * 	----
 * 	2*9=18 3*9=27 ... 9*9=81
 * 
 * 	9줄/8개출력
 */
public class 중첩반복문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*char c='A';
		for(int i=1;i<=5;i++) //줄만 생성
		{
			for(int j=1;j<=3;j++)
			{
				System.out.print(c++ +" ");
			}
			System.out.println( ); 
		} */
		/*for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			
			{
				System.out.print("i="+i+",j="+j+" ");
			}
		System.out.println( ); } */
		
		System.out.println("=====구구단=====");
		for(int i=1;i<=9;i++)
		{
			for(int j=2;j<=9;j++)
			{
				System.out.printf("%2d*%2d=%2d\t",j,i,j*i);
			}
			System.out.println();
		}
	}

}
