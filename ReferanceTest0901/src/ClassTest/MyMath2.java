package ClassTest;

public class MyMath2 {
	//�޼ҵ� �����ε� ��� ���� �ϱ� 
	//�ż��� �̸��� ���ƾ� �Ѵ� 
	//�Ű����� , Ÿ���� �޶�� �Ѵ� (��ȣ���� �޶�� �Ѵ�) 
	int add(int a, int b) {
		System.out.println();
		return a+b;
	}
   long add (long a, long b ) {
	   return a+b; 
   }
   
   int add (int[]arr) {
	   int result=0;
		for (int i = 0; i < arr.length; i++) {
		result += arr[i];
	}
		return result ;
		
   }
   //������ �����ε� Ŭ���� �̸��� �����ؾ��Ѵ� 
   

   
}
