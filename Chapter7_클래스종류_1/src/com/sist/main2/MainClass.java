package com.sist.main2;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("해당 클래스 번호:");
		int no=scan.nextInt();
		Container cc=new Container();
		Exec a=(Exec)cc.getBean(no);
		a.execute();
		
		/*if(no==1)
		{
			A a=(A)cc.getBean(no);	///getBean이Object이니까 A로 명시적형변환
			a.execute();
		}
		if(no==2)
		{
			B a=(B)cc.getBean(no);	
			a.execute();
		}
		if(no==3)
		{
			C a=(C)cc.getBean(no);	
			a.execute();
		}
		if(no==4)
		{
			D a=(D)cc.getBean(no);	
			a.execute();
		}
		if(no==5)
		{
			E a=(E)cc.getBean(no);	
			a.execute();
		} */
	
	}

}
