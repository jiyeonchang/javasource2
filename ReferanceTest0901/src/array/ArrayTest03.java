package array;



public class ArrayTest03 {
	public static void main(String[] args) {
//int Ÿ���� �迭 5�� ���� 
//		0 10 20 30 40 
		int score[] = {0, 10, 20, 30, 40 };
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]+"\t");
	}
		// ����for������ 
		for(int idx:score) {
			System.out.println(idx+"\t");//idx�� ������� �̸����� 
		}
		
		
		
		//String Ÿ���� �迭 5�� ���� 
//	�����̸� �ʱ�ȭ 

		
		String fruit []= {"���","��","����","�ٳ���","����"	};
//		for (int i = 0; i < fruit.length; i++) {
//			System.out.print(fruit[i]+"\t");
			
			//���� for�� 
		for(String f:fruit) {
			System.out.println(f+"\t");
			
			
		}
		
	}
}
