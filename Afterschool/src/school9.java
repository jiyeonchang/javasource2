import java.util.Iterator;
import java.util.Scanner;

public class school9 {

	public static void main(String[] args) {

// int Ÿ���� 5�� �����ϴ� �迭 ���� 
		//�迭�� �ʱ�ȭ�� ���� ����ڷκ��� �Է¹ޱ� 
		
	//�Է¹��� �� ��� 
		
		Scanner sc = new Scanner(System.in);
		int arr [ ]= new int[5];//�迭�� ������ 

		System.out.println("5���� ������ �Է� �ϼ���");
//		
//		System.out.println("1���� ������ �Է� �ϼ���");
//		arr[0]=sc.nextInt();
//		System.out.println("2�� ������ �Է� �ϼ���");
//		arr[1]=sc.nextInt();
//		System.out.println("3�� ������ �Է� �ϼ���");
//		arr[2]=sc.nextInt();// ���ŷӴ�
		 
		
		for (int i = 0; i < arr.length; i++) {
			int num = sc.nextInt();
			 arr[i]= num;//�Է¹��� ���ֱ� 
			
		}
		
		for (int i = 0; i < arr.length; i++)  {//�����ϱ����ؼ��� ������ ������ �־����
		System.out.println(arr[i]+"");
	
	}
}

}