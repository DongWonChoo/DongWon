package 배열;

public class 별여러줄 {
	public static void main(String[] args) {
		int[][] num = {{1,2,3},{4,5,6}};
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		//한줄짜리
		for (int i = 0; i < 10; i++) {
			System.out.print("*");
		}		
		System.out.println();
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j]);
			}
			System.out.println();
		}
		
	}
}
