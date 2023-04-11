/*
 	매개변수 전송법
 	
 	= Call by Value: 일반 기본형 데이터 (String)		display(int a, int b) => 복사본만 넘겨주는
 	= Call by Reference: : 주소값을 넘겨주는 방식(배열, 클래스)				  => 원본을 넘겨주는
 

 */
public class 메소드_2 {
	static void swap2(int[] arr2)
	{
		System.out.println("arr2="+arr2);
		System.out.println("교환 전:arr2[0]="+arr2[0]+",arr2[1]="+ arr2[1]);
		int temp= arr2[0];
		arr2[0]=arr2[1];
		arr2[1]=temp;
		System.out.println("교환 후:arr2[0]="+arr2[0]+",arr2[1]="+ arr2[1]);
	}
	static void swap(int x,int y)
	{
		System.out.println("교환 전 x="+x+",y="+y);
		int temp=x;
		x=y;
		y=temp;
		System.out.println("교환 후 x="+x+",y="+y);
	}
	
	static void swap3(String id,String pwd)
	{
		System.out.println("교환전:id="+id+",pwd="+pwd);
		String temp=id;
		id=pwd;
		pwd=temp;
		System.out.println("교환후:id="+id+",pwd="+pwd);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		swap(a, b);
		System.out.println("종료="+a+",b="+b);
		// 값만 전송 -> Call by Value => 기본형은 전부 값만 바뀜
		
		int[] arr= {10,20};
		System.out.println("arr="+arr);
		swap2(arr);
		System.out.println("교환 후:arr[0]="+arr[0]+",arr[1]="+ arr[1]);
		// 배열, 클래스 => 메소드 자체에서 변경 가능						// 바뀜
		// Call by Reference
		
		String id="admin";
		String pwd="1234";
		swap3(id,pwd);
		System.out.println("종료:id="+id+",pwd="+pwd);			// String은 안 바뀜.
		
		
		}
		
	}

