package java16;

import java.util.ArrayList;

public class MemberDAO {
	public ArrayList selectAll() {
		
		BbsDTO b1 = new BbsDTO("100","java","fun java","1");
		BbsDTO b2 = new BbsDTO("200","jsp","fun jsp","2");
		BbsDTO b3 = new BbsDTO("300","spring","fun spring","3");
		
		ArrayList list = new ArrayList();
		
		list.add(b1);
		list.add(b2);
		list.add(b3);
		
		return list;
	}
}
