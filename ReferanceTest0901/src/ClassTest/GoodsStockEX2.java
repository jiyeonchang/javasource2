package ClassTest;

public class GoodsStockEX2 {

	public static void main(String[] args) {
		
		//ù��° ��� ���� 
		
		GoodsStock2 product1 = new GoodsStock2("p1234",30);
		
		//�𷡽� �ܺο��� �Ӽ��� ���� �����ϴ°��� �ȵ� 
		//private Ű���尡 �ɷ� �ֱ� ������ 
//		product1.code= "p1234";
//		product1.stockNum =30;
		
	
//��ǰ �Ǹ� - >��� ���� 
	//ȣ�� 
// System.out.println ("���� ������"+product1.subtrackStock(15););
	
	
	
//	product1.subtrackStock(15);
	
	int stockNum = product1.subtrackStock(15);
	//���ķ� ��� ����Ҽ� �ִ�.
	System.out.println("���� ������"+stockNum);
	
	
	
	product1.addStock(5);
	System.out.println("���� ������"+	product1. getStockNum());
	
	
	}
}
