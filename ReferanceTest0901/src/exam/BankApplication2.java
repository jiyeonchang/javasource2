package exam;

import java.util.Scanner;

public class BankApplication2 {
   //Ŭ���� ���� ,arr�� 100�� ����� 
   private static Account2[] account2Array = new Account2[100];	
 private static Scanner scanner  = new Scanner (System.in);
	
	public static void main(String[] args) {
	
		boolean run = true ;
		while (run) {
			System.out.println("----------------------");
			System.out.println("1. ���� ���� | 2. ���¸�� | 3.���� | 4.��� | 5.���� ");
			System.out.println("----------------------");
			System.out.println("----------------------");
			System.out.print("���� >");
			
			int selecNo =scanner.nextInt();
			
			int selectNo;
			
			if (selectNo ==1) {
				createAccount();//���� ����
			}else if (selecNo ==2 ) {
				accountLIst();//���¸��
			}else if (selecNo ==3 ) {
				deposit();//���¸��
			}else if (selecNo ==4 ) {
				withdraw();//���
			}else if (selecNo ==5 ) {
				run = false;//����
			}
			System.out.println("���α׷� ����");
			
			
		}
		
		
  }
	private static void createAccount() {
		System.out.println("--------------");
		System.out.println("���� ����");
		System.out.println("--------------");
		System.out.println("���¹�ȣ : ");
		String ano = scanner.next();
	 
		System.out.println("������ : ");
		String owneer = scanner.next();
		
		System.out.println("�ʱ� �Աݾ� :");
		int balance = scanner.nextInt();
		
		Account2 newAccount2 =new Account2(ano, owneer, balance);
		for (int i = 0; i < account2Array.length; i++) {
			
			if(account2Array[i]==null) {
				account2Array[i]= newAccount2;
				System.out.println("���°� �����Ǿ����ϴ�");
				break;
			}
		}
	
	
	}	
	
	private static void accountList( ) {
		System.out.println("--------------");
		System.out.println("���� ���");
		System.out.println("--------------");
		for (int i = 0; i < account2Array.length; i++) {
			Account2 account2 = account2Array[i];
				if(account2 !=null) {
					System.out.print(account2.getAno());
					System.out.print(" ");
					System.out.print(account2.getowner());
					System.out.print(" ");
					System.out.print(account2.getbalance());
					
				}
			}
		}
		private static void deposit () {
			System.out.println("--------------");
			System.out.println("����");
			System.out.println("--------------");
			System.out.print("���� ��ȣ : ");
			String ano = scanner.next();
			System.out.print("���ݾ� : ");
			int money = scanner.nextInt	();
			Account2 account2 = findAccount(ano);
			if(account2 ==null) {
				System.out.println("���°� �����ϴ�");
				return;
			}account2.setBalance(account2.getbalance()+money);
			System.out.println("��� : �Ա��� �����Ǿ����ϴ� ");
			
			
		}
		
		
		private static void withdraw() {
			System.out.println("--------------");
			System.out.println("���");
			System.out.println("--------------");
			System.out.print("���� ��ȣ : ");
	       String ano = scanner.next();
	       
	       System.out.println("��ݾ�");
	       int money = scanner.nextInt();
	       
	       Account2 account2 = findAccount(ano);
	       if(account2 == null) {
	    	   System.out.println("��� : ���°� �����ϴ� ");
	       return;
	       }
	       account2.setBalance(account2.getbalance()-money );
	       System.out.println("��� : ����� �����Ǿ����ϴ� ");
	       
	       
		}
		
	
	private static Account2 findAccount(String ano) {
    Account2 account2 =null;
    for (int i = 0; i < account2Array.length; i++) {
		if(account2Array[i]!=null) {
			String abAno = account2Array[i].getAno();
			if(abAno.equals(ano)) {
				account2=  account2Array[i];
				break;
			}
		}
	}
		
		
		
		return account2;
	}
	}

