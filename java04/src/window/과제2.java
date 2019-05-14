package window;

import java.util.Date;

public class 과제2 {
	public static void main(String[] args) {
		Date date = new Date();
		int to_year = 2222;
		
		int year = date.getYear()+1900;
		
		System.out.println("2222년까지 " + (to_year - year) + "남았습니다.");
	}
}
