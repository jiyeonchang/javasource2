package ClassTest;

public class Triangle2 {
//�ﰢ�� ���� ���ϱ� 
//	�غ� *���� /2
	
	
	//�Ӽ� : �غ� ,���� 
//	��� (�޼ҵ� ) : �غ� * ���� /2 ��� ���� 
	
	//�����ڴ� �⺻ ������ 
//	Triangle2 (){}	//���ص� �������
	
	
	
	
	
	private int baseLine ;
	private int height;
	//�����̺� ����϶� �����ڸ� �ʱ�ȭ �ؼ� EX���� �����ְ� �Ѵ� 
	Triangle2 (int baseLine,int height){
		this.baseLine=baseLine;
		this.height=height;
	}
	
	
	//�غ� ,���� 
	int getArea ( ) {
		return(baseLine * height)/2;
		
	}
	
	
	
	
	
	
	
	
}
