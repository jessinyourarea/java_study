/*
 * 		
 * 
 */
public class 산술연산자_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=3;
		
		System.out.println(a+"%"+b+"="+(a%b));
		System.out.println(-a+"%"+b+"="+(-a%b));
		System.out.println(a+"%"+-b+"="+(a%-b));
		System.out.println(-a+"%"+-b+"="+(-a%-b));  //부호는 항상 왼쪽 값의 것을 따라간다.
		System.out.println(-a+"*"+-b+"="+(-a*-b));  // 나누기(%)부호를 제외하면 일반 사칙연산의 법칙과 동일하게 간다 -*-=+
		

	}

}
