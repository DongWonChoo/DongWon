package window;

import java.util.Date;

public class 과제1 {
	public static void main(String[] args) {
		Date date = new Date();
		String a = null;
		
		int day = date.getDay();
		
		if(day == 1 ) {
			 a = "월";
		} else if (day == 2 ) {
			a = "화";
		} else if (day == 3) {
			a = "수";
		} else if (day == 4) {
			a = "목";
		} else if (day == 5) {
			a = "금";
		} else if (day == 6) {
			a = "토";
		} else {
			a = "일";
		}
		
		
		switch(a) {
		case "월" : System.out.println("A장소"); break;
		case "화" : System.out.println("B장소"); break;
		case "수" : System.out.println("C장소"); break;
		case "목" : System.out.println("D장소"); break;
		case "금" : System.out.println("E장소"); break;
		case "토" : System.out.println("F장소"); break;
		case "일" : System.out.println("G장소"); break;
		}
	}
}
