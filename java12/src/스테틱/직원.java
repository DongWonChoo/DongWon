package ����ƽ;

public class ���� {
	String name;
	char gender;
	int age;
	static int woker;
	static int ageTotal;

	public ����(String name, char gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		woker++;
		ageTotal = ageTotal + age;	
	}

	@Override
	public String toString() {
		return "WokerTest [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
}
