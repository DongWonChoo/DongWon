package 반복문;

public class 배열연습3 {

	public static void main(String[] args) {
		int[]num = {444,666,777};
		//배열에 첫번째 값에 세번째 값을 넣어보세요
		int temp;
		
		temp = num[0];
		num[0] = num[2];
		num[2] = temp;
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
			
		}
		
	}
}
