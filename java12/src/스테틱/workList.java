package 스테틱;

public class workList {
	public static void main(String[] args) {
		직원 wk1 = new 직원("임아무개",'남',24);
		직원 wk2 = new 직원("김아무개",'여',23);
		직원 wk3 = new 직원("박아무개",'남',25);
		
		System.out.println("전체 직원 수? " + 직원.woker);
		System.out.println("직원들의 평균 나이? "+직원.ageTotal/직원.woker);
		
		System.out.println("전체 직원 리스트 ");
		System.out.println(wk1);
		System.out.println(wk2);
		System.out.println(wk3);
	}
}
