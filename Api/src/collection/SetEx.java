package collection;

import java.util.HashSet;
import java.util.Set;

public class SetEx {
	/*
	 * Set : �ߺ� ������� ���� ,������ ���� :����Ŭ���� -HashSet, TreeSet
	 * 
	 */
	public static void main(String[] args) {

		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new HashSet<String>();

		set1.add("java");
		set1.add("jsp");
		set1.add("oracle");
		set1.add("html");
		System.out.println(set1);

		for(String str : set1) {
			System.out.println(str);
		}
		System.out.println();
		
		set2.add("1");
		set2.add("2");
		set2.add("3");
		set2.add("3");
		System.out.println(set2);
		
		for(String str2: set2) {
			System.out.println(str2);
		}
		
		
		
		
	}

}
