package ClassTest;

public class GoodsStock2 {

	// 	�Ӽ� :��ǰ �ڵ�(p1234),��� ����(100),
//		��� : 	������ ����(�Է°� ����,��°��� ����) ,
//				������ ����(�Է°� ����,��°��� ���� ��� ����) 
	//�Ӽ� ���߱� private
	private String code;
	private int stockNum;
	
	
	
	GoodsStock2(){//()�ȿ� �ƹ��͵� ������ �⺻������ ����Ʈ ������ 
		
	}
	GoodsStock2(String code,int stockNum){//������ �����ε� ,��ȣ ���� �ٸ��� ���� 
	this.code = code;//������� �ʱ�ȭ ���� 
	this.stockNum= stockNum;
	}
	
	
	
	
	
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
	
//���� �������� �����ϴ� ����� ���� �޼ҵ� �����
	int getStockNum() {
	return stockNum;
	
	}
	
	
}
