package 스테틱;

public class 나의일상 {
	public static void main(String[] args) {
		day day1 = new day("자바공부",10,"강남");
		day day2 = new day("여행     ",15,"강남");
		day day3 = new day("운동     ",11,"강남");
		
		int sum = day1.time + day2.time + day3.time;
		
		System.out.println("하루의 일과를 나타내는 프로그램");	
		System.out.println("======================");
		System.out.println(day1);
		System.out.println(day2);
		System.out.println(day3);
		System.out.println("======================");
		System.out.println("전체 하는 일의 시간 : " + sum);
		System.out.println("평균 하는 일의 시간 : " + sum/3);
		System.out.println("매일 무엇을 얼마나 어디서에서 했는가? : " + day1.Doing + "을" + day1.time + "씩 " + day1.location + "에서 공부했다");
		System.out.println("몇시간 했는지? : " + day.count);
	}
}
