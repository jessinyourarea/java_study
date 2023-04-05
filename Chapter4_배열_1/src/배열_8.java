import java.util.Arrays;

/*
 * 
 */
public class 배열_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {10,20,30,40,50};
		int[] arr2=arr1.clone();	//	별칭(참조데이터)- 주소값이 같기 때문에 같은 메모리를 제어/쓰기 때문
		//int[] arr2=arr1.clone();				// .clone(); 을 주면 다른 메모리에 저장하도록 복제시키는 
		System.out.println("arr1="+Arrays.toString(arr1));
		System.out.println("arr2="+Arrays.toString(arr2));
	
		System.out.println("=============배열값 변경================");
		/*arr2[0]=100;
		arr2[1]=200;
		arr2[2]=300;
		arr2[3]=400;
		arr2[4]=500;*/
		
		System.out.println("arr2="+Arrays.toString(arr2));
		System.out.println("arr1="+Arrays.toString(arr1));	//arr2를 바꾸면 arr1도 바뀐다..!?-  주소값이 같기 때문에 같은 메모리를 쓰기 때문
		
		System.out.println(arr1);
		System.out.println(arr2);
		
		int[] arr3=new int[5];
		for(int i=0;i<arr1.length;i++)
		{
			arr3[i]=arr1[i];
		}								//	.clone(); 하는 다른 방법/ clone쓰려면 데이터가 같아야한다

	}

}
