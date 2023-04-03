/*
 * 		조건문 (if)
 * 				
 * 
 * 
 * 
 * 
 */
public class 비교연산자_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1=(char)((Math.random()*26)+65); // 랜덤 알파벳대문자 만들기 (65A 66B ... ) 소문자는 97a ...
		System.out.println("c1:"+c1);
		char c2=(char)((Math.random()*26)+65);
		System.out.println("c2:"+c2);
		// 'A'= 65 'a'=97, char는 연산 시에 정수로 변환해서 연산
		
		boolean b1=c1==c2;
		System.out.println("b1:"+b1);
		
		b1=c1!=c2;
		System.out.println("b1:"+b1);
		
		b1=c1<c2;
		System.out.println("b1:"+b1);
		
		b1=c1>c2;
		System.out.println("b1:"+b1);
		
		b1=c1<=c2;
		System.out.println("b1:"+b1);
		
		b1=c1>=c2;
		System.out.println("b1:"+b1);
	}

}
