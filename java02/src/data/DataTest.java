package data;

public class DataTest {

	public static void main(String[] args) {
		// comment, 주석, 설명
		// 컨트롤+/(한줄 주석)
		System.out.println("나의 데이터 프린트..");
		// 저장은 컨트롤 + S 
		// 컨트롤 + F11 
		//정수(integer, int)
		int spaceY = 300; // -21~21억
		//byte(1byte, 8비트: -128~127)
		//short(2)
		//int(4)
		//long(8)
		
		int startX = 0; //대입 연산자, 할당 연산자
		int startY = 0;
		
		int result =startX + startY;
		String result2 = ("그래픽의 시작점 Y축은 " + startY);
		
		System.out.println("그래픽의 시작점은 X 축은 " + startX);
		System.out.println(result2);
		
		System.out.println();
		
		float x = 5.5f;
		double y = 5.5;
		
		char gender = '남';
		boolean breakTime = true; //false
		
		System.out.println("내 이름은 김아무개이고, 나이는 100세입니다");
		System.out.println("나의 키는 180.5이고, 몸무게는 99kg입니다");
		System.out.println("시력은 1.5이고, 성별은 남입니다");
		
	}

}
