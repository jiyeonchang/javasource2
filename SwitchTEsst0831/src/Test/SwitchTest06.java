package Test;

import java.util.Scanner;

public class SwitchTest06 {
public static void main(String[] args) {
	
//	����(1)����(2)��(3)
	
//	������ ��ǻ�ͷ�
//	���� 1-3���ڵ����� 
	
//	�������ºκ��� -�Է� 
//	���¹� ����� �����ϴ� .�̰���ϴ� .�����ϴ�
	Scanner k = new Scanner(System.in);
	
	int computer =(int)(Math.random() *3)+1 ;
	
	System.out.println("����1,����2,��3 �� �ϳ� ���ÿ�.");
	
	int user = k.nextInt();
	
	System.out.printf("��:"+user, "��ǻ�� :" +computer);
	
	
	switch (user - computer) {
	case 1 :case -2:
		System.out.println("����� �̰���ϴ�.");
		
		break;
	case 2 : case-1:
		System.out.println("�����ϴ�");
		
	break;
	case 0 : 
		System.out.println("����� �����ϴ�.");
		
		break;

	default:
		break;
	}
//	�ݺ��� for ,while ,do-while 
	
	
}
}
