package com.sist.exam2;

public class HelloImpl implements Hello{

	@Override
	public void sayHello(String name) {	//결합성이 낮음. 에러나면 해당 클래스에서만 에러가 남. Loosely coupling
		// TODO Auto-generated method stub
		System.out.println(name+"님 환영합니다");
	}

}
