package ClassTest;

public class Tv {
	//�Ӽ�(�ʵ�,�������,������Ƽ) =>����,�������� ,ä��
	String color; //red ,blue, black 
	boolean power; //on ,off
	int channel;
	
	//����(�޼ҵ�) =>ä�κ����ϴ�/������ �Ѵ� /���� 
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
