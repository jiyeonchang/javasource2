package array;

import sun.security.util.Length;

public class ArrayTest8 {

	public static void main(String[] args) {

		
		//ī�带 45������(1~45��)
		
		int card [] = new int [45]; 
		
		
		for (int i = 0; i < card.length; i++) {
			card[i]= i +1; 
			
		}
		for(int no : card) {
			System.out.print(no+" ");
		}
		//ī�� ���� (testMain01���� )
		for (int i = 0; i < card.length; i++) {
			int pos = (int)(Math.random()*45);//�ٲ���ġ ���� ,i�� 0~44������ �̴ϱ� 45���� �� 
			int temp = card[i];
			card [i] = card [pos];
			card[pos]=temp;
		}
		
		System.out.println();
		for(int no:card) {
			System.out.print(no+" ");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}
