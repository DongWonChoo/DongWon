package java19;

import java.util.HashSet;

public class SetTest {
	public static void main(String[] args) {
		HashSet bag = new HashSet();
		bag.add("휴지");
		bag.add("휴대폰");
		bag.add("지갑");
		
		System.out.println("가방 속의 물건 갯수는 : " + bag.size() + "개");	
		
		System.out.println(bag);
		bag.add("지갑");
		System.out.println(bag);
		//자동 중복 제거
		
		//중복여부
		System.out.println(bag.contains("지갑"));
	}
}
