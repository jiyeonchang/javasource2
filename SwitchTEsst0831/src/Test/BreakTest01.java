package Test;

public class BreakTest01 {
// break; �ݸ� ���� ���� 
	public static void main(String[] args) {
		while (true) {
			//�ֻ����� ������ 6�̳����� �ݺ����� �����Ű�� ������
			int num =(int)(Math.random()*6)+1;
			System.out.println(num);
			
			if (num ==6) {
				break; 
			}
		}
		
		
		
		
	}

}
