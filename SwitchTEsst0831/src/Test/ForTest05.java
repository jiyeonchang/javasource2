package Test;

import java.util.Iterator;

public class ForTest05 {

	public static void main(String[] args) {
//		2�ܺ��� 9�ܱ��� ������ 
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
 System.out.printf("%d*%d=%d\n",i , j, i*j );
			}
		}
		System.out.println();
		
		//������ ������ �������ϰ� ���� ������ ���ͳֱ�
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				
 System.out.printf("%d*%d=%2d\t",i , j, i*j );
 //�ڸ��� ���ڰ� �������� %2d\t�������� ���� �����ش�
			}
         System.out.println();//�ؿ� syso���־��ָ� ���Ͱ� �� 
		}
//		������� ���������� ������ for�� 2����
//3�������� ���������� (���ļ�) for�� 3�� ��  
	
		//*�� ������ ����� 
//		for(int j=1;j<=1;j++) {
//			System.out.print("*");
//				}
//		System.out.println();
//		
//		for(int j=1;j<=2;j++) {
//		System.out.print("*");
//	}
//	System.out.println();
 
		for(int i=1;i<=1;i++) {
		for(int j=1;j<=5;j++) {
			System.out.printf("*");
		
		}
		System.out.println();
		}
		
		
		//��� �ݴ�� ����� 

		for(int i=1;i<=5;i++) {
		for(int j=5;j>=1;j--) {
			System.out.print(j<=i?"*":"");
//			if(j<=i) {
//			System.out.print("*");
//		}else {
//		System.out.print(" ");
//		}
	}
		System.out.println();
		}		
	}
}	
		
		
		
		
		
	