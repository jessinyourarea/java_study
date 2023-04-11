/*
 
 
 
 */
import java.util.Arrays;
import java.util.Scanner;
/*
 	1. 난수 발생
 	2. 사용자 입력
 	-----------------------------
 	3. 비교
 	4. 힌트
 	-----------------------------
 	5. 프로그램종료 여부
 */
public class 메소드조립법_3 {
	static void getNumbers(int[]com, int[]user)
	{
		for(int i=0;i<3;i++)
		{
			com[i]=(int)(Math.random()*9)+1; //1~9
			for(int j=0;j<i;j++)
			{
				if(com[i]==com[j])
				{
					i--;				
					break;				// 중복 없는 숫자
				}
			}
		}
	
		while(true)
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("세자리 정수 입력:");
			int input=scan.nextInt();
			if(input<100 || input>999)
			{
				System.out.println("잘못된 입력입니다!!");
				//while문의 조건식으로 이동=> while문의 처음부터 다시
				continue;
			} 
			
			user[0]=input/100;		
			user[1]=(input%100)/10;	
			user[2]=input%10;
			
			if(user[0]==user[1] || user[1]==user[2] || user[2]==user[0])
			{
				System.out.println("같은 숫자는 사용이 불가능합니다!!");
				continue;
			}
			if(user[0]==0 || user[1]==0 || user[2]==0)
			{
				System.out.println("0은 입력할 수 없습니다!!");
				continue;
			} 
			}
	}
	
	static int getGameResult(int[] com, int[] user)
	{
		int s=0,b=0;
		for(int i=0;i<3;i++)		
		{
			for(int j=0;j<3;j++)	
			{
				if(com[i]==user[j])	
				{
					if(i==j)		
						s++;
					else			
						b++;
				}
			}
		}
		System.out.printf("Input:%d%d%d,Result:%dS-%dB\n",
				user[0],user[1],user[2],s,b);
		return s;
	}
	
	   static boolean isEnd(int s)
	    {
	    	boolean bCheck=false;
	    	if(s==3)
	    		bCheck=true;
	    	
	    	return bCheck;
	    }
	    static void process()
	    {
	    	int[] com=new int[3];
	        int[] user=new int[3];
	        getNumbers(com,user);
	        
	    }
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*int[] com=new int[3];
		int[] user=new int[3];
		for(int i=0;i<3;i++)
		{
			com[i]=(int)(Math.random()*9)+1; //1~9
			for(int j=0;j<i;j++)
			{
				if(com[i]==com[j])
				{
					i--;				// 현재 저장된 데이터에 다시 난수를 발생하라는 의미(i++을 무력화하는 i--, 다시 원래자리에 다시 random메소드를 돌림>만약 또 같은 수가 나오면 또 돌려 또또또도또ㄸ도)
					break;				// 중복 없는 숫자
				}
			}
		}
		//System.out.println(Arrays.toString(com));
		Scanner scan=new Scanner(System.in);
		//사용자 입력
		while(true)
		{
			System.out.println("세자리 정수 입력:");
			int input=scan.nextInt();
			//정상 입력 &&
			//오류	 ||
			if(input<100 || input>999)
			{
				System.out.println("잘못된 입력입니다!!");
				//while문의 조건식으로 이동=> while문의 처음부터 다시
				continue;
			} 
			//예) 369 
			user[0]=input/100;		//369/100 = 3
			user[1]=(input%100)/10;	//369%100= 69/10 = 6
			user[2]=input%10;
			
			if(user[0]==user[1] || user[1]==user[2] || user[2]==user[0])
			{
				System.out.println("같은 숫자는 사용이 불가능합니다!!");
				continue;
			}
			if(user[0]==0 || user[1]==0 || user[2]==0)
			{
				System.out.println("0은 입력할 수 없습니다!!");
				continue;
			}
			//비교
			int s=0,b=0;
			//s= 같은 자리의 수가 동일할 때 / b= 다른 자리의 수가 동일할 떄
			for(int i=0;i<3;i++)		//com
			{
				for(int j=0;j<3;j++)	//user
				{
					if(com[i]==user[j])	//같을 수가 있는지
					{
						if(i==j)		//같은 자리의 수
							s++;
						else			//다른 자리의 수
							b++;
					}
				}
			}
			//힌트
			System.out.printf("Input:%d,Result:%dS-%dB\n",
					input,s,b);
			//종료 여부 확인
			if(s==3)
			{
				System.out.println("GAME OVER!!");
				break;
			}
		}*/
		process();
	}

}
