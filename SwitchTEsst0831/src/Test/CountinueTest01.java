package Test;

public class CountinueTest01 {
//continue; �ݺ����ȿ��� ���Ǹ� ��� ������ continue���� ����Ǹ� 
//	for���� ������ , while�� ���ǽ����� �̵�
	public static void main(String[] args) {
    for (int i=1;i<=10;i++) {
    	
    	if (i%2!=0) {//Ȧ������ ����ϰ� �ƴϸ� ����
                   continue; //��ƼƩ�� ����Ǹ� syso�� ����ȵǰ� i++�� �Ѿ��    	
    	}
		
		System.out.println(i);
		
	}

	}
}
