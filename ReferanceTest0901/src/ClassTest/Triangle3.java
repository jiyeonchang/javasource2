package ClassTest;

public class Triangle3 {
//�ﰢ�� ���� ���ϱ� 
//	�غ� *���� /2
	
	
	//�Ӽ� : �غ� ,���� 
//	��� (�޼ҵ� ) : �غ� * ���� /2 ��� ���� 
	
	//�����ڴ� �⺻ ������ 
//	Triangle2 (){}	//���ص� �������
	
	
	
	
	
	private int baseLine ;
	private int height;
	//�����̺� ����϶� �����ڸ� �ʱ�ȭ �ؼ� EX���� �����ְ� �Ѵ� 
	Triangle3 (int baseLine,int height){
		this.baseLine=baseLine;
		this.height=height;
	}
	
	
	
	
	
	
	
	
	public int getBaseLine() {
		return baseLine;
	}








	public void setBaseLine(int baseLine) {
		this.baseLine = baseLine;
	}








	public int getHeight() {
		return height;
	}








	public void setHeight(int height) {
		this.height = height;
	}








	//�غ� ,���� 
	int getArea ( ) {
		return(baseLine * height)/2;
		
	}
	
	
	
	
	
	
	
	
}
