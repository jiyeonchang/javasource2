
public class school13 {

	public static void main(String[] args) {
//2�� arr
//	������� �������ִ� �ҽ��� ������ ��ȣ�� �ΰ� ��,������ 
	
	int arr[][]=new int [3][2];//���� �������� //��ȣ�� �ΰ��� ������ for���� �ΰ���
    //�ʱ�ȭ������������ 0�� ����ִ�.

//	���� ���̸� �˰������ System.out.println("�����"+arr.length)
	//���� ���̸� �˰������ System.out.println("�����"+arr[1].length)-���� 1���� ���̸� ����ض� 
	System.out.println("�����"+arr.length);//���� 0���� 2���� �˰������ [0:���ȣ][2:����ȣ]
	System.out.println("�����"+arr[1].length);
	for(int i= 0; i<arr.length;i++) {//���� ���� 
		for(int j= 0; j<arr[i].length;j++) {//���Ǳ��� 
		arr[i][i]=j+1;
	}
		for(int i=0; i<arr.length;i++) {//���� ���� 
			for(int j= 0; j<arr[i].length; j++) {//���Ǳ��� 
			System.out.printf("%2d",arr[i][i]);
		}
	}
	}
	}
}

