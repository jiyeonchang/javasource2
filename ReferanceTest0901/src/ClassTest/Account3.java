package ClassTest;

public class Account3 {
//�Ӽ� : ���� ��ȣ(1656-6516-5456) ,�ܾ� ,�̸� 
	// ��� : �Ա� (�Է°� : �Աݾ� )�����ܾ�+=�Աݾ�
//	,��� (�Է°� :��ݾ� ,��ȯ��: �����ܾ� )�����ܾ�-=�Աݾ�
	
	//�ܺηκ��� ���� �޾Ƽ� ��� ������ ���� �����ϴ� �۾��� 
	//set~���� �޼ҵ带 �����Ѵ�.
	//������������� 
	//������� : ���¹�ȣ�� �����ϰ� �ʹٸ� 
	
	
	
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	//�̸��� �����ϰ� �ʹٸ� 
	public void setName(String name) {
		this.name = name;
	}
	//�ܾ��� �����ϰ� �ʹٸ� 
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAccountNo() {
		return accountNo;
	}
	
	
	private String accountNo;
	private int balance;
	private String name;
	
	
	
	//�ڵ����� ������ ����� 
	//������ �ۼ� ���콺������ �ҽ� Ŭ�� -�ؿ��� ����° =>�Ϲݻ����� 
	//������ �ۼ� ���콺������ �ҽ� Ŭ�� -�ؿ��� �ι�° =>default
	//�⺻ ������ 
	
	public Account3() {
		super();
	}
	
	public Account3(String accountNo, int balance, String name) {
		super();
		this.accountNo = accountNo;
		this.balance = balance;
		this.name = name;
	}

	public Account3(String accountNo, String name) {
		super();
		this.accountNo = accountNo;
		this.name = name;
	}
	//��ȯ���� ������ void

	
	void deposit (int amount) {
		balance +=amount;
	}
	
//����Ѵ�
	int withdraw(int amount) {
		if (balance> amount) {
			balance -=amount;
		}
		return balance;
	

	
	}
	
	
}
	
     

