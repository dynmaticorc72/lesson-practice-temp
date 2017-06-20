package tw.satisfaction.myproject.oop.collection;

import java.util.ArrayList;

public class TestArrayListEx1 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();

		list1.add("mary");
		list1.add("mary");
		list1.add("john");
		list1.add(1);
		list1.add(3.14);
		list1.add("mike");
		list1.add(new Integer(8));
		Integer c = 52;
		list1.add(c);

		list1.set(3, "michelle");
		list1.remove(2);

		list1.remove("mary");

		System.out.println("list1 : " + list1);

		int size1 = list1.size();
		System.out.println("size1 : " + size1);


	}

}
