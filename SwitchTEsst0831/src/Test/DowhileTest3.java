package Test;

import java.util.Scanner;

public class DowhileTest3 {

	public static void main(String[] args) {
	 
// ��ǻ�Ͱ�1~100������ ������ ���Ƿ� ���� 
//		����ڴ� ��ǻ�Ͱ� ������ �մ� ���ڰ� �������� �˾Ƹ��߱� 
		//���Ƿ� ���� �����غ��� math
		Scanner sc = new Scanner(System.in);
		int answer = (int)(Math.random()*100)+1;//0~99
		int input = 0; 
		do {
			System.out.println("������ ���ڸ� �Է��� �ּ���");
			input = sc.nextInt();//50
			
			if (input<answer) {
				System.out.println("�� �� ū���� �Է��� �ּ���");
				
			}else {
				System.out.println("���� �������� �Է��� �ּ���");
			}
		}while(input!=answer);
		
				
	}

}
