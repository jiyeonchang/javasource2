
public class school14 {

	public static void main(String[] args) {
//2�� arr
//	������� ���� ����ϴ¹� 
	
	int arr[][]={
		{45,55},
		{65,95,85},
		{78,88,88},
	};
	
	System.out.println("���Ǳ���"+arr.length);
	System.out.println("���Ǳ���"+arr[0].length);
	System.out.println("���Ǳ���"+arr[1].length);
	System.out.println("���Ǳ���"+arr[2].length);


	for(int i= 0; i<arr.length;i++) {//���� ���� 
		for(int j= 0; j<arr[i].length;j++) {//���Ǳ��� 
			System.out.printf("%d",arr[i][i]);
		
	}
	System.out.println();
	}
	}
}

