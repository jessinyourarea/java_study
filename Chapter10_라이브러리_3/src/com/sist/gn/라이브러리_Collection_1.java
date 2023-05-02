package com.sist.gn;
/*
 	제네릭
 	  => 데이터형을 통일화
 	  => 라이브러리의 데이터형을 변경할 경우에 사용
 		 ------- 매개변수 / 리턴형 (Object)
 		 		 => 프로그램 개발시마다 형변환을 해야된다
 		 		 => 프로그램에 필요한 데이터형으로 변경
 		 ** 데이터를 저장할 때는 한가지 데이터형만 저장해야 사용하기 쉽다
 		    프로그램 => 데이터를 통일하는게 제일 좋다
 	  => 사용방법 => <>
 	  List<클래스> => Object-> 지정된 클래스명으로 변경
 	  List<String>
 	  List<MovieVO>
 	
 		=> T E(Elements) K V
 			T => Type(클래스형)
 			E => Elements
 			K => Key
 			V => Value
 			Map <K,V>
 			Map<String,String>
 			List<E>
 			List<Integer>
 			     --------기본형은 사용이 불가능/ 클래스형만 사용 가능.
 			     		 -----> 클래스형으로 제작한 것을==Wrapper클래스
 			
 */
import java.util.*;
class Box<T>
{
	T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}
class A
{
	
}
public class 라이브러리_Collection_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<A> list2=new ArrayList<A>();
		List<String> list=new ArrayList<String>();
		list.add("사과");
		list.add("배");
		list.add("딸기");
			
		for(Object obj:list)
		{
			String f=(String)obj;
			System.out.println(f);
		}
		
		
	}

}
