package myexam;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		// ��������� ����2�� �Է� �ޱ�
		// ������ �Է� �ޱ� (+,-,/,%)
		// switch������
		// ������ ��� ���
		
		Scanner sc = new Scanner(System.in);
				System.out.println("�����Է�");
		int a = sc.nextInt();
		System.out.println("�����Է�");
		int b = sc.nextInt();
		System.out.println("������ �Է�");
		String c = sc.next();
		
		
		int result=0;
		switch (c) {
		case "+" :
			result = a+b;
			
			break;
		case "-" :
			result = a-b;
			
			break;

		default:
			break;
		}
		System.out.printf("%d %s %d = %d",a,c,b,result);
	}

}
