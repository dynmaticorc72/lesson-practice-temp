package tw.satisfaction.myproject.oop.collection;

import java.util.HashSet;

public class TestHashSetEx1 {

	public static void main(String[] args) {
		HashSet set1 = new HashSet();
		set1.add("mary");
		set1.add("mary");
		set1.add("john");
		set1.add(6);
		set1.add(3.14);
		set1.add(new Integer(7));
		set1.add(new Double(7.12));
		set1.add(123);
		Integer a = 8;
		set1.add(a);
		System.out.println("set1 : " + set1);

		int size1 = set1.size();
		System.out.println("size1 : " + size1);
		
		set1.clear();
		int size2 = set1.size();
		System.out.println("size2 : " + size2);
		
	}

}
