
public class 배열문제_2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				// i=1 j=1,2,3
				// i=2 j=1,2,3
				// i=3 j=1,2,3
				if(j==2)
					continue;
				System.out.println("i="+i+",j="+j);
			}
		}
	}

}
