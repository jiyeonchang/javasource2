package myexam;

import java.util.Scanner;
//������ ������ ���� ���� ����� 
public class RestaurantKeybord {
	// �Ĵ� �̸� �Է¹ޱ�
	// �Ĵ� ũ�� ,���̺� ��
	// ������ ��� Ű����� �����ޱ�
	public static void main(String[] args) {
  
		Scanner sc = new Scanner (System.in);

		System.out.println("�����̸� :");
		String name = sc.next();

		System.out.println("���� ������ :");
		double size = sc.nextDouble();
		System.out.println("���̺�� :");
		int table= sc.nextInt();
		System.out.println("���¿��� :");
		boolean open = sc.nextBoolean();
		
		System.out.println(name);
		System.out.println(size);
		System.out.println(table);
		System.out.println(open);
		
		
	}

}
