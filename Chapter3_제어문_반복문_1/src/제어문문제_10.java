/*
 * 10) B,D,F,H,J,L,N을 출력하는 프로그램을 작성하라 (for 사용)
 2개 단위
 65 67
 */
public class 제어문문제_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i=0;
//		for(i=65;i<=91;i++)
//		{
//			if(i%2==0)
//			 System.out.print((char)i+"\t");
//		}
		
		for(char c='B';c<='N';c+=2)
		{
			System.out.print(c+"\t");
		}
			
	}

}
