package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/*
 * ArrayList - ���� �������� �迭 ������(�ߺ� ����)
 *  ���������� �߰��� �����ϴ°�� ArrayList�� ����=>size�� ũ����°� �߿�
 * LinkdeList -
 *  �߰� �����͸� �߰� /������ LinkedList �� ���� 
 * 
 * ���⿡�� �ɸ��ð� Ȯ���غ��� 
 */
public class ListEx5 {

	public static void main(String[] args) {
		List<String> arraylist = new ArrayList<String>(2000000);
		List<String> linkedList = new LinkedList<String>();
		
		System.out.println("*********������ �߰� *********");
		System.out.println("arraulist�ɸ��ð� "+add1(arraylist));
		System.out.println("linkedlist�ɸ��ð�	"+add1(linkedList));
	
		System.out.println();
		
		System.out.println("*********�߰����� �߰� *********");
		System.out.println("arraulist�ɸ��ð� "+add2(arraylist));
		System.out.println("linkedlist�ɸ��ð�	"+add2(linkedList));
		
		System.out.println();
		
		System.out.println("*********�߰����� ���� *********");
		System.out.println("arraulist�ɸ��ð� "+remove1(arraylist));
		System.out.println("linkedlist�ɸ��ð�	"+remove1(linkedList));
		
		System.out.println();
		
		
		System.out.println("*********���������� ���� *********");
		System.out.println("arraulist�ɸ��ð� "+remove2(arraylist));
		System.out.println("linkedlist�ɸ��ð�	"+remove2(linkedList));
		
		
	}//������ �߰� 
	
 public static long add1(List<String> list) {//add1(arraylist);,add1(linkedList);�ΰ� �� �޾��� 
	long start =System.currentTimeMillis();
	 for (int i = 0; i < 1000000; i++) {
		list.add(i+"");
	}
	 long end = System.currentTimeMillis();
	 return end-start;
 }
 //�߰����� �߰� 
 public static long add2(List<String> list) {
	 long start =System.currentTimeMillis();
	 for (int i = 0; i < 10000; i++) {
		 list.add(500,"x");
	 }
	 long end = System.currentTimeMillis();
	 return end-start;
 }//�߰����� ����
 
 public static  long remove1(List<String> list) {
	 long start =System.currentTimeMillis();
	 for (int i = 0; i < 10000
			 ; i++) {
		 list.remove(i);
 } long end = System.currentTimeMillis();
 return end-start;
 
}//���������� ���� 
 public static  long remove2(List<String> list) {
	 long start =System.currentTimeMillis();
	 for (int i =list.size()-1; i >0; i--) {
		 list.remove(i);
	 } long end = System.currentTimeMillis();
	 return end-start;
 }
}
