package inheritance;

public class DmbCellphoneEX {
	public static void main(String[] args) {
		DmbCellphone phone = new DmbCellphone();

		phone.color = "black";
		phone.model = "�ڹ���";
		phone.channel = 7;

		phone.powerOn();
		phone.turnOnDmb();
		phone.shangChannelDmb(8);
		phone.turnOffDmb();
		phone.bell();
		phone.sendVoice("�ȳ��ϼ���");
		phone.receiveVoice("�ݰ�����");
		phone.hangUp();
	}

}
