package com.hyondai.project;

import com.samsung.porject.Account;

public class AccountEX {
//�Ӽ� : ���� ��ȣ(1656-6516-5456) ,�ܾ� ,�̸� 
	// ��� : �Ա� (�Է°� : �Աݾ� )�����ܾ�+=�Աݾ�
//	,��� (�Է°� :��ݾ� ,��ȯ��: �����ܾ� )�����ܾ�-=�Աݾ�
	public static void main(String[] args) {
		
	
	
Account account1 =new Account("1656-6516-5456",10000,"ȫ�浿");
//account1.accountNo="1656-6516-5456";
//account1.balance=10000;
//account1.name="ȫ�浿";

//void �׳�ȣ�⸸ �Ѵ� 
account1.deposit(50000);
//���
System.out.println("���� �ܾ� : "+account1.withdraw(30000));


	
}
}