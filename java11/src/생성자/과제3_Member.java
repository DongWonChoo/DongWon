package 생성자;

public class 과제3_Member {
	String id;
	String pw;
	String user;
	int point;
	
	public 과제3_Member(String id, String pw, String user,int point) {
		this.id = id;
		this.pw = pw;
		this.user = user;
		this.point = point;
	}
	public void print() {
		System.out.println(this.id + "      " +this.pw + "      " + this.user +  "      " +this.point);
	}
}
