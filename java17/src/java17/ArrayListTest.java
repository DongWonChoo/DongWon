package java17;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("나는 스트링");
		list.add(100);
		list.add(11.22);
		list.add('a');
		
		System.out.println(list);
	}
}
