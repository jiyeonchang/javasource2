package MyPractice;

import java.util.Scanner;

public class Practice6 {

	public static void main(String[] args) {
//  ������ - do - while �� switch���� �Ἥ �ۼ��غ��� 
		// ���� �ϱ� : ????
		
		
		
//		���� ���տ����� ���� ���� Ǯ��� !
//	������ ��뿡�� �Է°��� �������� �޾Ƽ� ���� �Ҽ� �ִ� Ƽ���� �����ڽ��ϴ� ����
//		���� �ٽ����¡ 
//		3������ �������� 
//��ĳ�� ����
		Scanner sc = new Scanner(System.in);
// ���� �ֻ��� 1~3���� ���� 
		int a = (int) (Math.random() * 4) + 1;
		//  int �³�  
		// �ȳ� ��Ʈħ

// �մ����� ��ȣ �ް� �ֻ��� ������ ������ ��� , �ƴϸ� �簡�� ��ȸ�� 3�� 
	// ��÷�Ǹ� �̱� ���߱� �ϰ������ �ȵ� ��µ� �� �ȵ� 
	for (int i = 1; i < 4; i++) {
		
		System.out.println("������� �����̱� �Դϴ�.");
		System.out.println("����� ���� 1,2,3���߿��� �ϳ��� �Է��� �ּ��� ");
		int b = sc.nextInt();
			if (b == 1 && b == a) {
				System.out.printf("��÷�Դϴ� !\n ������ȣ :%d %d\n",b,a);
			} else if (b == 2 && b == a) {
				System.out.printf("���Դϴ� !\n ������ȣ :%d %d\n",b,a);
			} else if (b == 3 && b == a|| a!=b) {

				System.out.printf("���Դϴ� !\n ������ȣ :%d %d\n",b,a);

			}

		}System.out.println( );
	}
}

// ���� ���� �ϳ׿�!! ���� ���ڰ� �ٹ̰� ������ ���ڽ��ϴ�.
//ȥ�ڼ� ���� ����°͵� ���� 






