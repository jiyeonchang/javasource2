import java.util.Scanner;

public class school15 {

	public static void main(String[] args) {
// arr,2���� �迭  �������� 
		
		
		//3���� �л��� �ְ� 3���񿡴��� ������ �Է¹ް��� �Ѵ�.
		//2���� �迭
		
		//���
		
		//���л��� ���� ���հ� ��� ��� 
	
		Scanner sc = new Scanner(System.in);
		
	
		int sum =0;//�հ踸������� 
		int student[][]=new int[3][3];
		
		for (int i = 0; i < student.length; i++) {
			System.out.printf("%d��",i+1);
			for (int j = 0; j < student.length; j++) {
				student[i][j]=sc.nextInt();			
			}			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("----------�л��� ���� ��Ȳ-------------");
		System.out.println("��ȣ\t �ڹ�\t html\t string\t  ����\t ���\t");
		System.out.println("-----------------------------------");
		
		
		for (int i = 0; i < student.length; i++) {
			System.out.printf("%d��",i+1);
			for (int j = 0; j < student.length; j++) {
				
				System.out.print(student[i][j]+"\t");
				
			sum+=student[i][j];
			}
			System.out.printf("%d %.1f\n",sum,(double)sum/student[i].length);
			
		}
			
		}
	
}
		
		
		
		
		
	

