package 배열;

public class 과제1 {
	public static void main(String[] args) {
		int[][] ban = {
						{44, 55, 66},
						{77, 88, 99, 100}
					};
		int sum = 0;
		
		for (int i = 0; i < ban.length; i++) {
			for (int j = 0; j < ban[i].length; j++) {
				sum = ban[i][j] + sum;
			}
			System.out.println("1반 평균 : " + (sum/ban[i].length));
			sum = 0;
		}
	}
}
