/*
 * 		반복제어문
 * 		= break
 * 			=> 반복문을 종료
 * 			=> 반복문(for,do~while,while),선택문(switch~case)
 * 			=> break문 밑에는 소스 코딩이 불가능하다.
 * 			for()
 * 			{
 * 				if()
 * 				{
 * 					break;
 * 					// 여기부터는 코딩 불가능.
 * 				}
 * 			}
 * 		= continue
 * 			=> 특정 부분을 제외할 때 사용.(반복문을 계속 수행)
 * 			=> 반복문(for,while,do~while)에서만 사용 가능.
 * 			=> 웹에서는 특별한 경우에만 사용
 *  */
public class 반복제어문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=========break==========");
		for(int i=1;i<=10;i++)
		{
			if(i==5)
				break; //=1~4까지 수행, 5되면 반복중단/수행종료.
			System.out.print(i+" ");
		}
		/*
		 * 		for => break종료 , continue => 증가식 이동
		 * 		while => break종료 , continue => 조건식으로 이동
		 * 						-------------- 처음부터 다시 실행할 때
		 * 						잘못하면 무한루프에 걸릴 수 있음.
		 * 
		 * 		int i=1;
		 * 		while(i<=10)
		 * 		{
		 * 			if(i==5)
		 * 				continue
		 * 			System.out.print(i+" ");
		 * 			i++;
		 *  	}
		 *  
		 */
		System.out.println("\n=======continue=========");
		for(int i=1;i<=10;i++)
		{
			if(i==5 || i==7 || i==9)
				continue;		// 조건에맞을때 아래문장수행없이 i++로 이동
			System.out.print(i+" ");
			
		}
		System.out.println("\n========================");
		int i=1;
		while(i<=10)
		{
			if(i==5)	// 조건식으로 이동. 이렇게되면 5에서 계속 머물러서 무한루프에 빠짐.
						// 게임: 잘못된 입력이 있는 경우 처음으로 다시 돌아갈때 주로 사용.
				continue;
			System.out.print(i+" ");
			i++;
		}
	}

}
