package ClassTest;

public class MymathEX {
 public static void main(String[] args) {
	//static �޼ҵ� (Ŭ���� �޼ҵ� )ȣ��=> ��ü �������� ȣ�� 
	 
	 System.out.println(Mymath.add(100L, 300L));//longŸ���� l�� �ٿ��ֱ⵵ �Ѵ�
	 System.out.println(Mymath.multiply(100L, 300L));
	 System.out.println(Mymath.subtract(100L, 300L));
	 System.out.println(Mymath.divide(100.0, 300.0));
	 
	 //�������ȣ�� 
	
	 Mymath math = new Mymath();
	 
	 math.x=200L;
	 math.y=100L;
	 
	 System.out.println(math.add());
	 System.out.println(math.subtract());
	 System.out.println(math.multiply());
	 System.out.println(math.divide());
			 
	 
	 
}


	
}
