package Test;


public class ForTest4 {

	public static void main(String[] args) {

// ********** 
// **********
// **********
// **********
// **********
		
//	1	���� for ���� ���� 
//	2	int i=0;
//	3	i<3;
//	4	���� for���� int i=0;
//	5	i<3;
//	6	System.out.println("*"); /*�ϳ� ���� 
//	7	i++  -> i=1
//	8	i<3; /���� ���Ǹ����ϴϱ� �ٽùݺ� 
//	9	System.out.println("*");/**
//		i++  -> i=2
//	10	i<3;
//	11	System.out.println("*");/**
//	12		i++  -> i=3
//	13	i<3; ->���� for�� ����
//	14	System.out.println("*");
		
//		���� for��
//		i++; i=2
//		i<3;
//		***
//		***
//		***
		
//		i++; i=3
//		i<3; ->�ٱ��� for������ 
		
		
		
		
		for (int i = 0; i < 3; i++) {//��,�� �̷��� ������ 
			for(int j= 0; j < 3; j++) {
			System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
