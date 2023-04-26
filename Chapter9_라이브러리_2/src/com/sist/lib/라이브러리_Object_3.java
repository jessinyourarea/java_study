package com.sist.lib;
//equals => Object에서는 객체비교 String 에서는 문자열
class Student2{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Student2(String name)
	{
		this.name=name;
	}
	//((Student2)obj).name ==> 형변환 / 괄호 중요
	//Object의 equals는 사용빈도가 많지 않다 => 무조건 오버라이딩을 사용해야 되기 때문에
	// 대신=> String ... equals는 이미 재정의되어 있다 (실제 문자열)
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Student2)
		{
			Student2 s=(Student2)obj;
			//((Student2)obj).name
			return name==s.name;
		}
		else
			return false;
	}
	
	public void print()
	{
		System.out.println("이름:"+name);
	}
}
public class 라이브러리_Object_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 s1=new Student2("홍길동");
		Student2 s2=new Student2("홍길동");
		
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);
		if(s1==s2)	// 객체비교 == 주소값을 비교한다
		{
			System.out.println("s1과 s2은 같다");
		}
		else
		{
			System.out.println("s1과 s2는 같지 않다");
		}
		//주소(default == 주소값 비교)
		if(s1.equals(s2))
		{
			System.out.println("s1과 s2은 같다");
		}
		else
		{
			System.out.println("s1과 s2는 같지 않다");
		}
		
		
		s1.print();
		new Student2("박문수").print();
		
	}

}
