package ClassTest;

public class Tv3 {
	//�Ӽ� -������ -�żҵ� ������ �ϴ°� �Ϲ��� �� 
	private String color; //red ,blue, black 
	private boolean power; //on ,off
	private int channel;
	
	//������ :���� ��ü ������ ��� ,������� �ʱ�ȭ ,��ü ������ �� �ʿ��� ���� �۾� ó��  
	Tv3(){
		//��ȣ �ȿ� �ƹ��͵� ���°��� default(�⺻) ������ 
		//��������� �����ڰ� �ϳ��� ������� �ʾҴٸ� �����Ϸ��� �ڵ����� ���� 
	}
	Tv3(String color, int channel  ){
		
		this.color = color ;//this�� ��ü �ڽ��� ���Ѵ� (���� ������ �ִ� �Ӽ�) 
		this.channel = channel ;
		//�ΰ����ʹ� �����ε� (���� �����ڸ� ����°�) 
	}
	
	public Tv3(String color, boolean power, int channel) {
		super();
		this.color = color;
		this.power = power;
		this.channel = channel;
	}
	
//	getter : ���� ������� ���� Ȯ�� 
//	setter : ���� ������� ���� �ϰ������ 
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
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
