package Test;

public class WhileTest2 {

	public static void main(String[] args) {

//		1-100���� �� 
		
//		sum= 0;//���� sum������߱⶧���� �ٽ���� �ʱ�ȭ�� ������ 
//		
//		for (int i = 1; i <100; i++) {
//          sum = sum +i;			
//		}System.out.println("1-100���� �� "+ sum);
 int sum = 0, i=1; 
		 while(i<101) {
		sum=sum+i;
		i++;
		 }
		 System.out.printf("1~100������ ��",sum);

//			������ 2�� ����� ���� 
//			for (int i = 0; i < 10; i++) {
//				System.out.println("2*" + i+ "="+(2*i));
	// printf�� ��ȯ ������	- System.out.printf("2* %d = %d\n ", i,(2*i));
		
		  i=2;//���ʱ�ȭ 
		 while(i<10) {
			 System.out.printf("2* %d = %d\n ", i,(2*i) );
			 ++i;
		 }
		 
}
}