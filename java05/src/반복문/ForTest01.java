package 반복문;

public class ForTest01 {
	int test; //전역변수
	public void end () {
		//System.out.println(sum);
	}
	public static void main(String[] args) {
		int sum = 0;
		int start;
		for(start = 1; start <10 ; start++) {
			sum = sum + start;
		}
		System.out.println(sum);
	}
}
