package MyPractice;

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
	public String getColor() {
		return color;
	}
	public boolean isPower() {
		return power;
	}
	public int getChannel() {
		return channel;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public Tv(String color, boolean power, int channel) {
		super();
		this.color = color;
		this.power = power;
		this.channel = channel;
	}
	void ChannelDown() {
		channel--;
	}
	void power () {
		//power �� �ؾ��ϴ� �۾� on => off
		power = !power;
		
	}
}
