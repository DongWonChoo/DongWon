package java16;

import java.util.ArrayList;

public class ListTest {
	public static void main(String[] args) {
		//������ �߿�.
		ArrayList list = new ArrayList();
		list.add("��");
		list.add("��");
		list.add("��");
		list.add("��");
		int size = list.size();
		System.out.println(size);
		System.out.println(list);
		list.remove(0);
		list.add(2,"���ι�");
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
		list.remove("��");
		list.set(1,"�õ��ι�"); //�� ��ü
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i+1) + " : " + list.get(i));
		}
	}
}
	