import java.util.Arrays;

public class 배열_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {10,'A','B',100,15};
		System.out.println(arr1);		// 메모리에 실제 저장되어있는 주소!! 신기해
		System.out.println(Arrays.toString(arr1));
		double[] arr2= {10,'A','B',100,15.7};
		System.out.println(Arrays.toString(arr2));
		char[] arr3= {'A',66,'C',78,97};
		System.out.println(Arrays.toString(arr3));
		boolean[] arr4=new boolean[5];			//boolean의 초기값은 false
		System.out.println(Arrays.toString(arr4));
		byte[] arr5=new byte[5];
		System.out.println(Arrays.toString(arr5));	//byte,int의 초기값은 0
		// int[] arr; ==> null(주소가 없는 경우)
	}

}
