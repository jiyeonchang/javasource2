import java.util.Iterator;
import java.util.Scanner;

public class school7 {

	public static void main(String[] args) {
//�迭�� ������ ���ӵȰ����� ���� 
	// �����ؼ� ���������°� �����ִ� �ڸ��� 
//	������ �󸶳� �����ִ��� �𸣴ϱ� ���ڸ��� ���� �����ͿŰְܳ� �����ڸ��� �����Ѵ�. 
//	�迭�� ���� Ÿ���� ��ƾ��Ҷ� ����.
		
		//�迭 ->�� (new)/new�� �ʿ��ϴ�
		//�迭 ���� : �迭���� - ���� -�ʱ�ȭ -���
		//intŸ������ ����10���� ��� �ʹٸ� 
		int arr[];//����
		arr= new int [10];//����
		//int arr[]= new int [10];//���� ���� ���ÿ� 
	
		//�ʱ�ȭ - 1~10������
for (int i = 0; i < arr.length; i++) {// arr.length�ϴ������� �������� ������ ���� �ٲܼ��� �ֱ� ������ 
//	System.out.print(arr[i]+" ");
	arr[i]=i+1;


}	for (int i = 0; i < arr.length; i++) { //�̰� for ����� ���� ���
	System.out.print(arr[i]+" ");
}
	
	
	
	
	
	
	
	}
}

