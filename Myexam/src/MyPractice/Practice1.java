package MyPractice;

public class Practice1 {
//for,if�� ���� 
	public static void main(String[] args) {
   //1~100 ���� 3�� ����� ���� 
		
	for (int i= 3; i < 100; i++) {
		if (i%3==0);{
	System.out.print(i+" ");
		}	
	}
	
	// 3�� ������� ���ϴ� ���α׷� ����� ,9�� ����� ������ ���� 
	
	int sum = 0; 
	for (int i = 3; i <101; i++) {
		if (i%3==0 && i%9!=0) { //i%9!=0- i�� 9�� �������� 0�� �ȵǴ� ���� ���Ͷ�
			sum +=i;
			System.out.println("3�ǹ���̰� 9�� ����� �ƴ���"+sum);	
		}	
	}
	
	// 1~100���� 3�� ����̰ų� 5�� ����� ���� ��
	int sum2 = 0;
	for (int i = 0; i <101; i++) {
	if (i%3==0&&i%5==0) {
		sum2+=i;
	}	System.out.println("3�� ����̰ų� 5�� ����� ���� ��"+sum2);
	}
	
	
}
}
