import java.util.Arrays;

/*
 * 	로또 만들기~ 
 * 	6개의 난수 발생 => 1~45 (중복된 수 나오면 X)
 * 
 */
public class 배열응용_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lotto=new int[10];
		/*for(int i=0;i<lotto.length;i++)
		{
			lotto[i]=(int)(Math.random()*45)+1;
			for(int j=0;j<i;j++)	//가장 첫번째값은 0과 0은 같으니 건너뛰고 계산한다
			{
				if(lotto[i]==lotto[j])
				{
					i--;		// lotto[i]와 lotto[j]가 같은 번호가 나왔을 때, i++해서 다음 번호로 넘어가지 않고, 
								// i--로 상계시켜서 그 index에서 멈추고 다시 계산하게 하기 위해서 (???????)
					break;
				}
			}
		}*/
			
		int su=0;	//난수를 저장
		boolean bCheck=false;	//중복여부확인
		for(int i=0;i<lotto.length;i++)
		{
			bCheck=true;
			while(bCheck)
			{
				su=(int)(Math.random()*10)+1;
				bCheck=false;				//false면 저장하고
				for(int j=0;j<i;j++)
				{
					if(lotto[j]==su)
					{
						bCheck=true;		//true(같은수가 나오면)면 다시 계산하도록 break
						break;
					}
				}
			}
			lotto[i]=su;
		}
			
		System.out.println(Arrays.toString(lotto));
		
	}

}
