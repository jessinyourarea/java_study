package com.sist.gn;
import java.util.*;

class Sawon
{	//Object
	private int sabun;
	private String name;
	private String dept;
	private String job;
	private int pay;
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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public Sawon(int sabun, String name, String dept, String job, int pay) {
		super();
		this.sabun = sabun;
		this.name = name;
		this.dept = dept;
		this.job = job;
		this.pay = pay;
	}

	
}
//Sawon s=new Sawon();
class Human
{
	public String name;
	public String addr;
}
public class 라이브러리_Generic_1 {

	public static void main(String[] args) {
//		Sawon hong=new Sawon();
		//다른 클래스에 있는것(영역밖)은 접근할 수 없다!
	List<Sawon> list=new ArrayList<Sawon>();
	//데이터 추가
	list.add(new Sawon(1,"Hong","개발부","대리",4500));
	list.add(new Sawon(2,"Park","총무부","과장",5500));
	list.add(new Sawon(3,"Yi","기획부","사원",3500));
	list.add(new Sawon(4,"Kang","자재부","부장",6500));
	list.add(new Sawon(5,"Shim","영업부","부장",6500));
	
	//출력
//	for(Sawon s:list)
//	{
//		System.out.println(s.getSabun()+" "
//							+s.getName()+" "
//							+s.getDept()+" "
//							+s.getJob()+" "
//							+s.getPay());
	//삭제 ==> remove index 2
	//List => 데이터 첨부 => 데이터 읽기 -> 데이터 갯수
    // 수정,삭제 => in Oracle
	list.remove(2);
	System.out.println("================================");
	for(Sawon s:list)
	{
			System.out.println(s.getSabun()+" "
								+s.getName()+" "
								+s.getDept()+" "
								+s.getJob()+" "
								+s.getPay());
	}
	System.out.println("================================");
	System.out.println("현재 인원:"+list.size());
	Sawon sa=new Sawon(6, "춘향이","개발부","사원",3500);
	list.set(3, sa);
	System.out.println("================================");
	list.clear();
	System.out.println("현재 인원:"+list.size());
	}
	/*
	  	add , size , get , clear => 웹에서 사용하는 메소드!!!!!!!
	  +addAll
	  
	  
	  	
	 */
}
