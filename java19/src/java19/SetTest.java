package java19;

import java.util.HashSet;

public class SetTest {
	public static void main(String[] args) {
		HashSet bag = new HashSet();
		bag.add("����");
		bag.add("�޴���");
		bag.add("����");
		
		System.out.println("���� ���� ���� ������ : " + bag.size() + "��");	
		
		System.out.println(bag);
		bag.add("����");
		System.out.println(bag);
		//�ڵ� �ߺ� ����
		
		//�ߺ�����
		System.out.println(bag.contains("����"));
	}
}
