package 일기장;

import java.io.FileWriter;
import java.io.IOException;

public class 파일다루기 {
	public static void main(String[] args) throws Exception {
		//파일에 저장
		//객체 생성
		//메소드 사용
		FileWriter w = new FileWriter("start.txt");
		//메소드 호출 -> 기본생성자가 없기에 파라미터 값 입력
		w.write("hi, what your name?\n");
		w.write("my name is choo\n");
		
		w.close();
	}
}
