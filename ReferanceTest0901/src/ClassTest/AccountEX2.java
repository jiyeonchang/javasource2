package ClassTest;

import java.util.Set;

public class AccountEX2 {
//�Ӽ� : ���� ��ȣ(1656-6516-5456) ,�ܾ� ,�̸� 
	// ��� : �Ա� (�Է°� : �Աݾ� )�����ܾ�+=�Աݾ�
//	,��� (�Է°� :��ݾ� ,��ȯ��: �����ܾ� )�����ܾ�-=�Աݾ�
	public static void main(String[] args) {

		Account2 account1 = new Account2();
		account1.setAccountNo("p1566-656");
		account1.setBalance(1000);
		account1.setName("ȫ�浿");
		account1.deposit(50000);
 System.out.println("�����ܾ�"+account1.getBalance());
		// ���������

		Account2 account2 = new Account2("1566-56-6", 500, "������");

		System.out.println("���� �ܾ� ��ȸ : " + account2.getBalance());

//�ں��� ���� 
		Account2 account3 = new Account2("684-6156", 10000, "�ں���");
		System.out.println("���� �ܾ� ��ȸ : " + account3.getBalance());

	}
}