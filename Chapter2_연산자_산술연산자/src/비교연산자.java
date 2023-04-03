/*
 * 		단항연산자(++ , --)
 * 		a++ + a++ + a++ + ++a 
 * 		→
 * 		산술연산자 (쉬프트, 비트)  *,/ > +,- 
 * 		→
 *  		  ==> 왼쪽에서 오른쪽으로 이동하며 계산함.
 *
 * 		대입연산자, 삼항연산자
 * 		----------------
 * 		←       > 반대 방향으로 계산.
 		int a=10
 		int a=b+c
 *		=================> () : 괄호는 최우선순위
 *		
 * 			
 * 		비교연산자 => 결과값 (boolean) => true/false
 * 		==	같다
 * 		!=	같지 않다
 * 		<	작다 ==> 왼쪽이 기준점. 
 * 		>	크다
 * 		<=	작거나 같다
 * 		>=	크거나 같다
 * 
 * 		7==6	false
 * 		7!=6	true
 * 		-----	byte , int , short , long , double , float , boolean, char
 * 		---"a"=="a" > 문자열은 사용 안됨. 대신 equals()를 이용함.  ***
 * 		'A'<'B'char이니까 숫자로변경 65<66	true
 * 		10>5	true
 * 		10<=10	true ==> 10<10 || 10==10
 * 		10>=10	true 
 * 		
 * 		
 * 	
 */
public class 비교연산자 {
	public static void main(String[] args) {
		int a=(int)(Math.random()*100)+1;
		/*
		 *  (int)(Math.random()*100)+1;
		 *  	  -------------
		 *  			1 (0.0~0.99)
		 *  					---
		 *  					 2 ==> 0.0~99.0
		 *  ------
		 *    3 0~99
		 *    						---
		 *    						 4 ==> 1~100
		 */
		int b=(int)(Math.random()*100)+1;
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		//1. ==
		boolean b1=a==b;
		System.out.println("a==b:"+b1);
		//2. !=
		b1=a!=b;
		System.out.println("a!=b:"+b1);
		b1=a<b;
		System.out.println("a<b:"+b1);
		b1=a>b;
		System.out.println("a>b:"+b1);
		b1=a<=b;
		System.out.println("a<=b:"+b1);
		b1=a>=b;
		System.out.println("a>=b:"+b1);
		
		
	}
}
