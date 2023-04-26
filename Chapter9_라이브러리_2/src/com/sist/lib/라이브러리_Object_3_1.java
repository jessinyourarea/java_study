package com.sist.lib;
/*
 
 
 */
class Sawon2{
	private int sabun;
	private String name;
	// 초기화
	public Sawon2(int sabun,String name)
	{
		this.sabun=sabun;
		this.name=name;			//변수가 같으니 this 사용, 후 초기화
	}
	public int getSabun() {
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Sawon2 s=(Sawon2)obj;
		return name.equals(s.name) && sabun==s.sabun;
	}
	
}
public class 라이브러리_Object_3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon2 s1=new Sawon2(1,"홍길동");
		Sawon2 s2=new Sawon2(1,"홍길동");
		if(s1.equals(s2))
		{
			System.out.println("같은 사원입니다");
		}
		else
		{
			System.out.println("다른 사원입니다");
		}
	}

}
