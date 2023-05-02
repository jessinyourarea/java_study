package com.sist.lib;
import java.util.*;
class Student{
	private String name;
	private int age;
	//데이터 보호 => 은닉화
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

@Override
public String toString() {
	// TODO Auto-generated method stub
	return name+"("+age+")";
}
@Override
public int hashCode() {
	// TODO Auto-generated method stub
	return (name+age).hashCode();
}
@Override
public boolean equals(Object obj) {
	// TODO Auto-generated method stub
	if(obj instanceof Student)
	{
		Student s=(Student)obj;
		return name.equals(s.name) && age==s.age;
	}
	return false;
}
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

}
public class 라이브러리_Set_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		객체 비교 => 메모리 주소 , 실제 저장된 값
		//----------------기본 ================재정의(오버라이딩)
		Set set=new HashSet();
		Student s1=new Student("홍길동",25);
		Student s2=new Student("홍길동",25);
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);
		if(s1.equals(s2))
		{
			System.out.println("s1==s2");
		}
		else 
		{
			System.out.println("s1!=s2");
		}
		set.add(new Student("홍길동",25));
		set.add(new Student("홍길동",25));
		System.out.println(set);
	}

}
