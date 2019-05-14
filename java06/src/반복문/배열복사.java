package 반복문;

public class 배열복사 {

	public static void main(String[] args) {
		int[] num1 = {1,2,3};
		int[] num2 = num1;
		
		for (int i = 0; i < num2.length; i++) {
			System.out.println(num2);
		}
	}
}
