package 생성자;

public class 과제1_Member {
	String name;
	int age;
	String tel;
	String addr;
	int i = 0;
	
	public 과제1_Member(String name, int age, String tel, String addr) {
		this.name = name;
		this.age = age;
		this.tel = tel;
		this.addr = addr;
	}
	
	public void user() {
		System.out.print(name + "        " + age + "       " +  tel + "        " + addr + "\n");
	}
	
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", tel=" + tel + ", addr=" + addr + "]";
	}
	
}
