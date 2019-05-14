package java19;

public class Mem {
	String title;
	String content;
	String user;
	String pw;
	
	public Mem(String title, String content, String user, String pw) {
		this.title = title;
		this.content = content;
		this.user = user;
		this.pw = pw;
	}
	
	@Override
	public String toString() {
		return "mem [=" + "title=" + title + ", content=" + content + ", user=" + user + ", pw=" + pw + "]";
	}

}
