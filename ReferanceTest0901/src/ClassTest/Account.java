package ClassTest;

public class Account {
//�Ӽ� : ���� ��ȣ(1656-6516-5456) ,�ܾ� ,�̸� 
	// ��� : �Ա� (�Է°� : �Աݾ�,��ȯ�� ����  )�����ܾ�+=�Աݾ�
//	,��� (�Է°� :��ݾ� ,��ȯ��: �����ܾ� )�����ܾ�-=�Աݾ�
	
	
	String accountNo;
	String name;
	int balance;
	
	void deposit (int amount ) {
		
		balance += amount ;
	}
	
	int withdraw (int amount) {
		if (balance < amount ) {
			balance-=amount;
		}
		return balance;
	}
	
}
