package java19;

import java.util.HashMap;

public class MapTest {
	public static void main(String[] args) {
		HashMap phone = new HashMap();
		phone.put(1,"决付");
		phone.put(2,"酒狐");
		phone.put(3,"悼积");
		phone.put(4,"模备");
		
		System.out.println(phone);
		System.out.println(phone.get(1));
		
		phone.remove(2);
		System.out.println(phone);
	}
}
