package reviewExam;

public class OverloadingEx {

	public static void main(String[] args) {
  Overloading1_1 myCalcu = new Overloading1_1();
  
  //���簢�� ���� ���ϱ� 
  double result = myCalcu.areaRectangle(10);
  
  //���簢���� ���� ���ϱ� 
  
  double result2 = myCalcu.areaRectangle(10, 20);
  
  System.out.println("���簢������ ="+ result );
  System.out.println("���簢������ ="+ result2 );
	}

}
