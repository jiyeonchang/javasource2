package inheritance;

public class PolyEx {

	public static void main(String[] args) {
  Parent2 p2 = new Child3();
  
  p2.field1 = "";
  p2.method1();
  p2.method2();
  
  //method3���� �ϴ¹� 
  
  Child3 c= (Child3)p2;
  c.method3();
  
  //������ �� 
  Parent2 obj = new Parent2()	;//�ּҰ��� �θ�Ŭ���� �ۿ� �ȳ����µ� �ڽ�Ŭ������ �޼ҵ带�ҷ��� ������
  Child3 c2 = (Child3) obj ;
  c2.method3(); //java.lang.ClassCastException ��Ÿ�� ���� 
  
	}
 
}
