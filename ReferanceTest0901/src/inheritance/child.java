package inheritance;
//extends�θ� Ŭ������
//�����ڿ� �ʱ�ȭ ���� ��ӵ��� ���� 
// private ��� ������ ������ ���ѵ� 
//Ȯ���� ���� 
public class child extends Parent {

	public child(int age) {
		super(age);//parent�� int�� �޴� ������ ȣ�� 
	}
	
	
//	Implicit super constructor Parent() is undefined for default constructor. Must define an explicit constructor
	
	
//	public Child() {
//		super (); //parent �⺻ ������ ȣ�� 
//	}
	
	void play () {
		System.out.println("���� !!");
	}
	@Override
 public void print() {
	 System.out.println("Hello");
 }
}
