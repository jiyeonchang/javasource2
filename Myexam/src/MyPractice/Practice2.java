package MyPractice;

import java.util.Iterator;

public class Practice2 {
//���� for�� 
	public static void main(String[] args) {
  //��5�� ���ΰ� 10�� �ݺ��Ǳ� ���Ҷ�
		
		for (int i = 0; i <5; i++) {//(���� :��)�ϴ� �κ� 
			for (int j = 0; j < 10; j++) {//(���� :��)�ϴºκ� 
				System.out.print("*");
			}
		System.out.println();
		}
		
		//������ 2�ܺ��� 9�ܱ��� ��� 
		int sum = 0;
		for (int i = 2; i < 10; i++) {
		for (int j = 2; j < 10; j++) {
			System.out.printf("%d * %d = %d\n",i,j,i*j,sum);
		}
		    System.out.println();      //������ ������ �ٲٰ������ \n�ְ�syso
		}
	System.out.println();
	
	
	//���� �ﰢ�� ��� 
	
	for (int i = 1; i <= 5; i++) {
		for (int j = 1; j <= i; j++) {
			System.out.print("*");//9.1�������� 1:11
		}
		System.out.println();
	}
		//�ﰢ�� �ݴ����� 
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j>= 1; j--) {
				if (j<=i) {
					System.out.print("*");
				}else {
					System.out.print(" ");//print�����ϱ� 
				}
			}
			System.out.println();
		}
		
		
	
}
}
