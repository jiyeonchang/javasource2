package myexam;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		// position �Է� ���� �� ��� /position= "����";
		// position ���� 700, ����500, ������ 300����
//		(���� )�����ֻ�����,switch�� ����Ͽ� �ذ��Ұ�
		Scanner sc = new Scanner (System.in);
		String  position = sc.next();
		
		switch (position) {
		case "����" : 
			System.out.println("���� :700");
			
			break;
		case "����" :
			System.out.println("���� :500");
			
			break;
		default:
			System.out.println("���� :300");
			break;
		}
		
		
		
	}

}
