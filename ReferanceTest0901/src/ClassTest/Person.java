package ClassTest;

public class Person {
	//final : �����Ұ� /�ʱ�ȭ������ �ʿ� 
	//final �� ���Ǵ°� :Ŭ���� ,�ż��� ,��� ���� ,���� ���� 
	//Ŭ���� �� ������: ��� �Ұ�
	//�޼ҵ忡 ������ : �������̵� �Ұ� 
	//�������,�������� �� ������ �����Ұ� 
	final String nation ="korea";
	final String ssn;//The blank final field ssn may not have been initialized �ʱ�ȭ ���� ����� 
	String name ; 
//	������ :������� �ʱ�ȭ 
	public Person(String ssn, String name) {
		super();
		this.ssn = ssn;
		this.name = name;//ssn �ʱ�ȭ ��� 
	}
	
	
}
