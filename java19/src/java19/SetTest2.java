package java19;

import java.util.HashSet;

public class SetTest2 {
	public static void main(String[] args) {
		HashSet set1 = new HashSet();
		set1.add("���");
		set1.add("����");
		set1.add("�ٳ���");
		
		HashSet set2 = new HashSet();
		set1.add("��");		
		set1.add("���÷�");		
		set1.add("���̽�ũ��");		
		set2.addAll(set1);
		System.out.println(set1);
		System.out.println(set2);
		set2.clear();
		System.out.println(set2);
		
	}
}