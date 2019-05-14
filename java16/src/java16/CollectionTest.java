package java16;

import java.util.Vector;

public class CollectionTest {
	public static void main(String[] args) {
		Vector datalist = new Vector();
		datalist.add("hallow");
		datalist.add(100);
		datalist.add(11.22);
		datalist.add(true);
		datalist.add('a');
		
		System.out.println(datalist.size());
		System.out.println(datalist);
		datalist.remove(0);
		System.out.println(datalist.size());
		System.out.println(datalist);
	}
}
