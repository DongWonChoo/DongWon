package 배열;

public class 배열2차원2 {
	public static void main(String[] args) {
		//배열 만들 때
		//초기값을 지정하는 경우
		int[][] num = {{1,2,3},{4,5,6}};
		System.out.println(num[0][1]);
		System.out.println(num[1][2]);

		System.out.println("배열의 개수(행의 개수) : " + num.length);
		System.out.println("배열0행의 열개수 : " + num[0].length);
		System.out.println("배열0행의 열개수 : " + num[1].length);
		
	}
}
