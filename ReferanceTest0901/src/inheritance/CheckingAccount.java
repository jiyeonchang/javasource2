package inheritance;
//���¹�ȣ ,������ ,�ܾ�,�Ա��ϴ� ����ϴ� =>�θ� ������ ���� 


import java.util.Scanner;

public class CheckingAccount extends Account2 {
	
	private String cardNo ;
  public CheckingAccount(String accountNo, int balance, String name,String cardNo) {
		super(accountNo, balance, name);
		this.cardNo=cardNo;
	}

	//ī���ȣ (111-11-1234	)
	
	
	/* ī�尪�� �����Ѵ�.(�Ѿ�� ī���ȣ�� ���� �߱޵� ī���ȣ�� ������)
	 * ���ݾ��� ���� �ܾ׺��� ������ Ȯ���� 
 * �Է°� : ī���ȣ , ��� �ݾ�
 * ��ȯ�� : int(����) 
 */
  
  int pay (String cardNo, int amount) {
	  if (!cardNo.equals(this.cardNo)||getBalance() < amount) {
		 System.out.println("ī���ȣ�� ���ݾ��� Ȯ���� �ּ���");
	 
	  return 0;}
	  
//	  setBalance(getBalance()-amount);
//	�θ��� withdraw�� ���� �� �����ϱ� �θ��� ��� ȣ���ϱ� 
	  
	 return  withdraw(amount);
			

	
	
  }
}


	
	
	
	
	
