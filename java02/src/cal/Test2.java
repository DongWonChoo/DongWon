package cal;

public class Test2 {

	public static void main(String[] args) {
		int A = 400;
		int result2 = A % 2;
		
		if(A % 2== 0) {
			System.out.println(A+"은 짝수이다");
		}else {
			System.out.println(A+"은 홀수이다");
		}

		System.out.println("----삼항연산자로 출력----");
		
		System.out.println(result2 == 0 ? "짝수" : "홀수");
	}

}
