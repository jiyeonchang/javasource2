package ClassTest;

public class Tv2 {
	//�Ӽ� -������ -�żҵ� ������ �ϴ°� �Ϲ��� �� 
	String color; //red ,blue, black 
	boolean power; //on ,off
	int channel;
	
	//������ :���� ��ü ������ ��� ,������� �ʱ�ȭ ,��ü ������ �� �ʿ��� ���� �۾� ó��  
	Tv2(){
		//��ȣ �ȿ� �ƹ��͵� ���°��� default(�⺻) ������ 
		//��������� �����ڰ� �ϳ��� ������� �ʾҴٸ� �����Ϸ��� �ڵ����� ���� 
	}
	Tv2(String color, int channel  ){
		
		this.color = color ;//this�� ��ü �ڽ��� ���Ѵ� (���� ������ �ִ� �Ӽ�) 
		this.channel = channel ;
		//�ΰ����ʹ� �����ε� (���� �����ڸ� ����°�) 
	}
	
	
	
	
	//�Ӽ�(�ʵ�,�������,������Ƽ) =>����,�������� ,ä��
//	String color; //red ,blue, black 
//	boolean power; //on ,off
//	int channel;
	
	//����(�޼ҵ�) =>ä�κ����ϴ�/������ �Ѵ� /���� 
//	(==�Լ� )Ư���۾��� �����ϴ� ���� ���� ������ �ϳ��� ������ 
	//�޼ҵ��� ���� : ���뼺, �ߺ��� �ڵ����� , ���α׷� ����ȭ 
	
	
	void channelUp () {
			//ChannelU�� �ؾ��ϴ� �۾� �ۼ� 
		//���� ä���� 7����=>8,9�� ������ 
		channel++;
		
		
	}
	void ChannelDown() {
		channel--;
	}
	void power () {
		//power �� �ؾ��ϴ� �۾� on => off
		power = !power;
		
	}
}
