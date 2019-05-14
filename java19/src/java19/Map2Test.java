package java19;

import java.util.HashMap;

public class Map2Test {
	public static void main(String[] args) {
		HashMap memberlist = new HashMap();
		Mem m1 = new Mem("제목1", "내용1", "글쓴이1", "비밀번호1");
		Mem m2 = new Mem("제목2", "내용2", "글쓴이2", "비밀번호2");
		Mem m3 = new Mem("제목3", "내용3", "글쓴이3", "비밀번호3");
		
		memberlist.put(100, m1);
		memberlist.put(200, m2);
		memberlist.put(300, m3);
		
		System.out.println(memberlist.get(100));
		System.out.println(memberlist.get(200));
		System.out.println(memberlist.get(300));
	}
}
