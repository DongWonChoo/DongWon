package java19;

public class Member {
	String id;
	int age;
	char gender;
	String addr;
	String tel;
	
	public Member(String id, int age, char gender, String addr, String tel) {
		this.id = id;
		this.age = age;
		this.gender = gender;
		this.addr = addr;
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", age=" + age + ", gender=" + gender + ", addr=" + addr + ", tel=" + tel + "]";
	}
}
