package 배열;

public class 배열의복사 {
	public static void main(String[] args) {
		int[] num = {1,2,3};
		int num2 = 100;
		
		int num3 = num2;
		System.out.println(num2);
		System.out.println(num3);
		
		int[] num4 = num;
		
		System.out.println();
		int[] num5 =num.clone();
		num[0]=999;
		System.out.println(num[0]);
		System.out.println(num5[0]);
	}
}
