package Test;

public class SwitchTEst04 {

	public static void main(String[] args) {
		// 8 :����� �մϴ�.
//		9: ȸ�Ǹ� �մϴ�
//		10: ������ ���ϴ�
//		������ : �ܱ��� �����ϴ� 

//		8-11������ ���ڰ� �������� �ۼ� 
//		Math.random( )*6 -> 0-5 ����
//		int num = (int)(Math.random( )*6)+1; / 5�����ۿ� �ȳ��ͼ� 1���� 
//		int num = (int)(Math.random( )*4)= 0-3���� ����
		int time = (int) (Math.random() * 3) + 8;
		switch (time) {
		case 8:
			System.out.println("����� �մϴ�");
			break;
		case 9:
			System.out.println("ȸ�Ǹ� �մϴ�");
			break;
		case 10:
			System.out.println("������ ���ϴ�");
			break;
		default:
			System.out.println("�ܱ��� �����ϴ�");
			break;
		}
	}

}
