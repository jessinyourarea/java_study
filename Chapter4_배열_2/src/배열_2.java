/*
 * 알파벳 20ㅐ 저장하는 공간을 만든다
 *  char c1!~c10;
 *  char[] alpha=new char [10]
 *  알파벳 10000개 저장하는 공간을 만든다
 *  char c1~100000;  가장 큰 알파벳을ㄸ
 *   => if(max<c2) ==> 9999
 *   char[] alpha=new char(100000);
 */

		// *** 배열 변수가 3개 이상이면,
public class 배열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//1. 선언
		int [] arr=new int[5];		// =>new/ 새로운 동적 메모리 핳당
	//2.초기화
		for(int i=0;i<arr.length; i++)
			arr[i]=(int)(Math.random()*100)+1;
	//3.출력
		for (int i:arr)
		{
			System.out.print(i+" ");
			
		}
	//4. 제어 //정렬
		//5. 제어판 출력
		
		
		
		
	}

}
