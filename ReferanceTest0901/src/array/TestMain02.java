package array;

public class TestMain02 {

	public static void main(String[] args) {
//�߰��� ���� �߰� �ϰ� �;����� ?
		
		int oldArr[] = {10,20,30};
		int newArr[] = new int[4];
		
		//�������� ���ο� ������ ���� 
//-----------		
//		for (int i = 0; i < newArr.length; i++) {
//			newArr[i]=oldArr[i];
//		}
		//------------
		
		//�ڹٰ� ������ �ҽ� 
		System.arraycopy(oldArr,0,newArr,0,oldArr.length);
		//���ű��� /������� / ���� / ������ 
		
		newArr[3]=40;
		for(int i : newArr) {
			
			System.out.println(i+" ");
			
		}
	}

}
