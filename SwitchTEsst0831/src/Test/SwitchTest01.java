package Test;

public class SwitchTest01 {

	public static void main(String[] args) {
//		�ֻ��� ����� 
		
//		1-6������ ���� �ڵ����� ���� 
		//0.0<=��� <1.0
		int num = (int)(Math.random( )*6)+1;
//		��� (int)�� ������ ������ �ٲ�
		
//		System.out.println(num); 
//		
//		if (num==1) {
//			System.out.println("1������");
//		}else if (num==2) {
//			System.out.println("2������");
//			
//		}else if (num==3) {
//			System.out.println("3������");
//		}else if (num==4) {
//			System.out.println("4������");
//		}else if (num==5) {
//			System.out.println("5������");
//		}else if (num==5) {
//			System.out.println("6������");

			
// switch (int, double,float,char,String,enum)
//case ��1:
//       �ؾ�����
//       	break;
//case �� 2:
//       �ؾ�����
//       	break;
//default:
//�ؾ����� :
			
//if - elseif - else ��ü�ؼ� ��밡�� 
		
		switch (num) {
		case 1: 
			System.out.println("1������");
		case 2: 
			System.out.println("2������");
		case 3: 
			System.out.println("3������");
		case 4: 
			System.out.println("4������");
		case 5: 
			System.out.println("5������");
		 
			System.out.println("6������");
				
			break;

		default:System.out.println("6������");
		
			
		}
		
		
		
		
		
		
		
		
		}
	}


























