package com.sist.exam1;
/*
 * 결합성이 높은 프로그램: 내가 수정할떄마다 다른 클래스에 영향을 미치는 프로그램을 짠다 (Hello 클래스에서 수정을 했더니 MainClass에서 오류가 생겼다!)
 */
public class Hello {
	public void sayHello(String name)
	{
		System.out.println(name+"님 환영합니다");
	}
}
