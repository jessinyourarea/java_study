/*
 * 배열 alpha를 모두 출력하고자 한다. 빈칸에 적절한 코드를 삽입하시오.

 * 
 * 
 * 

 */
public class 배열문제_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] alpha = {'a', 'b', 'c', 'd'};

		for(int i=0;i<alpha.length;i++)
		{    
			System.out.print(alpha[i]+" ");
		}
		System.out.println( );
		
		
		for(char c:alpha)
		{
			System.out.print(c+" ");
		}									//for-each구문(향상된 for문) >> 권장 !!!!!!!!
		}
	}

