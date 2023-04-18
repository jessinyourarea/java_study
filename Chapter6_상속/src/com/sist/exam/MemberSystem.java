package com.sist.exam;

import java.util.Scanner;
/*
 *  
 */
public class MemberSystem {
	static Member[] members=new Member[10];		// 배열 최초 생성시 메모리 공간 생성: null >  
	static int index=0;
	// 오라클에서는 모든 데이터 static
	// 회원가입하는 기능
	public void join()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("아이디, 이름, 성별 입력(hong 홍길동 남자:");
		members[index]=new Member();		//만든 메모리에 Member라는 데이터(3개씩)을 넣을 거라는 예고!
		members[index].setId(scan.next());
		members[index].setName(scan.next());
		members[index].setSex(scan.next());	
		index++;
	
	}
	public void print()
	{
		for(Member m:members)
		{
			if(m!=null)
			{
				System.out.println(m.getId()+" "
						+m.getName()+" "+ m.getSex());
			}
		}
	}
	
}
