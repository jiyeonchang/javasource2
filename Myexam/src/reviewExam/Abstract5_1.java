package reviewExam;
//�߻� Ŭ���� ���� �ϴ� �� (abstract)
/*Ŭ���� ���� abstract �� �ٿ��� �Ѵ� 
*new �����ڸ� �̿��ؼ� ��ü�� ������ ���ϰ� ����� ���� �ڽ� Ŭ������ ���� �� �ִ� .
*���� ������ ȣ���� �Ҽ� ������ �ڽ� ��ü�� �����ɶ� super () �� ȣ���ؼ� �߻� Ŭ���� ��ü�� �����Ѵ� 
*/
public abstract class  Abstract5_1 {
//�ʵ� 
	public String owner; 
	//������ 
	public Abstract5_1(String owner2) {
		this.owner =owner; 
	}
	//�޼ҵ� 
	public void turnOn () {
		System.out.println("�������� �մϴ�");
	}
	public void turnOff() {
		System.out.println("�� ������ ���ϴ�");
	}
	
}
