package 반복문;

public class WhileTeste2 {
	public static void main(String[] args) {
		int start = 1;
		int sum = 0;
		while(start <= 10) {
			//1부터 10까지 더해줌
			sum = sum + start;
			start++;
			System.out.println(sum);
		}
	}
}
