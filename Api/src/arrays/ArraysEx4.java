package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
//ã�� ���� �ڸ� ��ȸ Arrays
public class ArraysEx4 {
public static void main(String[] args) {

//List�� ũ�⸦ ������ �� ���� 
	List<String>list =Arrays.asList("apple","���","lemon");
//	List.add("����");//������ 
	System.out.println(list);
	
//	List<String> list1 = new ArrayList<String>();
//	list.add("apple");
//	list.add("���");
//	list.add("lemon");//������ �� �����ϰ� ������ִ� 
	
	List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
	list2.add(6);
	System.out.println(list2);
	


}
}

