package 과제;

import java.util.Scanner;

public class 과제2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] names = new String[5];
		int[] age = new int[5];
		String[] grade = new String[5];
		int[] age_temp = new int[3];
		int[] grade_temp = new int[3];
		for (int i = 0; i < names.length; i++) {
			System.out.print("이름 입력 : ");
			names[i] = sc.next();
			System.out.print("학년 입력 : ");
			age[i] = sc.nextInt();
			System.out.print("학점 입력 : ");
			grade[i] = sc.next();
		}
		
		
		System.out.print("1. 전체인원은? " + names.length + "명");
		System.out.println();
		System.out.println();
		System.out.print("2. 전체 명단 프린트?");
		System.out.println();
		System.out.println("  이름             학년      학점");
		for (int i = 0; i < grade.length; i++) {
			System.out.println(names[i]+ "             " + age[i] + "     " + grade[i]);
		}
		System.out.println();
		System.out.println("3. 학년별 인원수, 학점 별 인원수 !");
		
		for (int i = 0; i < grade.length; i++) {
			if(age[i] == 1) {
				age_temp[0]++;
			} else if(age[i] == 2) {
				age_temp[1]++;
			} else {
				age_temp[2]++;
			}
			
			
			if(grade[i].equals("A") || grade[i].equals("a")) {
				grade_temp[0]++;
			} else if(grade[i].equals("B") || grade[i].equals("b")) {
				grade_temp[1]++;
			} else {
				grade_temp[2]++;
			}
		}
		
		System.out.println("학년별 인원 수");
		System.out.println("1학년  2학년 3학년");
		System.out.println(" " + age_temp[0] + "    " + age_temp[1] + "    " + age_temp[2]);
		System.out.println("학점별 인원 수");
		System.out.println("A학점  B학점 C학점");
		System.out.println(" " + grade_temp[0] + "    " + grade_temp[1] + "    " + grade_temp[2]);
		System.out.println();
		
		int max_age = age_temp[0];
		int max = 1;
		for (int i = 0; i < age_temp.length; i++) {
			if(max_age < age_temp[i]) {
				max_age = age_temp[i];
				max = i+1;
			}
		}
		System.out.println("4. 이 동아리에 가장 많은 학년은?");
		System.out.println(max + "학년");
		
		int max_grade = grade_temp[0];
		max = 1;
		String temp = null;
		for (int i = 0; i < grade_temp.length; i++) {
			if(max_grade < grade_temp[i]) {
				max_grade = grade_temp[i];
				max = i+1;
			}
			if(max == 1) {
				temp = "A";
			} else if (max == 2) {
				temp = "B";
			} else {
				temp = "C";
			}
		}
		System.out.println("5. 이 동아리에 가장 많은 학점은?");
		System.out.println(temp + "학점");
		
		System.out.print("6. 이름을 입력 받아 몇번째 인덱스에 있는지 찾아보세요.");
		String name = sc.next();
		int index = 0;
		for (int i = 0; i < names.length; i++) {
			if(name.equals(names[i])) {
				index = i;
			}
		}
		System.out.println(index + "번째 인덱스");
		
		int student_age = 0;
		String student_grade = null;
		System.out.print("7. 이름을 입력 받아 학년과 학점을 출력해보세요.");
		String student = sc.next();
		for (int i = 0; i < names.length; i++) {
			if(student.equals(names[i])) {
				student_age = age[i];
				student_grade = grade[i];
			}
		}
		System.out.println(student_age + "학년 " + student_grade + "학점");
	}
}














