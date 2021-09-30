package collection;

import java.util.ArrayList;
import java.util.List;

public class ListEx1 {

	/*�÷��� �����ӿ�ũ 
	 * -���� �����͵��� �����ϴ� Ŭ����Ʋ�� ǥ��ȭ�� ���� ��� 
	 * Collection (�������̽�)- List ,set 
	 * -Map
	 * 
	 * 
	 *List (�������̽�): ������ �ִ� .������ �ߺ� ���� 
	 *  ����Ŭ���� : Vector,ArrayList ,LinkedList,stack
	 *  �迭�� ���� �����ε� ����Ų ���� 
	 *  ���� : ��ü�� �ҿ����ϰ� �������� �ϳ� �ϳ� ���� ��ܼ� �����ؾ��� 
	 *  E,T,K,V:���� ��ü Ÿ���� ����
	 *  
	 *  
	 *  �⺻Ÿ���� =>��ü Ÿ�� (WrapperŬ����)�� �����ؾ� �����ִ� 
	 *  int => integer ,float => Float, double => Double ,char => Character, boolean => Boolean
	 */
	public static void main(String[] args) {
	
		
//		List<E> list1 = new ArrayList<E>();/*�ڹ� ��ƿ�� �θ���*/
//		ArrayList<E>list2 = new ArrayList<E>();

		//�����ſ��� �ؿ���ó�� ����
		//��ü ���� (����ִ� ��Ȳ)
		List<String> list1 = new ArrayList<String>();/*�⺻ ���� ��� ���� */
		ArrayList<Integer>list2 = new ArrayList<Integer>();
		
		//������ �߰� ->add()���
		list1.add("���");//0������ 5������ ����� 
		list1.add("��");
		list1.add("�ٳ���");
		list1.add("������");
		list1.add("����");
		list1.add("����");
		
		//������ �������� 
		for(String str: list1)//���� for�� (Ÿ�� �����̸�(������) : ������ ������)
		{System.out.println(str);
			
		}System.out.println();
		System.out.println(list1);//toString() �������̵� �Ǿ� ���� 
		System.out.println();
		
		for (int i = 0; i <list1.size(); i++) {//�Ϲ�for���� length���� size()�� ���
			System.out.println(list1.get(i));
		}
		
		System.out.println();
		
		list2.add(10);
		list2.add(20);
		list2.add(30);
		list2.add(40);
		list2.add(50);
		list2.add(60);
		
		for (Integer atr2 : list2) {
			System.out.println(atr2);
		}
		
		int sum=0;
        for (	Integer atr2 : list2) {
        	sum += atr2;
        	
		}System.out.println("�հ�"+sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
