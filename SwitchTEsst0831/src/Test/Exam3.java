package Test;

import java.util.Scanner;

public class Exam3 {

	public static void main(String[] args) {

		boolean run = true;

//�ܾ�
		Scanner sc = new Scanner(System.in);

		int balance = 0;
		while (run) {
			System.out.println("************************");
			System.out.println("1. ���� | 2.��� | 3.�ܰ� |4.����");
			System.out.println("************************");
			System.out.println("���� >>");
// 1���� ��������� ���ݾ� �Է� �ޱ� - �Է¹����ݾ� balance�߰�
			int menu = sc.nextInt();
			switch(menu) {
			case 1 :
				System.out.println("���ݾ� :");
				int money =sc.nextInt();
	balance = balance += money;//balance += money;/balance+=sc.nextInt();�� ���� 
				break;
			case 2 :
				System.out.println("��ݾ� :");
	      balance-=sc.nextInt(); 
				break;
			case 3 :System.out.println("�ܾ� : " +balance);
				break;
			case 4 :
				run = false;
				break;
			default:
			System.out.println("�޴�Ȯ��");
			break;
				
				
			}
			}
			
			
//			������ �������� ���߿� for ������ �ٲ㺸�� 
//			for (int i = 0; i < 10; i++) {
//			if (a==1) {
//				System.out.printf("%d,%d\n", (balance + a));
//			}else if (a==2) {
//		      for (int h = 0; h < 10; h++) {
//				int b = sc.nextInt();
//				System.out.printf("%d,%d\n",(balance - b) );
//				}else if (a==3) {
//			      for (int h = 0; h < 10; h++) {
//						int b = sc.nextInt();
//						System.out.printf("%d ",balance  );
//					}else if (a==4) {
//					      for (int h = 0; h < 10; h++) {
//								int b = sc.nextInt();
//								System.out.printf("%d ",balance  );
//							}
//					}
//				}
//							
					
			
//2���� ��������� ��ݾ� �Է� �ޱ� - �Է¹����ݾ� balance���� 
//3���� balance���  
//4���� run = false ������ ���α׷� ����   

			
			

			}
		}
