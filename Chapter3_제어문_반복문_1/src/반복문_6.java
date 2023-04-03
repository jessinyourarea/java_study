import java.util.Scanner;

/*
 * 	updown게임
 * 	
 * 	컴퓨터 난수 발생(1~100 사이의 난수)
 * 	=> 사용자 입력
 *  => 입력 시에 힌트(up/down)
 *  => for문 횟수 ? 
 *  	-> 무한루프: for(;;) =.while(true)
 *  
 */
public class 반복문_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int com=(int)(Math.random()*100+1);
		int count=0;
		Scanner scan=new Scanner(System.in);
		for(;;) //무한루프
		{
			System.out.println("1~100까지 사이의 정수 입력:");
			int user=scan.nextInt();
			
			if(user>=1 && user<=100)
			{
				count++;
				//힌트
				if(com>user)
				{
					System.out.println("입력한 수보다 큰 수를 입력하세요(UP)");
				}
				else if(com<user)
				{
					System.out.println("입력한 수보다 작은 수를 입력하세요(DOWN)");
				}
				else if(com==user)
				{
					System.out.println("GAME OVER");
					System.out.println("입력 횟수:"+count);
					System.exit(0);
				}
			}
			else
			{
				System.out.println("잘못된 입력입니다");
			}
		}
	}

}
