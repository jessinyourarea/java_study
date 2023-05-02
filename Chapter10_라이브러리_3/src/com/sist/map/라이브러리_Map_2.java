package com.sist.map;
import java.util.*;
interface M
{
	public void execute();
}
class A implements M
{
	public void execute()
	{
		System.out.println("A:execute() Call...");
	}
}
class B  implements M
{
	public void execute()
	{
		System.out.println("B:execute() Call...");
	}
}
class C  implements M
{
	public void execute()
	{
		System.out.println("C:execute() Call...");
	}
}
//Spring => 클래스 관리자 (게임에도 씀)
class Container 
{
	Map map=new HashMap();
	//싱글턴 구조 : 한 개의 객체만 가지고 재사용 ==> 메모리 누수현상을 방지 
	public Container()
	{
		map.put("a", new A());
		map.put("b", new B());
		map.put("c", new C());
	}
	public Object  getBean(String key)
	{
		return (M)map.get(key);
	}
}
public class 라이브러리_Map_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Container c=new Container();
		A aa=(A)c.getBean("a");
		aa.execute();
		A bb=(A)c.getBean("a");
		bb.execute();
		System.out.println("aa="+aa);
		System.out.println("bb="+bb);
	}

}
