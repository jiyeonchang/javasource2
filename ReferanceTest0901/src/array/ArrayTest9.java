package array;

import java.util.Iterator;

import sun.security.util.Length;

public class ArrayTest9 {

	public static void main(String[] args) {
//�հ踦 ���ϰ� ���� �� 
		int score[][] = { { 100, 100, 100 },
							{ 20, 20, 20 }, 
							{ 30, 40, 30 }, 
							{ 40, 50, 20 },
							{ 50, 60, 50 } };// 6�� 4���̴�

//		int result [][]=new int[6][4];
		int result[][] = new int[score.length + 1][score[0].length + 1];
// 3������ 1�� �� ����Ŵϱ� +1���ش� 

		// �������� - System.out.println(score)[5][4];
		// java.lang.Error: Unresolved compilation problems:

		// �հ踦 ���ؼ� ���� �߰�
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				// score ���� result�� �ű��
				result[i][j] = score[i][j];
//���հ� ����� 
				//result[0].length�ϸ� 4������ ���´� (�̹� 4�� ����� ����)�׸��� -1���� 
				result [i][result[i].length-1]+=result[i][j];
				
				//��ü �հ� 
				result [5][3]+= score[i][j];
				//������ ��ȭ�� ���ü��� �����ϱ� 
//	�̷��Ե� ����	result[result.length-1][result[i].length-1]+=score[i][j];
			}

			//���հ�
			result[result.length-1][0]+=result[i][0];
			result[result.length-1][1]+=result[i][1];
			result[result.length-1][2]+=result[i][2];
			
		}
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.printf("%5d", result[i][j]);
			}
			System.out.println();
		}

	}
}
