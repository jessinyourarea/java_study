
public class 문자열_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String menu="원조김밥"
				+ " 2,500원"
				+ "쌀떡볶이"
				+ " 3,500원"
				+ "찹쌀순대"
				+ " 3,500원"
				+ "라면"
				+ " 3,500원"
				+ "쫄면"
				+ " 5,500원";
		System.out.println(menu);
		String[] menus=menu.split("원");			//()값을 기준으로 띄어서 나누어 출력!
		for(String m:menus)
		{
			System.out.println(m+"원");
		}
		
	}

}
