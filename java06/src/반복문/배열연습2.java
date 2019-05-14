package 반복문;

public class 배열연습2 {

	public static void main(String[] args) {
		int[] nums = {44,66,22,88};
		System.out.println(nums);
		for(int i=0 ; i < nums.length ; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println("");
		System.out.println(nums.length);
		
		nums[0] = 55;
		
		for(int i=0 ; i < nums.length ; i++) {
			System.out.print(nums[i] + " ");
		}
	}
}
