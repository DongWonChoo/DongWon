package java19;

import java.util.HashMap;

public class Map2Test {
	public static void main(String[] args) {
		HashMap memberlist = new HashMap();
		Mem m1 = new Mem("����1", "����1", "�۾���1", "��й�ȣ1");
		Mem m2 = new Mem("����2", "����2", "�۾���2", "��й�ȣ2");
		Mem m3 = new Mem("����3", "����3", "�۾���3", "��й�ȣ3");
		
		memberlist.put(100, m1);
		memberlist.put(200, m2);
		memberlist.put(300, m3);
		
		System.out.println(memberlist.get(100));
		System.out.println(memberlist.get(200));
		System.out.println(memberlist.get(300));
	}
}
