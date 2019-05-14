package 배열;

import java.util.Scanner;

public class 과제 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("1번 문제");
		String[] subject = new String[3];
		for (int i = 0; i < subject.length; i++) {
			subject[i] = sc.next();
		}
		System.out.println("**"+ subject[0] + "보다는 " + subject[2] +"**" );
		
		System.out.println("2번 문제");
		int[] num = new int[3];
		for (int i = 0;  i< num.length; i++) {
			num[i] = sc.nextInt();
		}
		System.out.println(num[0] + "+" + num[2] + "=" + (num[0] + num[2]));
		
		System.out.println("3번 문제");
		int[] arr1 = new int[5];
		for (int i = 0; i < 5; i++) {
			arr1[i] = sc.nextInt();
		}
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println("\n");

		System.out.println("4번 문제");
		int[] arr2 = new int[4];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}
		for (int i = 0; i < arr2.length; i++) {
			if (arr2[i] == 33) {
				System.out.println(i + "번쨰 배열이 33 입니다.");
			}
		}

		System.out.println("5번 문제");
		int[] avg = new int[5];

		System.out.println("성적 입력 : ");
		for (int i = 0; i < avg.length; i++) {
			avg[i] = sc.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < avg.length; i++) {
			sum = avg[i] + sum;
		}

		System.out.println("평균 성적 = " + (sum / avg.length));
		
		System.out.println("6번 문제");
		int[] arr3 = {66,77,88,99};
		int max=arr3[0];
		for (int i = 0; i < arr3.length; i++) {
			if(max < arr3[i]) {
				max = arr3[i];
			} 
		}
		System.out.println("max 값 : " + max);
		
		System.out.println("7번 문제");
		int temp1=0;
		int temp2=0;
		for (int i = 0; i < arr3.length; i++) {
			if(arr3[i] == 66) {
				temp1 = i;
			}
			if(arr3[i] == 99) {
				temp2 = i;
			}
		}
				
		int imsi = arr3[temp1];
		arr3[temp1] = arr3[temp2];
		arr3[temp2] = imsi;
		for (int i = 0; i < arr3.length; i++) {
			System.out.println();
		}
	}
}
