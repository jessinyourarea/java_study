/*
 * 배열의 필요성.. 얼마나 줄일 수 있나?
 * 
 * 	
 * 
 * 	배열 선언
 * 	int[] arr=new int[5];
 * 	
 */
public class 배열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
			System.out.printf("arr[%d]=%d\n",i,arr[i]);
		}							// 변수 세팅
		
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			
			if(max<arr[i])
				max=arr[i];
		}
		System.out.println("최댓값:"+max);	//max값 세팅 (변수 max와 arr배열 내의 값을 비교 후 제일 큰 것을 max로 집어넣기)
	}

}
