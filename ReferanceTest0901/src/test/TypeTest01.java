package test;

public class TypeTest01 {

	public static void main(String[] args) {
//Ÿ�� -1) �⺻Ÿ�� 2)����Ÿ�� 
//		���Ǵ� Ÿ�Կ����� ������ �޸𸮿����Ǵ� ����� �޶���
		
		//�⺻ Ÿ�� 
//		���ÿ��� stack ������ /�ڵ� ��ȯ�Ͼ 
		int age = 23; 
		double price = 200.3; 
		
		
		
		
		
		//���� Ÿ��//����Ÿ�Ը� null�� �ʱ�ȭ ���� 
//		���� ���ڷ� ����Ǵµ� ���ڴ� heap������ �ּ� ���̴�-heap���������  
// ���ڿ� ���� : String name = new String("java");/���ļ����
		String name = "java";//==��밡���ϱ��� ,����ڵ�
		String name2 = new String("java");//�����ڵ� 
//		String hobby = "����";
		String hobby = null;// null�� �ʱ�ȭ ����,���� �� ������ �Ҵ���� ������
		
//	 �� ���ϰ������ (==  != ������ 
//	String ���� �� ���ϰ������ equals() 
		
		System.out.println(name == name2? "������ ":"�ٸ�");
		//���� �ٸ��ٰ� ���´� .
//		���� java��� �ܾ����� ����ɶ��� �ٸ�heap�� �����ּҷ� ����Ǳ� ������ �ٸ��� �ν� 
//		�׷��� string�� equals �� ����Ѵ� 
//		null : heap�ּҰ� �ȳ��� ,���߿� ���� ����Ҷ� ���� 
		
		System.out.println(name.equals(name2)? "������ ":"�ٸ�");//���ٰ���
		
	System.out.println(hobby);// null�� ���� 	
	System.out.println(hobby.length()); 
	//hobby�� ����� java.lang.NullPointerException	
//	.length / .�����̰� �ڿ���������� heap������ ���� �˾ƿ��� �̾߱��ε� �ƹ��͵� ������ ������ ������ �� 
	}

}
