package reviewExam;
// ���� �޼ҵ� ���� ���� 
// �̵� ���ο� �ν��Ͻ� �ʵ峪 �ν��Ͻ� �޼ҵ带  ����� �� ����.
// �ڽ��� ������ this �� ��� �Ұ�

/* ���� ���� �޼ҵ�� ���� ��Ͽ��� �ν��Ͻ� ����� ����ϰ� 
 * �ʹٸ� ��ü�� ���� �����ϰ� ���� ������ �����ؾ��Ѵ�.
 */
//�޼ҵ尡 ��� ���������� �˼��ִ� 
public class Static4_1 {

	//�ν��Ͻ� �ʵ�� �޼ҵ� 
	int field1; 
	void method1 () {}
	
	//���� �ʵ�� �޼ҵ� 
	static int field2 ; 
	static void method2() {}
		
	//���� ��� 
	static {
//		 field1 = 10;
//		 method();  -������ ������ 
		 field2 = 10; 
		 method2();// static������ ���� ���� 
	}
	
	//���� �޼ҵ� 
	static void Method3() {
		Static4_1 obj = new Static4_1();//��ü�� ���� �����ϰ� ���� ���� �����ؾ��� 
//			this.field1 = 10; 
//			this.method1();-������ ���� 
		obj.field2 = 10; 
		obj.method2(); 
			
	//��� Ÿ�� 
	
	}
	
}

	

