package ClassTest;

public class GoodsStock {

	// 	�Ӽ� :��ǰ �ڵ�(p1234),��� ����(100),
//		��� : 	������ ����(�Է°� ����,��°��� ����) ,
//				������ ����(�Է°� ����,��°��� ���� ��� ����) 
	
	String code;
	int stockNum;
	
	void addStock (int amount) {
		stockNum +=amount;
		
	}
	int subtrackStock (int amount) {
//		stockNum -=amount;
		if (stockNum>amount) {
			stockNum-=amount;
		}
		    return stockNum;
	}
	

	
	
	
	
}
