package Test;

public class ForTest01 {

	public static void main(String[] args) {
		
// 1-10 ���� ��/4:48
		int sum =0;//sum -main����� ���ŵ� 
		for (int i = 0; i < 11; i++) {
			sum= sum+i;
			
		}System.out.println(sum);
		
		System.out.println();
		
//		1-100���� �� 
		
		sum= 0;//���� sum������߱⶧���� �ٽ���� �ʱ�ȭ�� ������ 
		
		for (int i = 1; i <100; i++) {
          sum = sum +i;			
		}System.out.println("1-100���� �� "+ sum);
		
	}

}
