package java19;

import java.util.HashSet;

public class SetTest2 {
	public static void main(String[] args) {
		HashSet set1 = new HashSet();
		set1.add("사과");
		set1.add("우유");
		set1.add("바나나");
		
		HashSet set2 = new HashSet();
		set1.add("빵");		
		set1.add("요플레");		
		set1.add("아이스크림");		
		set2.addAll(set1);
		System.out.println(set1);
		System.out.println(set2);
		set2.clear();
		System.out.println(set2);
		
	}
}
