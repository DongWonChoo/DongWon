package 반복문;

import java.util.Scanner;

public class WhileTeste4 {
	public static void main(String[] args) {
		int start = 1;
		int mul = 1;
		while(start <10) {
			mul = mul* start;
			start = start + 1 ;
		}
		System.out.println(mul);
	}
}
