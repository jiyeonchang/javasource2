package com.samsung.porject;

public class Account {
//�Ӽ� : ���� ��ȣ(1656-6516-5456) ,�ܾ� ,�̸� 
	// ��� : �Ա� (�Է°� : �Աݾ�,��ȯ�� ����  )�����ܾ�+=�Աݾ�
//	,��� (�Է°� :��ݾ� ,��ȯ��: �����ܾ� )�����ܾ�-=�Աݾ�
	
	
	private String accountNo;
	private String name;
	private int balance;
	
	
	
	public Account(String accountNo,  int balance, String name) {
		super();
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
	}

	public void deposit (int amount ) {
		
		balance += amount ;
	}
	
	public int withdraw (int amount) {
		if (balance < amount ) {
			balance-=amount;
		}
		return balance;
	}
	
}
