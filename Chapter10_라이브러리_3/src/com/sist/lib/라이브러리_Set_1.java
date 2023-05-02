package com.sist.lib;
import java.util.*;
class Person implements Cloneable
{
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//Object의 메소드를 오버라이딩 ==> 원래는 메모리 주소값 > 지금은 name(age) 
	@Override
	public String toString()
	{
		return name+"("+age+")";
	}
	
	//복제 => 새로운 메모리를 만들어서 사용
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	// 매개변수가 있는 생성자
	public Person(String name, int age) {
		super();
		this.name=name;
		this.age=age;
	}
}
public class 라이브러리_Set_1 {
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Set set=new HashSet();
		Person p1=new Person("홍길동",25);
		Person p2=new Person("홍길동",25);
		System.out.println("p1="+p1);
		System.out.println("p2="+p2);
		Person p3=p1;	//저장이 안됨(중복)
		Person p4=(Person)p1.clone();
		System.out.println("p3="+p3);
		System.out.println(p4.getName());
		System.out.println(p4.getAge());
		System.out.println("p4="+p4);
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		System.out.println(set);
	}
}
