package collection;

import java.util.LinkedList;
import java.util.List;
/*
 * ArrayList - ���� �������� �迭 ������(�ߺ� ����)
 *  ���������� �߰��� �����ϴ°�� ArrayList�� ����
 * LinkdeList -
 *  �߰� �����͸� �߰� /������ LinkedList �� ���� 
 * 
 */
public class ListEx4 {

	public static void main(String[] args) {
 List<String> list = new LinkedList<String>();
 
 list.add("���"); 
	list.add("��");
	list.add("�ٳ���");
	list.add("������");
	list.add("����");
	list.add("����");
	
	System.out.println(list);
	
	
	}

}
