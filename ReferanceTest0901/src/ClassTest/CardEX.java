package ClassTest;

public class CardEX {
	
	public static void main(String[] args) {
		
		Card card1 =new Card("speed",7);
		cardPrint(card1);
//	static�� Ŭ���� ������ �����Ѵ� 	
//		card1.width =10;	
//		card1.height =7;	
//		Card.width=8;
//		Card.height=4;
		
		Card card2 = new Card ("heart",2);
		cardPrint(card2);
		
//		card1.number = 2;
//		card1.kind = "heart";
	}
 static void cardPrint(Card card1) {
	 System.out.println("���� ; "+ card1.getNumber());
	 System.out.println("��� ; "+card1.getKind());
	 System.out.printf("ī��ũ�� (%d,%d)\n",Card.width,Card.height);
		System.out.println();
	}
    
    
}
