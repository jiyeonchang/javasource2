package array;

import sun.security.util.Length;

public class ArrayTest7 {

	public static void main(String[] args) {

		int score [] = {78,65,95,88,36,45,25,47,87,43};
	int max =score[0];
	int min=score[0];
			
	
			
		//�ְ����� ���ϱ� 
		//�������� ���ϱ� 
		
		
		
		for (int i = 0; i < score.length; i++) {
			if (max<score[i]) {//���� ���ھ �ƽ����� ũ�� �ƽ��� ���ھ� ������ �ٲ�� 
				max=score[i];
			}else if (score[i]<min) {
				min= score[i];
			}
		}
System.out.printf("�ְ����� : %d\n ��������: %d",max,min);

}
}
