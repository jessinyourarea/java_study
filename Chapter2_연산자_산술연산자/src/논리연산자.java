/*
 * 		&&	||
 * 		
 * 		(조건) && (조건)
 *		----	------
 *		  | 	  |
 *		--------------
 *			  |
 *			 결과
 *		&& => 범위나 기간에 포함! (예: 예약기간/ 체크인 등)
 *	------------------------
 *		true	true	=> true
 *	------------------------
 *		true	false	=> false
 *	------------------------
 *		false	true	=> false
 *	------------------------
 *		false	false	=> false
 *	------------------------
 * 		
 * 		||	=> 범위나 기간을 벗어난 경우 (예: 행사 등)
 *	------------------------
 *		true	true	=> true
 *	------------------------
 *		true	false	=> true
 *	------------------------
 *		false	true	=> true
 *	------------------------
 *		false	false	=> false
 *	------------------------
 * 		
 * 			=> 효율적 연산
 * 			()	&&	()
 * 					-- 여기를 수행하느냐 안하느냐 => 수행하지 않으면 연산속도가 더 빨라질것
 * 		   ----		
 * 		   false //라면 뒤연산을 할 필요가 없다
 * 			()	||	()
 * 			---		
 *			true //라면 뒤연산을 하지 않음. 왜? 필요가 없으니까.
 *				// false 일 때는 뒤연산함.
 *	
 *			int a=10;
 *			int b=9;
 *			
 *			(a<b) && ++b==a
 *			-----
 *			이미 false > 앞이 false라면 뒷연산은 실행되지 않는다
 *					-----
 *						> 연산되었다면 10이겠지만, 연산하지 않으니 b는 그대로 9
 *
 */
public class 논리연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			/*int a=10;
			int b=9;
			boolean bCheck= (a<b) && ++b==a;
			
			System.out.println(bCheck);
			System.out.println("b="+b);*/
			
			/*int a1=10;
			int b1=9;
			boolean b1Check= (a1<b1) || ++b1==a1;
			
			System.out.println(bCheck);
			System.out.println("b1="+b1);*/
			
			/*int a=100;
			int b=99;
			boolean bCheck= (a>b) && (b==a);
			//				true		false  => false
			System.out.println(bCheck);
			bCheck=(a>b) || (b==a);
			System.out.println(bCheck);*/
			
			/*char c=(char)((Math.random()*26)+65);
			boolean bCheck= c>='A'&&c<='Z'     ;
			//				true		true  => true
			System.out.println("c="+c);
			System.out.println(bCheck);		*/							// 문장 마지막에 ; 안씀 .... 잘하자.
			
			/*char sex='M';
			int score=87;
			
			boolean bCheck= (sex=='M' && score>=80);
			//				true			true		==> true
			System.out.println(bCheck);*/
		
			/*int a=10;
			boolean bCheck= a%2==0 || a<2;
			//				true 	  false => true ! // ||는 true 하나만 있어도 true
			System.out.println(bCheck);*/
			
			/*int year=2024;
			boolean bCheck=((year%4==0 && year%100!=0))||(year%400==0));	// 윤년 계산법/ 4년에 한번씩 ~
			//				------------------------
			System.out.println(bCheck);	*/
			
			
			
			
	}

}
