package eaxm;

import java.util.Scanner;

public class Degrees {

	public static void main(String[] args) {
//	ȭ���µ� =>�����µ� 
		
//		����
		
//		ȭ���µ� �Է¹ޱ�(����)
//		���� ȭ���µ� �� �����µ��� ��ȯ�� ����ϱ� 
//		(ȭ���µ� -32)*5/9
		Scanner K = new Scanner(System.in);
	System.out.println("ȭ���µ� �Է� :");
		int fireA = K.nextInt();
		
		double cels=(fireA-32)*5/9.0;
		
		System.out.println("�����µ� : " +cels);
		System.out.printf("�����µ� : %.4f",cels);
		
		
		
	
	}

}
