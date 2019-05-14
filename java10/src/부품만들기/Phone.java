package 부품만들기;

public class Phone {
	//전화기 => class
	//특징을 찾아서 부품을 만들어야 함.
	// - 특징(attribute, property), 특성, 속성
	// - 정적 특성  : 모양, 크기, 회사
	String shape;
	int size;
	String company;
	

	public String call() {
		return "친구";
	}
	
	
	public void company() {
		System.out.println("회사");
	}
	
	
//	public void alram() {
//		System.out.println("알람을 맞추다.");
//	}
	
	public int alram() {
		return 11;
	}
	
	public void text () {
		System.out.println("문자하다.");
	}
	
	public String toString() {
		return "Phone [shape=" + shape + ", size=" + size + ", company=" + company + "]";
	}
}
