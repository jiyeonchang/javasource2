package reviewExam;
/*�ν��Ͻ� (instans)�� This��������
 * -�ν��Ͻ� ����� ��ü (�ν��Ͻ�) �� ������ �� ����� �� �ִ� �ʵ�� �޼ҵ带 ���Ѵ�.
 * -���� �ν��Ͻ� �ʵ�� �ν��Ͻ� �޼ҵ��� �θ��� .
 */
public class This2_1 {
//�ʵ� 
	String model; 
	int speed;
	
	//������ 
	
	This2_1(String model ){
		this.model = model;
	}//�𵨼��� 

	//�޼ҵ� 
	
	void setSpeed (int speed) {
		this.speed= speed; 
	}//��ȯ�� ���� 
	
	
	 void run () {//���ǵ� ���� 
		 for (int i = 10; i <=50; i+=10) //{10���� �����ؼ� i�� 50�� ���ų������� false i�� 10�� �ø��鼭 �ݺ� 
			 this.setSpeed(i);
			 System.out.println(this.model + " �� �޸��ϴ� .(�ü�"+ this.speed+ "km/h)");
			
		}
	 }
	 
	 

