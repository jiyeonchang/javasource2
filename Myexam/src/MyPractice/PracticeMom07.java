package MyPractice;

import java.util.Scanner;

public class PracticeMom07 {

	public static void main(String[] args) {
//�� ����� ��� ��..
//		�������?��..
//		��ǻ�Ͱ� ���ϴ� ���ڸ� ���纸�� ���α׷� ������ 
		//������ ���ϴ� ���� �Է��ϰ� �� 
		Scanner sc = new Scanner(System.in);
		int b =(int)(Math.random()*11)+1;
		int a = sc.nextInt();
		int total=0;
	do {
		System.out.println("���ϴ� ���ڸ� 10�ȿ��� �ϳ����ּ���");
		total = sc.nextInt();
		
	if (total<b) {
		System.out.printf("�� Ʋ�Ƚ��ϴ�. ��ǻ�� :%d ��� :%d ",b,a);
		total = sc.nextInt();
		
	}else {
		System.out.printf("�����Դϴ�. ��ǻ�� :%d ��� :%d\n ",b,a);
		int a1 = sc.nextInt();
	}while (total!=b);
	
		System.out.printf("�� Ʋ�Ƚ��ϴ�. ��ǻ�� :%d ��� :%d ",b,a);
	
	

}
}





