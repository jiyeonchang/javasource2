package ClassTest;

public class AccountEX {
//�Ӽ� : ���� ��ȣ(1656-6516-5456) ,�ܾ� ,�̸� 
	// ��� : �Ա� (�Է°� : �Աݾ� )�����ܾ�+=�Աݾ�
//	,��� (�Է°� :��ݾ� ,��ȯ��: �����ܾ� )�����ܾ�-=�Աݾ�
	public static void main(String[] args) {
		
	
	
Account account1 =new Account();
account1.accountNo="(1656-6516-5456)";

account1.balance=10000;
account1.name="ȫ�浿";
//void �׳�ȣ�⸸ �Ѵ� 
account1.deposit(50000);
//���
System.out.println("���� �ܾ� : "+account1.withdraw(30000));


	
}
}