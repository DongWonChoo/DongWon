package 부품만들기;

public class 커피숍 {
	public static void main(String[] args) {
		계산기 cal = new 계산기();
		cal.add(5000, 4000);
		cal.add("엄마", 1000);
		int sum = cal.add(5000, 4000);
		System.out.println(sum + "원");
	}
}
