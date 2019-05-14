package 배열;

import java.util.Scanner;

public class 과제3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] name = new String[3];
		int[] java = new int[3];
		int[] spring = new int[3];
								
		
		for (int i = 0; i < 3; i++) {
			System.out.print("학생 이름 : ");
			name[i] = sc.next();
			System.out.print("학생 점수(자바) : ");
			java[i] = sc.nextInt();
			System.out.print("학생 점수(스프링) : ");
			spring[i] = sc.nextInt();
		}
		
		System.out.println("세 학생의 이름은 " + name[0] + ", " +name[1] + ", " + name[2]);
		
		System.out.print("학생 점수 중 제일 높은 자바 점수는 ");
		int max=java[0];
		int java_rank=0;
		for (int i = 0; i < spring.length; i++) {
			if(max < java[i]) {
				max = java[i];
				java_rank = i;
			}
		}
		System.out.println(max + " " + "(" + name[java_rank] + ")");
		
		System.out.print("학생 점수 중 제일 낮은 스프링 점수는 ");
		int min=spring[0];
		int spring_rank=0;
		for (int i = 0; i < spring.length; i++) {
			if(min > spring[i]) {
				min = spring[i];
				spring_rank = i;
			}
		}
		System.out.println(min + " " + "(" + name[spring_rank] + ")");
		
		
	}
}
