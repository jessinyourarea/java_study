/*
 		 연산자, 제어문 => 형식 , 용도
 		 1) 형식
 		 	초기값은 딱 한번 수행
 		 	
 		 			   | false  
 		 		  1 -> 2   ←『ㅡㅡㅡㅡㅡ
 		 	for(초기값;조건식;증가식)	4  	|
 		 	{		   | true		|
 		 		반복수행 문장-----------
 		 	}			  true
 		 	초기값 => 조건식 =====>	 수행문장 ====>증가식  => 조건식 => 수행문장 => 조건식 ..(반복)...
 		 		     | false(종료)
 	    = while문 => 읽기
 	    초기값  =============1
 	    while(조건문)       =2				  ←ㄱ
 	    {										|
 	    	수행문장		  =3					|
 	    	증가식		  =4	===>조건식 2번으로 이동
 	    }
 	    
 	    
 	    필요에 의해 반복문 제어
 	    -------------------
 	    break;
 	    	반복문을 중단할 때 사용 (조건)	게임 > esc
 	    	반복문 , switch case에서 사용 가능.
 	    continue;
 	    	반복문에서만 사용 가능	(특정 부분을 제외하는 경우에 주로 사용)
 	    	종료하지 않고 => 이동	
 	    	for => 증가식으로 이동
 	    	while => 조건식으로 이동
 	    
 	    주의점)
 	    	break,continue=> 밑에는 소스코딩 불가능 하다
 	    				  => 자신 소속 반복문만 제어한다
 	    	
 	    	for()
 	    	{
 	    		continue;
 	    		System.out.println(); => 오류 
 	    	}
 	    	
 	    	for()
 	    	{
 	    		for()
 	    		{
 	    			if()
 	    			{
 	    				 break,continue ==> if문만 제어
 	    			}
 	    		}
 	    		break,continue 
 	    	}
 	    	
 	    	
 	    	if()
 	    	if()
 	    	------
 	    	if()
 	    	else
 	    	------
 */					
public class 제어문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		System.out.println(arr);	// [I@6504e3b2
		int[] arr2=arr;
		System.out.println(arr2); 	// [I@6504e3b2
		arr2[0]=10;
		System.out.println(arr[0]);
		int[] arr3=arr.clone();		//arr크기의 새로운 배열 생성
		System.out.println(arr3);	// [I@515f550a 다른 영역을 제어함.
		// 주소에 의한 참조 ==> 메모리 주소를 이용해서 실제 데이터 관리
	}

}
