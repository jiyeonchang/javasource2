import java.util.Scanner;

public class school4 {

	public static void main(String[] args) {
	//������ �Է��ϰ� �������� 0�� �Է��ϼ���
//		10 20 ~30 40
// �Է��� ���� ������ 4���̸� ����� 15.0�Դϴ� 
		Scanner sc = new Scanner(System.in);//�Է¹ޱ� 
		System.out.println("������ �Է��ϰ� �������� 0�� �Է��ϼ���");//����
		int num ;//�̺κ��� �ݺ��ؾ� �Ѵ� 
		int count =0;//���� ���°� 
		//��������� int���� �ް� ,num�̶�� ��������� num�� 0�� �ƴϿ����Ѵ� 
		int sum=0;// ��ü ���� ���� ���� ���� �ڸ� 
		
		while((num= sc.nextInt())!=0)
		{//0�� �ƴҶ����� �޴´� 
			//((num= sc.nextInt()!)�ȹ����� ���н�ó��-,+������ �������⶧���� ���� �ش޶�� ���´�
			 sum += num;//num�� Ű���忡��  ���� ���� �� ������� 
		 count++;//�ϳ������� �ϴ°� ��
		}
		  
//	System.out.printf("�Է��� ���� ������ %d���̸� ����� %.1f�Դϴ�",count,sum/count);
	//����ϸ� ������ f != java.lang.Integer���� 
//	������ ������ �Ǽ�%.1f�� ����϶� �ؼ� -�ذ���� ĳ���� (sum�տ� ������ �־��ش�)
//�ذ�-System.out.printf("�Է��� ���� ������ %d���̸� ����� %.1f�Դϴ�",count,(double)sum/count);
	
	
	

		System.out.print("�Է��� ���� ������"+count+ "���̸� �����" +sum/count+"�Դϴ�");
	}
}

