package Test;

import java.util.Scanner;

public class SwitchTest03 {

	public static void main(String[] args) {

//	position �Է� ���� �� ��� /position= "����";
		
		Scanner k = new Scanner(System.in);
System.out.println("�����Է� : ");
		String position = k.next();

//		position ���� 700, ����500, ������ 300����

		switch (position) {
		case "����":
			System.out.println("700����");
			break;
		case "����":
			System.out.println("500����");
			break;

		default:
			System.out.println("300����");
			break;
		}
		
		
		
		
		

	}

}
