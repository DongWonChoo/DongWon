package 배열;

import javax.swing.JButton;

public class 스트링배열 {

	public static void main(String[] args) {
		int[] ages = {50,100,10};
		for (int i : ages) {
			System.out.println(i);
		}
		String[] names = {"홍길동","박길동","김길동"};
		names[2] = "김길동";
		names[names.length-1] = "김동순";
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		for(String temp : names) {
			System.out.println(temp);
		}
	}

}