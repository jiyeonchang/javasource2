package array;

public class ArrayTest4 {
	public static void main(String[] args) {
//������ ��հ� �հ� ���ϱ� 
		
		int score [] = {78,65,95,88,36,45,25,47,87,43};//������� �迭
//--------------		
		//������ ������ ��ճ�������� ���= �հ�/���(score.length)
		int sum =0;//�հ��� ����
//	for (int i = 0; i < score.length; i++) {
//		sum = sum+score[i];
		
		//score[i]�ϳ��� ������ ���ͼ� ����
		//sum+=score[i]�� �� ������ ���� 
//	}
//--------------		
	
	// ���� for������ �ۼ� �ϴ¹� 
	for(int jumsu: score) {
		sum +=jumsu;
		
	}
	
	System.out.printf("�հ� : %d ,��� : %d",sum,sum/score.length);
	
	
	}
}
