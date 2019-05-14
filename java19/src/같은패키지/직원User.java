package 같은패키지;

public class 직원User {
	public static void main(String[] args) {
		직원 work = new 직원();
		work.age = 100; 		//default = 같은 package 접근 가능
		work.name = "park";		
		work.salary = 100;		//같은 package안의 상속관계에만 가능
		//work.ssn = "10010";
		
	}
}
