package inheritance;

public class ChekingAccountEx {

	public static void main(String[] args) {

		CheckingAccount checkingaccount = new CheckingAccount("121-12",200000,"ȫ�浿","1222-12-133")	;
		
		
		
//	ī���ȣ �ȸ´� ��� 
//		System.out.println(checkingaccount.pay("1212-12",200000));
		
// ī���ȣ �´� ��� 
		System.out.println(checkingaccount.pay("1222-12-133",1000));
	
	
	}

}
