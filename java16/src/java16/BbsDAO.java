package java16;

import java.util.ArrayList;

public class BbsDAO {
	public ArrayList selectAll() {
		BbsDTO b1 = new BbsDTO("100","java","fun java","1");
		BbsDTO b2 = new BbsDTO("200","jsp","fun jsp","2");
		BbsDTO b3 = new BbsDTO("300","spring","fun spring","3");
		BbsDTO b4 = new BbsDTO("400","android","fun android","4");
		
		ArrayList list = new ArrayList();
		
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		
//		System.out.println(list);
//		System.out.println(list.get(0));
//		BbsDTO dto1 = (BbsDTO)list.get(0);
//		System.out.println(dto1.getId());
//		System.out.println(dto1.getTitle());
//		System.out.println(dto1.getContent());
//		System.out.println(dto1.getEtc());
//
//		BbsDTO dto2 = (BbsDTO)list.get(3);
//		System.out.println(dto2.getId());
//		System.out.println(dto2.getTitle());
//		System.out.println(dto2.getContent());
//		System.out.println(dto2.getEtc());
		
		return list;
	}
}
