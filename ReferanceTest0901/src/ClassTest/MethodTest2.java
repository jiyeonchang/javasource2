package ClassTest;

public class MethodTest2 {
	
	
	
//�ΰ��� ���ڸ� �޾Ƽ� ���� ����� �����ֱ� 
//	�������� �ΰ��� ���� (�������� �Ǽ����� Ȯ���ϰ� ����Ÿ�� ���ϱ� )
	
	
	int sum(int num1 ,int num2 ) {
//		return 0;-ù��° ��� 
//		
 int result = num1+ num2;
    return  result; 
//    ���ٷ� �����ϰ� �ϴ¹� result num1+num2;
    
	}
//	������ 2~9�� ����ϱ� 
//	��� ���Ⱥ����Ÿ� void
//	�Է°� : ���� , ��ȯ�� : ���� 
	
	void print99dan() {
		for (int i = 2; i < 10; i++) {
			for (int j =1; j < 10; j++) {
				System.out.printf("%d *%d = %d\n",i,j,i*j);
				
			}
		}
	}
//	�ΰ��� ������ �޾Ƽ� (�Է°�)���ϱ��� ����� ����(��ȯ��)�ϱ� 
	int multiply (int x,int y) {
		return x* y ; 
		
	}
	
	
	  
}
