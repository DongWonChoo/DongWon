package java19;

import java.util.ArrayList;

public class ListTest2 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("나는스트링");
		list.add(100);
		list.add(11.22);
		list.add('a');
		
		int num =  (int)list.get(1);
		
		System.out.println(list);
		String name= (String)list.get(0);
		System.out.println(name);
	}
}