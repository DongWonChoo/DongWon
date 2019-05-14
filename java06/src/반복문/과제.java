package 반복문;

public class 과제 {
	public static void main(String[] args) {
		double[] eyes = {0.1,0.1,0.2,0.2,0.,0.,0.4,0.4,0.5,0.5};
		char[] sex = {'남','여','남','여','남'};
		double[] score = {2.5,3,3.5,4,4.5};
		String[] name = {"홍길동","김길동","박길동","송길동","길길동"};
		int[] com_score = {100,90,80,70,60,50};
		
		for (int i = 0; i < com_score.length; i++) {
			System.out.print(name[i]+ " " + eyes[i]+ " " + sex[i]+ " " + score[i]+ " " + com_score[i] + "\n");
			//System.out.print(eyes[i]);
			//System.out.print(sex[i]);
			//System.out.print(score[i]);
			//System.out.print(com_score[i]);
			
		}
	}
}