package inheritance;


//���� ��ȣ ,������ , �ܾ� ,����ī��, ����ī�� ��ȣ ��� ����
// �Ա��ϴ� ,����ϴ� ,üũī�� ���� ,����ī�� ����� �ִٸ� ����� �����Ѵ� 
public class TrafficCardAccunt extends CheckingAccount {
//����ī�� ��� �ֱ� 
	private boolean hastrafficCard;
	public TrafficCardAccunt(String accountNo, int balance, String name, String cardNo,boolean hastrafficCard) {
		super(accountNo, balance, name, cardNo);
		this.hastrafficCard = hastrafficCard;
	}

	//����Ű�� ���� ��� ������ ���� 
		
	int paytrfficCard( String cardNo , int amount) {
		if (!hastrafficCard ) {
			System.out.println("ī�带 Ȯ���� �ּ��� ");
			return 0;
		}
		return paytrfficCard(cardNo, amount);
		
		
	}
	
	
	

	
	
	
}
