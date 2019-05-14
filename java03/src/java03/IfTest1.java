package java03;

import java.util.Scanner;

public class IfTest1 {

	public static void main(String[] args) {
		
		int num = 1;
		System.out.println("저기요!!!");
		System.out.println("---------------");
		System.out.println("메뉴를 고르세요");
		System.out.println("---------------");
		System.out.println("1.짜장 2.짬뽕 3.우동");
		System.out.println("---------------");
		System.out.println("당신의 선택은?");
			if(num==1) {
				System.out.println("짜장면을 선택!");
			}
			else if(num==2) {
				System.out.println("짬뽕을 선택!");
			}
			else if(num==3) {
				System.out.println("우동을 선택!");
			}
			else {
				System.out.println("다시 음식을 선택해주세요. 없는 메뉴입니다.");
			}

	}// main end

}// class end
