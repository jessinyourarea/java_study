/*
 * 		<< , >>
 * 		왼쪽	오른쪽
 * 
 * 		10<<2			// 앞의 숫자를 2진법으로 변경 후 뒤에 0을 뒤의 숫자만큼 채운다
 * 		1010(10의 이진법으로 저장됨) > 2칸이동 
 * 		1010(0)(0)=> 101000 = 40 
 * 		7<<3
 * 		111000 = 56
 * 		
 * 		8<<2  = 32
 * 
 * 		x<<y ==> x*2^y
 * 		9<<3 = 9*2^3 = 72
 * 	
 * 		10>>2
 * 		1010
 * 		  -- 2개 제거하라. 10 = 2
 * 		
 * 		15>>3
 * 		1111 > 1 = 1
 * 		
 * 		27>>3
 * 		1 1 0 1 1 > 11 = 3
 * 		27/2^3 ==> 27/8 = 3(소수점제거)
 * 		
 * 		x>>y ==> x/2^y
 * 		
 * 		100>>3 ==> 100/8 = 12
 * 
 */
public class 쉬프트연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(10<<2); //40
		System.out.println(7<<3); //56
		System.out.println(8<<2); //32
		System.out.println(27>>3); 
	}

}
