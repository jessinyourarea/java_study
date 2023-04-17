package com.sist.main;
import static java.lang.Math.random;
/*
 * import 패키지명.클래스명
 * import 패키지명.* > 패키지 안의 모든 클래스를 불러올때
 * import static java.lang.Math.random; 지정된 클래스를 불러올때
 * java.lang.* => 자동 로딩이 된다 , import를 붙이지 않는다
 * ----------> String, Math
 * 
 * void method()
 * {
 * 	 return; // 자동 설정 (void일때 생략 가능하다)
 *		==> 중간에 존재할 때도 있다
 * }
 * class A
 * {
 *   A(){}
 * }
 */
//Math클래스는 지원하는 모든 메소드
public class 클래스_메소드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		if(a%2==0)
		{
			System.out.println("a="+a);
			return;
		}
		
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
	}

}
