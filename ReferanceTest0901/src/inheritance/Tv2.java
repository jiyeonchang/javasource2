package inheritance;

public class Tv2 {
	//�Ӽ�(�ʵ�,�������,������Ƽ) =>����,�������� ,ä��
	private String color; //red ,blue, black 
	private boolean power; //on ,off
	private int channel;
	
//	public Tv2() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
	public Tv2(String color, boolean power, int channel) {
		super();
		this.color = color;
		this.power = power;
		this.channel = channel;
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
