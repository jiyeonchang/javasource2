package ClassTest;

public class GoodsStockEX {

	public static void main(String[] args) {
		
		//ù��° ��� ���� 
		
		GoodsStock product1 = new GoodsStock();
		product1.code= "p1234";
		product1.stockNum =30;
		
	
//��ǰ �Ǹ� - >��� ���� 
	//ȣ�� 
// System.out.println ("���� ������"+product1.subtrackStock(15););
	
	
	
//	product1.subtrackStock(15);
	
	int stockNum = product1.subtrackStock(15);
	//���ķ� ��� ����Ҽ� �ִ�.
	System.out.println("���� ������"+stockNum);
	
	
	
	product1.addStock(5);
	System.out.println("���� ������"+	product1.stockNum);
	
	
	}
}
