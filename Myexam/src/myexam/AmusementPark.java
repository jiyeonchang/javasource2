package myexam;

import java.util.Scanner;

public class AmusementPark {

	public static void main(String[] args) {
//		 ��� ���� �Է� �޴´� 
		// Ű�� 150 ������ ž�°���
		// ���̰� 10�� ���ϸ� ok
		//���̰� 5�� �̻��̰�, Ű�� 2���� �̻��̸� ž�°���
		//Ű�� 2���� �̻��̰�, ���̰�5�� �̻��̸� ž�°��� (!����ϱ�)
 
		Scanner sc = new Scanner(System.in);//System.in�ϰ� �Ǿȵ� ����� 
		
		System.out.println("Ű�� �Է����ּ���:");
		int height = sc.nextInt();
		System.out.println("���̸� �Է��� �ּ���:");
		int age = sc.nextInt();
		
		boolean a = age >= 5&& height >= 150;
		System.out.println(a);
		
		boolean b = !a;
		System.out.println(b); //a��false�γ����� true�� �ݴ�Ǽ� ����  

	}

}
