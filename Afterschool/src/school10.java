import java.util.Iterator;
import java.util.Scanner;

public class school10 {

	public static void main(String[] args) {

		// int Ÿ���� 5�� �����ϴ� �迭 ���� 
		// �迭�� �ʱ�ȭ�� ���� ����ڷκ��� �Է¹ޱ�

		// �Է¹��� �� ���
		//��� ,���ձ��ؼ� ���
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];// �迭�� ������

		int sum = 0;
		int sum2 = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.println((i + 1) + "��° �����Է� ");// ������ ����
			arr[i] = sc.nextInt();// �̷��� ���� �پȾ��� �Է¹���
		}

		for (int i = 0; i < arr.length; i++) {// �����ϱ����ؼ��� ������ ������ �־����
			System.out.print(arr[i] + " ");
			
			sum += arr[i];
			// sum += arr[i];����,����� for���̵� ������� for���� ������ ���ԵǸ� ���� ������������ ���°� �ǹǷ� ������ ���� 
		}

		sum2 = sum / 5;// ���
		System.out.println("����" + (sum) + "���" + (sum2));
//System.out.printf�ε� ���� ��� �Ǽ��� ������ ���� �������
	}

}