package ����ƽ;

public class �����ϻ� {
	public static void main(String[] args) {
		day day1 = new day("�ڹٰ���",10,"����");
		day day2 = new day("����     ",15,"����");
		day day3 = new day("�     ",11,"����");
		
		int sum = day1.time + day2.time + day3.time;
		
		System.out.println("�Ϸ��� �ϰ��� ��Ÿ���� ���α׷�");	
		System.out.println("======================");
		System.out.println(day1);
		System.out.println(day2);
		System.out.println(day3);
		System.out.println("======================");
		System.out.println("��ü �ϴ� ���� �ð� : " + sum);
		System.out.println("��� �ϴ� ���� �ð� : " + sum/3);
		System.out.println("���� ������ �󸶳� ��𼭿��� �ߴ°�? : " + day1.Doing + "��" + day1.time + "�� " + day1.location + "���� �����ߴ�");
		System.out.println("��ð� �ߴ���? : " + day.count);
	}
}
