import java.util.Arrays;

public class 배열응용_알고리즘_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr=new int[5];
		 for(int i=0;i<arr.length;i++)
		 {
			 arr[i]=(int)(Math.random()*100)+1;
			 
		 }
		 System.out.println("=======정렬전========");
		 System.out.println(Arrays.toString(arr));
		 System.out.println("=======정렬후========");
		 Arrays.sort(arr);							// 버블소트로 가져오는법, DESC는 안됨!
		 System.out.println(Arrays.toString(arr));
		 
		 for(int i=arr.length-1;i>=0;i--)			//인덱스 끝번호부터 인덱스0까지 내림차순으로 부르는 방법, 버블소트(ASC)를 반대로 불러오니 DESC.
		 {
			 System.out.println(arr[i]+" ");
		 }

		 
	}

}
