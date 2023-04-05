/*
 * 임의의 정수 10개를 받아서 최대값/최소값 구하기
 * 
 */
import java.util.*;
public class 배열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr=new int[10];
        //초기화
        for(int i=0;i<arr.length;i++)
        {
        	arr[i]=(int)(Math.random()*100)+1;
        	
        }
        
        //1번째출력- 일반 for문
        for(int i=0;i<arr.length;i++)
        {
        	System.out.print(arr[i]+" ");
        }
        
        //2번째출력
        System.out.println( );
        System.out.println(Arrays.toString(arr));	//어레이스.투스트링. 배열 안에 있는거(arrays) 출력(toString)
        
        //3.*** for-each => 배열,컬렉션 처럼 데이터가 여러개 모아서 관리할때 사용***
        /*
         **** 	for(int a:arr)	****
         */
        // 출력용으로 사용 => 웹(브라우저)
        for(int a:arr)	//index로 불러오는게 아니라, 실제 데이터를 불러옴 //Vue, React
        {
        	System.out.print(a+" ");
        }
        System.out.println( );
        //최대값,최소값
        int max=arr[0];
        int min=arr[0];
       
        for(int a:arr)
        {
        	if(max<a)
        		max=a;
        	if(min>a)
        		min=a;
        }
        System.out.println("최대값:"+max);
        System.out.println("최소값:"+min);
	}

}
