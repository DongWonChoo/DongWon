package java16;

import java.util.ArrayList;

public class ListTest {
	public static void main(String[] args) {
		//순서가 중요.
		ArrayList list = new ArrayList();
		list.add("박");
		list.add("송");
		list.add("김");
		list.add("정");
		int size = list.size();
		System.out.println(size);
		System.out.println(list);
		list.remove(0);
		list.add(2,"뉴인물");
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
		list.remove("정");
		list.set(1,"올드인물"); //값 교체
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i+1) + " : " + list.get(i));
		}
	}
}
	