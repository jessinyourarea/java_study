package com.sist.main2;
import java.util.*;
//인터페이스 -> 여러개 클래스를 묶어서 쉽게 관리할 목적으로 만들어짐
//스프링도 클래스관리자임. => 인터페이스 기반
public class E implements Exec{
	public void execute()
	{
		System.out.println("E:execute() Call...");
	}
}
